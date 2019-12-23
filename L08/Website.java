public class Website {
    private int visitors;
    private String type;

    public Website() {
        type = "";
    }

    public Website(int visitors, String type){
        this.visitors = visitors;
        this.type = type;
    }

    public int getVisitors(){
        return visitors;
    }

    public String getType(){
        return type;
    }

    public void setVisitors(int visitors){
        this.visitors = visitors;
    }

    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        String retVal = "";
        retVal += "Number of visitors: " + visitors + "\n";
        retVal += "Type of site: " + type;
        return retVal;
    }

    public boolean equals(Object o) {
        boolean retVal = false;
        if(o instanceof Website) {
            Website w = (Website) o;
            if(type.equals(w.type) && w.visitors >= 0) {
                retVal = true;
            }
        }
        return retVal;
    }
}