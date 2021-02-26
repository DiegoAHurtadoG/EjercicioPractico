import { Component, OnInit } from '@angular/core';
import { Orden } from './orden';
import { OrdenService } from './orden.service';

@Component({
  selector: 'app-ordenes',
  templateUrl: './ordenes.component.html',
  styleUrls: ['./ordenes.component.css']
})
export class OrdenesComponent implements OnInit {

  titulo:String="Lista de Ordenes";
  ordenes:Orden[];

  constructor(private ordenService:OrdenService) { }

  ngOnInit(): void {
    this.ordenService.listar().subscribe(
      e=>this.ordenes=e
    )
  }

}
