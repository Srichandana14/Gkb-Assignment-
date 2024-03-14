import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-validate-form',
  templateUrl: './validate-form.component.html',
  styleUrls: ['./validate-form.component.css']
})
export class ValidateFormComponent {

  // user = {
  //   name: '',
  //   email: '',
  //   age: null,
  //   dob: ''
  // };

  user: any = {};

  constructor(private http: HttpClient) {}

  submitForm(formValue: any) {
    this.http.post<any>('http://localhost:8085/addUser', this.user).subscribe(
      response => {
        console.log('Form data submitted successfully:', response);
        // Optionally, reset the form after successful submission
        this.user = {};
      },
      error => {
        console.error('Error submitting form data:', error);
      }
    );
  }
}
