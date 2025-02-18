package Task;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
public class Semester {
    public static void main(String[] args) {


        List<Course> course = new ArrayList<>();
        course.add(new Course("OOC", 4201, 3, "Theory"));
        course.add(new Course("DLD", 4205, 3, "Theory"));
        course.add(new Course("DM", 4203, 3, "Theory"));
        course.add(new Course("MATH", 4241, 4, "Theory"));
        course.add(new Course("BIZPSY", 4249, 3, "Theory"));
        course.add(new Course("ACCOUNTING", 4247, 3, "Theory"));
    }
}