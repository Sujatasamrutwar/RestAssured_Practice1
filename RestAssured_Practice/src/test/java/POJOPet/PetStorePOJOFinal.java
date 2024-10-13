package POJOPet;

import org.testng.annotations.Test;


import POJOPractice.CategoryPet;
import POJOPractice.POJOcreatePet;
import POJOPractice.tagsPet;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class PetStorePOJOFinal {

	@Test
	
	public void PetStoreCreate() {
		CategoryPet category = new CategoryPet(101, "Cat");
		
		ArrayList<String> photoUrls = new ArrayList<String>();
		photoUrls.add("https://google.com");
		
		tagsPet tag2 = new tagsPet(1, "Maggie");
		ArrayList<tagsPet> tags = new ArrayList<tagsPet>();
		tags.add(tag2);
		
		POJOcreatePet jsonBodyPet = new POJOcreatePet(0, category, "Maggie", photoUrls, tags , "Available");
		
		//precondition
		given().contentType(ContentType.JSON).body(jsonBodyPet).log().all()
		
		//http method
		.when().post("https://petstore.swagger.io/v2/pet")
		
		//response
		.then().log().all();
	}
	
}
