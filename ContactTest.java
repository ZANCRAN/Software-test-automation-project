/* 
 * Title: Contact test class source code
 * Author : Zancran Togbe
 * Date: April 2021
 * code version : 1.0
 * Course: CS-320
 * School : SNHU
 * Professor: Cross, Angel*/
package testContact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*JUnit class testing Contact class and its methods*/
class ContactTest {
    /*Test the instantiation of the contact class*/
	@Test
	void testContactClass() {

		Contact contactObj = new Contact("01A15", "Zancran", "Togbe","3475672346", "213 Taylors rd");
		assertTrue(contactObj.getID().equals("01A15"));
		assertTrue(contactObj.getFirstName().equals("Zancran"));
		assertTrue(contactObj.getLastName().equals("Togbe"));
		assertTrue(contactObj.getPhone().equals("3475672346"));
		assertTrue(contactObj.getAddress().equals("213 Taylors rd"));
		
	}
    
	/*Test the number of character of the ID value*/
	@Test
	void testContactClassIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact ("01A15111111", "Zancran", "Togbe","3475672346", "213 Taylors rd");
		});
	}
	
	/*Test the number of character of the firstName value*/
	@Test
	void testContactClassFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact ("01A151", "Zancrantogbe", "Togbe","3475672346", "213 Taylors rd");
		});
	}
	
	/*Test the number of character of the lastName value*/
	@Test
	void testContactClassLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact ("01A151", "Zancran", "ZancranTogbe","3475672346", "213 Taylors rd");
		});
	}
	
	/*Test the number of digit of the phone value (more than 10 digit)*/
	@Test
	void testContactClassPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact ("01A151", "Zancran", "Togbe","347567234658", "213 Taylors rd");
		});
	}
	
	/*Test the number of digit of the phone value (less than 10 digit)*/
	@Test
	void testContactClassPhoneToShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact ("01A151", "Zancran", "Togbe","34756723", "213 Taylors rd");
		});
	}
	
	
	/*Test the number of character of the Address value*/
	@Test
	void testContactClassAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact ("01A151", "Zancran", "Togbe","3475672346", "213 Taylors Landing Ave Mc Leansville NC 27301 rd");
		});
	}
	
	/*Test when iD value is null*/
	@Test
	void testContactClassIDisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact (null, "Zancran", "Togbe","3475672346", "213 Taylors rd");
		});
	}
	
	/*Test when firstName value is null*/
	@Test
	void testContactClassFirstNameisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact ("01A151", null, "Togbe","3475672346", "213 Taylors rd");
		});
	}
	
	/*Test when lastName value is null*/
	@Test
	void testContactClassLastNameisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact ("01A151", "Zancran", null,"3475672346", "213 Taylors rd");
		});
	}
	
	/*Test when phone value is null*/
	@Test
	void testContactClassPhoneisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact ("01A151", "Zancran", "Togbe",null, "213 Taylors rd");
		});
	}
	

	/*Test when address value is null*/
	@Test
	void testContactClassAddressisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact ("01A151", "Zancran", "Togbe","3475672346",null);
		});
	}
}
