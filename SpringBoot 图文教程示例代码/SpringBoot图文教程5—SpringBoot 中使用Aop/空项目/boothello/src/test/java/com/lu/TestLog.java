package com.lu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {

    /**
     * getLogger 参数为当前类的类对象
     * org.slf4j.Logger;
     * org.slf4j.LoggerFactory;
     */
    private static Logger logger = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {
        /**
         * 通过 Logger 的api打印信息
         *
         */
        logger.debug("这是日志");
        logger.info("这是日志");
        logger.warn("这是日志");
        logger.error("这是日志");
    }
}
