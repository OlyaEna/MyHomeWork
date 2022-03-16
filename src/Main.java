import services.Helper;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        try {
            helper.showOptions();
        } catch (InputMismatchException e) {
            System.out.println("Wrong option! Try again");
        }
    }
}
