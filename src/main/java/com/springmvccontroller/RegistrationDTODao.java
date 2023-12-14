package com.springmvccontroller;

import java.util.List;


public interface RegistrationDTODao {
	int addUser(RegistrationDTO objDto);
	RegistrationDTO updateRegistrationDTO(int userid , RegistrationDTO obj);
	int deleteRegistrationDTO(int userid);
	List<RegistrationDTO> list();
	RegistrationDTO getRegistrationDTObyuserId(int userid) ;

}
