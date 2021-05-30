package Java.Algorithm_Practice.chap01;

public class A_Min3 {

    static int min3(int a, int b, int c) {

        int min3 = a;

        if (min3 > b){
            min3 = b;
        }else if (min3 > c){
            min3 = c;
        }
        return min3;
    }

    public static void main(String [] args ){

        System.out.println("최소값은: " + min3(3,4,1));
    }
}


