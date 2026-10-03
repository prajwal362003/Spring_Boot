package com.eazybytes.main;

import com.eazybytes.configuration.AppConfig;
import com.eazybytes.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean("student",Student.class);

        student.display();

        String msg = context.getBean(String.class);
        System.out.println(msg);

        var student1 = context.getBean("student",Student.class);
        System.out.println("Student Name is: " + student1.getName());

        var student2 = context.getBean("onlinepass",Student.class);
        System.out.println("Student name using value parameter in beans: "+ student2.getName());


        // Vehicle

        // Used primary annotation
        var vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle Name: " + vehicle1.getName());

        // Used value based
        var vehicle2 = context.getBean("non-primary",Vehicle.class);
        System.out.println("Vehicle Name: " + vehicle2.getName());


        // Player
        var player1 = context.getBean(Player.class);
        player1.display();
        System.out.println("The name of the player is: " + player1.getName());

        // Use of primary
        var player2 = context.getBean(Player.class);
        player2.display();
        System.out.println("The name of the player is: " + player2.getName());


        // Use of Autowired(Field Injection)
        var car = context.getBean(Car.class);
        var engine = context.getBean(Engine.class);

        System.out.println("Car name from Spring context: "+ car.getName());
        System.out.println("Engine name from spring context: "+ engine.getName());
        System.out.println("Engine that the car owns is: "+car.getEngine());

    }

}
