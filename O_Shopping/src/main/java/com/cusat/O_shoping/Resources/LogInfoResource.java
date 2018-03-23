package com.cusat.O_shoping.Resources;
import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cusat.O_shoping.model.LogInfo;
import com.cusat.O_shoping.persistence.LogInfoDao;


public class LogInfoResource {
LogInfoDao loginfodao;
	
	@Inject
	public LogInfoResource(LogInfoDao loginfodao) {
		this.loginfodao=loginfodao;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<LogInfo> getloginfo() {
		List<LogInfo> loginfo =loginfodao.findAll();
		return loginfo;
	}@POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public LogInfo save(@Valid LogInfo loginfo) {
        return loginfodao.save(loginfo);
    }
}
