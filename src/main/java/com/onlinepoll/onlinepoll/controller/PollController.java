package com.onlinepoll.onlinepoll.controller;

import com.onlinepoll.onlinepoll.model.Poll;
import com.onlinepoll.onlinepoll.services.PollService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/polls")
public class PollController {
    private final PollService pollService;

    public PollController(PollService pollService) {
        this.pollService = pollService;
    }

    @PostMapping("/")
    public Poll createPoll(@RequestBody Poll poll) {
        System.out.println("Create Poll" + poll);
        return pollService.createPoll(poll);
    }

}
