package com.example.demo.Controller;

import cn.synron.iplocate.bean.IpBean;
import cn.synron.iplocate.service.IpLocateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName
 * @Description
 * @Author WangHaiQiang
 * @Date Created in 14:05 2020/5/27
 **/

@SpringBootTest
class IpControllerTest {

    @Autowired
    private IpController ipController;


    @Test
    void ipPosition() {


        Runtime r = Runtime.getRuntime();
        r.gc();

        long startTime = System.currentTimeMillis();
        long startMem = r.freeMemory();

        IpBean ipBean = ipController.ipPosition("2.20.254.10");
        //IpBean ipBean = ipController.ipPosition("17563647");

        long endMem = r.freeMemory();

        long endTime = System.currentTimeMillis();

        long consumeMem = startMem - endMem;
        long consumeTime = endTime - startTime;

        System.out.println(ipBean);
        System.out.println("消耗内存" + consumeMem + "ms");
        System.out.println("所用时间" + consumeTime + "b");

    }
}