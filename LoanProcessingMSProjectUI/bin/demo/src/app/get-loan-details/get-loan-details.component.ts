import { Component, OnInit } from '@angular/core';
import { ServicemService } from '../servicem.service';
import { loanDetails } from '../model/loanDetails.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-get-loan-details',
  templateUrl: './get-loan-details.component.html',
  styleUrls: ['./get-loan-details.component.css']
})
export class GetLoanDetailsComponent implements OnInit {

  constructor(private se:ServicemService, private route: Router) { }

    lD:loanDetails[];
  ngOnInit() {

    this.se.getLoanDetails().subscribe(res=>{
      this.lD=res;
    },
    err=> {alert("an error has been occured;")
  }
  
  );

  }

  goToFrontPage()
  {
    this.route.navigate(['details']);
  }

}
