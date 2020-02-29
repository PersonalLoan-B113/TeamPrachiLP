import { Injectable } from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http'
import { Observable, throwError } from 'rxjs';
import { CustomerDetail } from './model/customerDetails.model';

@Injectable({
  providedIn: 'root'
})
export class ServicemService {

  constructor(private http : HttpClient) { }

  
  url= "http://localhost:8086/loanDetails";
  urlLoanDetails = "http://localhost:8085/loanDetails"

  getData(): Observable<CustomerDetail[]>{

    console.log("i m in get Data service")
    return this.http.get<CustomerDetail[]>(this.url+"/"+"getD");

  }

  
  status:number;
  cd: CustomerDetail={
    custId:null,
    leadId:null,
    loanAmount:null,
    loanNo:'',
    statusCode:''
  }

  saveData(loginPayload): Observable<string>
  {
    console.log("i m in service");
    return this.http.post<string>(this.urlLoanDetails +"/"+"details",loginPayload.value);
  }

}
