

public class Main {
// recursive function to print the gcd of two given integers
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        int a=gcd(6,4);
        System.out.println(a);
    }
}