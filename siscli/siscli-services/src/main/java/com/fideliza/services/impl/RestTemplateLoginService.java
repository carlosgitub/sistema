package com.siscli.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.siscli.bom.Cliente;
import com.siscli.bom.Operador;
import com.siscli.bom.Usuario;
import com.siscli.services.ILoginService;
import com.siscli.webapp.beans.ClienteBean;

/**
 * para microservicioss @Service("restTemplateOfertasService")
 * 
 * @author rmaynar
 *
 */
@Service("restTemplateLoginService")
public class RestTemplateLoginService implements ILoginService {

	@Autowired
	RestTemplate restTemplate;

	public Usuario login(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario register(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cliente registrarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	public Operador registrarOperador(Operador operador) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario login(String email, String password) {

		String transactionUrl = "http://localhost:8084/login";

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(transactionUrl)
				// Add query parameter
				.queryParam("email", email).queryParam("password", password);

		RestTemplate restTemplate = new RestTemplate();
		Usuario response = restTemplate.getForObject(builder.toUriString(), Usuario.class);
		return response;
	}

	public ClienteBean registrarCliente(ClienteBean cliente) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("Content-Type", "application/json");

		HttpEntity <ClienteBean> httpEntity = new HttpEntity <ClienteBean> (cliente, httpHeaders);
		RestTemplate restTemplate = new RestTemplate();
		ClienteBean response = restTemplate.postForObject("http://localhost:8084/registroCliente", httpEntity, ClienteBean.class);
		return response;
	}

}
