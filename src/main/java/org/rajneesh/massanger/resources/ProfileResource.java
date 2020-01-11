package org.rajneesh.massanger.resources;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rajneesh.massanger.model.Profile;
import org.rajneesh.massanger.service.ProfileService;
@Path("/profile")
public class ProfileResource {
	ProfileService profileService=new ProfileService(); 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getProfile()
	{
		return profileService.getAllProfiles();
	}
	
	@POST 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile addProfile(Profile profile)
	{
		return profileService.addProfile(profile);
	}
	
	@PUT
	@Path("/{profileName}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile updateMessage(@PathParam("profileName") String profileName, Profile profile)
	{
		profile.setProfileName(profileName);
		return profileService.updateProfile(profile);
	}
	
	@GET
	@Path("/{profileName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getProfile(@PathParam("profileName") String profileName)
	{
		return profileService.getProfile(profileName);
	}

	@DELETE
	@Path("/{profileName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Profile deleteMessage(@PathParam("profileName") String profileName)
	{
		return profileService.removeProfile(profileName);
	}
	
}

