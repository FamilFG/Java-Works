package ExceptionHandling;

public class Student {
    String name;
    double averageGrade;

    public Student(String name, double averageGrade){
        this.name = name;
        this.averageGrade = averageGrade;
    }
    public void checkExamResult() throws LowGradeException{
        if (averageGrade<51){
            throw new LowGradeException("Not enough points");
        }
        else if(averageGrade>=51 && averageGrade<=90 ){
            System.out.println("You passed the exam successfully");
        }
        if (averageGrade>90){
            System.out.println("You passed the exam with high grade");
        }
    }
}
