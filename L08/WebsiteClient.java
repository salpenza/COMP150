public class WebsiteClient {
    public static void main(String [] args) {
        Website w1, w2, w3;
        w1 = new Website();
        w2 = new Website(23, "commercial");
        w1.setVisitors(12);
        w1.setType("government");
        w3 = new Website(12, "government");

        if(w1.equals(w3)){
            System.out.println("They're the same."); // should print
        }
        if(! w2.getType().equals("commercial")){
            System.out.println("Something went wrong."); // shouldn't print
        }
        if(w2.getType().equals("commercial")){
            System.out.println("They're the same."); // should print
        }
        System.out.println(w1.getType());
        System.out.println(w3.getVisitors());
        System.out.println(w1.toString());
    }
}