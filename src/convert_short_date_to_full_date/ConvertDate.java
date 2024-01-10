package convert_short_date_to_full_date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Scanner;
public class ConvertDate {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDF = new SimpleDateFormat("yyyy-MM-dd");
        String inputdate;
        String monthname = null;
        System.out.println(" Remember You must input (year , mounth , day)");
        System.out.print("Input your date : ");
        inputdate = sc.nextLine();

        String[] splitDate  = inputdate.split("-");
        if (Objects.equals(splitDate[1], "01")) {

            monthname = "January";
        }
        if (Objects.equals(splitDate[1], "02")) {

            monthname = "febury";
        }
        if (Objects.equals(splitDate[1], "03")) {

            monthname = "match";
        }
        if (Objects.equals(splitDate[1], "4")) {

            monthname = "april";
        }
        if (Objects.equals(splitDate[1], "5")) {

            monthname = "may";
        }
        if (Objects.equals(splitDate[1], "6")) {

            monthname = "june";
        }
        if (Objects.equals(splitDate[1], "7")) {

            monthname = "july";
        }
        if (Objects.equals(splitDate[1], "8")) {

            monthname = "august";
        }
        if (Objects.equals(splitDate[1], "9")) {

            monthname = "sepember";
        }
        if (Objects.equals(splitDate[1], "10")) {

            monthname = "october";
        }
        if (Objects.equals(splitDate[1], "11")) {

            monthname = "november";
        }
        if (Objects.equals(splitDate[1], "12")) {

            monthname = "december";
        }
        System.out.println("result = "+monthname+","+splitDate[0]+","+splitDate[2]);


    }
}


