package com.example;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

    Child child1 = new Child();
    child1.some();
    child1.some();
    Child child2 = new Child();
    child2.some();
    System.out.println("Количество вызывов метода some: " + Child.totalAmount);
    }

    public static void parserSite() throws IOException {
        URL website = new URL("https://upakovshik.com");
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fileOutputStream = new FileOutputStream("data.html");
        fileOutputStream.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }

    public static void writeReadNewFile() throws IOException {
        File file = new File("hello.txt");
        if (!file.exists())
            file.createNewFile();

        PrintWriter pw = new PrintWriter(file);
        pw.println("Some text");
        pw.close();

        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }

    public static void guessNumber() {
        System.out.println("Вам нужно угадать число от 1 до 10" +
                "\nВведите число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Random random = new Random();
        int happyNumber = random.nextInt(10 - 1 + 1);

        while (number != happyNumber) {
            System.out.println("Вы не угадали!");
            if (number < happyNumber)
                System.out.println("Вы ввели слишком маленькое значение!");
            else System.out.println("Вы ввели слишком большое значение!");
            number = scanner.nextInt();
        }

        System.out.println("Поздравляю! Вы угадали!");
    }


    public static void depositCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        double summa = scanner.nextInt();
        System.out.println("Введите количество лет:");
        double countYear = scanner.nextInt();
        System.out.println("Введите процентную ставку:");
        double percent = scanner.nextInt();

        int i;

        for (i = 1; i < countYear; i++) {
            summa *= 1 + percent / 100;
            System.out.printf("После " + i + " года " + "%.2f", summa);
            System.out.println();
        }

        System.out.printf("В итоге, после " + i + " лет сумма составит " + "%.2f", summa);

    }

    public static void summaNumber() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int rezult = 0;

        while (number != 0) {
            rezult += number % 10;
            number /= 10;
        }
        System.out.println("Ответ: " + rezult);
    }
}