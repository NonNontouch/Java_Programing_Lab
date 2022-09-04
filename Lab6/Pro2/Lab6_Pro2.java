package Pro2;
public class Lab6_Pro2 {
    public static void main(String[] args) {
        Course couse = new Course("Math");
        couse.addStudent("A");
        couse.addStudent("B");
        couse.addStudent("C");
        System.out.println("Number of Student: "+couse.getNumberOfStudents());
        couse.printStudent();
        couse.dropStudent("C");
        System.out.println("Number of Student: "+couse.getNumberOfStudents());
        couse.printStudent();
        couse.clear();
        System.out.println("Number of Student: "+couse.getNumberOfStudents());
        couse.printStudent();
    }
}
 class Course {
    private String courseName;
    private String[] students=new String[10];
    private int numberOfStudents;
    public Course(String couseName){
        this.courseName=couseName;
    }
    public void addStudent(String student){
        if(numberOfStudents >= students.length);{
            String[] temp=new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0 , students.length);
            students=temp;
        }
        students[numberOfStudents++]=student;
        System.out.println("Add student "+student);

    }
    public String[] getStudent(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCouseName(){
        return courseName;
    }
    public void dropStudent(String student){
        for(int i=0;i<students.length;i++){
            if(student.equalsIgnoreCase(students[i])){
                students[i]= null;
                numberOfStudents--;
                while(i<numberOfStudents){
                    students[i] =students[i+1];
                    i++;
                }
                break;
            }
        }
        System.out.println("drop student "+student);
    }
    public void clear(){
        students =new String[25];
        numberOfStudents = 0;
    }
    public void printStudent(){
        System.out.print("Students :");
        for(int i=0;i<numberOfStudents;i++){
            System.out.print(students[i]+" ");
        }
        System.out.print("\n");
    }
    
}
