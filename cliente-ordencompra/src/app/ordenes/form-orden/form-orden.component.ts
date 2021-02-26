import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Articulo } from 'src/app/articulos/articulo';
import { ArticuloService } from 'src/app/articulos/articulo.service';
import { Cliente } from 'src/app/clientes/cliente';
import { ClienteService } from 'src/app/clientes/cliente.service';
import { Orden } from '../orden';
import { OrdenArticulos } from '../orden-articulos';
import { OrdenService } from '../orden.service';

@Component({
  selector: 'app-form-orden',
  templateUrl: './form-orden.component.html',
  styleUrls: ['./form-orden.component.css']
})
export class FormOrdenComponent implements OnInit {

  titulo:String="Formulario Orden";
  orden:Orden = new Orden();
  idCliente:number;
  clientes:Cliente[];
  articulosSel:Articulo[];
  articulos:Articulo[];
  ordenArticulos:OrdenArticulos[];
  

  constructor(private ordenService:OrdenService, private router:Router, 
    private clienteService:ClienteService, private articuloService:ArticuloService) { }

  guardar():void{
    this.ordenService.guardar(this.orden,this.idCliente,this.articulosSel).subscribe(
      e=>this.router.navigate(['/ordenes/'])
    )
  }

  ngOnInit(): void {
    this.clienteService.listar().subscribe(
      e=>this.clientes=e
    );

    this.articuloService.listar().subscribe(
      e=>this.articulos=e
    );
  }

}
