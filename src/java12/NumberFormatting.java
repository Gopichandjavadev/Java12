package java12;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatting {

    public static void main(String[] args) {
        
        NumberFormat likesShort = 
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
              likesShort.setMaximumFractionDigits(2);
              
              System.out.println("Short format "+likesShort.format(2592));
             

              NumberFormat likesLong = 
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
              likesLong.setMaximumFractionDigits(2);
              
              System.out.println("Long format "+likesLong.format(2592));
      }

}
