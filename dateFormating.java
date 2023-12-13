import java.text.SimpleDateFormat;
import java.util.*;
public class dateFormating {
    
    public static void main(String[] args) {
        String getTime;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        getTime = dateFormat.format(calendar.getTime());
        System.out.println(getTime);
    }
}
    
