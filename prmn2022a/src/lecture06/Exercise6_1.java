package lecture06;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("少数を入力してください。");
            float a = input.nextFloat();
            System.out.println(a);
        }
        catch(InputMismatchException e){
            System.out.println("エラー");
        }

    }
}
