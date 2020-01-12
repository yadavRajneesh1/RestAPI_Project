package org.rajneesh.massanger.gitex;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/git1")
public class GitExperiments1 {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public static String git1()
	{
		return "hello git";
	}

}
