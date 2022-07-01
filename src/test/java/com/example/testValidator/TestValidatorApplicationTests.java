package com.example.testValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestValidatorApplicationTests {
	
	ValidatorBusinessLogic validatorBusinessLogic = new ValidatorBusinessLogic();

	@Test
	void contextLoads() {
		
		}
	
	@ParameterizedTest
	@ValueSource(strings = {"desciptionforValidA", "AnotherdesciptionforValidA","11JustValid","omeaaathingccccccccccccccccc39charscccc"})
	void testCheckValidLengthConditionsForA(String description) {
	    assertTrue(validatorBusinessLogic.checkLengthConditionsForA(description));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"NotValidA", "Invalid ","Inv","StillInv"})
	void testCheckInvalidLengthConditionsForA(String description) {
	    assertFalse(validatorBusinessLogic.checkLengthConditionsForA(description));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"desciptionforValidB", "AnotherdesciptionforValidB","","omeaaathingccccccccccccccccc39charscccc"})
	void testCheckValidLengthConditionsForB(String description) {
	    assertTrue(validatorBusinessLogic.checkLengthConditionsForB(description));
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"omeaaathingcccccccccccccccccc40charscccc","omeaaathingccccccccccccccccccc41charscccc"})
	void testCheckInvalidLengthConditionsForB(String description) {
	    assertFalse(validatorBusinessLogic.checkLengthConditionsForB(description));
	}
	
	
	
	@ParameterizedTest
	@MethodSource("getValidObjectArgumentsAsJson")
	void testValidCheckName(ObjectPOJO inputJson) {
	    assertTrue(validatorBusinessLogic.checkName(inputJson));
	}
	
	
	static Stream<ObjectPOJO> getValidObjectArgumentsAsJson() {
	    final var inputJson1 = new ObjectPOJO('A','a',"");
	    final var inputJson2 = new ObjectPOJO('B','b',"");;

	    return Stream.of(inputJson1,inputJson2);
	}
	
	
	
	@ParameterizedTest
	@MethodSource("getInValidObjectArgumentsAsJson")
	void testInvalidCheckName(ObjectPOJO inputJson) {
	    assertFalse(validatorBusinessLogic.checkName(inputJson));
	}
	
	
	static Stream<ObjectPOJO> getInValidObjectArgumentsAsJson() {
	    final var inputJson1 = new ObjectPOJO('A','e',"");
	    final var inputJson2 = new ObjectPOJO('B','B',"");;
	    final var inputJson3 = new ObjectPOJO('B','z',"");;

	    return Stream.of(inputJson1,inputJson2,inputJson3);
	}
	
	
	
	
	
	
	
	
}


