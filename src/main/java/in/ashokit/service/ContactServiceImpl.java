package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repository.ContactRepo;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepo repo;

	@Override
	public String upsert(Contact contact) {
		//repo.save(contact);
		return "Contact details saved successfully with id :: "+repo.save(contact).getCid();
	}

	@Override
	public Contact editContact(int id) {
		Optional<Contact> findById=repo.findById(id);
		if(findById.isPresent())
			return findById.get();
		return null;
	}

	@Override
	public String deleteContact(int id) {
		repo.deleteById(id);
		return "Contact details deleted successfully";
	}

	@Override
	public List<Contact> getAllContact() {
		
		return repo.findAll();
	}

}
