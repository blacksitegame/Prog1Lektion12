package opgave02;

public class Hero {
    private int lifePoints;
    private int damagePoints;
    private int chanceOfHit;
    private String name;
    private String pronoun;
    private String weapon;

    public Hero(int lifePoints, int damagePoints, int chanceOfHit, String name, String pronoun, String weapon) {
        setLifePoints(lifePoints);
        setDamagePoints(damagePoints);
        setChanceOfHit(chanceOfHit);
        setName(name);
        setPronoun(pronoun);
        setWeapon(weapon);
    }

    public void attacks(int roll, Monster monster) {
        System.out.print(getName() + " attacks with " + getPronoun() + " " + getWeapon());
        if (roll <= getChanceOfHit()) {
            System.out.println(" and hits the " + monster.getDescription() + " inflicting " + getDamagePoints());
            int lifePoints = monster.getLifePoints();
            lifePoints -= damagePoints;
            monster.setLifePoints(lifePoints);
            if (monster.getLifePoints() <= 0) {
                System.out.println("killing the " + monster.getDescription());
            }
        } else {
            System.out.println(" but misses the target.");
        }
    }

    public void setLifePoints (int lifePoints){
        this.lifePoints = lifePoints;
    }
    public int getLifePoints (){
        return this.lifePoints;
    }

    public void setDamagePoints(int damagePoints){
        this.damagePoints = damagePoints;
    }
    public int getDamagePoints (){
        return this.damagePoints;
    }
    public void setChanceOfHit (int chanceOfHit){
        this.chanceOfHit = chanceOfHit;
    }
    public int getChanceOfHit (){
        return this.chanceOfHit;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return this.name;
    }
    public void setPronoun (String pronoun){
        this.pronoun = pronoun;
    }
    public String getPronoun () {
        return this.pronoun;
    }
    public void setWeapon (String weapon){
        this.weapon = weapon;
    }
    public String getWeapon (){
        return this.weapon;
    }
}
