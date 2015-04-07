public class TimeTest {
    public static void main(String[] args){
        Time time = new Time();
        time = new Time(6);
        time = new Time(6, 1);
        time = new Time(6, 1, 1);

        System.out.println(time.toString());

        // Error: private variable
        // time.hours = 9;

        time.setMinutes(0);
        time.setSeconds(0);
        System.out.println(time.toString());

        System.out.println(time.hoursPerDay);
        System.out.println(Time.hoursPerDay);

        System.out.println(time.getHoursPerDay());
        System.out.println(Time.getHoursPerDay());
    }
}
