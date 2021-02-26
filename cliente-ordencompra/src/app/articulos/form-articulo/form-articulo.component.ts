import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Articulo } from '../articulo';
import { ArticuloService } from '../articulo.service';

@Component({
  selector: 'app-form-articulo',
  templateUrl: './form-articulo.component.html',
  styleUrls: ['./form-articulo.component.css']
})
export class FormArticuloComponent implements OnInit {

  titulo:String="Formulario Articulo";
  articulo:Articulo = new Articulo();

  constructor(private articuloService:ArticuloService, private router:Router) { }

  guardar():void{
    this.articuloService.guardar(this.articulo).subscribe(
      e=>this.router.navigate(['/articulos/'])
    )
  }

  ngOnInit(): void {
  }

}
