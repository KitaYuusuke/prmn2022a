package lecture4;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(180,80,"Fighter1");
        Fighter fighter2 = new Fighter(160,100,"Fighter2");
        int count = 0;
        while(fighter1.isAlive() && fighter2.isAlive()){
            if(count % 2 == 0) {
                fighter1.attack(fighter2);
                System.out.println(fighter2.getName() + " の残り hitpoint: " + fighter2.getHitpoint());
                count++;
            }
            else {
                fighter2.attack(fighter1);
                System.out.println(fighter1.getName() + " の残り hitpoint: " + fighter1.getHitpoint());
                count++;
            }

            if(!fighter1.isAlive()){
                System.out.println(fighter1.getName() + " は倒れた。");
            }
            else if(!fighter2.isAlive()){
                System.out.println(fighter2.getName() + " は倒れた。");
            }

        }



    }
}
