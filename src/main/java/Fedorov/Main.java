package Fedorov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();

    }
    //1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
    // - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов:
    // "a > b", "a < b" или "a = b";
    // - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
    public static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число ");
        int b = scanner.nextInt();
        if (a > b){
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else   {
            System.out.println("a = b");
        }
        System.out.println("Введите операнд");
        String operand = scanner.next();
        switch (operand){
            case "+":
                System.out.println(a+b); break;
            case  "-":
                System.out.println(a-b); break;
            case "/":
                if (b == 0){
                    System.out.println("Делить на ноль нельзя");
                }
                else{System.out.println(a/b);} break;
            case "*":
                System.out.println(a*b); break;
        }
    }

    //2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
    //В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"

    private static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово ");
        String a = scanner.nextLine();
        System.out.println("Введите второе слово ");
        String b = scanner.nextLine();
        if (a.equals(b)){
            System.out.println("Строки идентичны");
        }
        else System.out.println("Строки неидентичны");
    }

//    3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]  необходимо написать программу,
//    которая выведет в консоль все чётные числа.
    private static void thirdTask() {

        int[]  intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        for (int i : intArray) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}

