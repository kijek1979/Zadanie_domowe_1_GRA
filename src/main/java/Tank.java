public class Tank extends Hero {

    public Tank(String name, Side side) {
        super(name, side);
        setHP(getHP()*2);
        setDefPoints(getDefPoints()*1.2);
    }

    @Override
    public void doSpecialMove(Hero hero) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
