package Exercices;

import java.util.Scanner;
public class z1 {
    public static void main(String[] args){
        System.out.println("введите население");
        Scanner scan = new Scanner(System.in);
        Integer people = scan.nextInt();

        System.out.println("введите рождаемость на 1000 человек");
        Scanner scan2 = new Scanner(System.in);
        Integer burn = scan.nextInt();

        System.out.println("введите смертность на 1000 человек");
        Scanner scan3 = new Scanner(System.in);
        Integer die = scan.nextInt();

        System.out.println("введите промежуток времени");
        Scanner scan4 = new Scanner(System.in);
        Integer years = scan.nextInt();

        Integer burned = (people/1000) * burn;
        Integer died = (people/1000) * die;

        Integer people_after = people - (died * years) + (burned * years);
        System.out.println(people_after);
    }
}