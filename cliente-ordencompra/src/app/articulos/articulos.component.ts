import { Component, OnInit } from '@angular/core';
import { Articulo } from './articulo';
import { ArticuloService } from './articulo.service';

@Component({
  selector: 'app-articulos',
  templateUrl: './articulos.component.html',
  styleUrls: ['./articulos.component.css']
})
export class ArticulosComponent implements OnInit {

  titulo:String="Lista de Articulos";
  articulos:Articulo[];

  constructor(private articuloService:ArticuloService) { }

  ngOnInit(): void {
    this.articuloService.listar().subscribe(
      e=>this.articulos=e
    )
  }

}
