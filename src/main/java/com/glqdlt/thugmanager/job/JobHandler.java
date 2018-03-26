package com.glqdlt.thugmanager.job;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created By iw.jhun
 * On 2018-03-26 , 오전 11:40
 */
@Component
public class JobHandler {

    @Getter
    private int jobIndex;
    @Getter
    private List<String> URLS;
    @Getter
    private Map<String,Integer> jobPool;


    public JobHandler() {
        this.setUp();
    }


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






    void checkFreeJob(){

        while(true){

        }
    }

    public synchronized void updateAgentStatus(String agent){
        if(this.jobPool.get(agent) == 0){
            this.jobPool.put(agent,1);
        }
    }


}
