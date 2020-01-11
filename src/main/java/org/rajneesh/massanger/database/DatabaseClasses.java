package org.rajneesh.massanger.database;

import java.util.HashMap;
import java.util.Map;

import org.rajneesh.massanger.model.Message;
import org.rajneesh.massanger.model.Profile;

public class DatabaseClasses {
	private static Map<Long,Message> message=new HashMap<>();
	private static Map<String,Profile> profile=new HashMap<>();
	
	public static Map<Long, Message> getMessage(){
		return message;
	}
	public static Map<String, Profile> getProfiles(){
		return profile;
	}
	
	public static Map<String, Profile> setProfiles(){
		return profile;
	}
	

}
