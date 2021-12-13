package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {3, 2, 1, 6, 5};

        reverse(array);
    }

    static int consInput() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void yearChecker(int year){
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println("«" + (year) + " год является високосным».");
        } else System.out.println("«" + (year) + " год не является високосным».");
    }

    static String doubleIfUnoExc(String firstMsg, String secondMsg, String thrdExp, int x) {

        if (x == 1) {
            return firstMsg;
        } else if (x == 2) {
            return secondMsg;
        } else {
            return thrdExp;
        }
    }
    static int exercise1() {

        System.out.println("Пожалуйста выбирети ваше устройство. 1.IOS or 2.Android - 1 или 2?");

        String firstMsgEx1 = "Установите версию приложения для iOS по ссылке";
        String secondMsgEx1 = "Установите версию приложения для Android по ссылке";
        String thrdExpEx1 = "Повторите попытку, что то пошло не так";
        int buffer = consInput();

        String res = doubleIfUnoExc(firstMsgEx1, secondMsgEx1, thrdExpEx1, buffer);
        System.out.println(res);
        return buffer;

    }
    static void exercise2() {
        int model = exercise1();
        System.out.println("Пожалуйста выбирети год производства вашего устройство. 1.до 2015 года или 2.старше 2015 - 1 или 2?");
        int year = consInput();
        if (year == 1) {
            year = -1;
        } else year = 1;

        int res = model * year;


        switch (res) {
            case -1 -> System.out.println("Лучше установите облегченную версию приложения для iOS по ссылке");
            case -2 -> System.out.println("Лучше установите облегченную версию приложения для Android по ссылке");
            default -> System.out.println("Отлично переходите по ссылке");
        }
    }

    public static void exercise3(float distance){

        final float mainDivisor = 40f;
        float quotient = distance / mainDivisor;
        int calculationOfDeliveryTime = Math.round(quotient) + 1;
        System.out.println("\"Потребуется дней: " + (calculationOfDeliveryTime) + "\"");
    }

    public static void reverse(int[] intArray) {
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
    }
}
