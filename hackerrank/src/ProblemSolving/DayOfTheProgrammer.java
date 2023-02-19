package ProblemSolving;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class ResultDayOfTheProgrammer {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */



    public static String dayOfProgrammerShort(int year) {
        LocalDate date = LocalDate.ofYearDay(year, 256);

        if(year == 1918) {
            date = date.plusDays(13);
        }

        else if(year < 1918 && year % 4 == 0 && !date.isLeapYear()) {
            date = date.minusDays(1);
        }
        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }




    public static String dayOfProgrammer(int year) {
        int minJulianCalendarYear = 1700;
        int maxJulianCalendarYear = 1917;
        int minInclusiveYearRange = minJulianCalendarYear;
        int maxInclusiveYearRange = 2700;
        int minGregorianCalendarYear = 1918;
        int maxGregorianCalendarYear = maxInclusiveYearRange;

        if (year >= minInclusiveYearRange && year <= maxInclusiveYearRange) {
            if (year == 1918) {
                int day = 256 - (243 - 13);
                return String.valueOf(day) + ".09." + year;
            }

            if (year >= minJulianCalendarYear && year <= maxJulianCalendarYear) {
                if (year % 4 == 0) {
                    return "12.09." + year;
                } else {
                    return "13.09." + year;
                }
            }
            if (year >= minGregorianCalendarYear && year <= maxGregorianCalendarYear) {
                if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                    return "12.09." + year;
                } else {
                    return "13.09." + year;
                }
            }
        }
        return null;
    }
}


public class DayOfTheProgrammer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = ResultDayOfTheProgrammer.dayOfProgrammer(year);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}

