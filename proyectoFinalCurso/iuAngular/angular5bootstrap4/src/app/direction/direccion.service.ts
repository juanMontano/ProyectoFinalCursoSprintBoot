import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Direccion } from './direccion';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class DireccionService {

public directionUrl: string='http://localhost:8080/direction';

  constructor(private http: HttpClient) { }

  getDirections(): Observable<Direccion[]>{
    return this.http.get<Direccion[]>(this.directionUrl);

  }
  deleteDirection(direction:Direccion | number):Observable<Direccion>{
    const id = typeof direction === 'number' ? direction : direction.id;
    const url = `${this.directionUrl}/${id}`;
    return this.http.delete<Direccion>(url,httpOptions).pipe();
  }
  addDireccion(direccion:Direccion):Observable<Direccion>{
    return this.http.post<Direccion>(this.directionUrl,direccion,httpOptions).pipe();
  }

  updateDireccion(direccion: Direccion):Observable<Direccion>{
    return this.http.patch<Direccion>(this.directionUrl,direccion,httpOptions).pipe();
  }


}
