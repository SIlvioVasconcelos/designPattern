package strategy.behavior;


@FunctionalInterface
public interface AttackStrategy {
    String attack();

    AttackStrategy swordStrategy = () -> "J'attaque à l'épée";
    AttackStrategy bowStrategy = () -> "J'attaque à l'arc";
    AttackStrategy magicianStrategy = () -> "Je lance des sorts";
}
