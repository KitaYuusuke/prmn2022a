package KozinKadai;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Javakkuri {
    Scanner input = new Scanner(System.in);
    private String question;
    private List<String> splita;
    private List<String> human = new ArrayList<String>(Arrays.asList("たけし","かずお"));
    private List<String> food = new ArrayList<String>(Arrays.asList("とうふ","おはぎ"));
    private List<String> place = new ArrayList<String>(Arrays.asList("よしのがりいせき","いーすたーとう"));
    private int listSize = human.size();

    public Javakkuri(String question) {
        while(true) {
            if (question.contains("誰") || question.contains("食べ物") || question.contains("場所")) {
                this.question = question;
                break;
            } else {
                System.out.println("キーワードを入力せよ");
                question = input.next();
            }
        }
    }

    public void answer(){
        Random rand = new Random();
        int index = rand.nextInt(this.listSize);
        if(question.contains("誰")){
            for(int i = 0; i < human.get(index).length(); i++) {
                System.out.println(human.get(index).charAt(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else if(question.contains("食べ物")){
            for(int i = 0; i < food.get(index).length(); i++) {
                System.out.println(food.get(index).charAt(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else if(question.contains("場所")){
            for(int i = 0; i < place.get(index).length(); i++) {
                System.out.println(place.get(index).charAt(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else{
            System.out.println("該当なし");
        }
    }

    public String getQuestion() {
        return question;
    }
}
