package lecture03;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("１つ目の整数を入力してください:");
        String mozi1 = input.nextLine();
        System.out.println("２つ目の整数を入力してください：");
        String mozi2 = input.nextLine();

        int kazu1 = Integer.parseInt(mozi1);
        int kazu2 = Integer.parseInt(mozi2);

        System.out.println(kazu1 + "+" + kazu2 + "=" + (kazu1+kazu2));
    }
}
