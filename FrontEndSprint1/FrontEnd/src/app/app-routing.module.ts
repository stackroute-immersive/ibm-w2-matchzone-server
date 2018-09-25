import { AcademicDetailsComponent } from './academic-details/academic-details.component';
import { CertificationComponent } from './certification/certification.component';
import { ProjectComponent } from './project/project.component';
import { PersonalDataComponent } from './personal-data/personal-data.component';
import { CardsComponent } from './cards/cards.component';
import { LoginComponent } from './login/login.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { SkillsComponent } from './skills/skills.component';
import { LocationComponent } from './location/location.component';

const routes: Routes = [
    {
      path:'',
      component:HomeComponent
    },
    {
      path:'register',
      component:RegisterComponent
    },
    {
      path:'login',
      component:LoginComponent
    },
    {
      path:'cards',
      component:CardsComponent
    },
    {
      path:'personal-data',
      component:PersonalDataComponent
    },
    {
      path:'skills',
      component:SkillsComponent
    },
    {
      path:'project',
      component:ProjectComponent
    },
    {
      path:'location',
      component:LocationComponent
    },
    {
      path:'certification',
      component:CertificationComponent
    },
    {
      path:'academic-details',
      component:AcademicDetailsComponent
    }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }