import { SearchService } from './../services/search.service';
import { Component, OnInit } from '@angular/core';
import { TokenStorage } from '../core/token.storage';
import { Result } from '../model/result';
import { SkillsService } from '../services/skills.service';
import { LocationService } from '../services/location.service';


@Component({
  selector: 'app-employer',
  templateUrl: './employer.component.html',
  styleUrls: ['./employer.component.css']
})
export class EmployerComponent implements OnInit {
  userName: string;
  userId: string;
  query: string;
  result: Result[] =[];
  candidateName:string;
  skills:string;
  city:string;

  constructor(private tokenStorage: TokenStorage, private searchService: SearchService,private skill:SkillsService,private location:LocationService) {

  }

  ngOnInit() {
    this.userId = this.tokenStorage.getUserId();
    this.userName = this.tokenStorage.getUserName();
  }

  onSearch(query: string) {
    this.query = query;
    this.searchService.postQuery(this.query).subscribe(
      data => {
        console.log(Object.keys(data).length);
        for (let i = 0; i < Object.keys(data).length; i++) {
          this.result[i] = data[i];
          console.log(this.result[i].userName);
          console.log(this.result[i].skills);
        
        this.skill.candidateSkills(this.result[i].userName).subscribe(
          data=>{
            console.log(data.iTSkills);
              this.result[i].skills=data.iTSkills;
             console.log(this.result[i].skills);
            
          }
        )

        this.location.candidateLocation(this.result[i].userName).subscribe(
          data=>{
            console.log(data);
             this.result[i].location=data.city;
             console.log(this.result[i].location);
            
          }
        )
      }
      }
      
    );
  }

  

}
