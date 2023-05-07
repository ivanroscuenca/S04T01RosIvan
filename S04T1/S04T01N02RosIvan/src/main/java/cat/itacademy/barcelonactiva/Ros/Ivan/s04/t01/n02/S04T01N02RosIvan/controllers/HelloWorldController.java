package cat.itacademy.barcelonactiva.Ros.Ivan.s04.t01.n02.S04T01N02RosIvan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    //CASE 1
    @GetMapping(value ={"/HelloWorld","/HelloWorld/"})
    @ResponseBody
    public String greeting(@RequestParam(name="name",required=false,defaultValue = "UNKNOWN") String name) {
        return "Hello " + name + ". You are executing this program in Maven.";
    };

    //CASE 2
   @GetMapping(value ={"/HelloWorld2","/HelloWorld2/","/HelloWorld2/{name}"})
   @ResponseBody
    public String greeting2(@PathVariable(name="name",required=false) String name) {

       if (name ==null || name.isEmpty()){
          name = "UNKNOWN";
    }
      return "Hello " + name + ". You are executing this program in Maven.";
   }

}