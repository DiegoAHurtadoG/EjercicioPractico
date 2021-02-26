import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {HttpClientModule} from '@angular/common/http';
import {Routes, RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { ClientesComponent } from './clientes/clientes.component';
import { FormClienteComponent } from './clientes/form-cliente/form-cliente.component';
import { ArticulosComponent } from './articulos/articulos.component';
import { FormArticuloComponent } from './articulos/form-articulo/form-articulo.component';
import { OrdenesComponent } from './ordenes/ordenes.component';
import { FormOrdenComponent } from './ordenes/form-orden/form-orden.component';

const routes:Routes=[  
  {path:'', redirectTo:'/clientes', pathMatch:'full'},
  {path:'clientes', component:ClientesComponent },
  {path:'clientes/formulario', component:FormClienteComponent },
  {path:'clientes/formulario/:idCliente', component:FormClienteComponent },

  {path:'articulos', component:ArticulosComponent },
  {path:'articulos/formulario', component:FormArticuloComponent },

  {path:'ordenes', component:OrdenesComponent },
  {path:'ordenes/formulario', component:FormOrdenComponent }
]

@NgModule({
  declarations: [
    AppComponent,
    ClientesComponent,
    FormClienteComponent,
    ArticulosComponent,
    FormArticuloComponent,
    OrdenesComponent,
    FormOrdenComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
