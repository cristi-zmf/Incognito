import {Component, OnInit} from '@angular/core';
import {SubjectsTableService} from "./SubjectsTable.service";
import {TableModule} from 'primeng/table';
import {Subject} from "../table/Subject";

@Component({
  selector: 'app-table',
  templateUrl: './subjectsTable.component.html',
  styleUrls: ['./subjectsTable.component.css'],
  providers: [SubjectsTableService, TableModule]
})
export class TableComponent implements OnInit {

  subjects: Subject[];
  cols: any[];
  constructor(private tableService: SubjectsTableService) { }

  ngOnInit() {
    this.tableService
      .getSubjects()
      .subscribe((data: Subject[]) => this.subjects = data)
    ;

    this.cols = [
      {field: 'title.value', header: 'Title'},
      {field: 'description.value', header: 'Description'}
    ];
  }

}
