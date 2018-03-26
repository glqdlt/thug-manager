package com.glqdlt.thugmanager.common.rest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.client.AsyncRestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created By iw.jhun
 * On 2018-03-26 , 오후 1:42
 */

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RequestBuilderTest {


    @Autowired
    RequestBuilder requestBuilder;

    AsyncRestTemplate asyncRestTemplate;

    @Before
    public void init() {
        this.asyncRestTemplate = requestBuilder.asyncRestTemplate;
    }

    @Test
    public void asyncRestTemplateTest() throws InterruptedException {


        List<String> URLS = new ArrayList<>();
        URLS.add("http://www.google.co.kr");
        URLS.add("http://www.daum.net");
        URLS.add("http://www.naver.com");

        List<ListenableFuture<ResponseEntity<String>>> listFuture = new ArrayList<>();

        URLS.forEach(x -> {
            listFuture.add(callbackMethod(x));
        });



        TimeUnit.SECONDS.sleep(15);

    }


    public ListenableFuture<ResponseEntity<String>>  callbackMethod(String url) {

        ListenableFuture<ResponseEntity<String>> future = this.asyncRestTemplate.getForEntity(url, String.class);

        future.addCallback(result -> {
            log.debug("=================");
            log.debug("url: "+url);
            log.debug(result.getBody());
            log.debug(result.getStatusCode() + "");
            log.debug("=================");
        }, e -> {
            log.error(e.getMessage(), e);
        });
        return future;
    }

}