package lecture01;

public class kadai15 {
    public static void main(String[] args){
        int[] score = {41,85,72,38,80};

        for(int i=0 ; i<score.length ; i++){
            System.out.print(i + "番 " + score[i] + "点 ");
            if(score[i]<60) {
                System.out.println("不可");
            }
            else if(score[i]<70){
                System.out.println("可");
            }
            else if(score[i]<80){
                System.out.println("良");
            }
            else if(score[i]<90){
                System.out.println("優");
            }
            else if(score[i]<=100){
                System.out.println("秀");
            }
        }

        System.out.println(".............");

        min(score);
        max(score);
        average(score);

        System.out.println(".............");


    }

    static void min(int score[]){
        int min = score[0];

        for(int i=0 ; i<score.length ; i++){
            if(min > score[i]){
                min = score[i];
            }
        }
        System.out.println("最低点：" + min + "点");
    }

    static void max(int score[]){
        int max = score[0];

        for(int i=0 ; i<score.length ; i++){
            if(max < score[i]){
                max = score[i];
            }
        }
        System.out.println("最高点：" + max + "点");
    }

    static void average(int score[]){
        int sum = 0;
        double ave;

        for(int i=0 ; i<score.length ; i++){
            sum = sum + score[i];
        }

        ave = (double)sum / score.length;

        System.out.println("平均点：" + ave + "点");
    }
}
