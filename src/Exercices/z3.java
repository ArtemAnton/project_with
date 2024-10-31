package Exercices;

import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {

        System.out.println("введите строку");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println("введите символ");
        Scanner scan2 = new Scanner(System.in);
        String letter = scan.nextLine();

        Integer a = 0;
        int i = 0;
        char comparisonChar = word.charAt(i);
        for (i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == comparisonChar){
                a += 1;
            }
        }
        System.out.println(a);
    }
}
//написать программу, которая подсчитывает появления того или иного символа в заданной строке.