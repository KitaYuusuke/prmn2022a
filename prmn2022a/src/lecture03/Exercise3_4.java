package lecture03;
import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> vege = new ArrayList<>();

        vege.add(new Vegetable("にんじん",117));
        vege.add(new Vegetable("たまねぎ",120));
        vege.add(new Vegetable("じゃがいも",154));

        for(int i=0;i<vege.size();i++){
            vege.get(i).print();
        }


    }
}
