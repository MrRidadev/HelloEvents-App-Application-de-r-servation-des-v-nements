import { ComponentFixture, TestBed } from '@angular/core/testing';

import { APropsComponent } from './a-props.component';

describe('APropsComponent', () => {
  let component: APropsComponent;
  let fixture: ComponentFixture<APropsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [APropsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(APropsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
