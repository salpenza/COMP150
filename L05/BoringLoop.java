public class BoringLoop {
    public static void main(String[] args) {
        int sum = 1;
        for(int i = 3; i <= 7; i++){
            sum *= i;
        }
        System.out.println(sum);
    }
}