/*
 * Author : Aderonke Adebayo
 * Date : 09/27/2019
 * Project : Project 1
 */


import java.util.Scanner;

public class GradingSystem {
    public static String getGrade(float marks)
    {
        if(marks>=93)
            return "A";
        else if(marks>=90)
            return "A-";
        else if(marks>=87)
            return "B+";
        else if(marks>=83)
            return "B";
        else if(marks>80)
            return "B-";
        else if(marks>=77)
            return "C+";
        else if(marks>=73)
            return "C";
        else if(marks>=70)
            return "C-";
        else if(marks>=67)
            return "D+";
        else if(marks>=63)
            return "D";
        else if(marks>=60)
            return "D-";
        else
            return "F";
    }
    public static void main(String[] args) {
        System.out.println("******* Java class grade calculating system using a syllabus specification *******\n");
        Scanner input = new Scanner(System.in);
        System.out.print("How many assignment did you have for this class? ");
        float marks=0;
        int noOfAsg=input.nextInt();
        float totalMarksOfAsg= 150;//Total worth for 5 assignments
        float obtainedMarksOfAsg=0;
        for(int i=0;i<noOfAsg;i++)
        {

            System.out.print("Enter obtained Marks of Assignment "+(i+1)+": "); //Get score from user for each assignment
            obtainedMarksOfAsg+=input.nextFloat();
        }
        if(noOfAsg>0)
            marks= obtainedMarksOfAsg/totalMarksOfAsg*30; //Assignment is worth 20% of total grade.

        System.out.print("How many Projects did you have for this class?  ");
        int noOfProj=input.nextInt();
        float totalMarksOfProj=600;//Total worth for 3 projects
        float obtainedMarksOfProj=0;
        for(int i=0;i<noOfProj;i++)
        {
            System.out.print("Enter Obtained Marks of Project "+(i+1)+": "); //Get score from user for each Project
            obtainedMarksOfProj+=input.nextFloat();
        }
        if(noOfProj>0)
            marks += obtainedMarksOfProj/totalMarksOfProj*20;//Project is worth 20% of total grade.


        System.out.print("How many quiz did you have for this class?  ");
        int noOfQuiz=input.nextInt();
        float totalMarksOfQuiz=100; //Total worth for 5 quizzes
        float obtainedMarksOfQuiz=0;
        for(int i=0;i<noOfQuiz;i++)
        {
            System.out.print("Enter Obtained Marks of Quiz "+(i+1)+": "); //Get score from user for each Quiz
            obtainedMarksOfQuiz+=input.nextFloat();
        }
        if(noOfQuiz>0)
            marks += obtainedMarksOfQuiz/totalMarksOfQuiz*20; //Quiz is worth 20% of total grade.
        System.out.print("How many exams did you have for this class?  ");
        int noOfExams=input.nextInt();
        float totalMarksforExam=400;//Total worth for 2 exams
        float obtainedMarksOfExam=0;
        for(int i=0;i<noOfExams;i++)
        {
            System.out.print("Enter Obtained Marks of Exam "+(i+1)+": ");//Get score from user for each Exam
            obtainedMarksOfExam+=input.nextFloat();
        } // Exam percentage was not on the syllabus, so i made project 20% and exam 20% since we were told to add
        //exam in the last class.
        if(noOfExams>0)
            marks += obtainedMarksOfExam/totalMarksforExam*20; //Exam is worth 20% of total grade.
        float participation = 50; //Total worth for student participation
        System.out.print("Enter Obtained Marks of Participation: ");
        float obtainedMarksOfPart=input.nextFloat();

        marks+=obtainedMarksOfPart/participation*10; //Participation is worth 10% of total grade.
        System.out.println("You did "+noOfAsg+" out of 5 Assignments in this class this semester");
        System.out.println("You did "+noOfQuiz+" out of 5 Quizzes in this class this semester");
        System.out.println("You did "+noOfProj+" out of 3 Projects in this class this semester");
        System.out.println("You did "+noOfExams+" out of 2 Exams (midterm and final) in this class this semester");
        System.out.println("You scored a total of "+marks+"% and your grade for this class is: "+getGrade(marks));
    }

}
