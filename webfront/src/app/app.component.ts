import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'webfront';


  constructor(private http:HttpClient) {
  }

  getTestData():void{
    this.http.get("/api/books/books").subscribe(response => {
      console.log(response)
    })
  }

}
