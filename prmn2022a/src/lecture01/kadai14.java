package lecture01;

public class kadai14 {
    public static void main(String[] args){
        int[] array = new int[100];

        //forの理由：iを増やす処理をforの()でできるので便利だから
        for(int i=0 ; i<array.length ; i++){
            array[i] = i+1;
            System.out.println(array[i]);
        }

        int sum = 0;
        for(int i = 0 ; i<array.length ; i++){
            if(i % 2 == 0){
                sum = sum + array[i];
            }
        }

        System.out.println("配列番号が偶数の総和 = " + sum);

    }
}
