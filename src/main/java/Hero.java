import java.time.LocalDateTime;

public abstract class Hero {

    private  String name;
    private double HP;
    private double attackPoints;
    private  double defPoints;
    Side side;
    LocalDateTime spawnDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    public double getDefPoints() {
        return defPoints;
    }

    public void setDefPoints(double defPoints) {
        this.defPoints = defPoints;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public LocalDateTime getSpawnDate() {
        return spawnDate;
    }

    public void setSpawnDate(LocalDateTime spawnDate) {
        this.spawnDate = spawnDate;
    }

    public Hero(String name, Side side) {
        this.name = name;
        this.side = side;
        this.HP = 1000;
        boolean isBoss = false;
        this.attackPoints = 100;
        this.defPoints= 50;
        this.spawnDate = LocalDateTime.of(2018, 1, 1,0,0);

    }

    public abstract void doSpecialMove(Hero hero);

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", attackPoints=" + attackPoints +
                ", defPoints=" + defPoints +
                ", side=" + side +
                ", spawnDate=" + spawnDate +
                '}';
    }
}
