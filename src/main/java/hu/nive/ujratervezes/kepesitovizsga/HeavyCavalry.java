package hu.nive.ujratervezes.kepesitovizsga;

public class HeavyCavalry extends MilitaryUnit{

    int numberOfAttacks = 0;

    public HeavyCavalry() {
        setLifePont(150);
        setDamagePoint(20);
        setShield(true);
    }

    @Override
    public int doDamage() {
        if(numberOfAttacks == 0) {
            numberOfAttacks++;
            System.out.println("damage: " +getDamagePoint()*3 );
            return getDamagePoint()*3;
        }
        System.out.println("damage: " +getDamagePoint() );

        return getDamagePoint();
    }

    @Override
    public int getDamagePoint() {
        return super.getDamagePoint();
    }

    @Override
    public int sufferDamage(int damage) {
        if(isShield()){
            setLifePont(getLifePont()-damage/2);
        } else{
            super.sufferDamage(damage);
        }
        return getLifePont();
    }
}
