public class ParamClass {
    @AnnotationWIthIntParam(value = 2)
    public void printNumber(int value) {
        System.out.print("The value is: ");
        System.out.println(value);
    }

    public void printMyAge(int value) {
        System.out.println("I was born in ");
        System.out.println(2023 - value);
    }

    @AnnotationWIthIntParam(value = 4)
    private void printYourIQ(int value) {
        System.out.print("Your IQ is ");
        System.out.println(100 + value);
    }

    @AnnotationWIthIntParam(value = 3)
    protected void getSquare(int value) {
        System.out.println(value * value);
    }

    private void printBrrr(int value) {
        System.out.println("Brrr");
    }

    protected void sayHi(int value) {
        System.out.println("Hi");
    }
}
