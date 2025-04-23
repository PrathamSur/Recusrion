public class Power {

    static int pow(int a, int b){
        if(b == 0) return 1;
        if(b == 1) return a;
        return pow(a*a,b-1);

    }
    public static void main(String[] args) {
        int a=pow(3,2);
        System.out.println(a);
    }
}
