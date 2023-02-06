package pl.zobaczymy;

import java.util.Scanner;

/**
 Program ilustrujący zagnieżdżoną pętlę for
 */
public class Main
{
    public static void main(String[] args)
    {
        int numStudents, numTests,
                score, total;
        double average;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj liczbę studentów");
        numStudents = keyboard.nextInt();

        System.out.println("Podaj liczbę testów zdawanych przez studentów: ");
        numTests = keyboard.nextInt();

        for (int student = 1; student <= numStudents; student++)
        {
            total = 0;

            System.out.println("Student numer " + student);
            System.out.println("-------------------");

            for (int test = 1; test <= numTests; test++)
            {
                System.out.println("Wprowadź wynik nr " + test + ": ");
                score = keyboard.nextInt();
                total += score;
            }

            average = total / numTests;
            System.out.printf("Srednia studenta nr %d wynosi %.1f.\n\n",
                    student, average);
        }
    }
}