import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetDetailsBelow300Component } from './get-details-below300.component';

describe('GetDetailsBelow300Component', () => {
  let component: GetDetailsBelow300Component;
  let fixture: ComponentFixture<GetDetailsBelow300Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetDetailsBelow300Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetDetailsBelow300Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
