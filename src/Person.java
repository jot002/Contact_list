import java.util.*;   

public class Person {
	
    // Add instance variables here
    private String name;
    private ArrayList<String> phoneNumbers;
    private int totalNum;
	
	public Person(String name, ArrayList<String> pnArray) {
        this.name = name;
        this.phoneNumbers = pnArray;
        this.totalNum = this.phoneNumbers.size();
	}
	
    public String getName() {
        return this.name;
    }

    public boolean addPhoneNumber(String pn) {
        for (String num : this.phoneNumbers) {
            if (num.equals(pn)) {
                return false;
            }
        }
        this.phoneNumbers.add(pn);
        this.totalNum++;
        return true;
    }

    public ArrayList<String> getPhoneNumbers() {
        Collections.sort(this.phoneNumbers);
        return this.phoneNumbers;
    }

    public boolean deletePhoneNumber(String pn) {
        if (this.totalNum == 1) {
            throw new IllegalArgumentException();
        }
        for (String num : this.phoneNumbers) {
            if (num.equals(pn)) {
                this.phoneNumbers.remove(num);
                this.totalNum--;
                return true;
            }
        }
        return false;
    }
}
