package com.example.testValidator;

public class ObjectPOJO {
	
	private char topic;
	private char name;
	String description;

	
	
	
	
	/**
	 * @return the topic
	 */
	public char getTopic() {
		return topic;
	}



	/**
	 * @param topic the topic to set
	 */
	public void setTopic(char topic) {
		this.topic = topic;
	}



	/**
	 * @return the name
	 */
	public char getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(char name) {
		this.name = name;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}



	/**
	 * @param topic
	 * @param name
	 * @param description
	 */
	public ObjectPOJO(char topic, char name, String description) {
		super();
		this.topic = topic;
		this.name = name;
		this.description = description;
	}



	public ObjectPOJO() {
		// TODO Auto-generated constructor stub
	}

}
