package Java.Algorithm_Practice.chap01;

public class A_Min3m {

    static int min(int a, int b, int c, int d){

        int min = a;

        if (min > b){
            min = b;
        }else if (min > c){
            min = c;
        }else if (min > d){
            min = d;
        }

        return min;
    }

    public static void main(String args []){

        System.out.println("최소값은 : " + min(2,3,4,1));
    }
}
