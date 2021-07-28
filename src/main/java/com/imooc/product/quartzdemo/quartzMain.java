package com.imooc.product.quartzdemo;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author zxW
 * @ClassName: quartzMain
 * @Description:
 * @date 2021-07-28 ,10:45
 * @packageName com.imooc.product.quartzdemo
 */
public class quartzMain {
    public static void main(String[] args) {
        //定义一个JobDetail
        JobDetail jobDetail = JobBuilder.newJob(HelloQuartz.class).
                //定义name 和 group
                        withIdentity("job1", "group1")
                //job需要传递的内容
                .usingJobData("name", "王泽轩")
                .build();
        //定义一个Trigger(触发器)
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
                .startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).repeatForever()).build();

        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            scheduler.shutdown();
        } catch (
                SchedulerException e) {
            e.printStackTrace();
        }
    }


}
