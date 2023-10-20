package com.springmvccontroller;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {

	
	@Autowired
	RegistrationDTODao dao;
	
	@Override
	public int addUser(RegistrationDTO objDto) {
		// TODO Auto-generated method stub
		return dao.addUser(objDto);
	}

	@Override
	public RegistrationDTO updateRegistrationDTO(int userid, RegistrationDTO obj) {
		// TODO Auto-generated method stub
		return dao.updateRegistrationDTO(userid, obj);
	}

	@Override
	public int deleteRegistrationDTO(int userid) {
		// TODO Auto-generated method stub
		return dao.deleteRegistrationDTO(userid);
	}

	@Override
	public List<RegistrationDTO> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	@Override
	public RegistrationDTO getRegistrationDTObyuserId(int userid) {
		// TODO Auto-generated method stub
		return dao.getRegistrationDTObyuserId(userid);
	}
	
	
	
}
