package com.jia.y;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Wei
 */
@RestController
public class Jia {

   @Autowired
   private GirlProperties girlProperties;

    @RequestMapping("/miss")
    public String Miss(){
        return girlProperties.getAge().toString();
    }
}
