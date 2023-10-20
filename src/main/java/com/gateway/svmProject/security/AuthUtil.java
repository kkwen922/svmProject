package com.gateway.svmProject.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author : Kevin Chang
 * @create 2023/10/6 上午10:36
 */
@Slf4j
@Component
public class AuthUtil {
    @Value("${apt.username}")
    private String username;

    @Value("${apt.password}")
    private String password;

    @Value("${notify.username}")
    private String notifyUsername;

    @Value("${notify.password}")
    private String notifyPassword;
    public boolean checkAccount(String input_username,String input_password){

        if(input_username.equals(username) && input_password.equals(password)){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkNotifyAccount(String input_username,String input_password){
        if(input_username.equals(notifyUsername) && input_password.equals(input_password)){
            return true;
        }else{
            return false;
        }
    }
}
