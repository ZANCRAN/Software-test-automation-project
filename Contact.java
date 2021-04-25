/* 
 * Title: Contact class source code
 * Author : Zancran Togbe
 * Date: April 2021
 * code version : 1.0
 * Course: CS-320
 * School : SNHU
 * Professor: Cross, Angel*/
package testContact;


public class Contact {
	
	/*contact class attributes*/
	private String iD;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
   /*Default constructor with five parameters*/
	public Contact(String iD, String firstName, String lastName, String phone, String address) {
		
		if ( iD == null || iD.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		} 
		
		if ( firstName == null ||firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		
		if(lastName == null ||lastName.length()>10) {
			throw new IllegalArgumentException("Invalid LastName");
		}
			 
		if (  phone == null || phone.length() != 10 ) {
			throw new IllegalArgumentException("Invalid phone");
		}
		
		
		if ( address == null ||address.length()>30 ) {
			throw new IllegalArgumentException("Invalid address");
		}
				
		/* if no exception is thrown or if attributes meet requirements*/
		this.iD = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	/*getters and setters*/
	
	public String getID() {
		return iD;
	}

	public void setID(String iD) {
		this.iD = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	

}
