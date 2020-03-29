import {Component, OnInit} from '@angular/core';
import {HttpService} from "../../services/http.service";
import {Quotation} from "../../models/quotation.interface";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  quotations: Quotation[];

  constructor(private httpService:HttpService) {}

  ngOnInit() {
    this.httpService.getQuotations().subscribe(quotations => {
      this.quotations = quotations;
    });
  }

}
