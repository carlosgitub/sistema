package com.siscli.services;

import com.siscli.bom.Operador;
import com.siscli.bom.Usuario;
import com.siscli.webapp.beans.ClienteBean;

public interface ILoginService {

	public Usuario login(Usuario usuario);
	public Usuario login(String email, String password);
	public Usuario register(Usuario usuario);
	public ClienteBean registrarCliente(ClienteBean cliente);
	public Operador registrarOperador(Operador operador);
	
}
