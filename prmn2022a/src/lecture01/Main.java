package lecture01;

public class Main {
    public static void main (String[] args){
        //本来ならここに処理を書く
        //スラッシュを2つ打つと、コメント文として認識される。
        //コードの可読性の向上につながるので、書く癖をつけよう
        //行を選択して「ctrl+/ (command+/)」で選択行をコメント文に変更できる(複数行可)

        System.out.println("We are Project Member.");
        //コンソールに、We are Project Member と表示されるはず

        int sum = 5 + 3;	//sumには8が入る
        int sub = 5 - 3;	//subには2が入る
        int mul = 5 * 3;	//mulには15が入る
        int div = 5 / 3;	//divには1が入る(小数点以下は切り捨て)
        int mod = 5 % 3;	//modには2が入る(余りの導出)

        double temp = 18.7;
        System.out.println("The temperature is " + temp + " degrees");	//"The tempareture is 18.7 degrees"と表示

        if(sum==8) {
            /* 条件式1がtrueの時実行 */
        }
        else if(sum == 2) {
            /* 条件式1がfalseかつ条件式2がtrueの時実行 */
        }
        else {
            /* 条件式1も2もfalseだった時実行 */
        }

        int[] array = new int[10]; //int型の配列を10要素分確保
        array[4] = 3;	//arrayの5番目に3を代入する

        int[] arrayEx1={ 1,2,3,4 };

        //以下と同じ
        int[] arrayEx2 = new int[4];
        arrayEx2[0] = 1;
        arrayEx2[1] = 2;
        arrayEx2[2] = 3;
        arrayEx2[3] = 4;

        for(int i = 0; i < 10; i++){
            /* 処理が終わるたびにiが+1され, i<10でなくなった時にfor文を抜ける */
        }

        int count = 0;
        while(count < 100) {
            count++;	//count=100になると抜ける
        }

        String series = "XS";  //Java SE 7より文字列のswitchが可能に
        switch(series){
            case "X": //文字列の場合条件の""を忘れないように
                System.out.println("Face IDに対応");
                break;
            case "11":
                System.out.println("Dolby Atmosに対応");
                break;
            case "11　pro":
                System.out.println("タピオカメラ");
                break;
            case "SE":
                System.out.println("8の上位互換");
                break;
            default:
                System.out.println("古き良き時代");
                break;
        }

        print("Project Member");
    }

    static void print(String str) {
        //引数に与えられた文字列を表示するprintメソッド
        System.out.println(str);
    }
}
