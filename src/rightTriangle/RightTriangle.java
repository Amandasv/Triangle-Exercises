package rightTriangle;

import java.util.Scanner;

public class RightTriangle {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write a number:");
        int number = reader.nextInt();

        for(int column=1;column<=number;column++) {
            for (int line = 1; line <= column; line++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
