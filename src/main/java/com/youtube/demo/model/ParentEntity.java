package com.youtube.demo.model;

import java.io.Serializable;

import anotaciones.Access;
import anotaciones.AccessType;
import anotaciones.Column;
import anotaciones.GeneratedValue;
import anotaciones.GenerationType;
import anotaciones.MappedSuperclass;
import anotaciones.id;

public class ParentEntity implements Serializable {

   @MappedSuperclass
   @Access(AccessType.FIELD)
	private static final long serialVersionUID = -4611815928732870812L;
    
	@id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "id", unique = true, nullable=false, length = 0)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}
