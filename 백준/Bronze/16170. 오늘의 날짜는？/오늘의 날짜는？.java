import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ZonedDateTime now=ZonedDateTime.now(ZoneId.of("UTC"));
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy\nMM\ndd");
        System.out.println(now.format(formatter));
    }
}