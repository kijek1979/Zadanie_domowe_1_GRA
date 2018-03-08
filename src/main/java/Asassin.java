public class Asassin extends Hero {

    public Asassin(String name, Side side) {
        super(name, side);
        setAttackPoints(getAttackPoints()*2.5);

    }

    @Override
    public void doSpecialMove(Hero hero) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
