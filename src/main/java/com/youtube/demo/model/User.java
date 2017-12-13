package com.youtube.demo.model;

import anotaciones.Access;
import anotaciones.AccessType;
import anotaciones.Column;
import anotaciones.Entity;
import anotaciones.Table;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
public class User extends  ParentEntity{

	private static final long serialVersionUID = 8435405591663518471L;
	

		 
	
		@Column(name = "first_name ", nullable = false , length = 225, unique = false )
		private String firstName;
		
		@Column(name = "second_name", nullable = true  , length = 225, unique = false )
		private String secondName;
		
		@Column(name = "first_surname", nullable = false , length = 225, unique = false )
		private String firstSurname;
		
		@Column(name = "second_surname", nullable = true , length = 225, unique = false )
		private String secondSurname;
		
		@Column(name = "phone", nullable = true, length = 225, unique = false )
		private String  phone;
		
		@Column(name = "adress", nullable = false , length = 225, unique = false )
		private String adress;
		
		
			
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getSecondName() {
			return secondName;
		}
		public void setSecondName(String secondName) {
			this.secondName = secondName;
		}
		public String getFirstSurname() {
			return firstSurname;
		}
		public void setFirstSurname(String firstSurname) {
			this.firstSurname = firstSurname;
		}
		public String getSecondSurname() {
			return secondSurname;
		}
		public void setSecondSurname(String secondSurname) {
			this.secondSurname = secondSurname;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		 

	

}
