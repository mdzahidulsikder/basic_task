import java.text.SimpleDateFormat;
import java.util.Date;
public class Logger {
    private static Logger instance;
    private Logger() {
    }
    public static Logger getInstance() {
        if(instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    public void logMessage(String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("Message =  " + message + " and input time is: " + timestamp );
    }
    @Override
    public String toString() {
        return "Logger instance: " + hashCode();
    }

}
