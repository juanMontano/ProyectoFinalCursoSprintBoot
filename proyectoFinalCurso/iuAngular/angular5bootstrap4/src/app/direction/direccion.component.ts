import { Component, OnInit } from '@angular/core';
import { NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';
import { Direccion } from './direccion';
import { DireccionService } from './direccion.service';

class Registration {
  constructor(
    public firstName: string = '',
    public lastName: string = '',
    public dob: NgbDateStruct = null,
    public email: string = '',
    public password: string = '',
    public country: string = 'Select country'
  ) {}
}

@Component({
  selector: 'app-registration',
  templateUrl: './direction.component.html',
  styleUrls: ['./direccion.component.css']
})
export class DireccionComponent implements OnInit {
  // It maintains list of Registrations
  registrations: Registration[] = [];
  // It maintains registration Model
  regModel: Registration;
  // It maintains registration form display status. By default it will be false.
  showNew: Boolean = false;
  // It will be either 'Save' or 'Update' based on operation.
  submitType: string = 'Save';
  // It maintains table row index based on selection.
  selectedRow: number;
  // It maintains Array of countries.
  countries: string[] = ['US', 'UK', 'India', 'UAE'];

  public directions:Direccion[];
  regModel2:Direccion;
  constructor(private directionService:DireccionService) {


    // Add default registration data.
    //this.registrations.push(new Registration('Johan', 'Peter', {year: 1980, month: 5, day: 12}, 'johan@gmail.com', 'johan123', 'UK'));
    //this.registrations.push(new Registration('Mohamed', 'Tariq', {year: 1975, month: 12, day: 3}, 'tariq@gmail.com', 'tariq123', 'UAE'));
    //this.registrations.push(new Registration('Nirmal', 'Kumar', {year: 1970, month: 7, day: 25}, 'nirmal@gmail.com', 'nirmal123', 'India'));
  }

  ngOnInit() {

    this.directionService.getDirections().subscribe
    (directions =>{
      this.directions=directions;
    })
  }

  // This method associate to New Button.
  onNew() {
    // Initiate new registration.
    this.regModel2 = new Direccion();
    // Change submitType to 'Save'.
    this.submitType = 'Save';
    // display registration entry section.
    this.showNew = true;
  }

  // This method associate to Save Button.
  onSave() {
    if (this.submitType === 'Save') {
      // Push registration model object into registration list.
      //this.registrations.push(this.regModel);


        //this.directions = this.directions.filter(h => h !== this.regModel2);
        this.directionService.addDireccion(this.regModel2).subscribe(response=>{
          this.directions.push(this.regModel2);
        })

    } else {
      // Update the existing properties values based on model.
      this.directions[this.selectedRow].departamento = this.regModel2.departamento;
      this.directions[this.selectedRow].n_Casa = this.regModel2.n_Casa;
      this.directions[this.selectedRow].nombre_calle = this.regModel2.nombre_calle;
      this.directions[this.selectedRow].telefono = this.regModel2.telefono;

      this.directionService.addDireccion(this.regModel2).subscribe(data =>{
        console.log(data);
      })

    }
    // Hide registration entry section.
    this.showNew = false;
  }

  // This method associate to Edit Button.
  onEdit(index:number) {
    // Assign selected table row index.
    this.selectedRow = index;
    // Initiate new registration.
    this.regModel2 = new Direccion();
    // Retrieve selected registration from list and assign to model.
    this.regModel2 = Object.assign({}, this.directions[this.selectedRow]);

    // Change submitType to Update.
    this.submitType = 'Update';
    // Display registration entry section.
    this.showNew = true;
  }

  delete(direccion: Direccion): void {
    this.directions = this.directions.filter(h => h !== direccion);
    this.directionService.deleteDirection(direccion).subscribe();
  }

  // This method associate toCancel Button.
  onCancel() {
    // Hide registration entry section.
    this.showNew = false;
  }

}

