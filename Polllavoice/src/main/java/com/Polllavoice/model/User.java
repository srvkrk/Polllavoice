package com.Polllavoice.model;
	
	public class User {
		private String username;
		private String firstname;
		private String lastname;
		private String password;
		private String confirmpassword;
		private String email;
	    private int phone;
	    
		public String getUsername() {
		return username;
          }
		public void setUsername(String username) {
		this.username = username;
		  }
		public String getFirstname() {
		return firstname;
		  }
		public void setFirstname(String firstname) {
		this.firstname = firstname;
		  }
		public String getLastname() {
         return lastname;
		  }
		public void setLastname(String lastname) {
		this.lastname = lastname;
		  } 
		public String getPassword() {
		return password;
	      }
		public void setPassword(String password) {
		this.password = password;
		  }
		public String getConfirmpassword() {
		return confirmpassword;
			  }
		public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
			  }
		public String getEmail() {
		return email;
		  }
		public void setEmail(String email) {
		this.email = email;
		  }
		public int getPhone() {
		return phone;
	
		  }
		public void setPhone(int phone) {
		this.phone = phone;

		  }
		}

