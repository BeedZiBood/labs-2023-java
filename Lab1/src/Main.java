import java.util.Scanner;
import lab1.*;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();

        try (Scanner in = new Scanner(System.in)) {
//          hero.setMovementStrategy(null);
//          hero.HeroMove();
            while (in.hasNext()) {
                String command = in.next();
                switch (command) {
                    case ("fly"):
                        hero.setMovementStrategy(new FlyStrategy());
                        hero.HeroMove();
                        break;
                    case ("walk"):
                        hero.setMovementStrategy(new WalkStrategy());
                        hero.HeroMove();
                        break;
                    case ("elephant"):
                        hero.setMovementStrategy(new ElephantStrategy());
                        hero.HeroMove();
                        break;
                    case ("horse"):
                        hero.setMovementStrategy(new HorseStrategy());
                        hero.HeroMove();
                        break;
                    case ("run"):
                        hero.setMovementStrategy(new RunStrategy());
                        hero.HeroMove();
                        break;
                    case ("sneak"):
                        hero.setMovementStrategy(new SneakStrategy());
                        hero.HeroMove();
                        break;
                    case ("swim"):
                        hero.setMovementStrategy(new SwimStrategy());
                        hero.HeroMove();
                        break;
                    default:
                        throw new ExceptionOfHero("Герой так не умеет");
                }
            }
        } catch (ExceptionOfHero e) {
            System.out.println(e.what());
        }
    }
}
