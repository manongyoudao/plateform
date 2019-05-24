package entity;

import java.util.List;

/**
 * @author 王文泽
 * 涉及页面查询的响应结果
 */
public class PageResponse<T> {
    private Integer total; //总页数
    private List<T> rows; //数据列表
}
