import { Component, OnInit } from "@angular/core";
import { User } from "../model/user";
import { LoginService } from "../login.service";
import { error } from "@angular/compiler/src/util";
import { TokenStorage } from "../core/token.storage";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"]
})
export class LoginComponent implements OnInit {
  userEmail: string = "";
  userPassword: string = "";
  user: User = new User();
  error: any;

  constructor(
    private loginService: LoginService,
    private token: TokenStorage,
    private router: Router
  ) {}

  ngOnInit() {}

  onLogin() {
    this.user.userEmail = this.userEmail;
    this.user.userPassword = this.userPassword;

    this.loginService.login(this.user).subscribe(data => {
      this.token.saveToken(data["token"], data["emailId"]);
      this.router.navigate(["cards"]);
      error => (this.error = error);
    });
  }
}
