package com.example.testValidator;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ValidatorBusinessLogic {
	
	
	public ObjectPOJO serealizeInputJson(String inputJson) {

		Gson gson = new Gson();
		ObjectPOJO outputObj = null;
		java.lang.reflect.Type inputObjJson = new TypeToken<ObjectPOJO>() {
		}.getType();

		outputObj = gson.fromJson(inputJson, inputObjJson);
		assert (outputObj != null);
		return outputObj;
	}

	public ValidatorBusinessLogic() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public boolean checkLengthConditionsForA(String description) {
		return  (description.length() >10 &&description.length() <100 );
	}
	
	
	public boolean checkLengthConditionsForB(String description) { // Checks length of description is lower that 40 characters
		return  description.length() <40;
	}
	
	public boolean checkName(ObjectPOJO inputJson)// Checks that name is lowercase of topic character
	{
		return inputJson.getName() == Character.toLowerCase(inputJson.getTopic());
	}
	
	
	public String validateAccordingToRules(ObjectPOJO inputJson) {
		// TODO Auto-generated method stub
		
		switch(inputJson.getTopic()) {
		
		//&& (inputJson.getDescription().length() >10 && inputJson.getDescription().length() <100 )
		
		case 'A': return (checkName(inputJson) && checkLengthConditionsForA(inputJson.getDescription())) ?  "Valid" :  "Not Valid" ;
		case 'B': return (checkName(inputJson) &&  checkLengthConditionsForB(inputJson.getDescription())) ?  "Valid" :  "Not Valid" ;
		
		
		}
		
	
		
		
		return "Not Valid";
		
		//return inputJson.getDescription(); Testing if values are injected properly through POJO
	}

}
