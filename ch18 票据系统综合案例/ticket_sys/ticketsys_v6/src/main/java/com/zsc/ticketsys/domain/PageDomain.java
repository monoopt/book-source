package com.zsc.ticketsys.domain;

import com.zsc.ticketsys.constants.Constants;
import lombok.Data;
import org.springframework.util.StringUtils;

/**
 * 封装分页的请求
 */
@Data
public class PageDomain {
    Integer pageNum;     //请求页
    Integer pageSize;   //分页的大小
    String sortColumn;   //排序的字段名
    String sortOrder;   //排序方向


    /**
     * 构造函数
     *
     * @return
     */
    public PageDomain(int pageNum, int pageSize, String sortColumn, String sortOrder) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.sortColumn = sortColumn;
        this.sortOrder = sortOrder;
    }


    /**
     * 构造排序字符串
     *
     * @return
     */
    public String buildOrderStr() {
        if (!StringUtils.isEmpty(sortColumn) && !StringUtils.isEmpty(sortOrder)
                && ("asc".equals(sortOrder) || "desc".equals(sortOrder))) {

            StringBuffer sb = new StringBuffer();
            sb.append(sortColumn);
            sb.append(" ");
            sb.append(sortOrder);
            return sb.toString();
        } else {
            return "";
        }
    }
}
