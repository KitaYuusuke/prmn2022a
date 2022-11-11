package lecture03;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> moziretu = new ArrayList<>();

        System.out.println("何行分入力しますか？");
        int gyou = input.nextInt();
        input.nextLine();

        for(int i=0;i<gyou;i++){
            System.out.println(i+1 + "行目:");
            String mozi = input.nextLine();
            moziretu.add(mozi);
        }

        System.out.println("入力した文字列；");
        int j = 0;
        for(String hyouzi:moziretu){
            System.out.println("[" + j + "]" + hyouzi);
            j++;
        }

    }
}

