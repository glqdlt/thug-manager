package com.glqdlt.thugmanager.common.rest;

import org.springframework.stereotype.Component;
import org.springframework.web.client.AsyncRestTemplate;

/**
 * Created By iw.jhun
 * On 2018-03-26 , 오전 11:42
 */

@Component
public class RequestBuilder {

    public final static AsyncRestTemplate asyncRestTemplate = new AsyncRestTemplate();

}
