import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input here: ");
        String inputHere = input.nextLine();

        System.out.println("You entered in " + inputHere + ".\n");

        if(StringUtils.isNumeric(inputHere)) {
            System.out.println("You typed in a number!\n");
        } else {
            System.out.println("This is not a number.\n");
        }


        System.out.println("This is your input with the cases swapped: " + StringUtils.swapCase(inputHere));
        System.out.println();
        System.out.println("This is your input reversed: " + StringUtils.reverse(inputHere));
        System.out.println();
    }
}
