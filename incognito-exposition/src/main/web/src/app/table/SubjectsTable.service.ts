import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class SubjectsTableService {
  constructor(private http: HttpClient) { }
  url = 'http://localhost:8081/incognito/api';
  getSubjects() {
    return this
      .http
      .get(`${this.url}/subjects`);
  }
}
