import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StudentListComponent } from './student-list/student-list.component';
import { CreateStudentComponent } from './create-student/create-student.component';
import { UpdateStudentComponent } from './update-student/update-student.component';
import { StudentDeailsComponent } from './student-deails/student-deails.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path:'students',component:StudentListComponent},
  {path:'create-student',component:CreateStudentComponent},
  // {path:'',redirectTo:'home',pathMatch:'full'},
  {path: 'update-student/:id',component:UpdateStudentComponent},
  {path: 'student-deails/:id',component:StudentDeailsComponent},
  //{path: 'home', component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
