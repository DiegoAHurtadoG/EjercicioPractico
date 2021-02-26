import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Cliente } from '../cliente';
import { ClienteService } from '../cliente.service';

@Component({
  selector: 'app-form-cliente',
  templateUrl: './form-cliente.component.html',
  styleUrls: ['./form-cliente.component.css']
})
export class FormClienteComponent implements OnInit {

  titulo:String="Formulario Cliente";
  cliente:Cliente = new Cliente();

  constructor(private clienteService:ClienteService, private router:Router, private activatedRoute:ActivatedRoute) { }

  guardar():void{
    this.clienteService.guardar(this.cliente).subscribe(
      e=>this.router.navigate(['/clientes/'])
    )
  }

  obtener():void{
    this.activatedRoute.params.subscribe(
      e=>{
        let idCliente=e['idCliente'];
        if(idCliente){
          this.clienteService.obtener(idCliente).subscribe(
            es=>this.cliente=es
          )
        }
      }
    )
  }

  actualizar():void{
    this.clienteService.actualizar(this.cliente).subscribe(
      e=>this.router.navigate(['/clientes'])
    )
  }

  ngOnInit(): void {
    this.obtener();
  }

}
