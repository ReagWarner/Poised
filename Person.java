public class Person {
    private String name;
    private String number;
    private String email;
    private String address;

    public Person(String name,
                  String number,
                  String email,
                  String address)

    {   this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
    }

    public String toString()
    {   String output = "Name: " + this.name + "\n";
        output += "Telephone Number: " + this.number + "\n";
        output += "Email: " + this.email + "\n";
        output += "Physical Address: " + this.address + "\n";
        return output;
    }

    public String getName() {return name;}

    public String getNumber() {return number;}

    public String getAddress() {return address;}

    public String getEmail() {return email;}

    public void setAddress(String address) {this.address = address;}

    public void setEmail(String email) {this.email = email;}

    public void setName(String name) {this.name = name;}

    public void setNumber(String number) {this.number = number;}

}
