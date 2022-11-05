package lecture02;

public class Car2 {

    int fuel;
    Tire[] tires; //= new Tire[4]
    Engine engine;

    Car2(Tire[] tires,Engine engine){
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    void run(){
        if(fuel == 0){
            System.out.println("燃料が足りないため走れませんでした。");
        }
        else{
            fuel--;
            System.out.println("燃料を1消費して走りました。");
        }
    }

    void startEngine(){
        engine.start();
    }

    static class Tire{
        int size;

        Tire(int size){
            this.size = size;
        }

    }

    static class Engine{
        int rpm;

        Engine(int rpm){
            this.rpm = rpm;
        }

        void start(){
            System.out.println("rpm = " + rpm + " でエンジンを始動させました。");
        }

    }

}
