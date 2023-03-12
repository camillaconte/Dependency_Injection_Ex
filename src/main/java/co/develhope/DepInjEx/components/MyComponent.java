package co.develhope.DepInjEx.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    /**
     * define a component called MyComponent where you have:
     * an instance string variable called myComponentName
     * a constructor that assigns your name to the instance variable
     * a method getMyComponentName() that returns the value of myComponentImmutableName
     */

    private final String myComponentName;

    public MyComponent() {
        System.out.println("MyComponent constructor has been called");
        this.myComponentName = "Camilla Conte";
    }

    public String getMyComponentName() {
        System.out.println("MyComponent getMyComponentName had been called");
        return myComponentName;
    }
}
