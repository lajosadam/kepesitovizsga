package hu.nive.ujratervezes.kepesitovizsga;

public class Swordsman extends MilitaryUnit{

    public Swordsman(boolean shields) {
        setShield(shields);
        setLifePont(100);
        setDamagePoint(10);
    }

    @Override
    public int sufferDamage(int damage) {
        if(this.isShield()){
            this.setShield(false);
            return getLifePont();
        }
        return super.sufferDamage(damage/2);

    }
}
