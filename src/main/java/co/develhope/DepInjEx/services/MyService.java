package co.develhope.DepInjEx.services;

import co.develhope.DepInjEx.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    /**
     * a service called MyService where you have:
     * a private variable MyComponent
     * a constructor where you apply constructor-based dependency injection
     * a method getName() that calls and returns getMyComponentName()
     */

    private MyComponent myComponent;

    @Autowired
    public MyService (MyComponent myComponent){
        System.out.println("MyService constructor has been called");
        this.myComponent = myComponent;
    }

    public String getName(){
        System.out.println("MyService.getName has been called");
        return myComponent.getMyComponentName();
    }
}
