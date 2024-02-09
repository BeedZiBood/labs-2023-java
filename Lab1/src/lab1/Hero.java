package lab1;
public class Hero {
    private MovementStrategy movement;

    public void setMovementStrategy(MovementStrategy rhs) {
        movement = rhs;
    }

    public void HeroMove() throws ExceptionOfHero {
        if (movement != null) {
            movement.move();
        } else {
            throw new ExceptionOfHero("null");
        }
    }
}
