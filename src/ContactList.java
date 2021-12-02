import java.util.*;   

public class ContactList {
	
	// Add instance variables here
    private ArrayList<Person> contactList;
    private int totalNum;

	
    public boolean createContact(Person person) {
        for (Person p : this.contactList) {
            if (p.equals(person)) {
                return false;
            }
        }
        this.contactList.add(person);
        this.totalNum++;
        return true;
    }

    public boolean lookupContact(String name) {
        for (Person p : this.contactList) {
            if (p.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Person getContact(String name) {
        for (Person p : this.contactList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public Person[] getContactByRange(String start, String end) {
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException();
        }
        ArrayList<Person> rangedContacts = new ArrayList<Person>;
        for (Person p : this.contactList) {
            if ((start.compareTo(p.getName()) <= 0) && (end.compareTo(p.getName()) > 0)) {
                rangedContacts.add(p);
            }
        }
        Person[] reducedContacts = new Person[rangedContacts.size()];
        int i = 0;
        for (Person p : rangedContacts) {
            reducedContacts[i] = p;
            i++;
        }
        return reducedContacts;
    }

    public boolean deleteContact(String name) {
        for (Person p : this.contactList) {
            if (p.getName().equals(name)) {
                this.contactList.remove(p);
                this.totalNum--;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.totalNum;
    }

    public String[] fetchAllNames() {

    }

    public String[] fetchAllPhoneNumbers() {
        return null;
    }
}
