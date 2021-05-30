package Java.Algorithm_Practice.chap01;

public class A_Max4 {
    //네 개의 값의 최댓값을 구하는 메소드 만들기
    static int max4(int a, int b, int c, int d){

        int max4 = a;

        if (max4 > b){
            max4 = b;
            return  max4;
        } else if (max4 > c){
            max4 = c;
            return max4;
        } else {
            max4 = d;
            return max4;
        }
    }

    public static void main(String args []){


        System.out.println("최댓값은: " + max4(1,22321,312412,44123));
    }

}
