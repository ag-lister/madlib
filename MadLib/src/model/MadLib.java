package model;

public class MadLib {
	String verb1;
	String verb2;
	String noun1;
	int number;
	String description;
	
	public MadLib(String description) {
		this.description = description;
	}
	
	public MadLib(String verb1, String verb2, String noun1, int number) {
		super();
		this.verb1 = verb1;
		this.verb2 = verb2;
		this.noun1 = noun1;
		this.number = number;
	}
	public String getVerb1() {
		return verb1;
	}
	public void setVerb1(String verb1) {
		this.verb1 = verb1;
	}
	public String getVerb2() {
		return verb2;
	}
	public void setVerb2(String verb2) {
		this.verb2 = verb2;
	}
	public String getNoun1() {
		return noun1;
	}
	public void setNoun1(String noun1) {
		this.noun1 = noun1;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String firstLine() {
		verb1 = verb1.toLowerCase();
		String firstLine = "My favorite thing to do in life is " + verb1 + ".";
		return firstLine;
	}
	
	public String secondLine() {
		noun1 = noun1.toUpperCase();
		number = number * 2;
		String secondLine = "When I am sad I like to eat " + number + " grasshoppers and scream " + noun1 + " really loud.";
		return secondLine;
	}
	
	public String thirdLine() {
		verb2 = verb2.toLowerCase();
		String v2 = verb2.substring(0,1).toUpperCase();
		String newVerb = v2 + verb2.substring(1);
		String thirdLine = newVerb + ". How profound. I couldn't agree more.";
		return thirdLine;
	}
	
	public String feedbackLine() {
		description = description.toLowerCase();
		String feedback = "I said I thought this madlib was " + description + ", but its actually DOPE.";
		return feedback;
	}
}
