package com.crud.model;

public class PersonBuilder {
	
	private PersonBuilder(){
		
	}
	
	public static PersonDTO fromVO(PersonVO personaVO) {
		PersonVO origin=personaVO;
		PersonDTO destin=new PersonDTO();
		
		destin.setName(origin.getName());
		destin.setPaternalSurname(origin.getPaternalSurname());
		destin.setMaternalSurname(origin.getMaternalSurname());
		destin.setBirthdate((origin.getBirthdate()));
		destin.setGender(origin.getGender());
		
		
		return destin;
	}
	
	public static PersonVO fromDTO(PersonDTO personaDTO) {
		PersonDTO origin=personaDTO;
		PersonVO destin=new PersonVO();
		
		destin.setName(origin.getName());
		destin.setPaternalSurname(origin.getPaternalSurname());
		destin.setMaternalSurname(origin.getMaternalSurname());
		destin.setBirthdate((origin.getBirthdate()));
		destin.setGender(origin.getGender());
		
		return destin;
	}

}
