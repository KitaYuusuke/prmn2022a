package lecture4;

public class Fighter {
    int hitpoint;
    int power;
    String name;

    Fighter(int hitpoint,int power,String name){
        this.hitpoint = hitpoint;
        this.power = power;
        this.name = name;
    }

    void attack(Fighter enemy){
        enemy.hitpoint = enemy.hitpoint - this.power;
        System.out.println(this.name + " は " + enemy.name + " に " + this.power + " ダメージを与えた。");
    }

    boolean isAlive(){
        return this.hitpoint > 0;
    }

    int getHitpoint(){
        return this.hitpoint;
    }

    void setHitpoint(int hitpoint){
        this.hitpoint = hitpoint;
    }

    String getName(){
        return this.name;
    }


}
