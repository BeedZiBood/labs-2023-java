import java.util.Collection;

public class Segregation {
    public static void segregate(Collection<? extends Chordate> srcCollection,
                                 Collection<? super CommonHedgehog> collection1,
                                 Collection<? super Manul> collection2,
                                 Collection<? super Lynx> collection3) {
        for (Chordate animal: srcCollection) {
            if (animal instanceof CommonHedgehog) {
                collection1.add((CommonHedgehog) animal);
            } else if (animal instanceof Manul) {
                collection2.add((Manul) animal);
            } else if (animal instanceof Lynx) {
                collection3.add((Lynx) animal);
            }
        }
    }
}
