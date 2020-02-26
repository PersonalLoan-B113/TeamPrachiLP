import { Component, OnInit } from '@angular/core';
import { ServicemService } from '../servicem.service';
import { loanDetails } from '../model/loanDetails.model';

@Component({
  selector: 'app-get-details',
  templateUrl: './get-details.component.html',
  styleUrls: ['./get-details.component.css']
})
export class GetDetailsComponent implements OnInit {

  constructor(private se: ServicemService) { }

  loandetail: loanDetails[];
  ngOnInit() {
     this.se.getData().subscribe(res => { 
      this.loandetail = res ;
      console.log(this.loandetail);
   },
    err => { alert("an error has been occured;")
   }
   );
  }

  // loanDetail : loanDetails[];

  // getData()
  // {
  //   console.log("i m in get details");
  //   this.loanDetail = this.se.getData(); 
  //   console.log(this.loanDetail)
  // }

  

  

}
