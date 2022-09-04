public class Lab7_Pro3 {
    public static void main(String[] args) {
        Person o1 = new Person();
        o1.name="Somsak";
        o1.address="1 Chalongkrung Road";
        o1.phonenumber="012-345-6789";
        o1.emailaddress="somsak@myemail.com";
        System.out.println("----Person----\n"+o1.toString()+"\n\n");
        student o2=new student();
        o2.name="Somsak";
        o2.address="1 Chalongkrung Road";
        o2.phonenumber="012-345-6789";
        o2.emailaddress="somsak@myemail.com";
        System.out.println("----Student----\n"+o2.toString()+"\n\n");
        employee o3= new employee();
        o3.name="Somsak";
        o3.address="1 Chalongkrung Road";
        o3.phonenumber="012-345-6789";
        o3.emailaddress="somsak@myemail.com";
        o3.office="Manager";
        o3.salary=100000;
        o3.datehired="21/2/2022";
        System.out.println("----Employee----\n"+o3.toString()+"\n\n");
        Faculty o4=new Faculty();
        o4.name="Somsak";
        o4.address="1 Chalongkrung Road";
        o4.phonenumber="012-345-6789";
        o4.emailaddress="somsak@myemail.com";
        o4.office="Manager";
        o4.salary=100000;
        o4.datehired="21/2/2022";
        o4.officehours=420;
        o4.rank="Manager";
        System.out.println("----Faculty----\n"+o4.toString()+"\n\n");
        Staff o5 = new Staff();
        o5.name="Somsak";
        o5.address="1 Chalongkrung Road";
        o5.phonenumber="012-345-6789";
        o5.emailaddress="somsak@myemail.com";
        o5.office="Manager";
        o5.salary=100000;
        o5.datehired="21/2/2022";
        o5.title="I'm the manager";
        System.out.println("----Staff----\n"+o5.toString()+"\n\n");

    }
}
