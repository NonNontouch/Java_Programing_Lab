import java.io.ObjectInputFilter.Status;

public class student extends Person {
    public String[] status = { "freshman", "sophomore", "junior", "senior" };

    public student() {

    }

    @Override
    public String toString() {
        return super.toString() + "\nStudentStatus: "+status[0];
    }

}
