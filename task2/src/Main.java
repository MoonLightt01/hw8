import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.

        //Наибольший

        if (first > second && first > third) {
            greatest = first;
        }
        if (second > first && second > third) {
            greatest = second;
        }
        if (third > second && third > first) {
            greatest = third;
        }


        //Наименьший

        if (first < second && first < third) {
            smallest = first;
        }
        if (second < first && second < third) {
            smallest = second;
        }
        if (third < second && third < first) {
            smallest = third;
        }


        //Средний

        if (first > second && second > third) {
            average = second;
        }
        if (second > first && first > third) {
            average = first;
        }
        if (first > third && third > second) {
            average = third;
        }
        if (first < second && second < third) {
            average = second;
        }
        if (second < first && first < third) {
            average = first;
        }
        if (first < third && third < second) {
            average = third;
        }




        //todo


        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
