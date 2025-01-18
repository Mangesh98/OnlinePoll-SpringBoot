export interface OptionVote {
  voteText: string;
  voteCount: number;
}
export interface Poll {
  id: number;
  question: string;
  options: OptionVote[];
}
