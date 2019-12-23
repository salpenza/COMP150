public class ExcitingLoop {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 33; i <= 97; i++){
            if(i % 7 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}