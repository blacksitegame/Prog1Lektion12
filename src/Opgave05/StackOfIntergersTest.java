package Opgave05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StackOfIntergersTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a Number: ");
        StackOfIntegers stack = new StackOfIntegers(scanner.nextInt());
    }
}
