package strategy.behavior;

@FunctionalInterface
public interface MoveStrategy {

    String move();

    MoveStrategy walkingStrategy = ()-> "Je bouge en marchant";
    MoveStrategy runningStrategy = ()-> "Je bouge en courant";
}
