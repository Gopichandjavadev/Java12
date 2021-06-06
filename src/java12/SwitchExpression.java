package java12;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchExpression {

    public static void main(String[] args) {
        
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        
        typeOfDay = switch (dayOfWeek) {
        case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
        case SATURDAY, SUNDAY -> "Day Off";
        };
    
        System.out.println("Type of Day "+typeOfDay);

    }

}
