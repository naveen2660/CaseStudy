import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Order } from 'src/app/order';
import { OrderService } from 'src/app/order.service';
import { CartService } from 'src/app/service/cart.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {
  order = new Order();
  msg =''

  public products : any = [];
  public grandTotal !: number;
  constructor(private cartService : CartService,private orderservice: OrderService,private router:Router) { }

  ngOnInit(): void {
    this.cartService.getProducts()
    .subscribe(res=>{
      this.products = res;
      this.grandTotal = this.cartService.getTotalPrice();
    })
  }
  removeItem(item: any){
    this.cartService.removeCartItem(item);
  }
  emptycart(){
    this.cartService.removeAllCart();
  }
  // display(myuserform:any){
  //   this.cartService.getProducts()
  //   .subscribe(res=>{alert("your order is placed successfully")})     
  // }
  orderUser(){
    this.orderservice.orderUser(this.order).subscribe(
      data =>{
        alert("your order is placed sucessfully and it will ship in 7 days");
      
        this.msg= "registration success"
      },
      error =>{
        alert("exception occured");
        this.msg=error.error;
        
      }
      
    )


}
}
