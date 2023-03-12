package co.develhope.DepInjEx.controllers;

import co.develhope.DepInjEx.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    /**
     * a controller called MyController where you have:
     * a private variable MyService
     * a constructor
     * a mapping to /getName in order to return the result of the getName() method of the MyService variable
     * a mapping to default root / that prints a welcome message
     */

    private MyService myService;

    public MyController (MyService myService){
        System.out.println("MyController constructor has been called");
        this.myService = myService;
    }

    public MyService getMyService(){
        System.out.println("MyController.getMyService method has been called");
        return myService;
    }

    public void setMyService(MyService myService){
        System.out.println("MyController.setMyService method has been called");
        this.myService = myService;
    }

    //NON CAPISCO perché questa GET request su POSTMAN non funziona
    //cioè mi dà NOT FOUND
    //mentre il /getName funziona benissimo
    @GetMapping("/hello")
    public String helloMsg(){
        return "Hello, thanks for using this unuseful software!";
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyController.getName method has been called");
        return myService.getName();
    }
}
