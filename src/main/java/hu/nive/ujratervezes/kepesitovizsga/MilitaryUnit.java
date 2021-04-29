package hu.nive.ujratervezes.kepesitovizsga;

public abstract class MilitaryUnit {

    private int lifePont;
    private int damagePoint;
    private boolean shield;

    public int getLifePont() {
        return lifePont;
    }

    public void setLifePont(int lifePont) {
        this.lifePont = lifePont;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public int doDamage(){
        return damagePoint;
    }
    public int sufferDamage(int damage){
        return lifePont-=damage;
    }

    public int getHitPoints(){
        return getLifePont();
    }

    @Override
    public String toString() {
        return "MilitaryUnit{" +
                "lifePont=" + lifePont +
                ", damagePoint=" + damagePoint +
                ", shield=" + shield +
                '}';
    }

    public boolean isShield() {
        return shield;
    }
}
