package lab1;
public class FlyStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Герой летит");
    }
}
