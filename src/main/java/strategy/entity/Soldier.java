package strategy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import strategy.behavior.AttackStrategy;
import strategy.behavior.MoveStrategy;

@Data
@AllArgsConstructor
public class Soldier {
    private AttackStrategy attackBehavior;
    private MoveStrategy moveStrategy;

    public String attack(){
        return attackBehavior.attack();
    }

    public String move(){
        return moveStrategy.move();
    }
}
