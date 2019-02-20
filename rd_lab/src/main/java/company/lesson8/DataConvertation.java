package company.lesson8;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.Locale;

public class DataConvertation {


    private static final DateTime currentData = new DateTime();


    public void getData(String pattern) {
        DateTime data1 = new DateTime();
        data1 = DateTime.parse(pattern, DateTimeFormat.forPattern("yyyy-MM-dd"));
        System.out.println(data1.toString("dd-MM-yyyy"));
    }


    public long getStartDayDate(int dateTime) {
        long temp = currentData.withTimeAtStartOfDay().getMillis();
        System.out.println(temp);
        return temp;
    }

    //получить дату в формате long на конец дня;
    public long getEndDayDate(int dataTime1) {
        long temp2 = currentData.withTimeAtStartOfDay().plusSeconds(82859).getMillis();
        System.out.println(temp2);
        return temp2;
    }

    public void compareTwoDates() {
        DateTime dt1 = new DateTime();
        DateTime dt2 = new DateTime(dt1);
        DateTime dt3 = new DateTime(dt2.plusDays(1));
        System.out.println("dt1.equals(dt2): " + dt1.equals(dt2));
        System.out.println("dt1.equals(dt3): " + dt1.equals(dt3));
        System.out.println("dt1.isAfter(dt3): " + dt1.isAfter(dt3));
        System.out.println("dt1.isBefore(dt3): " + dt1.isBefore(dt3));
    }

    public void getDayOfWeek(long some) {
        String result = new DateTime(some).toString("EEEE", Locale.ENGLISH);
        System.out.println(result);
    }

    //переконвертировать дату в формате long в формат String по шаблону (шаблон подается в метод);
    public void dateToString(long temp, String pattern) {
        String result = new DateTime(temp).toString(pattern);
        System.out.println(result);
    }
}

