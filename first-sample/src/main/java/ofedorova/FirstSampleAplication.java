package ofedorova;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableScheduling
@RestController
@Slf4j
public class FirstSampleAplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSampleAplication.class, args);
    }

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        log.info("First-sample by timer!");
    }

    @RequestMapping("/")
    public String home() {
        log.info("Info: First-sample hello");
        return "First-sample hello!";
    }
}
