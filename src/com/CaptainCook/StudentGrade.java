package com.CaptainCook;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter number of students");
        int numberOfStudent = inputCollector.nextInt();

        System.out.println("Enter number of subjects");
        int numberOfSubjects = inputCollector.nextInt();
        int[][] score = new int[numberOfStudent][numberOfSubjects];

        for (int student = 0; student < numberOfStudent; student++) {
            System.out.println("Entering score for student 1 " + student + 1);
            for (int subject = 0; subject < numberOfSubjects; subject++) {

                System.out.println("Enter score " + subject + 1);


            }


        }
    }
}