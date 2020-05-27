package com.example.demo.Controller;

import cn.synron.iplocate.bean.IpBean;
import cn.synron.iplocate.service.IpLocateService;
import cn.synron.iplocate.util.IpLocate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName
 * @Description
 * @Author WangHaiQiang
 * @Date Created in 14:02 2020/5/27
 **/
@Controller
public class IpController {


    @Autowired
    private IpLocateService ipLocateService;

    @RequestMapping(value = "/ipPosition")
    @ResponseBody
    public IpBean ipPosition(String ip) {

        IpBean ipBean = ipLocateService.ipPosition(ip);

        return ipBean;
    }

}
