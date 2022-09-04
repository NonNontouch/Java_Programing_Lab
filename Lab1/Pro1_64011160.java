import java.text.NumberFormat.Style;
public class Pro1_64011160 
{
    public static void main(String[] args) 
    {
        long secound,population=312032486,death,born,immigrant;
        secound=365*24*60*60;
        System.out.println("Population this year : "+population);
        for(byte i=2 ;i<=6;i++)
        {
            born=secound/7;
            death=secound/13;
            immigrant=secound/45;
            population=population+born-death+immigrant;
            System.out.printf("Population in %d Yeaar : "+population+"\n",i-1);
            secound+=(365*24*60*60);
        }
    }   
}
