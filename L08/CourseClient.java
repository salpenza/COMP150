public class CourseClient {
    public static void main(String [] args) {
        Course c1, c2, c3;
        c1 = new Course();
        c2 = new Course("CS1", "Test class", 3);
        c1.setCode("A1");
        c1.setDescription("Real class");
        c1.setCredits(5);
        c3 = new Course("A1", "Real class", 5);

        if(c1.equals(c3)){
            System.out.println("They're the same."); // should print
        }
        if(! c2.getCode().equals("CS1")){
            System.out.println("Something went wrong."); // shouldn't print
        }
        if(c2.getCode().equals("CS1")){
            System.out.println("They're the same."); // should print
        }
        System.out.println(c1.getDescription());
        System.out.println(c3.getCredits());
        System.out.println(c1.toString());
        
    }
}