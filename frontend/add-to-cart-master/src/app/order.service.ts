import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from './order';



@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private _http:HttpClient) { 
  }
  
public orderUser(order: Order):Observable<any>{
  return this._http.post<any>("http://localhost:8089/order/add",order)
}



}