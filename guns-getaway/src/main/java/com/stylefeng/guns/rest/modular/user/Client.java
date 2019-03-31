package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.core.api.user.ServiceApi;
import com.stylefeng.guns.rest.modular.auth.controller.dto.AuthRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: 作者姓名
 * @CreateDate: 2019/3/31 11:41
 * @UpdateUser: jiaorongguo
 * @UpdateDate: 2019/3/31 11:41
 * @Version: 1.0
 * 身无彩凤双飞翼，心有灵犀一点通。
 */
@Component
public class Client {
   @Reference(interfaceClass = ServiceApi.class)
    private ServiceApi serviceApi;
    private void run(AuthRequest authRequest){
        serviceApi.login(authRequest.getUserName(),authRequest.getPassword());
    }
}
