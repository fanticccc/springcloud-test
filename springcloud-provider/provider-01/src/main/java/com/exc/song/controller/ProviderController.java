package com.exc.song.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author YSTen_SongJunBao
 * @Description:
 * @Date 2022/2/21 15:57
 * @Version 1.0
 * com.exc.controller
 */
@RequestMapping("/provider")
@RestController
public class ProviderController {

    @GetMapping("/offer")
    public String offerData() {
        return "hello im Provider ";
    }

    @GetMapping("/offer2")
    public String offerData2() {
        return "hello im Provider2 --->";
    }
}
