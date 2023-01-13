public class CodingExcercise8 {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));


    }
    public static boolean hasTeen(int n1, int n2, int n3){
        return (isTeen(n1) || isTeen(n2) || isTeen(n3));
    }

    public static boolean isTeen(int n){
        return (13<=n && n<=19);
    }
}
