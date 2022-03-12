package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte a = -7;
        System.out.println(a);
        short b = 136;
        System.out.println(b);
        int c = -45678;
        long d = 1234567891;
        float i = 3f;
        float f = i / 2;
        System.out.println("Переменная f равняется " + f);


        float boxerOneWeight = 78.2f;
        float boxerTwoWeight = 82.7f;
        float boxersWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Два боксера весят " + boxersWeight + " кг");
        float differentWeight = boxerTwoWeight % boxerOneWeight;
        System.out.println("Разница в весе боксеров " + differentWeight + " кг");


        int banana = 80;
        int milk100ml = 105;
        int iceCream = 100;
        int egg = 70;
        float breakfastWeight = banana * 5 + milk100ml * 2 + iceCream * 2 + egg * 4;
        System.out.println("Вес завтрака " + breakfastWeight + " грамм");
        float breakfastWeightkg = breakfastWeight / 1000;
        System.out.println("Вес завтрака в кг составляет " + breakfastWeightkg + " кг");

        int norma = 7;
        int minWeight = 250;
        int maxWeight = 500;
        int minWeightDay = norma * 1000 / minWeight;
        System.out.println("Потребуется с минимальным похудением " + minWeightDay + " дней");
        int maxWeightDay = norma * 1000 / maxWeight;
        System.out.println("Потребуется с максимальным похудением " + maxWeightDay + " дней");
        int averageResult = (maxWeightDay + minWeightDay) / 2;
        System.out.println("Среднее кол-во дней " + averageResult);


        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float newMashaSalary = mashaSalary + (mashaSalary * 0.1f);
        float newDenisSalary = denisSalary + (denisSalary * 0.1f);
        float newKristinaSalary = kristinaSalary + (kristinaSalary * 0.1f);
        float differenceMashaSalary = newMashaSalary - mashaSalary;
        float differenceDenisSalary = newDenisSalary - denisSalary;
        float differenceKristinaSalary = newKristinaSalary - kristinaSalary;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей");
        System.out.println("Годовой доход Маши вырос на " + differenceMashaSalary + " руб");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + differenceDenisSalary + " руб");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + differenceKristinaSalary + " руб");

    }
}
