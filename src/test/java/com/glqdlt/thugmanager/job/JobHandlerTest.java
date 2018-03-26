package com.glqdlt.thugmanager.job;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created By iw.jhun
 * On 2018-03-26 , 오전 11:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JobHandlerTest {


    @Autowired
    JobHandler jobHandler;


    @Test
    public void init(){
        Assert.assertEquals(0,this.jobHandler.getJobIndex());
        Assert.assertNotEquals(0, this.jobHandler.getURLS().size());
    }

    @Test
    public void checkFreeJob() {

    }

    @Test
    public void updateAgentStatus() {

    }
}