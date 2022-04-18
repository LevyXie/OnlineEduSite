package com.levy.service_statistics.service.client;

import com.levy.commonutils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description：服务调用
 * @author：LevyXie
 * @create：2022-03-27 15:47
 */
@Component
@FeignClient(name = "service-ucenter",fallback = UcenterClientImpl.class)
public interface UcenterClient {
    @GetMapping("/educenter/member/getRegiesterDaily/{day}")
    public R getRegisterDaily(@PathVariable("day") String day);
}
