package com.stylefeng.guns.rest.modular.user;


import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.core.api.user.ServiceApi;
import org.springframework.stereotype.Component;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: 作者姓名
 * @CreateDate: 2019/3/27 21:38
 * @UpdateUser: jiaorongguo
 * @UpdateDate: 2019/3/27 21:38
 * @Version: 1.0
 * 身无彩凤双飞翼，心有灵犀一点通。
 */
@Component
@Service(interfaceClass = ServiceApi.class)
public class QuickStartImpl implements ServiceApi {
    @Override
    public String sendMessage(String username,String password) {
        return "服务提供者："+username;
    }
}
