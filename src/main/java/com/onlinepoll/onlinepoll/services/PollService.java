package com.onlinepoll.onlinepoll.services;

import com.onlinepoll.onlinepoll.model.Poll;
import com.onlinepoll.onlinepoll.repositories.PollRepository;
import org.springframework.stereotype.Service;

@Service
public class PollService {
    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }
}
