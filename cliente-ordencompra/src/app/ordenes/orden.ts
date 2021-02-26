import { Articulo } from "../articulos/articulo";
import { Cliente } from "../clientes/cliente";
import { OrdenArticulos } from "./orden-articulos";

export class Orden {
    fechaOrden:Date= new Date(); 
    cliente:Cliente;
    ordenArticulos:OrdenArticulos[];
}
