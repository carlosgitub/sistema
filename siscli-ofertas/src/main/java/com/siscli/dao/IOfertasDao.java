package com.siscli.dao;

import java.util.Date;
import java.util.List;

import com.siscli.bom.Oferta;

public interface IOfertasDao {
	public List<Oferta> obtenerTodasOfertas();
	public List<Oferta> obtenerOfertasMes(Date fecha);
}
