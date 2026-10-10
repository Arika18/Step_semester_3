// Source: 06_Week8_Practice_Coding_Questions
// Problem: Question 3: Online Examination System

import java.util.*;

abstract class Question {
    String text,answer; int points;
    Question(String t,String a,int p){text=t;answer=a;points=p;}
    abstract boolean correct(String response);
}
class MCQ extends Question { MCQ(String t,String a,int p){super(t,a,p);} boolean correct(String r){return answer.equalsIgnoreCase(r);} }
class TrueFalse extends Question { TrueFalse(String t,String a,int p){super(t,a,p);} boolean correct(String r){return answer.equalsIgnoreCase(r);} }
class Attempt {
    Map<Question,String> answers=new LinkedHashMap<>(); boolean submitted;
    void answer(Question q,String a){if(submitted)throw new IllegalStateException("Submitted");answers.put(q,a);}
    int submit(){submitted=true;int score=0;for(Question q:answers.keySet())if(q.correct(answers.get(q)))score+=q.points;return score;}
}
