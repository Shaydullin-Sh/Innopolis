package org.example;

import abstraction.model.Cat;
import abstraction.model.Dog;
import abstraction.model.Human;
import org.w3c.dom.ls.LSOutput;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
       Dog dog = new Dog(
               "Млекопитающие",
               "Псовые",
               "Хищник",
               "Суша",
               2,
               "Шарик");
       dog.eat();
       dog.walk();
       dog.run();
       dog.sleeping();
    }
}
