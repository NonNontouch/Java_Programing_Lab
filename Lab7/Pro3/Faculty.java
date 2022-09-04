public class Faculty extends employee{
    public int officehours;
    public String rank;
    public Faculty(){

    }
    @Override
    public String toString(){
        return super.toString()+"\nOffice Hours: "+officehours+"\nRank: "+rank;
    }
}
