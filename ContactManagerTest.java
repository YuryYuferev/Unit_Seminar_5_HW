import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContactManagerTest {

    private ContactManager contactManager;

    @Before
    public void setUp() {
        contactManager = new ContactManager();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("John", "Doe", "john.doe@example.com");

        contactManager.addContact(contact);

        Assert.assertEquals(1, contactManager.getAllContacts().size());
        Assert.assertTrue(contactManager.getAllContacts().contains(contact));
    }

    @Test
    public void testEditContact() {
        Contact oldContact = new Contact("John", "Doe", "john.doe@example.com");
        Contact newContact = new Contact("Jane", "Smith", "jane.smith@example.com");

        contactManager.addContact(oldContact);
        contactManager.editContact(oldContact, newContact);

        Assert.assertEquals(1, contactManager.getAllContacts().size());
        Assert.assertFalse(contactManager.getAllContacts().contains(oldContact));
        Assert.assertTrue(contactManager.getAllContacts().contains(newContact));
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("John", "Doe", "john.doe@example.com");

        contactManager.addContact(contact);
        contactManager.deleteContact(contact);

        Assert.assertEquals(0, contactManager.getAllContacts().size());
        Assert.assertFalse(contactManager.getAllContacts().contains(contact));
    }
}
