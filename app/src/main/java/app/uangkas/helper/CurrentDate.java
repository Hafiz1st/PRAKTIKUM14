package app.uangkas.helper;

import java.util.Calendar;

/**
 * Created by Lazday Indonesia
 * https://lazday.com
 * on 02/10/2018.
 */

public class CurrentDate {

    private static Calendar calendar   = Calendar.getInstance();
    public static int year            = calendar.get(Calendar.YEAR); // current year
    public static int month           = calendar.get(Calendar.MONTH); // current month
    public static int day             = calendar.get(Calendar.DAY_OF_MONTH); // current day

}
