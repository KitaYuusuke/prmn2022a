package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {

        Car2.Tire[] tires = new Car2.Tire[4];
        for(int i=0 ; i<tires.length ; i++){
            tires[i] = new Car2.Tire(65);
        }

        Car2.Engine engine = new Car2.Engine(4000);

        Car2 car2 = new Car2(tires,engine);

        GasStation gas = new GasStation();

        gas.refuel(car2);
        car2.startEngine();
        car2.run();

    }
}
