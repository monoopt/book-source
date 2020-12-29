package com.zsc.ticketsys.utils;


import com.zsc.ticketsys.entity.Role;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 页面数据展示封装类
 */
@Component
public class Commons {

    /**
     * 截取字符串
     *
     * @param str
     * @param len
     * @return
     */
    public static String substr(String str, int len) {
        if (str.length() > len) {
            return str.substring(0, len);
        }
        return str;
    }

    /**
     * 返回日期
     *
     * @return
     */
    public static String dateFormat(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    /**
     * 返回role对应角色的中文名称
     * @param role
     * @return
     */
    public static String getRoleZhName(Role role) {
        String zhName;
        switch (role.getRoleName()) {
            case "ROLE_common":
                zhName = "普通用户";
                break;
            case "ROLE_admin":
                zhName = "管理员";
                break;
            default:
                zhName = "角色错误";
                break;
        }
        return zhName;
    }

}
