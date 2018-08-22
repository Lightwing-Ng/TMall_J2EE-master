package tmall.util;

/**
 * @ClassName DateUtil
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/15, 14:14
 * @Version 1.0
 **/
public class DateUtil {
    public static java.sql.Timestamp d2t(java.util.Date d) {
        if (null == d)
            return null;
        return new java.sql.Timestamp(d.getTime());
    }

    public static java.util.Date t2d(java.sql.Timestamp t) {
        if (null == t)
            return null;
        return new java.util.Date(t.getTime());
    }
}