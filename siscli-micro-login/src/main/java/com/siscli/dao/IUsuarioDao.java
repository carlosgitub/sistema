package com.siscli.dao;

import com.siscli.bom.Usuario;


public interface IUsuarioDao {
	public Usuario obtenerUsuario(Usuario usuario);
	public Usuario obtenerUsuarioEmail(String email);
	public Usuario crearUsuario(Usuario usuario);
	public void eliminarUsuario(Usuario usuario);
}
