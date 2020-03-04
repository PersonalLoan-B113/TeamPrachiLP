import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetDetailsBtwn300Component } from './get-details-btwn300.component';

describe('GetDetailsBtwn300Component', () => {
  let component: GetDetailsBtwn300Component;
  let fixture: ComponentFixture<GetDetailsBtwn300Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetDetailsBtwn300Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetDetailsBtwn300Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
