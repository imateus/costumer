package br.com.elizabethcarrilho.costumer.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class StringUtils {

    private StringUtils() {
    }

    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static synchronized boolean isEmpty(String str) {
        return (null == str || str.isEmpty());
    }

    public static synchronized boolean isEmptyWithTrim(String str) {
        return (null == str || str.trim().isEmpty());
    }

    public static synchronized String lpad(String valueToPad, String filler, int size) {
        if (valueToPad == null) valueToPad = "";

        var s = new StringBuilder(valueToPad);
        while (s.toString().length() < size) {
            s.insert(0, filler);
        }
        return left(s.toString(), size);
    }

    public static synchronized String rpad(String valueToPad, String filler, int size) {
        if (valueToPad == null) valueToPad = "";

        var s = new StringBuilder(valueToPad);
        while (s.toString().length() < size) {
            s.append(filler);
        }
        return left(s.toString(), size);
    }

    public static synchronized String left(String text, int length) {
        if (isEmpty(text)) {
            return text;
        }
        if (text.length() >= length) {
            return text.substring(0, length);
        } else {
            return text;
        }
    }

    public static synchronized String right(String text, int length) {
        if (isEmpty(text)) {
            return text;
        }
        return text.substring(text.length() - length);
    }

    public static String dateToString(Date data, String pattern) {
        var fmt = new SimpleDateFormat(pattern);
        var cal = Calendar.getInstance();
        cal.setTime(data);
        data = cal.getTime();

        return fmt.format(data);
    }

    public static String formatStringDate(String dateStr, String oldPattern, String newPattern) {

        if (dateStr == null || oldPattern == null || newPattern == null) return null;

        var sdtf = new SimpleDateFormat(oldPattern);
        Date date = null;
        try {
            date = sdtf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sdtf = new SimpleDateFormat(newPattern);
        return sdtf.format(date);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}