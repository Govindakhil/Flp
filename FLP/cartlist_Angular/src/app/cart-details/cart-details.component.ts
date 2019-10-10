import { Component, OnInit } from '@angular/core';
import { CapstoreService } from '../capstore.service';
import { Cartlist } from '../cartitem';


@Component({
  selector: 'app-cart-details',
  templateUrl: './cart-details.component.html',
  styleUrls: ['./cart-details.component.css']
})
export class CartDetailsComponent implements OnInit {

  constructor(private service:CapstoreService) { }
 
  cartlist:Cartlist[];
  ngOnInit() {
  

    this.service.getCartProducts().subscribe(data => {
      this.cartlist = data;
      console.log(this.cartlist);
      });
  }

  deleteProduct(cartId) {
   
    if (confirm("Are you sure to REMOVE??")) {
      
    this.service.deleteFromCart(cartId).subscribe(data => {
    this.cartlist = data;
    });
    }
    }
}
