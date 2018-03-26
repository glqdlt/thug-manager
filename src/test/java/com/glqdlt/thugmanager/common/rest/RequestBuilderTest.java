package com.glqdlt.thugmanager.common.rest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.client.AsyncRestTemplate;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created By iw.jhun
 * On 2018-03-26 , 오후 1:42
 */

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RequestBuilderTest {


    AsyncRestTemplate asyncRestTemplate;

    @Before
    public void init(){
        this.asyncRestTemplate = new AsyncRestTemplate();
    }

    @Test
    public void asyncRestTemplateTest() throws InterruptedException {


        ListenableFuture<ResponseEntity<String>> future = this.asyncRestTemplate.getForEntity("http://www.google.co.kr",
                String.class);

        future.addCallback(result -> {
            log.debug("=================");
            log.debug(result.getBody());
            log.debug(result.getStatusCode()+"");
            log.debug("=================");
        }, e -> {
            log.error(e.getMessage(),e);
        } );

        TimeUnit.SECONDS.sleep(8);

    }

}