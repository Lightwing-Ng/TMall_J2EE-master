package tmall.test;

import org.apache.commons.lang.StringUtils;

/**
 * @ClassName TestCase
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/15, 14:14
 * @Version 1.0
 **/

public class TestCase {
    public static void main(String[] args) {
        System.out.println(StringUtils.substringBetween("aa_bb_cc", "_", "_"));
        System.out.println(StringUtils.substringAfterLast("/forehome", "/fore"));
    }
}