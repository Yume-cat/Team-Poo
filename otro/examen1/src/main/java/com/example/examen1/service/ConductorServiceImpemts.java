package com.example.examen1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.examen1.entity.Conductor;
import com.example.examen1.repository.ConductorRepository;

@Service
public class ConductorServiceImpemts  implements ConductorService{
	@Autowired
	ConductorRepository conductorepository;

	@Override
	public Conductor registrar(Conductor conductor) {
		// TODO Auto-generated method stub
		return conductorepository.save(conductor);
	}

	@Override
	public Conductor actualizar(Conductor conductor) {
		// TODO Auto-generated method stub
		return conductorepository.save(conductor);
	}

	@Override
	public void eliminar(Conductor conducto) {
		// TODO Auto-generated method stub
		conductorepository.delete(conducto);
	}

	@Override
	public List<Conductor> ver() {
		// TODO Auto-generated method stub
		return conductorepository.findAll();
	}
	


}
