import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetDetailsAbove300Component } from './get-details-above300.component';

describe('GetDetailsAbove300Component', () => {
  let component: GetDetailsAbove300Component;
  let fixture: ComponentFixture<GetDetailsAbove300Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetDetailsAbove300Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetDetailsAbove300Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
