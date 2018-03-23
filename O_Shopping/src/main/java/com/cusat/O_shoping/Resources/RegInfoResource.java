package com.cusat.O_shoping.Resources;
import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cusat.O_shoping.model.RegInfo;
import com.cusat.O_shoping.persistence.RegInfoDao;


public class RegInfoResource {
RegInfoDao reginfodao;
	
	@Inject
	public RegInfoResource(RegInfoDao reginfodao) {
		this.reginfodao=reginfodao;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<RegInfo> getreginfo() {
		List<RegInfo> reginfo =reginfodao.findAll();
		return reginfo;
	}@POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public RegInfo save(@Valid RegInfo reginfo) {
        return reginfodao.save(reginfo);
    }
}
