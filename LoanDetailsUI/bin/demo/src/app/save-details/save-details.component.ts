import { Component, OnInit } from '@angular/core';
import { ServicemService } from '../servicem.service';
import { loanDetails } from '../model/loanDetails.model';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

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
  ngOnInit() {

    this.saveForm = this.formBuilder.group({
      loanCode : ['', Validators.required],
      customerId : ['', Validators.required],
      leadId : ['', Validators.required],
      loanAmount: ['', Validators.required],
      rateOfInterest :['', Validators.required],
      tenure : ['', Validators.required],
      sanctionDate :['', Validators.required],
      statuscode :['', Validators.required] ,
      marginmoney : [''],
      advanceEMI :[' '],
      processingFees:[''],
      totalInterest:[''],
      remark : ['']


    });
  }

  onSubmit() {
    if (this.saveForm.invalid) {
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
    marginmoney :this.saveForm.controls.marginmoney.value,
    advanceEMI : this.saveForm.controls.advanceEMI.value,
    processingFees : this.saveForm.controls.processingFees.value,
    totalInterest : this.saveForm.controls.totalInterest.value,
    sanctionDate: this.saveForm.controls.sanctionDate.value,
    remark : this.saveForm.controls.remark.value,
    statuscode : this.saveForm.controls.statuscode.value
    }
    console.log("i m in save details")
    this.se.saveData(this.saveForm).subscribe();
    console.log(" i m in end of save details");
  }
 }
}
