import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { loanDetails } from './model/loanDetails.model';

@Injectable({
  providedIn: 'root'
})
export class ServicemService {

  constructor(private http : HttpClient) { }

  
  url= "http://localhost:8085/loanDetails";


  //loandetail: loanDetails[];

  // getData()
  // {

  //   console.log("i m in get details");
  //   this.http.get<loanDetails[]>(this.url+"/"+"getdetails").subscribe(
  //    res => { 
  //      this.loandetail = res ;
  //   },
  //    err => { alert("an error has been occured;")
  //   }
  //   );
  //   return this.loandetail;
  // }


  getData(): Observable<loanDetails[]>{

    console.log("i m in get Data service")
    return this.http.get<loanDetails[]>(this.url+"/"+"getdetails");

  }
  saveData(loginPayload): Observable<string>
  {
    console.log("i m in service");
    return this.http.post<string>(this.url+"/"+"details",loginPayload.value);
  }

}
