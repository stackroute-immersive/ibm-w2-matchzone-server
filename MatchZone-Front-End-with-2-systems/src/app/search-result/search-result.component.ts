import { Component, OnInit } from '@angular/core';
import { Result } from 'src/app/model/result';

@Component({
  selector: 'app-search-result',
  templateUrl: './search-result.component.html',
  styleUrls: ['./search-result.component.css']
})
export class SearchResultComponent implements OnInit {
  result:Result;
  constructor() { }

  ngOnInit() {
  }

}
