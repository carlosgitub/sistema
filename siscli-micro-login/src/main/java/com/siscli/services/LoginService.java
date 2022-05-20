package com.siscli.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscli.bean.ClienteBean;
import com.siscli.bean.UsuarioBean;
import com.siscli.bom.Cliente;
import com.siscli.bom.Operador;
import com.siscli.bom.Usuario;
import com.siscli.dao.IClienteDao;
import com.siscli.dao.IUsuarioDao;

@Service
public class LoginService implements ILoginService {
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Autowired
	private IClienteDao clienteDao;

	public Usuario login(Usuario usuario) {
		Usuario user = usuarioDao.obtenerUsuario(usuario);
		return user;
	}

	@Override
	public UsuarioBean register(UsuarioBean usuario) {
		if(usuario!=null) {
			usuario.setTipo("cliente");
			Usuario user = usuarioDao.crearUsuario(new Usuario(usuario.getUsuario(), usuario.getPassword(), usuario.getPassword(), usuario.getTipo()));
			if(user!=null) {
				return usuario;
			}
		}
			return null;
		
	}

	@Override
	public ClienteBean registrarCliente(ClienteBean cliente) {
		UsuarioBean user = register(cliente.getDatosUsuario());
		if(user!=null) {//se ha guardado usuario
			Cliente cli = new Cliente();
			cli.setId_usuario(cliente.getDatosUsuario().getEmail());
			cli.setPuntos("0");
			cli = clienteDao.guardarCliente(cli);
			if(cli!=null) {//se ha guardado cliente
				return cliente;
			}else {//hacemos rollback
				usuarioDao.eliminarUsuario(new Usuario(user.getId()));
			}
		}
		return null;
	}

	@Override
	public Operador registrarOperador(Operador operador) {
		// TODO Auto-generated method stub
		return null;
	}

}
