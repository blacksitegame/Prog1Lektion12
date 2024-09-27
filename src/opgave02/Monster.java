package opgave02;

public class Monster {
    private int lifePoints;
    private int damagePoints;
    private int chanceOfHit;
    private String description;
    private String attackDescription;
    public Monster(int lifePoints, int damagePoints, int chanceOfHit, String description, String attackDescription) {
        setLifePoints(lifePoints);
        setDamagePoints(damagePoints);
        setChanceOfHit(chanceOfHit);
        setDescription(description);
        setAttackDescription(attackDescription);
    }
    public void attacks(int roll, Hero hero) {
        System.out.print("the " + getDescription() + " " + getAttackDescription());
        if (roll <= getChanceOfHit()) {
            System.out.println(" inflicting " + getDamagePoints() + " damage");
            int lifepoints = hero.getLifePoints();
            lifepoints -= damagePoints;
            setLifePoints(lifepoints);
            if (hero.getLifePoints() <= 0) {
                System.out.println("Slaying " + hero.getName());
            }
        } else {
            System.out.println(" but " + hero.getName() + " defends heroically");
        }
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setChanceOfHit(int chanceOfHit) {
        this.chanceOfHit = chanceOfHit;
    }

    public int getChanceOfHit() {
        return chanceOfHit;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAttackDescription(String attackDescription) {
        this.attackDescription = attackDescription;
    }

    public String getAttackDescription() {
        return attackDescription;
    }

}
