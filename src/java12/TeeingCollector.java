package java12;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollector {
    
public static void main(String[] args) throws IOException {
        
    double mean = Stream.of(1, 2, 3, 4, 5)
            .collect(Collectors.teeing(Collectors.summingDouble(i -> i), 
              Collectors.counting(), (sum, count) -> sum / count));
    
    System.out.println("Mean "+mean);
    
          //assertEquals(3.0, mean);

    }

}
