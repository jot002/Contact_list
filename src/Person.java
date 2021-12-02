import java.util.*;   

public class Person {
	
    // Add instance variables here
    private String name;
    private ArrayList<String> phoneNumbers;

	
	public Person(String name, ArrayList<String> pnArray) {
        this.name = name;
        this.phoneNumbers = pnArray;
	}
	
    public String getName() {
        return this.name;
    }

    public boolean addPhoneNumber(String pn) {
        if (this.phoneNumbers.contains(pn)) {
            return false;
        }
        this.phoneNumbers.add(pn);
        return true;
    }

    public ArrayList<String> getPhoneNumbers() {
        Collections.sort(this.phoneNumbers);
        return this.phoneNumbers;
    }

    public boolean deletePhoneNumber(String pn) {
        if (this.phoneNumbers.size() == 1) {
            throw new IllegalArgumentException();
        }
        if (this.phoneNumbers.contains(pn)) {
            this.phoneNumbers.remove(pn);
            return true;
        }
        return false;
    }
}
