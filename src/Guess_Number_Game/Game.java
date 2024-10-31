package Guess_Number_Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public void play_game() {
        List<Integer> arr = new ArrayList<>();
        Random random = new Random();

        // Генерация 4 уникальных случайных чисел от 0 до 9
        while (arr.size() < 4) {
            int number = random.nextInt(10); // Случайное число от 0 до 9
            if (!arr.contains(number)) {
                arr.add(number);
            }
        }
        Integer whole = 0;
        Integer tri = 0;
        while (whole != 4 & tri != 5) {
            Scanner scan = new Scanner(System.in);
            Integer number = scan.nextInt();
            Integer number1 = number / 1000;
            Integer number2 = number % 1000 / 100;
            Integer number3 = number % 100 / 10;
            Integer number4 = number % 10;
            Integer afor1 = 0;
            Integer afor2 = 0;
            Integer afor3 = 0;
            Integer afor4 = 0;
            String otvet1 = "";
            String otvet2 = "";
            String otvet3 = "";
            String otvet4 = "";
            for (int x = 0; x < 4; x++) {
                if (number1 == arr.get(x)) {
                    afor1 += 1;
                }
            }
            if (number1 == arr.get(0)) {
                otvet1 = "число 1: угадано верно";
                whole += 1;
            } else if (number1 != arr.get(0) & afor1 > 0) {
                otvet1 = "число 1: присутсвтует в числе но на другом месте";
            } else {
                otvet1 = "Число 1: угадано неверно";
            }

            for (int x = 0; x < 4; x++) {
                if (number2 == arr.get(x)) {
                    afor2 += 1;
                }
            }
            if (number2 == arr.get(1)) {
                otvet2 = "число 2: угадано верно";
                whole += 1;
            } else if (number1 != arr.get(1) & afor2 > 0) {
                otvet2 = ("число 2: присутсвтует в числе но на другом месте");
            } else {
                otvet2 = ("Число 2: угадано неверно");
            }

            for (int x = 0; x < 4; x++) {
                if (number3 == arr.get(x)) {
                    afor3 += 1;
                }
            }
            if (number3 == arr.get(2)) {
                otvet3 = ("число 3: угадано верно");
                whole += 1;
            } else if (number3 != arr.get(2) & afor3 > 0) {
                otvet3 = ("число 3: присутсвтует в числе но на другом месте");
            } else {
                otvet3 = ("Число 3: угадано неверно");
            }

            for (int x = 0; x < 4; x++) {
                if (number4 == arr.get(x)) {
                    afor4 += 1;
                }
            }
            if (number4 == arr.get(3)) {
                otvet4 = ("число 4: угадано верно");
                whole += 1;
            } else if (number4 != arr.get(3) & afor4 > 0) {
                otvet4 = ("число 4: присутсвтует в числе но на другом месте");
            } else {
                otvet4 = ("Число 4: угадано неверно");
            }
            System.out.println(otvet1);
            System.out.println(otvet2);
            System.out.println(otvet3);
            System.out.println(otvet4);
            tri += 1;
            if (whole != 4) {
                whole = 0;
            }
        }
        if (whole == 4) {
            System.out.println("Вы угадали число!");
            System.out.println("количество попыток: " + tri);
        }
        if (tri == 5 & whole != 4) {
            System.out.println("Попытки закончились. Вы проиграли");
        }
    }
}