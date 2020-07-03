/*
 * Copyright 2003 博升优势公司(Broadadv, Inc.) All rights reserved.
 * Use is subject to license terms.
 */

/*
 * @(#)DateTimeUtil.java	1.00 03/03/21
 */
package cn.com.busi.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


@Slf4j
public class DateTimeUtil {


	public static long currentDateTime() {

		return System.currentTimeMillis();
	}

	public static String getDateString() {
		SimpleDateFormat fm = new SimpleDateFormat("yyyyMMdd"); // "yyyyMMdd G
		return fm.format(new Date());
	}

	public static String getYearMonthString() {
		SimpleDateFormat fm = new SimpleDateFormat("yyyyMM"); // "yyyyMM G
		return fm.format(new Date());
	}

	public static String getCnDateString() {
		SimpleDateFormat fm = new SimpleDateFormat("yyyy年MM月dd日"); // "yyyyMMdd G
		return fm.format(new Date());
	}

	public static String getCnTimeString() {
		SimpleDateFormat fm = new SimpleDateFormat("HH时mm分ss秒"); // "yyyyMMdd G
		return fm.format(new Date());
	}

	public static String getTimeString() {
		SimpleDateFormat fm = new SimpleDateFormat("HHmmss"); // "yyyyMMdd G
		return fm.format(new Date());
	}

	public static String getDateString(long dt) {

		SimpleDateFormat fm = new SimpleDateFormat("yyyyMMdd"); // "yyyyMMdd G
		// 'at' hh:mm:ss
		// a zzz"
		return fm.format(new Date(dt));
	}

	public static String getTimeString(long dt) {

		SimpleDateFormat fm = new SimpleDateFormat("HHmmss"); // "yyyyMMdd G
		// 'at' hh:mm:ss
		// a zzz"
		return fm.format(new Date(dt));
	}

	public static String getDateTimeString(long dt) {

		SimpleDateFormat fm = new SimpleDateFormat("yyyyMMddHHmmss"); // "yyyyMMdd
		// G
		// 'at'
		// hh:mm:ss
		// a
		// zzz"
		return fm.format(new Date(dt));
	}

	public static String getDateTimeString(Date date,String format) {

		SimpleDateFormat fm = new SimpleDateFormat(format); // "yyyyMMdd
		// G
		// 'at'
		// hh:mm:ss
		// a
		// zzz"
		return fm.format(date);
	}

	public static String getDateTimeString() {

		SimpleDateFormat fm = new SimpleDateFormat("yyyyMMddHHmmss"); // "yyyyMMdd
		return fm.format(new Date());
	}

	/**
	 * 根据指定日期得到过期日期
	 * @param d                yyyyMMdd格式的日期
	 * @param period           有效期数量
	 * @param periodUnit       有效期类型：0：年；1：月；2：日；3：时；4：分
	 * @return
	 * @throws Exception
	 */
	public static Date getExpireDate(String d, String period, String periodUnit) throws Exception{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		try {
			date = sdf.parse(d);
		} catch (ParseException e){
			log.info("text",e);
			throw new Exception("日期格式转换出现异常！请核实日期格式：" + d, e);
		}
		cal.setTime(date);
		try {
			if ("0".equals(periodUnit)){
				System.out.println("0");
				cal.add(Calendar.YEAR, Integer.parseInt(period));
			} else if ("1".equals(periodUnit)){
				System.out.println("1");
				cal.add(Calendar.MONTH, Integer.parseInt(period));
			} else if ("2".equals(periodUnit)){
				System.out.println("2");
				cal.add(Calendar.DAY_OF_YEAR, Integer.parseInt(period));
			} else if ("3".equals(periodUnit)){
				System.out.println("3");
				cal.add(Calendar.HOUR_OF_DAY, Integer.parseInt(period));
			} else if ("4".equals(periodUnit)){
				System.out.println("4");
				cal.add(Calendar.MINUTE, Integer.parseInt(period));
			}
		} catch (NumberFormatException e1){
			log.info("text",e1);
			throw new Exception("PERIOD参数不是表示数字的字符串，请检查！", e1);
		}
		return new Date(cal.getTimeInMillis());
	}

