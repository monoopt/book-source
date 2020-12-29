package com.zsc.ticketsys.utils;

import com.google.common.base.CaseFormat;
import org.apache.ibatis.annotations.Case;

public class StringFormmat {
    /**
     * 将下划线字符串格式转换为驼峰命名格式
     *
     * @param s 下划线格式的字符串
     * @return
     */
    public static String toCamel(String s) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, s);
    }

    /**
     * 将驼峰命名格式转换为下划线字符串格式
     *
     * @param s 驼峰命名格式的字符串
     * @return
     */
    public static String toUnderScore(String s) {
        return  CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, s);
    }

    public static void main(String[] args) {
        System.out.println(toCamel("create_time"));
        System.out.println(toUnderScore("registerIp"));
    }
}
