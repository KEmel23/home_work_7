// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] heros = {new Medick(),new Magic(),new Warrior()};
        System.out.println("Супер способность героев");
        for (int i = 0; i < heros.length; i++) {
            System.out.println(heros[i].ablySuperAbility());
            if (heros[i] instanceof Medick) {
                ((Medick) heros[i]).increaseExperience();
            }
        }
    }
}