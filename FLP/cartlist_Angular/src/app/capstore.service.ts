import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cartlist } from './cartitem';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class CapstoreService {

  
  constructor(private http: HttpClient) { }

  getCartProducts(): Observable<Cartlist[]> {
    return this.http.get<Cartlist[]>("http://localhost:6500/cartitems");
    //return this.http.get<Cartlist[]>('../../assets/cartitem.json');
  }
  deleteFromCart(cartId): Observable<Cartlist[]> {
    return this.http.delete<Cartlist[]>("http://localhost:6500/cartitems/" + cartId);
    //return this.http.delete<Cartlist[]>('../../assets/cartitem.json' + cartId);
  }
}
