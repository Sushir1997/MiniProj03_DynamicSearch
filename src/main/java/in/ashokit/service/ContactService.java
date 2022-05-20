package in.ashokit.service;


import java.util.List;

import in.ashokit.entity.Contact;

public interface ContactService {
	public String upsert(Contact contact);
	public Contact editContact(int id);
	public String deleteContact(int id);
	public List<Contact> getAllContact();

}
