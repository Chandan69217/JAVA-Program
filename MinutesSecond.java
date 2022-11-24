public class MinutesSecond {
    public static String INVALID_VALUE_MESSAGE ="INVALID VALUE";
    public static void main(String agrs[]){
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3600));
    }

    public static String getDurationString(long minutes , long seconds){
        if(minutes<0||seconds<0&&seconds<60){
            return INVALID_VALUE_MESSAGE;
        }
        long hours =  minutes / 60;
        long remainingMinutes =  minutes % 60;

        String hourString = hours + " Hours";
        if(hours<10){
            hourString = "0"+hours + " Hours";
        }

        String minuteString = remainingMinutes + " Minutes";
        if(remainingMinutes<10){
            minuteString = "0" + remainingMinutes + " Minutes";
        }

        String secondString = seconds + " Seconds";
        if(seconds < 10){
            secondString = "0" + seconds + " Seconds";
        }

        return  hourString + " " + minuteString + " "+ secondString + " ";
    }

    public static String getDurationString(long seconds){
        if(seconds<0){
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds/60;
       long remainingSeconds = seconds%60;
        return getDurationString(minutes, remainingSeconds);
    }
}
