import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule} from '@angular/router'
import { SaveDetailsComponent } from './save-details/save-details.component';
import { GetDetailsComponent } from './get-details/get-details.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { AppComponent } from './app.component';
import { DummyComponent } from './dummy/dummy.component';



const routes : Routes = [
  {path:'save', component:SaveDetailsComponent },
  {path:'details', component:GetDetailsComponent},
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
