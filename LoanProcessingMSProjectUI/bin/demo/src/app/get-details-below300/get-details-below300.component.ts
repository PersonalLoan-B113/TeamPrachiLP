import { Component, OnInit } from '@angular/core';
import { ServicemService } from '../servicem.service';
import { Router } from '@angular/router';
import { CustomerDetail } from '../model/customerDetails.model';

@Component({
  selector: 'app-get-details-below300',
  templateUrl: './get-details-below300.component.html',
  styleUrls: ['./get-details-below300.component.css']
})
export class GetDetailsBelow300Component implements OnInit {

  constructor(private se:ServicemService, private route:Router) { }

  cust:CustomerDetail[];
  ngOnInit() {
    this.se.getDataBelow300().subscribe(res => { 
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
