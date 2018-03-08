public class Main {

    public static void main(String[] args) {

        Hero hero = new Tank("jarek", Side.GOOD);

        System.out.println(hero.toString());
        System.out.println(hero.getHP());

    }
}
