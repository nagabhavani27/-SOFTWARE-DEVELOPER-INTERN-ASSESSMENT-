package com.Example.Registration;


public class Launch {

	public static void main(String[] args) {
		CreateDao c = new CreateDao();
		UpdateDao u=new UpdateDao();
		ReadDao r=new ReadDao();
		DeleteDao d=new DeleteDao();
		c.createRegistration();
		u.updateRegistration();
		r.readRegistration();
		d.deleteRegistration();
	}

}
