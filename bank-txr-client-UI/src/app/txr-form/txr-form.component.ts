import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from '@angular/forms';
import {Http} from '@angular/http';

@Component({
  selector: 'app-txr-form',
  templateUrl: './txr-form.component.html',
  styleUrls: ['./txr-form.component.css']
})
export class TxrFormComponent implements OnInit {

  txrForm: FormGroup;
  constructor(private fb: FormBuilder, private http: Http) {}

  ngOnInit() {
    this.txrForm = this.fb.group({
      amount: [0],
      from: [''],
      to: ['']
    });
  }

  handleSubmit() {
    this.http.post('http://localhost:8080/txr', this.txrForm.value)
      .subscribe(resp => {
        console.log(resp);
      });
  }

}
