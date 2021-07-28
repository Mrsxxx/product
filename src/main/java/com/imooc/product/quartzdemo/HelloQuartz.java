package com.imooc.product.quartzdemo;

import org.quartz.*;

import java.util.Date;

/**
 * @author zxW
 * @ClassName: HelloQuartz
 * @Description:
 * @date 2021-07-28 ,10:58
 * @packageName com.imooc.product.quartzdemo
 */
public class HelloQuartz implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDetail detail = jobExecutionContext.getJobDetail();
        String name = detail.getJobDataMap().getString("name");
        JobKey key = detail.getKey();


        System.out.println("my job name is  " + name + " at " + new Date() + "___" + key);
    }
}
