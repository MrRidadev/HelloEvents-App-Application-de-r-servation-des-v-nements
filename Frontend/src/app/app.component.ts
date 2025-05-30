import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {NavbarClientComponent} from './components/navbar-client/navbar-client.component';
import {HeaderComponent} from './components/header/header.component';
import {EvenementComponent} from './components/evenement/evenement.component';
import {APropsComponent} from './components/a-props/a-props.component';
import {FooterComponent} from './components/footer/footer.component';
import {DashboardComponent} from './components/dashboard/dashboard.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, NavbarClientComponent, HeaderComponent, EvenementComponent, APropsComponent, FooterComponent, DashboardComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Frontend';
}
