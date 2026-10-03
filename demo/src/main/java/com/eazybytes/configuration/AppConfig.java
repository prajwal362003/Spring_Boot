package com.eazybytes.configuration;
import com.eazybytes.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.eazybytes.model"})
public class AppConfig {

    @Bean
    public String hello(){
        return "Hello World";
    }

    @Bean
    Student student(){
        var stud = new Student();
        stud.setName("Prajwal");
        return stud;
    }

    @Bean(value="onlinepass")
    Student student2(){
        var stud = new Student();
        stud.setName("Sarthak");
        return stud;
    }

    // Use of primary
    @Primary
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean("non-primary")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Maruti");
        return veh;
    }

    // For Player Class
    @Bean
    Player player1(){
        var play = new Player();
        play.setName("Virat");
        return play;
    }

    @Primary
    @Bean
    Player player2(){
        var play = new Player();
        play.setName("Rohit");
        return play;
    }

    @Bean
    Car car(){
        var cr = new Car(eng());
        cr.setName("Kia");
        return cr;
    }

    @Bean
    Engine eng(){
        var engine = new Engine();
        engine.setName("bs6");
        return engine;
    }


}