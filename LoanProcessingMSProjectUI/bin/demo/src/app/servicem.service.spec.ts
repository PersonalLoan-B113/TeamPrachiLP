import { TestBed } from '@angular/core/testing';

import { ServicemService } from './servicem.service';

describe('ServicemService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServicemService = TestBed.get(ServicemService);
    expect(service).toBeTruthy();
  });
});
