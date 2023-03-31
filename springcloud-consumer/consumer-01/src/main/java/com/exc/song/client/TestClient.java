package com.exc.song.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author YSTen_SongJunBao
 * @Description: 远程接口
 * @Date 2022/3/24 17:27
 * @Version 1.0
 * com.exc.song.service
 */
@FeignClient(name = "provider-01", url = "http://localhost:4001/")
public interface TestClient {
    @GetMapping("/provider/offer2")
    String offerData();
}
