import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {Quotation} from "../models/quotation.interface";
import {environment} from "../../environments/environment";
import {HttpClient} from "@angular/common/http";

@Injectable({providedIn: 'root'})

export class HttpService {

  constructor(private http: HttpClient) {}

  getQuotations(): Observable<Quotation[]>{
    return this.http.get<Quotation[]>(environment.localhost + '/quotations');
  }

}
