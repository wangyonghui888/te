package com.pm.arch;


import com.pm.arch.entity.DigitalCurrency;
import com.pm.arch.metadata.WindowTraffic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/{ver}")
public class FlowSpringApplicationTest {

    public static void main(String[] args) {
        SpringApplication.run(FlowSpringApplicationTest.class, args);
    }



    @GetMapping("/health")
    public DigitalCurrency healthCheck() {
        return DigitalCurrency.builder().volume(100).currency("digital currency(●'◡'●)💪").build();
    }


    @WindowTraffic("1.0.0")
    @GetMapping("/currency")
    public DigitalCurrency rmbCurrency(@PathVariable(name = "ver")  String distro) {
        return DigitalCurrency.builder().volume(100).currency("digital rmb currency(●'◡'●)💪" +  distro).build();
    }


}
