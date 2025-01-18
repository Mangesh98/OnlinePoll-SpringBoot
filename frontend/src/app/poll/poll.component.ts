import { Component, OnInit } from '@angular/core';
import { PollService } from '../poll.service';
import { Poll } from '../poll.model';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-poll',
  imports: [CommonModule,FormsModule],
  templateUrl: './poll.component.html',
  styleUrl: './poll.component.css',
})
export class PollComponent implements OnInit{
  polls: Poll[] = [];
  constructor(private pollService: PollService) {}
  ngOnInit(): void {
    this.loadPolls();
  }
  loadPolls() {
    this.pollService.getPolls().subscribe({
      next: (polls) => {
        this.polls = polls;
      },
      error: (err) => {
        console.error("Error fetching polls"+err);
      },
    });
  }
}
