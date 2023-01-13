public class Sum3And5Challenge {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i<=100;i++){
            if((i%3==0)&&(i%5==0)) {
                System.out.println("Found a match: " + i);
                sum+=i;
            }
        }

        System.out.println(sum);
    }
}
