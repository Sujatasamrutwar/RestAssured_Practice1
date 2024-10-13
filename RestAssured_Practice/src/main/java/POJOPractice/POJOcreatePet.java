package POJOPractice;

import java.util.ArrayList;

public class POJOcreatePet {
private int id;
private CategoryPet category;
private String name;
private ArrayList<String> photoUrls;
private ArrayList<tagsPet> tags;

private String status;

public POJOcreatePet( ) {}

public POJOcreatePet(int id, CategoryPet category, String name, ArrayList<String> photoUrls, ArrayList<tagsPet> tags,
		String status) {
	super();
	this.id = id;
	this.category = category;
	this.name = name;
	this.photoUrls = photoUrls;
	this.tags = tags;
	this.status = status;
	
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public CategoryPet getCategory() {
	return category;
}

public void setCategory(CategoryPet category) {
	this.category = category;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public ArrayList<String> getPhotoUrls() {
	return photoUrls;
}

public void setPhotoUrls(ArrayList<String> photoUrls) {
	this.photoUrls = photoUrls;
}

public ArrayList<tagsPet> getTags() {
	return tags;
}

public void setTags(ArrayList<tagsPet> tags) {
	this.tags = tags;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}



}
