import { Component, OnInit } from '@angular/core';
import { ServicemService } from '../servicem.service';
import { loanDetails } from '../model/loanDetails.model';
import { CustomerDetail } from '../model/customerDetails.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-get-details',
  templateUrl: './get-details.component.html',
  styleUrls: ['./get-details.component.css']
})
export class GetDetailsComponent implements OnInit {
  cust: CustomerDetail[];

  constructor(private se: ServicemService,private route:Router) { }
  isVisisble:boolean=false;
  

  ngOnInit() {
    
    this.se.getData().subscribe(res => { 
      this.cust = res ;
      console.log(this.cust);
   },
    err => { alert("an error has been occured;")
   }
   );

   this.se.customerdetails=this.cust;
   console.log(this.se.customerdetails);
  }

  goToBtwn300()
  {
   this.route.navigate(['getCustBtwn300'])
  }

  goToAbove302()
  {
    this.route.navigate(['getCustAbove300'])
  }
  goToBelow300()
  {
    this.route.navigate(['getCustBelow300'])

  }
  }
