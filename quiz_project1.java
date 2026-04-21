import java.util.Scanner;

class Question {
    private int id;
    private String ques;
    private String op1;
    private String op2;
    private String op3;
    private String op4;
    private String correct;

    public Question(int id, String ques, String op1, String op2, String op3, String op4, String correct) {
        this.id = id;
        this.ques = ques;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.correct = correct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestions() {
        return ques;
    }

    public void setQuestions(String ques) {
        this.ques = ques;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", ques=" + ques + ", op1=" + op1 + ", op2=" + op2 + ", op3=" + op3 + ", op4="
                + op4 + ", correct=" + correct + "]";
    }

}

class QuestionService {

    Question questions[] = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {

        questions[0] = new Question(1, "What is the capital of India?",
                "Delhi", "Mumbai", "Kolkata", "Chennai", "Delhi");

        questions[1] = new Question(2, "Which language is used for Android development?",
                "Python", "Java", "C++", "Kotlin", "Java");

        questions[2] = new Question(3, "Which planet is known as the Red Planet?",
                "Earth", "Mars", "Jupiter", "Venus", "Mars");

        questions[3] = new Question(4, "Which data structure uses FIFO?",
                "Stack", "Queue", "Array", "Tree", "Queue");

        questions[4] = new Question(5, "Which keyword is used to inherit a class in Java?",
                "extends", "implements", "inherit", "super", "extends");

    }

    public void playquiz() {

        int i = 0;
        for (Question q : questions) {
            System.out.println();
            System.out.println("Question No : " + q.getId());
            System.out.println("QUES : " + q.getQuestions());
            System.out.println("Options are ---");
            System.out.println("1 : " + q.getOp1());
            System.out.println("2 : " + q.getOp2());
            System.out.println("3 : " + q.getOp3());
            System.out.println("4 : " + q.getOp4());
            System.out.println("Your answer is ? ---");
            Scanner sc1 = new Scanner(System.in);
            selection[i] = sc1.nextLine();
            i++;
            System.out.println();

        }

        for (String s : selection) {
            System.out.println(s);
        }

    }

    public void printscore() {

        int score = 0;
        for (int i = 0; i < questions.length; i++) {

            Question que = questions[i];
            String answer = que.getCorrect();
            String useranswer = selection[i];

            if (answer.equalsIgnoreCase(useranswer)) {
                score++;
            }

        }

        System.out.println("your score is : " + score);
    }
}

public class quiz_project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuestionService service = new QuestionService();
        service.playquiz();
        service.printscore();

    }

}
