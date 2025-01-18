package com.onlinepoll.onlinepoll.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class OptionVote {
    private String voteText;
    private Long voteCount = 0L;
}
