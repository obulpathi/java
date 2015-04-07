public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public static final int hoursPerDay = 24;
    public static final int minutesPerHour = 60;
    public static final int secondsPerMinute = 60;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hours) {
        this(hours, 0, 0);
    }

    public Time(int hours, int minutes) {
        this(hours, minutes, 0);
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours(){
        return this.hours;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public int getMinutes(){
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds(){
        return this.seconds;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public static int getHoursPerDay() {
        return Time.hoursPerDay;
    }

    public String toString() {
        String ampm = (hours<12 ? "AM" : "PM");
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, ampm);
    }
}
