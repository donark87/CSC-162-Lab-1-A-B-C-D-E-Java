

public class DriverExam {

    int intCount;
    Character [] correctAnswer = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};


    public DriverExam(){
        intCount = 0;
    }

    public int getCorrectAnswer(char[] userAnswer)
    {
        int countCorrectAnswer = 0;
        while (intCount <= correctAnswer.length - 1)
        {
           if (userAnswer[intCount] ==  correctAnswer[intCount])
           {
               countCorrectAnswer++;
           }
            intCount++;
        }
        return countCorrectAnswer;


    }
    public int getWrongAnswer(char[] userAnswer)
    {
        int countWrongAnswer = 0;
        intCount = 0;
        while (intCount <= correctAnswer.length - 1)
        {
            if (userAnswer[intCount] !=  correctAnswer[intCount])
            {
                countWrongAnswer++;
            }
            intCount++;
        }
        return countWrongAnswer;


    }
    public boolean getResult(int correctAnswer)
    {
        boolean result;
        if (correctAnswer > 14)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
    public void getMissedQuestion(char [] userAnswer)
    {
        intCount = 0;
        System.out.println("You missed these questions");
        while (intCount <= correctAnswer.length - 1)
        {
            if (userAnswer[intCount] !=  correctAnswer[intCount])
            {
                System.out.println("Question: " + (intCount +1));
            }
            intCount++;
        }
    }
}
