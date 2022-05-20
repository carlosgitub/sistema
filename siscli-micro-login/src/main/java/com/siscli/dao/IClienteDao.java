package com.siscli.dao;

import com.siscli.bom.Cliente;
import com.siscli.bom.Usuario;


public interface IClienteDao {
	public Cliente obtenerCliente(Cliente cliente);
	public Cliente obtenerClienteUsuario(Usuario user);
	public Cliente guardarCliente(Cliente cliente);
}
