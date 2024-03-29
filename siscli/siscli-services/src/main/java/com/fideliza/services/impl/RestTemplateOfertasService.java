package com.siscli.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.siscli.bom.Oferta;
import com.siscli.services.IOfertasService;
/**
 * para microservicioss
 * @Service("restTemplateOfertasService")
 * @author rmaynar
 *
 */
@Service("restTemplateOfertasService")
public class RestTemplateOfertasService implements IOfertasService {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	public List<Oferta> consultarTodas() {
		ResponseEntity<Oferta[]> responseEntity = restTemplate.getForEntity("http://localhost:8082/oferta", Oferta[].class);
		Oferta[] objects = responseEntity.getBody();
		MediaType contentType = responseEntity.getHeaders().getContentType();
		HttpStatus statusCode = responseEntity.getStatusCode();
		List<Oferta> ofertas = new ArrayList<Oferta>(Arrays.asList(responseEntity.getBody()));
		return ofertas;
	}

}
