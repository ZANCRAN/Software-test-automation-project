/* 
 * Title: Contact Service test class source code
 * Author : Zancran Togbe
 * Date: April 2021
 * code version : 1.0
 * Course: CS-320
 * School : SNHU
 * Professor: Cross, Angel*/
package testContact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*JUnit class testing ContactService class and its methods*/
class ContactServiceTest {

	/*Test adding a new contact object*/
	@Test
	void testContactServiceAddPass() {
		
		/*create a contact service object to holds contact objects*/
		ContactService ctserv = new ContactService();
		/*create three contact object to be added to contactService*/
		Contact cOne = new Contact("12AD", "Zancran", "Togbe", "3457896352", " 17 sfr rd");
		Contact cTwo = new Contact("12BD", "Zamora", "Kevin", "3457896350", " 18 sfr rd");
		Contact cThree = new Contact("12CD", "Zamorano", "Smith", "3457896351", " 19 sfr rd");
		/*add contact objects to ContactService*/
		assertEquals( true, ctserv.addContact(cOne));
		assertEquals( true, ctserv.addContact(cTwo));
		assertEquals(true, ctserv.addContact(cThree));
	}
	
	/*Test adding an existing contact object */
	@Test
	void testContactServiceAddFail() {
	
		/*create a contact service object to holds contact objects*/
		ContactService ctserv = new ContactService();
		/*create three contact object to be added to contactService*/
		Contact cOne = new Contact("12AD", "Zancran", "Togbe", "3457896352", " 17 sfr rd");
		Contact cTwo = new Contact("12BD", "Zamora", "Kevin", "3457896350", " 18 sfr rd");
		Contact cThree = new Contact("12CD", "Zamorano", "Smith", "3457896351", " 19 sfr rd");
		/*add contact objects to ContactService*/
		assertEquals( true, ctserv.addContact(cOne));
		assertEquals( true, ctserv.addContact(cTwo));
		assertEquals(true, ctserv.addContact(cThree));
		/*adding an existing object*/
		assertEquals(false, ctserv.addContact(cTwo));
	}
	
	/*Test deleting an existing contact*/
	@Test
	void testContactServiceDeletePass() {
		
		/*create a contact service object to holds contact objects*/
		ContactService ctserv = new ContactService();
		/*create three contact object to be added to contactService*/
		Contact cOne = new Contact("12AD", "Zancran", "Togbe", "3457896352", " 17 sfr rd");
		Contact cTwo = new Contact("12BD", "Zamora", "Kevin", "3457896350", " 18 sfr rd");
		Contact cThree = new Contact("12CD", "Zamorano", "Smith", "3457896351", " 19 sfr rd");
		/*add contact objects to ContactService*/
		assertEquals( true, ctserv.addContact(cOne));
		assertEquals( true, ctserv.addContact(cTwo));
		assertEquals(true, ctserv.addContact(cThree));
		/*delete contact from the list based on the iD*/
		assertEquals( true, ctserv.deleteContact("12AD"));
		assertEquals( true, ctserv.deleteContact("12BD"));
		assertEquals(true, ctserv.deleteContact("12CD"));
		
	}
	
	/*Test deleting a non-existing contact*/
	@Test
	void testContactServiceDeleteFail() {
		
		/*create a contact service object to holds contact objects*/
		ContactService ctserv = new ContactService();
		/*create three contact object to be added to contactService*/
		Contact cOne = new Contact("12AD", "Zancran", "Togbe", "3457896352", " 17 sfr rd");
		Contact cTwo = new Contact("12BD", "Zamora", "Kevin", "3457896350", " 18 sfr rd");
		Contact cThree = new Contact("12CD", "Zamorano", "Smith", "3457896351", " 19 sfr rd");
		/*add contact objects to ContactService*/
		assertEquals( true, ctserv.addContact(cOne));
		assertEquals( true, ctserv.addContact(cTwo));
		assertEquals(true, ctserv.addContact(cThree));
		/*delete contact from the list based on the iD*/
		assertEquals( true, ctserv.deleteContact("12AD"));
		assertEquals( true, ctserv.deleteContact("12BD"));
		/*delete contact from the list based on a non existing iD*/
		assertEquals(false, ctserv.deleteContact("02CD"));
		
	}
	
	
	/*Test Updating an existing contact*/
	@Test
	void testContactServiceUpdatePass() {
		
		/*create a contact service object to holds contact objects*/
		ContactService ctserv = new ContactService();
		/*create three contact object to be added to contactService*/
		Contact cOne = new Contact("12AD", "Zancran", "Togbe", "3457896352", " 17 sfr rd");
		Contact cTwo = new Contact("12BD", "Zamora", "Kevin", "3457896350", " 18 sfr rd");
		Contact cThree = new Contact("12CD", "Zamorano", "Smith", "3457896351", " 19 sfr rd");
		/*add contact objects to ContactService*/
		assertEquals( true, ctserv.addContact(cOne));
		assertEquals( true, ctserv.addContact(cTwo));
		assertEquals(true, ctserv.addContact(cThree));
		/*update contact from the list based on the iD*/
		assertEquals( true, ctserv.updateContact("12AD","Zlatan", "Ibra", "3457896360", " 19 sofr rd"));
		assertEquals( true, ctserv.updateContact("12BD","Zancran", "Ronnie", "3457896362", " 18 sofr rd"));
		assertEquals(true, ctserv.updateContact("12CD","Kevin", "legend", "3457896372", " 17 sofr rd"));
		
	}
	
	/*Test Updating an existing contact*/
	@Test
	void testContactServiceUpdateFail() {
		
		/*create a contact service object to holds contact objects*/
		ContactService ctserv = new ContactService();
		/*create three contact object to be added to contactService*/
		Contact cOne = new Contact("12AD", "Zancran", "Togbe", "3457896352", " 17 sfr rd");
		Contact cTwo = new Contact("12BD", "Zamora", "Kevin", "3457896350", " 18 sfr rd");
		Contact cThree = new Contact("12CD", "Zamorano", "Smith", "3457896351", " 19 sfr rd");
		/*add contact objects to ContactService*/
		assertEquals( true, ctserv.addContact(cOne));
		assertEquals( true, ctserv.addContact(cTwo));
		assertEquals(true, ctserv.addContact(cThree));
		/*update contact from the list based on the iD*/
		assertEquals( true, ctserv.updateContact("12AD","Zlatan", "Ibra", "3457896360", " 19 sofr rd"));
		assertEquals( true, ctserv.updateContact("12BD","Zancran", "Ronnie", "3457896362", " 18 sofr rd"));
		/*update contact from the list based on a non existing iD*/
		assertEquals(false, ctserv.updateContact("020D","Kevin", "legend", "3457896372", " 17 sofr rd"));
		
	}
	
	

}
