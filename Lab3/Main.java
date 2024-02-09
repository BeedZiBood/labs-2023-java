import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mammal> mammals = List.of(new Mammal[]{new CommonHedgehog(),
                new CommonHedgehog(),
                new Manul(),
                new Lynx()});
        List<Hedgehog> resHedgehogForMammal = new ArrayList<>();
        List<Cat> resCatForMammal = new ArrayList<>();
        List<Predatory> resPredatoryForMammal = new ArrayList<>();
        Segregation.segregate(mammals, resHedgehogForMammal, resCatForMammal, resPredatoryForMammal);
        System.out.println("segregate(Млекопитающие, Ежовые, Кошачьи, Хищные)");
        System.out.println("Excepted: 2 1 1");
        System.out.println("Output: " + resHedgehogForMammal.size() +
                " " + resCatForMammal.size() +
                " " + resPredatoryForMammal.size() +
                "\n");

        List<Predatory> predatory = List.of(new Predatory[]{new Lynx(),
                new Lynx(),
                new Lynx()});
        List<Chordate> resChordateForPredatory = new ArrayList<>();
        List<Manul> resManulForPredatory = new ArrayList<>();
        List<Cat> resCatForPredatory = new ArrayList<>();
        Segregation.segregate(predatory, resChordateForPredatory, resManulForPredatory, resCatForPredatory);
        System.out.println("segregate(Хищные, Хордовые, Манулы, Кошачьи)");
        System.out.println("Excepted: 0 0 3");
        System.out.println("Output: " + resChordateForPredatory.size() +
                " " + resManulForPredatory.size() +
                " " + resCatForPredatory.size() +
                "\n");

        List<Hedgehog> hedgehogs = List.of(new Hedgehog[]{
                new CommonHedgehog(),
                new CommonHedgehog()});
        List<Insectivore> resInsectivoreForHedgehog = new ArrayList<>();
        List<Predatory> resFirstPredatoryForHedgehog = new ArrayList<>();
        List<Predatory> resSecondPredatoryForHedgehog = new ArrayList<>();
        Segregation.segregate(hedgehogs, resInsectivoreForHedgehog,
                resFirstPredatoryForHedgehog, resSecondPredatoryForHedgehog);
        System.out.println("segregate(Ежовые, Насекомоядные, Хищные, Хищные)");
        System.out.println("Excepted: 2 0 0");
        System.out.println("Output: " + resInsectivoreForHedgehog.size() +
                " " + resFirstPredatoryForHedgehog.size() +
                " " + resSecondPredatoryForHedgehog.size() +
                "\n");
    }
}
