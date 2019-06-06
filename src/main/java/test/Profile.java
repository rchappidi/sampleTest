package test;

public class Profile {

	String name;

	String qualification;

	int age;

	String gender;

	String address;

	Profile() {

	}

	Profile(String nameInput, String qualificationInput, int ageInput, String genderInput, String addressInput) {

		name = nameInput;
		qualification = qualificationInput;
		age=ageInput;
	}

	String getName() {

		return name;
	}

	String getQualfication() {
		return qualification;
	}

}
