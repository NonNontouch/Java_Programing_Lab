import java.util.GregorianCalendar;

public class StopWatch {
    GregorianCalendar gcal = new GregorianCalendar();
    private long startTime;
    private long endTime;
    public StopWatch(){
        startTime=gcal.getTimeInMillis();
    }
    public void start()
    {
        startTime=System.currentTimeMillis();
    }
    public void stop()
    {
        endTime=System.currentTimeMillis();
    }
    public long getElapsedTime()
    {
        return endTime-startTime;
    }
    
}
