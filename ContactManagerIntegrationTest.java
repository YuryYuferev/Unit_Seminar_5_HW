import org.junit.Before;

public class ContactManagerIntegrationTest {

    private ContactManager contactManager;
    private FakeContactRepository contactRepository;

    @Before
    public void setUp() {
        contactRepository = new FakeContactRepository();
        contactManager = new ContactManager(contactRepository);
    }
}