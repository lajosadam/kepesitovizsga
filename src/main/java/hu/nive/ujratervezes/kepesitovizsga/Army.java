package hu.nive.ujratervezes.kepesitovizsga;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Army {

    List<MilitaryUnit> armySize = new ArrayList<>();

    public int getArmySize() {
        return armySize.size();
    }

    public int getArmyDamage() {
        int dmg=    0;
        for(MilitaryUnit m: armySize){
            dmg += m.getDamagePoint();
        }

        return dmg;
    }

    public void addUnit(MilitaryUnit unit) {
        armySize.add(unit);
    }

    public void damageAll(int damagepoint) {
        armySize.forEach(x-> x.sufferDamage(damagepoint));
        armySize.removeIf(x->x.getHitPoints()<25);

    }
}
