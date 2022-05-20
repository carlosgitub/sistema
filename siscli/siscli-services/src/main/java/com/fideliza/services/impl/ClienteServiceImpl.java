package com.siscli.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscli.bom.Cliente;
import com.siscli.bom.Usuario;
import com.siscli.dao.IClienteDao;
import com.siscli.services.IClienteService;
@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	public Cliente registrarCliente(Cliente cliente) {
		return clienteDao.guardarCliente(cliente);
	}

	public Cliente obtenerCliente(Cliente cliente) {
		if(cliente.getId_usuario()!=null && !"".equals(cliente.getId_usuario())){
			return clienteDao.obtenerCliente(cliente);
		}
		return null;
	}

	public Cliente obtenerCliente(Usuario usuario) {
		return clienteDao.obtenerClienteUsuario(usuario);
	}


}
