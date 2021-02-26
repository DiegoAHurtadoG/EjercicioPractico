import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Cliente } from './cliente';

@Injectable({
  providedIn: 'root'
})

export class ClienteService {

  private url:string="http://localhost:8080/ejercicio/cliente";

  constructor(private http:HttpClient) { }

  listar():Observable<Cliente[]>{
    return this.http.get<Cliente[]>(this.url);
  }

  obtener(id:number):Observable<Cliente>{
    return this.http.get<Cliente>(this.url+'/'+id);
  }

  guardar(cliente:Cliente):Observable<Cliente>{
    return this.http.post<Cliente>(this.url,cliente);
  }

  actualizar(cliente:Cliente):Observable<Cliente>{
    return this.http.put<Cliente>(this.url,cliente);
  }

  eliminar(id:number):Observable<Cliente>{
    return this.http.delete<Cliente>(this.url+'/'+id);
  }
}
