package com.glqdlt.thugmanager.job;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created By iw.jhun
 * On 2018-03-26 , 오전 11:55
 */
public class JobHandlerTest {


    private int jobIndex;
    private List<String> URLS;
    private Map<String,Integer> jobPool;


    @Before
    public void setUp() {
        this.jobIndex = 0;

        this.URLS = new ArrayList<>();
        for(int i=0; i <99; i++){
            URLS.add("http://sample"+i+".com");
        }

        this.jobPool = new HashMap<>();
        this.jobPool.put("agent1",0);
        this.jobPool.put("agent2",0);

    }


    @Test
    public void checkFreeJob() {
    }

    @Test
    public void updateAgentStatus() {
    }
}