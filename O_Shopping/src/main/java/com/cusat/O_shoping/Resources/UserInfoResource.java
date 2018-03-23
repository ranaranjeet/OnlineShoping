package com.cusat.O_shoping.Resources;
import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cusat.O_shoping.model.UserInfo;
import com.cusat.O_shoping.persistence.UserInfoDao;

public class UserInfoResource {
UserInfoDao userinfodao;
	
	@Inject
	public UserInfoResource(UserInfoDao userinfodao) {
		this.userinfodao=userinfodao;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<UserInfo> getuserinfo() {
		List<UserInfo> userinfo =userinfodao.findAll();
		return userinfo;
	}@POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public UserInfo save(@Valid UserInfo userinfo) {
        return userinfodao.save(userinfo);
    }
}
