package com.siscli.services;

import com.siscli.bean.ClienteBean;
import com.siscli.bean.UsuarioBean;
import com.siscli.bom.Cliente;
import com.siscli.bom.Operador;
import com.siscli.bom.Usuario;

public interface ILoginService {

	public Usuario login(Usuario usuario);
	public UsuarioBean register(UsuarioBean usuario);
	public ClienteBean registrarCliente(ClienteBean cliente);
	public Operador registrarOperador(Operador operador);
	
}
