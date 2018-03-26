package com.glqdlt.thugmanager;

import com.glqdlt.thugmanager.job.JobManager;
import com.glqdlt.thugmanager.job.JobQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableAutoConfiguration
@SpringBootApplication
public class ThugManagerApplication {


	public static void main(String[] args) {
		SpringApplication.run(ThugManagerApplication.class, args);
		JobManager manager= new JobManager();
		manager.runningJobTasks();
	}

}
