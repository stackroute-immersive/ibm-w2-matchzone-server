import { RegisterService } from './../register.service';
import { Register } from './../register';
import { NgForm } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  //register:Register;
  //emailPattern="^[a-zA-Z0-9]*@[a-zA-Z0-9-]*.[a-zA-Z0-9-]*"
  constructor(private registerService:RegisterService) { }
  public userName:String;
  public userEmail:String;
  public userPassword:String;
  register:Register= new Register();
  ngOnInit() {
    this.resetForm();
  }

  onSubmit(){
    this.register.userName= this.userName;
    this.register.userEmail = this.userEmail;
    this.register.userPassword =this.userPassword;
    this.registerService.createUser(this.register).subscribe(
      data=> console.log(data)
    );
  }


  resetForm(form?:NgForm)
  {
    if(form !=null)
    form.reset();
    this.register={
    userName:"",
    userPassword:"",
    userEmail:""
  }
  }

}
