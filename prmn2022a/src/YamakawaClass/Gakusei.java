package YamakawaClass;

public class Gakusei {
    private GakusekiBangou number;
    private String name;
    private Age age;

    public Gakusei(String number, String name, int age) {
        this.number = new GakusekiBangou(number);
        this.name = name;
        this.age = new Age(age);
    }

    public void Hatachi(int nenrei){
        age.Hatati(nenrei);
    }
}
