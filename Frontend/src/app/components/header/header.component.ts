import { Component } from '@angular/core';
import {EvenementComponent} from '../evenement/evenement.component';
import {APropsComponent} from '../a-props/a-props.component';
import {FooterComponent} from '../footer/footer.component';
import {NavbarClientComponent} from '../navbar-client/navbar-client.component';

@Component({
  selector: 'app-header',
  imports: [
    EvenementComponent,
    APropsComponent,
    FooterComponent,
    NavbarClientComponent
  ],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {

}
