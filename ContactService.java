/* 
 * Title: Contact Service test class source code
 * Author : Zancran Togbe
 * Date: April 2021
 * code version : 1.0
 * Course: CS-320
 * School : SNHU
 * Professor: Cross, Angel*/
package testContact;
import java.util.ArrayList;

public class ContactService {

	/* Use an ArrayList to holds a list of contact object ( no database required) */
	private ArrayList<Contact> contact;
	
	/*default constructor*/
	public ContactService() {
		contact = new ArrayList<>();
	}
	
	/*method to add contact object to the ArraList*/
	
	public boolean addContact(Contact contactObj) {
		
		/*check if contact object exist*/
		boolean contactObjExist = false;
		for (Contact ctact : contact) {
			if(ctact.equals(contactObj)) {
				contactObjExist = true;
			}
		}
		
		/*add contact object if there is no such contact*/
		if (!contactObjExist) {
			contact.add(contactObj);
			System.out.println("Successfully added");
			return true;
		} else {
			System.out.println("Contact Exist already");
			return false;
		}
		
	}
	
	/* Delete contact ID  from the list of contact if this one exist*/
	public boolean deleteContact (String iD) {
		for(Contact ctact : contact) {
			if (ctact.getID().equals(iD)) {
				contact.remove(ctact);
				System.out.println("Remove successfully!");
				return true;	
			}		
		}
		System.out.println("Contact not found");
		return false;
	}
	
	/*update the features of a given contact iD*/
	public boolean updateContact (String iD, String firstName, String lastName, String phone, String address) {
		for (Contact ctact: contact) {
			if(ctact.getID().equals(iD)) {
				if (!firstName.equals(""))
					ctact.setFirstName(firstName);
				if(!lastName.equals(""))
					ctact.setLastName(lastName);
				if(!phone.equals(""))
					ctact.setPhone(phone);
				if(!address.equals(""))
					ctact.setAddress(address);
				System.out.println("Contact update successfully");
				return true;
			}
			
		}
		System.out.println("Contact not found");
		return false;
		
	}
}
