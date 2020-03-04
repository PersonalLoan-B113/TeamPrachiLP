import { Component, OnInit } from '@angular/core';
import { ServicemService } from '../servicem.service';
import { Router } from '@angular/router';
import { CustomerDetail } from '../model/customerDetails.model';

@Component({
  selector: 'app-get-details-btwn300',
  templateUrl: './get-details-btwn300.component.html',
  styleUrls: ['./get-details-btwn300.component.css']
})
export class GetDetailsBtwn300Component implements OnInit {

  constructor(private se:ServicemService, private route:Router) { }

  cust:CustomerDetail[];
  ngOnInit() {
    this.se.getDataBtwn300().subscribe(res => { 
      this.cust = res ;
      console.log(this.cust);
   },
    err => { alert("an error has been occured;")
   }
   );
  }

  
  radioChangeHandler(cus)
  {
    console.log('called');
  this.se.cd=cus;
  console.log(this.se.cd);
  this.route.navigate(['save']);
  }
}
