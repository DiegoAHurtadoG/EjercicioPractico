import { HttpClient } from '@angular/common/http';
import { NullTemplateVisitor } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Articulo } from '../articulos/articulo';
import { ArticuloService } from '../articulos/articulo.service';
import { Cliente } from '../clientes/cliente';
import { Orden } from './orden';
import { OrdenArticulos } from './orden-articulos';

@Injectable({
  providedIn: 'root'
})
export class OrdenService {

  private url:string="http://localhost:8080/ejercicio/orden";

  constructor(private http:HttpClient) { }

  listar():Observable<Orden[]>{
    return this.http.get<Orden[]>(this.url);
  }

  obtener(id:number):Observable<Orden>{
    return this.http.get<Orden>(this.url+'/'+id);
  }

  guardar(orden:Orden, idCliente:number, articulos:Articulo[]):Observable<Orden>{
    orden.cliente= new Cliente();
    orden.ordenArticulos=[];
    orden.cliente.idCliente=idCliente;
    for (let i = 0; i < articulos.length; i++) {
      orden.ordenArticulos[i] = new OrdenArticulos;
      orden.ordenArticulos[i].articulo=articulos[i];
    }    
    return this.http.post<Orden>(this.url,orden);
  }
}
