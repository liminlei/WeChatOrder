package com.imooc.sell.util;

import java.util.Random;

/**
 * 订单id 随机数生成
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 时间+随机数
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer a = random.nextInt(900000) + 100000;//6位随机数
        return System.currentTimeMillis() +String.valueOf(a);
    }
}
