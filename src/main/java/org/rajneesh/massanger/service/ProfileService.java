package org.rajneesh.massanger.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.rajneesh.massanger.database.DatabaseClasses;
import org.rajneesh.massanger.model.Profile;

public class ProfileService {
	
	
	private Map<String,Profile> profiles = DatabaseClasses.getProfiles();
	public ProfileService()
	{
		profiles.put("nitin",new Profile(1L,"first message","Rajanmunna author","jhjh"));
		profiles.put("raj",new Profile(2,"Second message","Rajanmunna author","kkj"));
	}
	
	public List<Profile> getAllProfiles()
	{
	
		return new ArrayList<Profile>(profiles.values());
	
	}
	
	public Profile getProfile(String profileName)
	{
		return profiles.get(profileName);
	
	}
	
	public Profile addProfile(Profile profile)
	{
		 profile.setId(profiles.size()+1);
		 profiles.put(profile.getProfileName(),profile);
			return profile;
	}
		
	public Profile updateProfile(Profile profile)
	{
		if(profile.getProfileName().isEmpty()){
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	
	}
	
	public Profile removeProfile(String profileName)
	{
	
		return profiles.remove(profileName);
	
	}
	

}

