import { Component, OnInit } from '@angular/core';
import { ServicemService } from '../servicem.service';
import { Router } from '@angular/router';
import { CustomerDetail } from '../model/customerDetails.model';

@Component({
  selector: 'app-get-details-above300',
  templateUrl: './get-details-above300.component.html',
  styleUrls: ['./get-details-above300.component.css']
})
export class GetDetailsAbove300Component implements OnInit {

  constructor(private se:ServicemService, private route:Router) { }

  cust:CustomerDetail[];
  ngOnInit() {
    this.se.getDataAbove302().subscribe(res => { 
      this.cust = res ;
      console.log(this.cust);
   },
    err => { alert("an error has been occured;")
   }
   );
  }

  done()
  {
    this.route.navigate(['details']);
  }

}
