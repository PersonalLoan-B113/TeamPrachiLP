import { Component, OnInit } from '@angular/core';
import { ServicemService } from '../servicem.service';
import { loanDetails } from '../model/loanDetails.model';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CustomerDetail } from '../model/customerDetails.model';

@Component({
  selector: 'app-save-details',
  templateUrl: './save-details.component.html',
  styleUrls: ['./save-details.component.css']
})
export class SaveDetailsComponent implements OnInit {

  saveForm : FormGroup;
  invalidLogin: boolean = false;
  constructor(private se:ServicemService, private formBuilder: FormBuilder, private router: Router) { }
  ld = new loanDetails();
  cd = new CustomerDetail();
  ngOnInit() {
    console.log("i m in ngOnINit of save");
    this.cd=this.se.cd;
    console.log("showing cd: "+this.cd);
    this.saveForm = this.formBuilder.group({
      loanCode : [this.cd.loanNo],
      customerId : [this.cd.custId],
      leadId : [this.cd.leadId],
      loanAmount: [this.cd.loanAmount],
      rateOfInterest :[12],
      tenure : ['', Validators.required],
      sanctionDate :['', Validators.required],
      statusCode :[''] ,
      marginmoney : [''],
      advanceEMI :[' '],
      processingFees:[800],
      totalInterest:[''],
      remark : ['']

    });
  }
 
  statusValue(status:any)
  {
    this.se.status=status.target.value;
    console.log(this.se.status);
  }
  marginmoney:number;
  totalInterest:number;
  advanceEMI:number;
  calculateData()
  {
    this.marginmoney = this.saveForm.controls.loanAmount.value *(2/100);
    console.log(this.marginmoney);
    this.totalInterest = this.saveForm.controls.loanAmount.value*(1+(12/100)*this.saveForm.controls.tenure.value);
    console.log(this.totalInterest);
    this.advanceEMI = (this.saveForm.controls.loanAmount.value + (this.saveForm.controls.loanAmount.value*(12/100))/(this.saveForm.controls.tenure.value)*12);
    console.log(this.advanceEMI);
  }

  
  customerId1:number;
  status:number;
  onSubmit() {
    if (this.saveForm.invalid) {
      alert("This form is invalid");
      return;
    }
    else{
      const loginPayload = {
        loanCode: this.saveForm.controls.loanCode.value,
    customerId: this.saveForm.controls.customerId.value,
    leadId: this.saveForm.controls.leadId.value,
    loanAmount : this.saveForm.controls.loanAmount.value,
    rateOfInterest : this.saveForm.controls.loanCode.value ,
    tenure : this.saveForm.controls.tenure.value,
    marginmoney :this.marginmoney,
    advanceEMI : this.advanceEMI,
    processingFees : this.saveForm.controls.processingFees.value,
    totalInterest : this.totalInterest,
    sanctionDate: this.saveForm.controls.sanctionDate.value,
    remark : this.saveForm.controls.remark.value,
    statusCode : this.saveForm.controls.statusCode.value
    }
    console.log("i m in save details");
    console.log(loginPayload);
    
    this.customerId1 = this.saveForm.controls.customerId.value;
    this.status=this.saveForm.controls.statusCode.value;
    this.se.custStatusCode(this.status,this.customerId1).subscribe();
     this.se.saveData(this.saveForm).subscribe();
    console.log(" i m in end of save details");
  }
 }

 seeLoanDetails()
 {
   this.router.navigate(['getloan']);
 }
}