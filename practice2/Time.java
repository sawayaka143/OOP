package practice2;

public class Time {
    private int hour;   
    private int minute; 
    private int second; 

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public Time() {
        this(0, 0, 0);
    }

    public void setTime(int hour, int minute, int second) {
        int totalSeconds = hour * 3600 + minute * 60 + second;
        
        totalSeconds = ((totalSeconds % 86400) + 86400) % 86400;
        
        this.hour = totalSeconds / 3600;
        totalSeconds %= 3600;
        this.minute = totalSeconds / 60;
        this.second = totalSeconds % 60;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int hour12 = hour % 12;
        if (hour12 == 0) hour12 = 12;
        String amPm = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", hour12, minute, second, amPm);
    }

    public void add(Time other) {
        int totalSeconds = toSeconds() + other.toSeconds();
        totalSeconds %= 24 * 3600;
        fromSeconds(totalSeconds);
    }

    public static Time add(Time a, Time b) {
        int totalSeconds = (a.toSeconds() + b.toSeconds()) % (24 * 3600);
        Time result = new Time();
        result.fromSeconds(totalSeconds);
        return result;
    }

    private int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    private void fromSeconds(int totalSeconds) {
        if (totalSeconds < 0) totalSeconds = ((totalSeconds % (24 * 3600)) + (24 * 3600)) % (24 * 3600);
        this.hour = totalSeconds / 3600;
        totalSeconds %= 3600;
        this.minute = totalSeconds / 60;
        this.second = totalSeconds % 60;
    }

    public int getHour()   { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal()); 
        System.out.println(t.toStandard());  

        Time t2 = new Time(4, 24, 33);
        t.add(t2);
        System.out.println(t.toUniversal()); 
        System.out.println(t.toStandard());  

        Time a = new Time(12, 30, 0);
        Time b = new Time(11, 45, 30);
        Time sum = Time.add(a, b); 
        System.out.println(sum.toUniversal()); 
        System.out.println(sum.toStandard());  
    }
}
