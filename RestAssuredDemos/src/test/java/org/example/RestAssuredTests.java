package org.example;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTests {
	
	RequestSpecification requestSpec;
	Response response;
	ValidatableResponse validatableResponse;

	@Test
	public void getRequest() {
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		//Create a request specification
		requestSpec = RestAssured.given();
		
		//Calling get method
		response = requestSpec.get();
		
		//Print the response
		System.out.println(response.asString());
		
		//Validate response
		validatableResponse = response.then();
		validatableResponse.assertThat().statusCode(200);
		validatableResponse.log().all();
		
	}
	
	@Test
	public void getRequest2() {
		
		RestAssured.given().baseUri("https://reqres.in/api/users")
		.when().get("/2")
		.then()
		.statusCode(200);
		
	}

	@Test
	public void postRequest3() {
		
		String payload = "{\"name\":\"morpheus\",\"job\":\"zion resident\"}";
						
		RestAssured.given().baseUri("https://reqres.in/api/users")
		             .body(payload)
		             .when()
		             .post()
		             .then()
		             .statusCode(201);
	
	}

	@Test
	public void putRequest2() {
		
		String payload = "{\"name\":\"morpheus\",\"job\":\"zion resident\"}";
		
		RestAssured.given().baseUri("https://reqres.in/api/users")
		             .body(payload)
		             .when()
		             .put("/2")
		             .then()
		             .statusCode(200);
	}

	@Test
	public void deleteRequest2() {
		
		RestAssured.given().baseUri("https://reqres.in/api/users")
		    
		             .when()
		             .delete("/2")
		             .then()
		             .statusCode(204);
	}
	
}
