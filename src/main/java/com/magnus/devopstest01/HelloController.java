package com.magnus.devopstest01;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class HelloController {

    @GetMapping("greeting/{name}")
    public String greeting(@PathVariable String name){
        return "Hello "+name+"!!!";
    }

    @GetMapping("greeting2")
    public String greeting2(@RequestParam("name") String name){
        return "Hello "+name+"!!!";
    }

    @GetMapping("greeting3")
    public String greeting3(@RequestParam(name="name", defaultValue= "Guest") String name){
        return "Hello "+name+"!!!";
    }

    @GetMapping("greeting4")
    public String greeting4(@RequestParam("name") String name,
                            @RequestParam("lastname") String lastname){
        return "Hello "+name+" "+lastname+"!!";
    }
}
