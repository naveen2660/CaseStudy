import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartService } from 'src/app/service/cart.service';
import { User } from 'src/app/user';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {
  user = new User();
  msg =''
  invalidLogin = false;
  public totalItem : number = 0;
  public searchTerm !: string;
  constructor(private cartService : CartService ,private userservice : UserService, private router:Router ) { }

  ngOnInit(): void {
    this.cartService.getProducts()
    .subscribe(res=>{
      this.totalItem = res.length;
    })
  }
  search(event:any){
    this.searchTerm = (event.target as HTMLInputElement).value;
    console.log(this.searchTerm);
    this.cartService.search.next(this.searchTerm);
  }
  login(){
    if(this.userservice.loginUser(this.user)){
    this.userservice.loginUser(this.user).subscribe(
      (data:User)=>{
        alert("Sign in successfully")
        this.user=data;
        this.router.navigate(['/cart']);
         
 
        //this.redirect();
      }
     
    );}
    else{
      alert("Invalid Login Credentials");
      this.msg="Enter valid email and password";
    }
   }
   registerUser(){
    this.userservice.registerUser(this.user).subscribe(
      data =>{
        alert("Successfully registered");
      
        this.msg= "registration success"
      },
      error =>{
        alert("exception occured");
        this.msg=error.error;
        
      }
      
    )
  }
   
  //  redirect(){
    
  //     if(this.user.useremail=="Admin@gmail.com" && this.user.password==123456789){
  //      sessionStorage.setItem('role','admin');
  //      sessionStorage.setItem('useremail',String(this.user.useremail));
  //      this.invalidLogin=false;
  //      this.router.navigate(['']).then(()=>{
  //        window.location.reload();
  //      })
  //    }
  //    else {
  //     sessionStorage.setItem('role','customer');
  //     sessionStorage.setItem('useremail',String(this.user.useremail));
  //     this.invalidLogin=false;
  //     this.router.navigate(["/cart"]).then(()=>{
  //       window.location.reload();
  //     });

  //   }

  //  }
  }