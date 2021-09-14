
public class AddressBookUC1 {

	class Contacts {
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		String email;
		int zipCode;
		int phoneNumber;

		public Contacts(String firstName, String lastName, String address, String city, String state, String email,
				int zipCode, int phoneNumber) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.email = email;
			this.zipCode = zipCode;
			this.phoneNumber = phoneNumber;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome!");
	}
}
