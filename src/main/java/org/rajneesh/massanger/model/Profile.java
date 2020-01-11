package org.rajneesh.massanger.model;

public class Profile {
	
	private long id;
	private String name;
	private String author;
	private String author2;

	public Profile()
	{
		
	}
	
	public Profile(long id,String name,String author,String author2)
	{
		this.id=id;
		this.name=name;
		this.setAuthor(author);
		this.setAuthor(author2);
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfileName() {
		return name;
	}

	public void setProfileName(String name) {
		this.name = name;
	}

	public String getAuthor2() {
		return author2;
	}

	public void setAuthor2(String author2) {
		this.author2 = author2;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


}
