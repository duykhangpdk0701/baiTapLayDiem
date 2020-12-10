public class Contact implements Comparable<Contact> {

  private String firstName;
  private String lastName;
  private String phoneNumber;

  public Contact(String firstName, String lastName, String phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return lastName + " / " + firstName + " (" + phoneNumber + ")";
  }

  public boolean equals(Contact other) {

    return (lastName.equalsIgnoreCase(other.getLastName())) && (firstName.equalsIgnoreCase(other.getFirstName()));

  }

  @Override
  public int compareTo(Contact other) {
    int result;

    String otherFirstName = other.getFirstName();
    String otherLastName = other.getLastName();

    if (lastName.equals(otherLastName)) {
      result = firstName.compareTo(otherFirstName);
    } else {
      result = lastName.compareTo(otherLastName);
    }

    return result;
  }

}
