import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentDeailsComponent } from './student-deails.component';

describe('StudentDeailsComponent', () => {
  let component: StudentDeailsComponent;
  let fixture: ComponentFixture<StudentDeailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StudentDeailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StudentDeailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
