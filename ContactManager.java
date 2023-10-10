import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    private List<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    public ContactManager(FakeContactRepository contactRepository) {
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void editContact(Contact oldContact, Contact newContact) {
        int index = contacts.indexOf(oldContact);
        if (index != -1) {
            contacts.set(index, newContact);
        }
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }
}
