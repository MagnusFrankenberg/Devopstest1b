package com.magnus.devopstest01

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class GoodbyeController{

@GetMapping("bye/{name}")
public String goodbye(@PathVariable String name){

return "Goodbye "+name+"!!";

}

}
