package com.gateway.svmProject.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : Kevin Chang
 * @create 2023/10/6 上午10:49
 */
public interface ApiService {


    ResponseEntity<String> getBangmartInfo(String uri);

    ResponseEntity<String> sendNotifyInfo(Object data);


}
