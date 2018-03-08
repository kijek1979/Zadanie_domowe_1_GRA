public class Priest  extends Hero{

    public Priest(String name, Side side) {
        super(name, side);
        setHP(getHP() * 1.5);
    }

    @Override
    public void doSpecialMove(Hero hero) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
