import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetLoanDetailsComponent } from './get-loan-details.component';

describe('GetLoanDetailsComponent', () => {
  let component: GetLoanDetailsComponent;
  let fixture: ComponentFixture<GetLoanDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetLoanDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetLoanDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
