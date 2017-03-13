package com.ihowq.VTopic.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 工具类
 * 
 * @author 万清文
 */
public class ValidateUtil {
    /**
     * 判断传入的字符串去除空格后是否为空
     * 
     * @param str传入的字符串
     * @return 非空为真，空为假
     */
    public static boolean strValidate(String str) {
        return !(str == null || "".equals(str.trim()));
    }

    /**
     * 判断传入的字符串可否转为int型
     * 
     * @param num
     * @return 可转为真，不可为假
     */
    public static boolean numValidate(String num) {
        try {
            Integer.parseInt(num.trim());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 为空串设值为空格 非空时返回去空结果
     * 
     * @param str
     * @return
     */
    public static String strDefaultValidate(String str) {
        if (strValidate(str)) {
            return str.trim();
        } else {
            return " ";
        }
    }

    /**
     * 传入的字符串可否转为int型 可转时返回转化结果 不可转时返回0
     * 
     * @param num
     * @return
     */
    public static int numDefaultValidate(String num) {
        if (numValidate(num)) {
            return Integer.parseInt(num.trim());
        } else {
            return 0;
        }
    }

    /**
     * 半角字符串长度检查
     * 
     * @param String
     *            strItem：半角字符串
     * @param int intLength：长度
     * @return true：合法、false：非法
     */
    public static boolean chkItemLength(String strItem, int intLength) {
        return strItem.trim().length() == intLength;
    }

    /**
     * 字符串长度检查
     * 
     * @param String
     *            strItem：半角字符串
     * @param int intLength：长度
     * @return true：合法、false：非法
     */
    public static boolean chkMaxLength(String strItem, int intLength) {
        return strItem.trim().length() > intLength;
    }

    /**
     * 合法日期
     * 
     * @param String
     *            date：半角字符串
     * @param int intLength：长度
     * @return true：合法、false：非法
     */
    public static boolean isValidDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 判定字符串是半角英、数字
     * 
     * @param String
     *            str：字符串
     * @return true：合法、false：非法
     */
    public static boolean chkEnNum(String str) {
        if (str.length() < str.getBytes().length) {
            return false;
        }
        return str.matches("\\d+|\\w+");
    }

    /**
     * 判定字符串是数字
     * 
     * @param String
     *            str：字符串
     * @return true：合法、false：非法
     */
    public static boolean chkNumeric(String str) {
        return str.matches("\\d+");
    }

    /**
     * 
     * @param num番号
     * @param formatsize需要格式化的位数
     * @return 番号被格式化后的字符串
     */
    public static String formatAutoNum(int num, int formatsize) {
        String autoNum;
        if (formatsize > 0) {
            String dform = "%0" + formatsize + "d";
            // 将数字格式化为传入的位数的字符串
            autoNum = String.format(dform, num);
        } else {
            // 当传入的位数小于等于0时，将数字直接原样转为字符串
            autoNum = "" + num;
        }
        return autoNum;
    }

    /**
     * 将字符串按给定的长度拆分为数组
     * 
     * @param str
     *            要拆分的字符串
     * @param len
     *            拆分的单位长度
     * @return 拆分后数组
     */
    public static List<String> splitByLength(String str, int len) {
        if (len <= 0)
            throw new IllegalArgumentException("len must great than zero");
        if (StringUtils.isEmpty(str))
            new ArrayList<String>();

        List<String> splist = new ArrayList<String>();
        if (len >= str.length()) {
            splist.add(str);
        } else {
            while (str.length() > len) {
                splist.add(StringUtils.left(str, len));
                str = StringUtils.substring(str, len);
            }
            splist.add(str);
        }
        return splist;
    }

    /**
     * 获取某年第一天日期
     * 
     * @param year
     *            年份
     * @return Date
     */
    public static Date getCurrYearFirst(Date currDay) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, getYear(currDay));
        Date currYearFirst = calendar.getTime();
        return currYearFirst;
    }

    /**
     * 取日期的年份
     * 
     * @param time
     *            日期
     * @return
     */
    public static int getYear(Date time) {
        SimpleDateFormat st = new SimpleDateFormat("yyyy");
        return Integer.parseInt(st.format(time));
    }

    /**
     * 字符串转换成日期
     * 
     * @param str
     * @return date
     */
    public static Date StrToDate(String str) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 日期转换成字符串
     * 
     * @param str
     * @return date
     */
    public static String dateToStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String strdate = "";
        strdate = format.format(date);
        return strdate;

    }

    /**
     * 取日期的月份
     * 
     * @param time
     *            日期
     * @return 月份
     */
    public static int getMonth(Date time) {
        SimpleDateFormat st = new SimpleDateFormat("MM");
        return Integer.parseInt(st.format(time));
    }

    /**
     * 判断是否为汉字
     * 
     * @param String
     * 
     * @return boolean
     */
    public static boolean chontainsChinese(String s) {
        if (null == s || "".equals(s.trim())) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isChinese(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isChinese(char a) {
        int v = (int) a;
        return (v >= 19968 && v <= 171941);
    }

    /**
     * 半角字符串长度检查
     * 
     * @param String
     *            strItem：半角字符串
     * @param int intLength：长度
     * @return true：合法、false：非法
     */
    public static boolean chkItemLength(String strItem, int minLength, int maxLength) {
        return strItem.trim().length() >= minLength && strItem.trim().length() <= maxLength;
    }

}