	/**
	 * 根据指定日期得到过期日期
	 * @param date             Date对象
	 * @param period           有效期数量
	 * @param periodUnit       有效期类型：0：年；1：月；2：日；3：时；4：分
	 * @return
	 * @throws Exception
	 */
	public static Date getExpireDate(Date date, String period, String periodUnit) throws Exception{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		try {
			if ("0".equals(periodUnit)){
				System.out.println("0");
				cal.add(Calendar.YEAR, Integer.parseInt(period));
			} else if ("1".equals(periodUnit)){
				System.out.println("1");
				cal.add(Calendar.MONTH, Integer.parseInt(period));
			} else if ("2".equals(periodUnit)){
				System.out.println("2");
				cal.add(Calendar.DAY_OF_YEAR, Integer.parseInt(period));
			} else if ("3".equals(periodUnit)){
				System.out.println("3");
				cal.add(Calendar.HOUR_OF_DAY, Integer.parseInt(period));
			} else if ("4".equals(periodUnit)){
				System.out.println("4");
				cal.add(Calendar.MINUTE, Integer.parseInt(period));
			}
		} catch (NumberFormatException e){
			log.info("text",e);
			throw new Exception("PERIOD参数不是表示数字的字符串，请检查！", e);
		}
		return new Date(cal.getTimeInMillis());
	}

	public static Date getExpireDate(String period, String periodUnit) throws Exception{
		Date d = new Date();
		return getExpireDate(d, period, periodUnit);
	}

	public static long getSpNextMonth(long dt) {

		Date d = new Date(dt);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int curDay = cal.get(Calendar.DAY_OF_MONTH);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		if(curDay == lastDay) { // 是月末，返回下月月末
			cal.add(Calendar.MONTH, 1);
			lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			cal.set(Calendar.DAY_OF_MONTH, lastDay);
		} else { // 增加一月
			cal.add(Calendar.MONTH, 1);
		}
		return cal.getTimeInMillis();
	}

	public static long getNextMonth(long dt, int monHow) {

		Date d = new Date(dt);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int curDay = cal.get(Calendar.DAY_OF_MONTH);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		if(curDay == lastDay) { // 是月末，返回下月月末
			cal.add(Calendar.MONTH, monHow);
			lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			cal.set(Calendar.DAY_OF_MONTH, lastDay);
		} else { // 增加一月
			cal.add(Calendar.MONTH, monHow);
		}
		return cal.getTimeInMillis();
	}

	public static long getSpNextMonth(long firstdt, long lastdt) {

		Date d = new Date(firstdt);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int firstDay = cal.get(Calendar.DAY_OF_MONTH); // 取得首次定制的日期
		d = new Date(lastdt);
		cal.setTime(d);
		cal.add(Calendar.MONTH, 1); // 上次定制的月份 + 1 月
		int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		if(firstDay >= maxDay) {
			cal.set(Calendar.DAY_OF_MONTH, maxDay);
		} else {
			cal.set(Calendar.DAY_OF_MONTH, firstDay);
		}
		return cal.getTimeInMillis();
	}

	/**
	 * 获得特定日期当月第一天的日期字符串
	 * @param date 日期
	 * @param regex 格式,如：yyyyMMdd
	 * @return
	 */
	public static String getFirstDayOfMonth(String date,String regex){
		if(date == null|| regex == null || "".equals(regex)) {
			return "";
		}

		String result = "";
		SimpleDateFormat sdf = new SimpleDateFormat(regex);
		Calendar now = Calendar.getInstance();
		try {
			now.setTime(sdf.parse(date));
		} catch (ParseException e) {
			log.info("text",e);
			throw new RuntimeException(date+"--不是有效的日期字符串",e);
		}
		now.set(Calendar.DATE, 1);

		result = sdf.format(now.getTime());
		return result;
	}

