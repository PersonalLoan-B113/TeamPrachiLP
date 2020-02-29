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

  constructor(private se: ServicemService,private route:Router) { }
  isVisisble:boolean=false;
  cust: CustomerDetail[];

  ngOnInit() {
     this.se.getData().subscribe(res => { 
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
