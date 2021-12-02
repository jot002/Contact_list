import java.util.ArrayList;

import static org.junit.Assert.*;

public class ContactListTest {

    @org.junit.Test
    public void createContact() {
        ContactList test = new ContactList();
        ArrayList<String> stuff = new ArrayList<String>();
        stuff.add("909");
        stuff.add("367");
        Person p1 = new Person("John", stuff);
        Person p2 = new Person("Bob", stuff);
        Person p3 = new Person("John", stuff);
        assertEquals(true, test.createContact(p1));
        assertEquals(true, test.createContact(p2));
        assertEquals(false, test.createContact(p3));
        assertEquals(true, test.lookupContact("John"));
    }

    @org.junit.Test
    public void lookupContact() {
        ArrayList<String> stuff = new ArrayList<String>();
        stuff.add("909");
        stuff.add("367");
        Person p1 = new Person("John", stuff);
        Person p2 = new Person("Bob", stuff);
        Person p3 = new Person("John", stuff);
        p1.addPhoneNumber("626");
        assertEquals(false, p1.addPhoneNumber("626"));
        assertEquals(true,p1.deletePhoneNumber("626"));
        assertEquals(false,p1.deletePhoneNumber("3333"));
        assertEquals(true,p1.deletePhoneNumber("909"));

        System.out.println(p1.getPhoneNumbers());
    }

    @org.junit.Test
    public void getContact() {
    }

    @org.junit.Test
    public void getContactByRange() {
    }

    @org.junit.Test
    public void deleteContact() {
    }

    @org.junit.Test
    public void size() {
    }

    @org.junit.Test
    public void fetchAllNames() {
    }

    @org.junit.Test
    public void fetchAllPhoneNumbers() {
    }
}