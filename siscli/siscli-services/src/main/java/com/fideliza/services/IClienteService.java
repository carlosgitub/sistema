package com.siscli.services;

import com.siscli.bom.Cliente;
import com.siscli.bom.Usuario;

public interface IClienteService {

	public Cliente registrarCliente(Cliente cliente);
	public Cliente obtenerCliente(Cliente cliente);
	public Cliente obtenerCliente(Usuario usuario);
	
}
