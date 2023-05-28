package com.yupi.yupao.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用删除请求
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Data
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = -5860707094194210842L;

    private long id;
}
