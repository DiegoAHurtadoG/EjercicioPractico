import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {

  titulo:String="Lista de Clientes";
  clientes:Cliente[];

  constructor(private clienteService:ClienteService) { }

  eliminar(cliente:Cliente):void{
    try{ 
    this.clienteService.eliminar(cliente.idCliente).subscribe(
      e=>this.clienteService.listar().subscribe(
        es=>this.clientes=es
      )
    )
      }catch{
        console.log("ERROR")
      }
  }

  ngOnInit(): void {
    this.clienteService.listar().subscribe(
      e=>this.clientes=e
    );
  }

}
