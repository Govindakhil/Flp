import { TestBed } from '@angular/core/testing';

import { CapstoreService } from './capstore.service';

describe('CapstoreService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CapstoreService = TestBed.get(CapstoreService);
    expect(service).toBeTruthy();
  });
});
