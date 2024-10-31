package Exercices;

import java.util.Scanner;
public class z2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double vclad = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        Integer months = scan.nextInt();

        for (int i = 0; i < months; i++) {
            vclad += vclad * 0.07;
        }
        System.out.println(vclad);
    }
}
