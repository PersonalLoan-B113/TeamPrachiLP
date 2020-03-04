import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { SaveDetailsComponent } from './save-details/save-details.component';
import { GetDetailsComponent } from './get-details/get-details.component';
import { AppRoutingModule } from './app-routing.module';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { RouterModule} from '@angular/router';
import { DummyComponent } from './dummy/dummy.component';
import { GetLoanDetailsComponent } from './get-loan-details/get-loan-details.component';
import { GetDetailsBtwn300Component } from './get-details-btwn300/get-details-btwn300.component';
import { GetDetailsBelow300Component } from './get-details-below300/get-details-below300.component';
import { GetDetailsAbove300Component } from './get-details-above300/get-details-above300.component';

@NgModule({
  declarations: [
    AppComponent,
    SaveDetailsComponent,
    GetDetailsComponent,
    PagenotfoundComponent,
    DummyComponent,
    GetLoanDetailsComponent,
    GetDetailsBtwn300Component,
    GetDetailsBelow300Component,
    GetDetailsAbove300Component,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule, 
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
