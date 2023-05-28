package com.yupi.yupao.once.importuser;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * 星球表格用户信息
 */
@Data
public class XingQiuTableUserInfo {

    /**
     * id
     */
    @ExcelProperty("成员编号")
    private String planetCode;

    /**
     * 用户昵称
     */
    @ExcelProperty("成员昵称")
    private String username;

    // [加入编程导航](https://t.zsxq.com/0emozsIJh) 入门捷径+交流答疑+项目实战+求职指导，帮你自学编程不走弯路

}