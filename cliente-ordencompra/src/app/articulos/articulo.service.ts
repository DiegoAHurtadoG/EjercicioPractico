import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Articulo } from './articulo';

@Injectable({
  providedIn: 'root'
})
export class ArticuloService {

  private url:string="http://localhost:8080/ejercicio/articulo";

  constructor(private http:HttpClient) { }

  listar():Observable<Articulo[]>{
    return this.http.get<Articulo[]>(this.url);
  }

  obtener(id:string):Observable<Articulo>{
    return this.http.get<Articulo>(this.url+'/'+id);
  }

  guardar(articulo:Articulo):Observable<Articulo>{
    return this.http.post<Articulo>(this.url,articulo);
  }
}
