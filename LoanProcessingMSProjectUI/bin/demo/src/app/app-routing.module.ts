import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule} from '@angular/router'
import { SaveDetailsComponent } from './save-details/save-details.component';
import { GetDetailsComponent } from './get-details/get-details.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { AppComponent } from './app.component';
import { DummyComponent } from './dummy/dummy.component';
import { GetLoanDetailsComponent } from './get-loan-details/get-loan-details.component';
import { GetDetailsAbove300Component } from './get-details-above300/get-details-above300.component';
import { GetDetailsBelow300Component } from './get-details-below300/get-details-below300.component';
import { GetDetailsBtwn300Component } from './get-details-btwn300/get-details-btwn300.component';



const routes : Routes = [
  {path:'save', component:SaveDetailsComponent },
  {path:'details', component:GetDetailsComponent},
  {path:'getloan', component:GetLoanDetailsComponent},
  {path:'getCustAbove300', component:GetDetailsAbove300Component},
  {path:'getCustBelow300', component:GetDetailsBelow300Component},
  {path:'getCustBtwn300' , component:GetDetailsBtwn300Component},
  {path:'**', component:GetDetailsComponent}
]

@NgModule({
  declarations: [],
  imports: [
    CommonModule, RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
