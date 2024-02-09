import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ParamListener Listener = new ParamListener();
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                int command = in.nextInt();
                Listener.runPrivateOrProtectedMethodWithParam(command);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
