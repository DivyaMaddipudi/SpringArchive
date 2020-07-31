package com.maven.DependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.maven.cars.Swift;
import com.maven.interfaces.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car swift = (Car) new Swift();
        System.out.println(swift.spec());
        
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
        Car myCar = context.getBean("celerio", Car.class);
        System.out.println(myCar.spec());
        context.close();
    }
}
