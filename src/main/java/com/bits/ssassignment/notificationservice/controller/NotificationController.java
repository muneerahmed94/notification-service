package com.bits.ssassignment.notificationservice.controller;

import com.bits.ssassignment.notificationservice.model.Notification;
import com.bits.ssassignment.notificationservice.service.EmailService;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {
    @RequestMapping(value="/notify", method = RequestMethod.POST)
    @ResponseBody
    public Notification notify(@RequestBody Notification notification) {
        EmailService.sendMail(notification);
        return notification;
    }
}
