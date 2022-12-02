package lecture06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> array = new ArrayList<>();

        for(int i=0;i<6;i++){
            array.add(rand.nextInt(6)+1);
        }
        System.out.println("さいころを5つ振りました。");

        try{
            System.out.println("何番目のさいころの値を確認しますか？");
            int saikoro = input.nextInt();
            System.out.println(array.get(saikoro));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
        }
        catch(InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
        }






    }
}
