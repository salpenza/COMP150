public class Backwards {
    public static void main(String[] args) {
        int [] a = new int [100];
        for(int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }
        for(int i = a.length -1; i >= 0; i--){
            System.out.println(a[i]);
        }
        
    }   
}