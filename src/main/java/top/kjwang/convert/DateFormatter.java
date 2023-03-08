package top.kjwang.convert;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author kjwang
 * @Date 2023/3/8 13:00
 * @Description 使用Formatter自定义日期转换器
 */
public class DateFormatter implements Formatter<Date> {
    String datePattern = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Date parse(String source, Locale locale) throws ParseException{
        //声明SimpleDateFormat对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        return simpleDateFormat.parse(source);
    }

    @Override
    public String print(Date date,Locale locale){
        return new SimpleDateFormat().format(date);
    }
}
