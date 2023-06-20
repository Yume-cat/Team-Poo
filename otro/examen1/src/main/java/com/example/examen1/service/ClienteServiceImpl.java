package com.example.examen1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.examen1.entity.Cliente;
import com.example.examen1.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired 
	ClienteRepository ClienteRepository;
	
	@Override
	public Cliente registrar(Cliente cliente) {
		return ClienteRepository.save(cliente);
		
	}

	@Override
	public Cliente actualizar(Cliente cliente) {
		
		return ClienteRepository.save(cliente);
	}

	@Override
	public void eliminar(Cliente cliente) {
		ClienteRepository.delete(cliente);
		
	}

	@Override
	public List<Cliente> ver() {
		return ClienteRepository.findAll();
	}

}
