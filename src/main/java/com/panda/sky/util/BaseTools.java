package com.panda.sky.util;

import com.mysql.cj.core.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Cheng.Peng
 * @version 1.0
 * @time 2017/3/1 18:33
 * @Description TODO
 */
public class BaseTools {
    // 默认时间
    public static String DEFAULTTIME = "2010-06-25 12:48:21";

    //日期格式化yyyyMMdd
    public static final String DATEFORMATEYMD = "yyyyMMdd";

    //日期格式化yyyyMMddHHmmss
    public static final String DATEFORMATEYMDHMS = "yyyyMMddHHmmss";

    /**
     * 系统时间格式化字符串
     *
     * @return
     * @throws ParseException
     */
    public static String systemtime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        String dateString = formatter.format(date);
        return dateString;
    }

    /**
     * 字符串时间转时间戳
     *
     * @return
     * @throws ParseException
     */
    public static Long stringtolong(String stringDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        Date date = null;
        try {
            date = formatter.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }


    /**
     * 字符串时间转Date
     *
     * @return
     * @throws ParseException
     */
    public static Date stringtodate(String stringDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        Date date = null;
        try {
            date = formatter.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 时间转换成年月日
     *
     * @return
     * @throws ParseException
     */
    public static String systemtimeFormat(String stringdate) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        Date date = null;
        try {
            date = formatter.parse(stringdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        String dateString = format.format(date);
        return dateString;
    }


    /**
     * 时间转换成2016/6/11格式
     *
     * @return
     * @throws ParseException
     */
    public static String systemtimeFormat2(String stringdate) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        Date date = null;
        try {
            date = formatter.parse(stringdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        String dateString = format.format(date);
        return dateString;
    }

    /**
     * 时间转换成6/11格式
     *
     * @return
     * @throws ParseException
     */
    public static String stringtimeFormat3(String stringdate) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        Date date = null;
        try {
            date = formatter.parse(stringdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat format = new SimpleDateFormat("MM/dd");
        String dateString = format.format(date);
        return dateString;
    }


    /**
     * 计算两个日期之间相差的天数
     * @param smdate 较小的时间
     * @param bdate  较大的时间
     * @return 相差天数
     * @throws ParseException
     */
    public static int daysBetween(Date smdate,Date bdate) throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        smdate=sdf.parse(sdf.format(smdate));
        bdate=sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);
        //计算规则,当天也计算一天要进行+1
        return Integer.parseInt(String.valueOf(between_days + 1));
    }


    /**
     * 获得明天的凌晨的时间
     */
    public static Date getTommerDate(Date beginDate){
        SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd",Locale.CHINA);
        Calendar date = Calendar.getInstance();
        date.setTime(beginDate);
        date.set(Calendar.DATE, date.get(Calendar.DATE) +1);
        Date endDate = null;
        try {
            endDate = dft.parse(dft.format(date.getTime()));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return endDate;
    }

    /**
     * 获得今天凌晨的时间
     */
    public static Date getTodayDate(Date beginDate){
        SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd",Locale.CHINA);
        Calendar date = Calendar.getInstance();
        date.setTime(beginDate);
        date.set(Calendar.DATE, date.get(Calendar.DATE) );
        Date endDate = null;
        try {
            endDate = dft.parse(dft.format(date.getTime()));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return endDate;
    }


    /**
     * 获得一周前凌晨的时间
     */
    public static Date getAWeekAgo(Date beginDate){
        SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd",Locale.CHINA);
        Calendar date = Calendar.getInstance();
        date.setTime(beginDate);
        date.set(Calendar.DATE, -7);
        Date endDate = null;
        try {
            endDate = dft.parse(dft.format(date.getTime()));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return endDate;
    }



    /**
     * 查询从今天起N天(暂为7天)
     * @return
     */
    public static List<String> getFromTodayNDays() {
        List<String> list = new ArrayList<String>();
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
//		SimpleDateFormat sdf = new SimpleDateFormat("E:yyyy-MM-dd");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		cal.set(Calendar.DAY_OF_WEEK, 2);
        for (int i = 0; i < 7; i++) {
            if (sdf.format(cal.getTime()).equals(sdf.format(date))) {
                cal.add(Calendar.DATE, 0);
            }
            list.add(sdf.format(cal.getTime()));
            cal.add(Calendar.DATE, 1);
        }
        return list;
    }


    /**
     * 两个时间相差距离多少天多少小时多少分多少秒
     * @param str1 时间参数 1 格式：1990-01-01 12:00:00
     * @param str2 时间参数 2 格式：2009-01-01 12:00:00
     * @return long[] 返回值为：{天, 时, 分, 秒}
     */
    public static long getDistanceTimes(String str1, String str2) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date one;
        Date two;
        long day = 0;
        long hour = 0;
        /*long min = 0;
        long sec = 0;*/
        try {
            one = df.parse(str1);
            two = df.parse(str2);
            long time1 = one.getTime();
            long time2 = two.getTime();
            long diff ;
            /*if(time1<time2) {
                diff = time2 - time1;
            } else {
                diff = time1 - time2;
            }*/
            diff = time2 - time1;
//            day = diff / (24 * 60 * 60 * 1000);
            hour = (diff / (60 * 60 * 1000) - day * 24);
//            min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
//            sec = (diff/1000-day*24*60*60-hour*60*60-min*60);
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        long[] times = {day, hour, min, sec};
        return hour;
    }


    /**
     * 获取未来 第 past 天的日期
     * @param past
     * @return
     */
    public static String getFetureDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + past);
        Date today = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String result = format.format(today);
        return result;
    }
    
    /**
     * 
     * empty2Zero:(这里用一句话描述这个方法的作用).
     *
     * @author zhao rui
     * @param value
     * @return
     */
    public static String empty2Zero(String value) {
    	if(StringUtils.isNullOrEmpty(value)) {
    		return "0";
    	}
    	return value;
    }
}
