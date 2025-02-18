package Task;

public class Course {
    String coursename;
    int coursecode;
    int credit;

    String type;
    public Course( String coursename,int coursecode,int credit,String type){
        this.coursename= coursename;
        this.coursecode= coursecode;
        this.credit= credit;

        this.type= type;

    }
    public String toString() {
        return "Coursename" + this.coursename + "Coursecode" + this.coursecode + "Credit" + this.credit + "Type" + this.type;
    }

}
