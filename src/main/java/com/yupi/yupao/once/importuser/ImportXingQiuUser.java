package com.yupi.yupao.once.importuser;

import com.alibaba.excel.EasyExcel;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 导入星球用户到数据库
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class ImportXingQiuUser {

    public static void main(String[] args) {
        // todo 记得改为自己的测试文件
        String fileName = "E:\\星球项目\\yupao-backend\\src\\main\\resources\\prodExcel.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 同步读取会自动finish
        List<XingQiuTableUserInfo> userInfoList =
                EasyExcel.read(fileName).head(XingQiuTableUserInfo.class).sheet().doReadSync();
        System.out.println("总数 = " + userInfoList.size());
        Map<String, List<XingQiuTableUserInfo>> listMap =
                userInfoList.stream()
                        .filter(userInfo -> StringUtils.isNotEmpty(userInfo.getUsername()))
                        .collect(Collectors.groupingBy(XingQiuTableUserInfo::getUsername));
        for (Map.Entry<String, List<XingQiuTableUserInfo>> stringListEntry : listMap.entrySet()) {
            if (stringListEntry.getValue().size() > 1) {
                System.out.println("username = " + stringListEntry.getKey());
                System.out.println("1");
            }
        }
        System.out.println("不重复昵称数 = " + listMap.keySet().size());
    }
}
