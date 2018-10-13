import { SearchService } from './../services/search.service';
import { Component, OnInit } from '@angular/core';
import { TokenStorage } from '../core/token.storage';

@Component({
  selector: 'app-employer',
  templateUrl: './employer.component.html',
  styleUrls: ['./employer.component.css']
})
export class EmployerComponent implements OnInit {
  userName: string;
  userId: string;
  query:string;
  isPressed=false;

  constructor(private tokenStorage: TokenStorage,private searchService:SearchService) { 
    this.userId = tokenStorage.getUserId();
    this.userName = tokenStorage.getUserName();
  }

  ngOnInit() {
  }
  onSearch(query:string){
    this.isPressed=true;
    this.query=query;
    this.searchService.postQuery(this.query).subscribe(
      data=> console.log(data)
    );
  }

}
