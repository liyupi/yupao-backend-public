package com.yupi.yupao.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用分页请求参数
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Data
public class PageRequest implements Serializable {

    private static final long serialVersionUID = -5860707094194210842L;

    /**
     * 页面大小
     */
    protected int pageSize = 10;

    /**
     * 当前是第几页
     */
    protected int pageNum = 1;
}
