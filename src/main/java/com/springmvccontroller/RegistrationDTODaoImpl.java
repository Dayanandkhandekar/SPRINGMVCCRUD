package com.springmvccontroller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationDTODaoImpl implements RegistrationDTODao{


	@Autowired
	SessionFactory sf;

	@Override
	public int addUser(RegistrationDTO objDto) {
		int result=0;
               try {
            	   Session s=sf.getCurrentSession();
            	   s.merge(objDto);
            	   result=1;
               }catch (Exception e) {
                e.printStackTrace();
               }
		return result;
	}

	@Override
	public RegistrationDTO updateRegistrationDTO(int userid, RegistrationDTO obj) {
		int result=0;
		Session s = sf.getCurrentSession();
		
		     try {
		    	RegistrationDTO eobj = s.get(RegistrationDTO.class,userid);
		    	   if(obj !=null) {
		    		   eobj.setUsername(obj.getUsername());
		    		   eobj.setEmail(obj.getEmail());
		    		   eobj.setPassword(obj.getPassword());
		    		   eobj.setPassword_confirm(obj.getPassword_confirm());
		    		    result=1;
		    	   }	  
		     }catch (Exception e) {
				e.printStackTrace();
			}
		return obj;
	}

	@Override
	public int deleteRegistrationDTO(int userid) {
		int result=0;
		Session s = sf.getCurrentSession();
		   try {
				RegistrationDTO obj = s.get(RegistrationDTO.class, userid);
			   if(obj !=null) {
				   obj.setRegistrationDeleted("Y");
			   }
		   }catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<RegistrationDTO> list() {
        List<RegistrationDTO> list=new ArrayList<RegistrationDTO>();
     try {
	   Session s = sf.getCurrentSession();
	   Criteria c = s.createCriteria(RegistrationDTO.class);
	    c.add(Restrictions.eq("registrationDeleted", "N")) ;  
	    list=c.list();
     }catch (Exception e) { 
    	 e.printStackTrace();
     }
		return list;
	}

	@Override
	public RegistrationDTO getRegistrationDTObyuserId(int userid) {
		Session s = sf.getCurrentSession();
		RegistrationDTO eobj =new RegistrationDTO();
	     try {
	    	 eobj = s.get(RegistrationDTO.class, userid);
	    	  
	     }catch (Exception e) {
			e.printStackTrace();
		}
	return eobj;

	}
	
	

}
