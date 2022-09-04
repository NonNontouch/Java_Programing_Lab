public class Staff extends employee {
    public String title;

    public Staff() {

    }

    @Override
    public String toString() {
        return super.toString()+"\nTitle: "+title;
    }
}
