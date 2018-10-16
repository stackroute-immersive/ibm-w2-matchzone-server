import { Injectable } from "@angular/core";
import { User } from "./model/user";
import {
  HttpClient,
  HttpHeaders,
  HttpErrorResponse
} from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";

@Injectable({
  providedIn: "root"
})
export class LoginService {
  private loginUrl: string = "http://172.23.239.175:8092/api/login";
  httpOptions = {
    headers: new HttpHeaders({ "Content-type": "application/json" })
  };
  localUser: User;

  constructor(private http: HttpClient) { }

  login(user: User): Observable<any> {
    this.localUser = user;
    return this.http
      .post<any>(this.loginUrl, user, this.httpOptions)
      .pipe(catchError(this.handleError));
  }
  handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      console.log("An error occured: ", error.error.message);
    } else {
      console.log(
        `Backend returned code ${error.status}`,
        +`body was:- ${error.error}`
      );
    }
    console.log(
      `Backend returned code ${error.status}`,
      +`body was:- ${error.error}`
    );
    return throwError("Something went wrong please try again");
  }
}
