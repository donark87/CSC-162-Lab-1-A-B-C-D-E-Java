// Donark Patel
// CSC 162-C1
// Date 5/14/2018
// Lab 1D
// This program grades the driving licence exam.


import java.util.Scanner;
public class Lab1D
    {
        public static void main (String [] args )
        {
            int intCount,correctAnswer,wrongAnswer;
            intCount = 0;
            String str;
            boolean result;

            Scanner kb = new Scanner(System.in);
            char [] userAnswer = new char[20];
            System.out.println("Enter your answers to the exam question. (Make sure Caps Lock is ON!)");
            while (intCount <= userAnswer.length - 1)
            {
                System.out.println("Question " + (intCount + 1) +" :" );
                str = kb.nextLine();
                str = str.toUpperCase();
                userAnswer[intCount] = str.charAt(0);



                intCount++;
            }



            DriverExam ua = new DriverExam();

            correctAnswer = ua.getCorrectAnswer(userAnswer);
            wrongAnswer = ua.getWrongAnswer(userAnswer);
            result = ua.getResult(correctAnswer);

            System.out.println("Correct answer: " + correctAnswer);
            System.out.println("Incorrect answers: " + wrongAnswer);
            if (result)
            {
                System.out.println("You passed the exam");
            }
            else
            {
                System.out.println("You failed the exam");
            }
            ua.getMissedQuestion(userAnswer);
        }

}
