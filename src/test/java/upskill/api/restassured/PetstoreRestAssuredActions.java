package upskill.api.restassured;


import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;
public class PetstoreRestAssuredActions {
	// changes for git
	// pushing to git
	public void createPet() {
		
		given().
		     body(new File(System.getProperty("user.dir")+ "/src/test/resource/ApiRequestsPayloads/CreatePetRequest.json")).
	    when().
		     header("Content-Type", "application/json").
		     header("Username" ,"upskill").
		     header("pasword", "123").
		     post("https://petstore.swagger.io/v2/pet").
		then().
		     log().body().
		and().
		     assertThat().statusCode(200).
		and().
		     body(matchesJsonSchema(new File(System.getProperty("user.dir")+ "/src/test/resource/ApiResponseSchemas/CreatePetResponse.json")));
		
	}
	//test
	public void updatePet() {
    
		given().
	     body(new File(System.getProperty("user.dir")+ "/src/test/resource/ApiRequestsPayloads/UpdatePetRequest.json")).
   when().
	     header("Content-Type", "application/json").
	     header("Username" ,"upskill").
	     header("pasword", "123").
	     put("https://petstore.swagger.io/v2/pet").
	then().
	     log().body().
	and().
	     assertThat().statusCode(200).
	and().
	     body(matchesJsonSchema(new File(System.getProperty("user.dir")+ "/src/test/resource/ApiResponseSchemas/UpdatePetResponse.json")));
	}
	
	public void getPet() {
   
		given().
        when().
	     header("Content-Type", "application/json").
	     header("Username" ,"upskill").
	     header("pasword", "123").
	     get("https://petstore.swagger.io/v2/pet/111").
	then().
	     log().body().
	and().
	     assertThat().statusCode(200).
	and().
	body(matchesJsonSchema(new File(System.getProperty("user.dir")+ "/src/test/resource/ApiResponseSchemas/CreatePetResponse.json")));
	
	}
	
	public void deletePet() {
		
		given().
        when().
	     header("Content-Type", "application/json").
	     header("Username" ,"upskill").
	     header("pasword", "123").
	     delete("https://petstore.swagger.io/v2/pet/111").
	then().
	     log().body().
	and().
	     assertThat().statusCode(200).
	and().
	body(matchesJsonSchema(new File(System.getProperty("user.dir")+ "/src/test/resource/ApiResponseSchemas/CreatePetResponse.json")));
	
	}

}
