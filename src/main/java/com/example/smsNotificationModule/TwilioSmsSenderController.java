package com.example.smsNotificationModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/sms")
public class TwilioSmsSenderController {
    private final TwilioSMSSenderService twilioSMSSenderService;

    @Autowired
    public TwilioSmsSenderController(TwilioSMSSenderService twilioSMSSenderService) {
        this.twilioSMSSenderService = twilioSMSSenderService;
    }

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest){
        twilioSMSSenderService.sendSms(smsRequest);
    }

}
