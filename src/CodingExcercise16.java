public class CodingExcercise16 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-123));
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static boolean isPalindrome(int n){
        int reverse = 0, num = n, lastDigit;

        while(Math.abs(num)>0){
            lastDigit = num %10;
            reverse*=10;
            reverse+=lastDigit;
            num/=10;
        }
        System.out.println(reverse);

        return n == reverse;
    }

    public static int sumFirstAndLastDigit(int n){
        if (n<0)
            return -1;
        int lastDigit = n %10;
        int firstDigit = 0;
        while(Math.abs(n)>0){
            firstDigit = n %10;
            n/=10;

        }
        return lastDigit+firstDigit;
    }

}
