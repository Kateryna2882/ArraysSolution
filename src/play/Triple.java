package play;

public class Triple {
private final PlayType first;
private final PlayType second;
private final PlayType winner;

private Triple(PlayType first, PlayType second, PlayType winner){
    this.first = first;
    this.second = second;
    this.winner = winner;
}
}
