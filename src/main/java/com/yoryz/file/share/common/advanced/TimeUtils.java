package com.yoryz.file.share.common.advanced;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * TODO
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/30 20:47
 */
public class TimeUtils {
    /**
     * get the time stamp of start time(00:00:00) of current day
     *
     * @return time stamp
     */
    public static long getCurrentDayStartTime() {
        return Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd 00:00:00").format(new Date())).getTime();
    }

    /**
     * get the time stamp of end time(23:59:59) of current day
     *
     * @return
     */
    public static long getCurrentDayEndTime() {
        return Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd 23:59:59").format(new Date())).getTime();
    }

    /**
     * get the date of current day
     *
     * @return 8 length string of date
     */
    public static String getCurrentDateString() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }

    /**
     * get the date of the part day
     *
     * @param past the past day
     * @return 8 length string of date
     */
    public static String getPastDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);
        return new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
    }
}
