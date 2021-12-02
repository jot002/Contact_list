import java.util.*;   

public class ContactList {
	
	// Add instance variables here
    private ArrayList<Person> contactList;
    private int totalNum;

    public ContactList() {
        this.contactList = new ArrayList<Person>();
        this.totalNum = 0;
    }

    public boolean createContact(Person person) {
        for (Person p : this.contactList) {
            if (p.getName().equals(person.getName())) {
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
//        if (start.compareTo(end) > 0) {
//            throw new IllegalArgumentException();
//        }
//        ArrayList<Person> rangedContacts = new ArrayList<Person>();
//        for (Person p : this.contactList) {
//            if ((start.compareTo(p.getName()) <= 0) && (end.compareTo(p.getName()) > 0)) {
//                rangedContacts.add(p);
//            }
//        }
//        return rangedContacts.toArray(new Person[rangedContacts.size()]);
////        Person[] reducedContacts = new Person[rangedContacts.size()];
////        int i = 0;
////        for (Person p : rangedContacts) {
////            reducedContacts[i] = p;
////            i++;
////        }
////        return reducedContacts;
        return null;
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
//        ArrayList<String> allNames = new ArrayList<String>();
//        for (Person p : this.contactList) {
//            allNames.add(p.getName());
//        }
//        Collections.sort(allNames);
//        return allNames.toArray(new String[allNames.size()]);
        return null;
    }

    public String[] fetchAllPhoneNumbers() {
//        ArrayList<String> allNums = new ArrayList<String>();
//        for (Person p : this.contactList) {
//            for (String num : p.getPhoneNumbers()) {
//                allNums.add(num);
//            }
//        }
//        Collections.sort(allNums);
//        ArrayList<String> temp = new ArrayList<String>();
//        for (String num : allNums) {
//            if (!allNums.contains(num)) {
//                allNums.add(num);
//            }
//        }
//        return allNums.toArray(new String[allNums.size()]);
        return null;
    }
}
