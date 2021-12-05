package strategy;


import strategy.behavior.AttackStrategy;
import strategy.behavior.MoveStrategy;
import strategy.entity.Soldier;

public class Main {
    public static void main(String[] args) {
        Soldier firstSoldier = new Soldier(AttackStrategy.swordStrategy, MoveStrategy.walkingStrategy);
        System.out.println(firstSoldier.attack());
        System.out.println(firstSoldier.move());
        firstSoldier.setAttackBehavior(AttackStrategy.magicianStrategy);
        System.out.println(firstSoldier.attack());

    }
}
