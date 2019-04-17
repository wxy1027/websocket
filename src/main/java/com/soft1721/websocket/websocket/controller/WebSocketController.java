package com.soft1721.websocket.websocket.controller;


import com.soft1721.websocket.websocket.config.WebSocketServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WebSocketController {

    //推送数据接口
    @GetMapping("/socket/push")
    public String pushMsg(String message) {
        try {
            WebSocketServer.sendInfo(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}