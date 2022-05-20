package com.siscli.dao;

import com.siscli.bom.Operador;
import com.siscli.bom.Usuario;


public interface IOperadorDao {
	public Operador obtenerOperador(Operador operador);
	public Operador obtenerOperadorUsuario(Usuario user);
	public Operador crearOperador(Operador operador);
}
