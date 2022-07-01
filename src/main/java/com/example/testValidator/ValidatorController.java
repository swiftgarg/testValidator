/**
 * 
 */
package com.example.testValidator;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kshit
 *
 */
@RestController
public class ValidatorController {

	
	private ValidatorBusinessLogic businessLogic;

	/**
	 * 
	 */
	public ValidatorController() {
		

		businessLogic =  new ValidatorBusinessLogic();
		// TODO Auto-generated constructor stub
	}
	
	


	  @PostMapping("/validateJson")
    public String validateObjectAsJson(@RequestBody ObjectPOJO inputJson) throws IOException, ClassNotFoundException {
        
    	
    	//ObjectPOJO inputAsObject =  businessLogic.serealizeInputJson(inputJson);// hardcoded json
    	
    	
    	
        return businessLogic.validateAccordingToRules(inputJson);
    }

}