	/**
	 * 获得特定日期当月最后一天的日期字符串
	 * @param date 日期
	 * @param regex 格式,如：yyyyMMdd
	 * @return
	 */
	public static String getEndDayOfMonth(String date,String regex){
		if(date == null|| regex == null || "".equals(regex)) {
			return "";
		}

		String result = "";
		SimpleDateFormat sdf = new SimpleDateFormat(regex);
		Calendar now = Calendar.getInstance();
		try {
			now.setTime(sdf.parse(date));
		} catch (ParseException e) {
			log.info("text",e);
			throw new RuntimeException(date+"--不是有效的日期字符串",e);
		}
		now.set(Calendar.DATE, 1);
		now.add(Calendar.MONTH, 1);
		now.add(Calendar.DATE, -1);

		result = sdf.format(now.getTime());
		return result;
	}

	/**
	 *
	 * @Description：获取现在时间
	 * <p>创建人：xdt ,  2016-3-4  下午03:26:15</p>
	 * <p>修改人：xdt ,  2016-3-4  下午03:26:15</p>
	 *
	 * @return 返回长时间格式 yyyy-MM-dd HH:mm:ss
	 * Date
	 */
	public static Date getNowDate() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		ParsePosition pos = new ParsePosition(0);
		Date currentTime_2 = formatter.parse(dateString, pos);
		return currentTime_2;
	}

	/**
	 *
	 * 检验传入日期是否符合会员日规则，即是否是会员日
	 * 会员日规则：
	 * 0-0：每月每天
	 * 0-1：每月一号
	 * 1-0：每月第一周每一天
	 * 1-1：每月第一个星期一
	 */
	public static boolean isMemberDay(int firParam,int secParam){
		Calendar c = Calendar.getInstance();
		int day_of_month = c.get(Calendar.DAY_OF_MONTH);
		int week_of_month = c.get(Calendar.WEEK_OF_MONTH);
		if(firParam == 0){
			//每月
			if(secParam == 0){
				return true;
			}else{
				return day_of_month == secParam ? true : false;
			}
		}else{
			if(secParam == 0){
				return week_of_month == firParam ? true : false;
			}else{
				return weekAnddate(firParam, secParam);
			}
		}
	}
	/*
	 * 每月第weekOfMonth个星期dayOfWeek，如：每月第三个周五
	 *
	 */
	public static boolean weekAnddate(int week, int day){
		int min = (week-1) * 7;
		int max = week * 7;
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyyMMdd");
		String currentDate = sf2.format(c.getTime());
		c.set(Calendar.DATE,1);
		//1号星期数
		int firstDate = c.get(Calendar.DAY_OF_WEEK) == 1 ? 7 : c.get(Calendar.DAY_OF_WEEK)-1;
		int memberDay = 0;
		if(firstDate>day){
			memberDay = max - (firstDate - day) + 1;
		}else{
			memberDay = min + (day - firstDate) + 1;
		}
		if(memberDay>31){
			return false;
		}
		c.set(Calendar.DATE,memberDay);
		String memberDate = sf2.format(c.getTime());
		return memberDate.equals(currentDate) ? true : false;
	}


	/*
	 * 判断传入的毫秒数是否为当月
	 */
	public static boolean isCurrentMonth(long timeMillis){
		Calendar calendar = Calendar.getInstance();
		int thisYear = calendar.get(Calendar.YEAR);
		int thisMonth = calendar.get(Calendar.MONTH);
		calendar.setTimeInMillis(timeMillis);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		if(thisYear != year){
			return false;
		}else{
			if(thisMonth != month){
				return false;
			}
		}
		return true;
	}

	public static boolean isExpire(String startDate, String endDate, String currentDate){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			long start = sdf.parse(startDate).getTime();
			long end = sdf.parse(endDate).getTime();
			long current = sdf.parse(currentDate).getTime();
			//new DateTimeUtil().log.debug("startTime="+start+"  end="+end+"  current="+current+(current>=start && current<=end));
			if(current>=start && current<=end){
				return false;
			}
		} catch (ParseException e) {
			log.info("text",e);
		}
		return true;
	}

	public static String formatString2stlDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		try {
			date = sdf1.format(sdf.parse(date));
		} catch (ParseException e) {
			log.info("text",e);
		}
		return date;
	}
	/**
	 * 返回当前时间的yyyy-MM-dd HH:mm:ss格式字符串
	 * @return yyyy-MM-dd HH:mm:ss
	 */
	public static String getTimestampForAlipay(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}


	public static int compare_date(String DATE1, String DATE2) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
		try {
			Date dt1 = df.parse(DATE1);
			Date dt2 = df.parse(DATE2);
			if (dt1.getTime() > dt2.getTime()) {
				System.out.println("dt1 在dt2前");
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				System.out.println("dt1在dt2后");
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			log.info("text",exception);
		}
		return 0;
	}

	public static String  strDateFormat(String strDate) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        // 实例化模板对象
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
		Date d = null;
		try{
			d = sdf1.parse(strDate);
		}catch(Exception e){            // 如果提供的字符串格式有错误，则进行异常处理
			log.info("text",e);       // 打印异常信息
		}
		String str = sdf2.format(d);
		return str;
	}

	public static String  strDateFormat2(String strDate) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        // 实例化模板对象
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
		Date d = null;
		try{
			d = sdf1.parse(strDate);
		}catch(Exception e){            // 如果提供的字符串格式有错误，则进行异常处理
			log.info("text",e);       // 打印异常信息
		}
		String str = sdf2.format(d);
		return str;
	}

	/**
	 * 日期字符串格式转换
	 * @param dateFmt 原格式日期字符串
	 * @param pattern1 原日期格式pattern
	 * @param pattern2 期望日期格式pattern
	 * @return 期望格式日期字符串
	 */
	public static String convertDateFmt(String dateFmt, String pattern1, String pattern2){
		try {
			DateFormat df = new SimpleDateFormat(pattern1);
			Date parse = df.parse(dateFmt);
			String newDateFmt = DateTimeUtil.getDateTimeString(parse, pattern2);
			return newDateFmt;
		} catch (ParseException e) {
			log.info("text",e);
			return "";
		}
	}

	//按照年往前推
	public static String getChangeYear(String colDate,String years){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		Calendar   calendar   =   new GregorianCalendar();
		try {
			calendar.setTime(sdf.parse(colDate));
		} catch (ParseException e) {
			log.info("text",e);
		}
		calendar.add(Calendar.YEAR,- Integer.valueOf(years));//把对账日期往前推year年
		String changeYearDate = sdf.format(calendar.getTime());
		return changeYearDate;
	}
	//按照年往前推
	public static String getChangeDays(String colDate,String days){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		Calendar   calendar   =   new   GregorianCalendar();
		try {
			calendar.setTime(sdf.parse(colDate));
		} catch (ParseException e) {
			log.info("text",e);
		}
		calendar.add(Calendar.DATE,- Integer.valueOf(days));//把对账日期往前推days天
		String changeDaysDate = sdf.format(calendar.getTime());
		return changeDaysDate;
	}
	//按照年往前推
	public static String getChangeMonths(String colDate,String months){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		Calendar   calendar   =   new   GregorianCalendar();
		try {
			calendar.setTime(sdf.parse(colDate));
		} catch (ParseException e) {
			log.info("text",e);
		}
		calendar.add(Calendar.MONTH,- Integer.valueOf(months));//把对账日期往前推months个月
		String changeMonthDate = sdf.format(calendar.getTime());
		return changeMonthDate;
	}

	public static Date formateDate(String date,String formate){
        Date parse=null;
		SimpleDateFormat sdf=new SimpleDateFormat(formate);
		try {
            parse = sdf.parse(date);
        }catch (Exception e){
			log.info("error",e);
		}
		return parse;
	}
}