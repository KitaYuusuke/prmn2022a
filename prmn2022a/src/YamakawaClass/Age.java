package YamakawaClass;

public class Age {
    private int value;

    public Age(int value) {
        if(value >= 0 && value <= 120) {
            this.value = value;
        }
        else{
            throw new RuntimeException("value = " + value + ":正しい年齢を入力してください");
        }
    }

    public void Hatati(int age){
        if(age >= 20){
            System.out.println("20歳以上だよ");
        }
        else if(age >= 0){
            System.out.println("20際未満だよ");
        }
        else{
            System.out.println("生まれてないよ");
        }
    }


}
