package com.glqdlt.thugmanager.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created By iw.jhun
 * On 2018-03-26 , 오후 3:54
 */

@Slf4j
public class JobWorker implements Runnable{

    private final String url;
    private final int index;

    public JobWorker(int index) {
        this.index = index;
        this.url = JobQueue.getInstance().getURLS().get(index);
    }

    @Override
    public void run() {
        log.debug("i'm worker.. url:" + url + ", and agent is..agent" + index + 1);
        JobQueue.getInstance().getJobPool().get(index).setStatus(true);
        JobQueue.getInstance().updateAgentStatus(index);
    }
}
