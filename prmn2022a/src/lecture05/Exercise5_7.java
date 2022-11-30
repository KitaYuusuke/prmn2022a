package lecture05;

public class Exercise5_7 {
    public static void main(String[] args) {
        Insect[] insects = {new Insect(), new Butterfly(), new Locust(), new SwallowtailButterfly()};

        for(Insect insect : insects){
            insect.move();
        }
    }
}
