

package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Contact;
import in.ashokit.service.ContactService;

@RestController
public class ContactMgmtController {
	@Autowired
	private ContactService service;

	@PostMapping("/contact")
	public ResponseEntity<String> upsert(@RequestBody Contact contact) {
		String result = service.upsert(contact);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}

	@GetMapping("contact/{id}")
	public ResponseEntity<Contact> editContact(@PathVariable int id) {
		Contact contact = service.editContact(id);
		return new ResponseEntity<>(contact, HttpStatus.OK);

	}

	@DeleteMapping("/contact/{id}")
	public ResponseEntity<String> deleteContact(@PathVariable int id) {
		String deleteContact = service.deleteContact(id);
		return new ResponseEntity<>(deleteContact, HttpStatus.OK);
	}

	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>> getAllContact() {
		List<Contact> allContact = service.getAllContact();
		return new ResponseEntity<>(allContact, HttpStatus.OK);
	}

}
