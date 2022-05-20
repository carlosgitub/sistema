package com.siscli.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscli.bom.Oferta;
import com.siscli.dao.IOfertasDao;
import com.siscli.services.IOfertasService;
@Service("ofertasServiceImpl")
public class OfertasServiceImpl implements IOfertasService {
	
//	private static Oferta[] ofertas = {new Oferta("Bahamas 2x1", new Date()),new Oferta("República dominicana 2x1", new Date())};
	
	@Autowired
	IOfertasDao ofertasDao;
	
	public List<Oferta> consultarTodas() {
		
		List<Oferta> ofertas = ofertasDao.obtenerTodasOfertas();
		return ofertas;
	}

}
