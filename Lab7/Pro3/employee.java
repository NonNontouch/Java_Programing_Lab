public class employee extends Person {
    public String office,datehired;
    public int salary;
    public employee(){

    }
    @Override
    public String toString()
    {
        return super.toString()+"\nOffice: "+office+"\nSalary: "+salary+"\nDate hired: "+datehired;
    }

}
