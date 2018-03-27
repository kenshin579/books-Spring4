package sample;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("batch-context.xml");
        JobLauncher jobLauncher = ctx.getBean(JobLauncher.class);

        Job job = (Job) ctx.getBean("job1");

        Map<String, JobParameter> params = new HashMap<String, JobParameter>();
        params.put("inputFile", new JobParameter("classpath:/product_csv/1.csv"));
        jobLauncher.run(job, new JobParameters(params));
    }
}
