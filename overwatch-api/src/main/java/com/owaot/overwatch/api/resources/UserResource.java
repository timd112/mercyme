package com.owaot.overwatch.api.resources;

import com.owaot.overwatch.OverwatchParser;
import com.owaot.overwatch.Platform;
import com.owaot.overwatch.Region;
import com.owaot.overwatch.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/users")
public class UserResource {
  private static Logger LOG = LoggerFactory.getLogger(UserResource.class);

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{platform}/{region}/{userid}")
  public User getUserInfo(@PathParam("platform") String platform, @PathParam("region") String reqion, @PathParam("userid") String userId){
    return OverwatchParser.getQuickUserInfo(Platform.getByName(platform), Region.getByName(reqion), userId);
  }
}
