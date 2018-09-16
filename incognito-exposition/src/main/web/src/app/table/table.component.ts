import { Component, OnInit } from '@angular/core';
import {TableService} from "./table.service";
import {Table} from "./Table";

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css'],
  providers: [TableService]
})
export class TableComponent implements OnInit {

  characters: Table[];
  constructor(private tableService: TableService) { }

  settings = {
    columns: {
      id: {
        title: 'ID'
      },
      name: {
        title: 'Name'
      },
      age: {
        title: 'Age'
      }
    }
  };

  ngOnInit() {
    this.tableService
      .getCharacters()
      .subscribe((data: Table[]) => this.characters = data)
    ;
  }

}
