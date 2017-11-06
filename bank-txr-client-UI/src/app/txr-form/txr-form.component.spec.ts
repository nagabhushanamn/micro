import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TxrFormComponent } from './txr-form.component';

describe('TxrFormComponent', () => {
  let component: TxrFormComponent;
  let fixture: ComponentFixture<TxrFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TxrFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TxrFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
