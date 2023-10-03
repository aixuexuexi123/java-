package Test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
    int []scoreArr=getScores();
    int max=getMax(scoreArr);
    int min=getMin(scoreArr);
    int avg=(getSum(scoreArr)-max-min)/ (scoreArr.length-2);
        System.out.println(avg);
    }

    public static int []getScores() {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6];
        for (int i = 0; i < 6; ) {
            int score = sc.nextInt();
         if(score>=0&&score<=100){
             scores[i]=score;
             i++;
         }else{
             System.out.println("输入数据有误,继续输入");
         }
        }
      return scores;
    }
    public static int getMax(int[]scoreArr){
        int max=scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
           if(scoreArr[i]>max){
              max= scoreArr[i];
           }
        }
        return max;
    }
    public static int getMin(int[]scoreArr){
        int min=scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if(scoreArr[i]<min){
                min= scoreArr[i];
            }
        }
        return min;
    }
    public static int getSum(int[]scoreArr){
        int sum=0;
        for (int i = 0; i < scoreArr.length; i++) {
             sum=sum+scoreArr[i];
        }
        return sum;
    }
   }
