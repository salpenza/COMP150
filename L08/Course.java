public class Course{
    private String code;
    private String description;
    private int credits;

    public Course(){
        code = "";
        description = "";
    }

    public Course(String code, String description, int credits){
        this.code = code;
        this.description = description;
        this.credits = credits;
    }

    public String getCode(){
        return code;
    }

    public String getDescription(){
        return description;
    }

    public int getCredits(){
        return credits;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }

    public String toString(){
        String retVal = "";
        retVal += "Code: " + code + "\n";
        retVal += "Description: " + description + "\n";
        retVal += "Credits: " + credits;
        return retVal;
    }

    public boolean equals(Object o){
        boolean retVal = false;
        if(o instanceof Course) {
            Course c = (Course) o;
            if(code.equals(c.code) && description.equals(c.description) && c.credits > 0){
                retVal = true;
            }
        }
        return retVal;
    }
}