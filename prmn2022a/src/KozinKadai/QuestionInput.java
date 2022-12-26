package KozinKadai;
import java.util.Scanner;

public class QuestionInput {

    public QuestionInput() {
    }
    Scanner input = new Scanner(System.in);

    public Javakkuri inputq(){
        System.out.println("質問していいよ");
        String question = input.next();
        Javakkuri ja = new Javakkuri(question);
        return ja;
    }
}
