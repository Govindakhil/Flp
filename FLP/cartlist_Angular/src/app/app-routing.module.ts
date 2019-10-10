import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CartDetailsComponent } from './cart-details/cart-details.component';
import { HomepageComponent } from './homepage/homepage.component';
import { PlaceOrderComponent } from './place-order/place-order.component';


const routes: Routes = [
  {path:"cartitems",component:CartDetailsComponent},
  {path:"homepage",component:HomepageComponent},
  {path:"placeorder",component:PlaceOrderComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
