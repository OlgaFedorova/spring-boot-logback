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
public class JsonSampleAplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonSampleAplication.class, args);
    }

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        log.info("Json-sample по таймеру!");
    }

    @RequestMapping("/")
    public String home() {
        log.info("Info: Json-sample привет");
        return "Json-sample hello!";
    }
}
