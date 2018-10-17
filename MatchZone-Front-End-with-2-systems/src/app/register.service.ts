import { Register } from "./register";
import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class RegisterService {
  _url = "http://172.23.239.175:8093";
  constructor(private _http: HttpClient) { }

  createUser(register) {
    console.log("create user service called ", register)
    // return this._http.post(`${this._url}/api/v1/user`, register, { responseType: 'text' });
    return this._http.post('http://172.23.239.175:8093/api/v1/user', register, { responseType: 'text' });
  }
}
