import { Injectable } from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http'
import { Observable, throwError } from 'rxjs';
import { CustomerDetail } from './model/customerDetails.model';
import { loanDetails } from './model/loanDetails.model';

@Injectable({
  providedIn: 'root'
})
export class ServicemService {

  constructor(private http : HttpClient) { }

  
  url= "http://localhost:8086/customerDetails";
  urlLoanDetails = "http://localhost:8085/loanDetails"

  getData():Observable<CustomerDetail[]>{

    console.log("i m in get Data service")
    return this.http.get<CustomerDetail[]>(this.url+"/"+"getCustomerDetails");

  }
  
  status:number;
  customerdetails:CustomerDetail[];
  cd: CustomerDetail={
    custId:null,
    leadId:null,
    loanAmount:null,
    loanNo:'',
    statusCode:''
  }
  custStatusCode(statusCode:number,custId:number)
  {
    console.log("Status "+statusCode+ "   "+"custId "+custId);
    return this.http.put(this.url+"/"+"updateStatus/",{
      custId,
      statusCode,
    }
    );

  }

  saveData(loginPayload): Observable<string>
  {
    console.log("i m in service");
    return this.http.post<string>(this.urlLoanDetails +"/"+"details",loginPayload.value);
  }

  getLoanDetails():Observable<loanDetails[]>
  {
    return this.http.get<loanDetails[]>(this.urlLoanDetails +"/"+"getdetails");
  }
  getDataBtwn300():Observable<CustomerDetail[]>
  {
    return this.http.get<CustomerDetail[]>(this.url +"/"+"getCustomerBtwn300");
  }

  getDataAbove302():Observable<CustomerDetail[]>
  {
    return this.http.get<CustomerDetail[]>(this.url +"/"+"getCustomerAbove302");
  }

  getDataBelow300():Observable<CustomerDetail[]>
  {
    return this.http.get<CustomerDetail[]>(this.url +"/"+"getCustomerBelow300");
  }
}
