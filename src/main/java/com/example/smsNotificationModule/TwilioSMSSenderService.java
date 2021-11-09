package com.example.smsNotificationModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TwilioSMSSenderService {

    private final TwilioSmsSenderImplementation twilioSmsSenderImplementation;

    @Autowired
    public TwilioSMSSenderService(@Qualifier("twilio") TwilioSmsSenderImplementation twilioSmsSenderImplementation) {
        this.twilioSmsSenderImplementation = twilioSmsSenderImplementation;
    }

    public void sendSms(SmsRequest smsRequest){
        twilioSmsSenderImplementation.sendSMS(smsRequest);
    }
}
