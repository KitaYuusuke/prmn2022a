package YamakawaClass;

public class GakusekiBangou {
    private String value;

    public GakusekiBangou(String value) {
        String kashira = value.substring(0,1);
        String ushiro = value.substring(1,8);
        if(kashira.equals("b") && ushiro.length() == 7){
            this.value = value;
        }
        else{
            throw new RuntimeException(value + "学籍番号ではありません");
        }
    }

}
