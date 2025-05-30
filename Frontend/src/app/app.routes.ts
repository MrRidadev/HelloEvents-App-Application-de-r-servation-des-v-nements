import { Routes } from '@angular/router';
import {EvenementComponent} from './components/evenement/evenement.component';
import {APropsComponent} from './components/a-props/a-props.component';
import {HeaderComponent} from './components/header/header.component';
import {DashboardComponent} from './components/dashboard/dashboard.component';

export const routes: Routes = [
  {
    path :"",
    component : HeaderComponent
  },
  {
    path : "evenement",
    component : EvenementComponent
  },
  {
    path :"props",
    component : APropsComponent
  },
  {
    path :'dashbord',
    component : DashboardComponent
  }
];
