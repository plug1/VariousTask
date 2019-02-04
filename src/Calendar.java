import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

    /*
    * Result same as in Linux OS 'cal'-command
    * */
    public static void printCalendar(){

        List<Integer> days = new ArrayList<>();

        LocalDate date = LocalDate.now();
        //LocalDate date = LocalDate.of(1989,1,1);
        date = date.withDayOfMonth(1);

        int m = date.getMonthValue();

        System.out.println("   M   T   W  Th   F   S   S\n");

        DayOfWeek day = date.getDayOfWeek();
        int value = day.getValue();

        for (int i = 1; i < value; i++)
            System.out.print("    ");

        while (date.getMonthValue() == m) {

            System.out.printf("%4d", date.getDayOfMonth());

            DayOfWeek weekday = date.getDayOfWeek();
            int dayOfWeek = weekday.getValue();

            if(dayOfWeek%7==0){
                System.out.println("\n");
            }
            date = date.plusDays(1);
        }

    }

}
