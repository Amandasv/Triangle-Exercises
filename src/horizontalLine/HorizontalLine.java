package horizontalLine;

import java.util.Scanner;

public class HorizontalLine {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write a number:");
        int number = reader.nextInt();
        for (int item = 0; item < number; item++) {
            System.out.print('*');
        }


    }
}
