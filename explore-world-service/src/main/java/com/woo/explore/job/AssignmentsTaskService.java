package com.woo.explore.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wuminggu on 2017/8/18.
 */
public class AssignmentsTaskService {
    private final Logger LOGGER = LoggerFactory.getLogger(AssignmentsTaskService.class);
    public void execute() {
        long time = System.currentTimeMillis();
        System.out.println("调用定时任务" + time);
        LOGGER.error("调用定时任务");
    }
}
