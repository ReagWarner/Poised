import java.time.LocalDate;

public class Project {
    private String projectName;
    private String buildingType;
    private String address;
    private String erf;
    private double totalFee;
    private double balance;
    private String deadline;
    private boolean finalised = false;
    private boolean overdue;
    private Person contractor;
    private Person architect;

    private Person customer;
    public LocalDate currentDate = LocalDate.now();

    public Project(String projectName,
                   String buildingType,
                   String address,
                   String erf,
                   double totalFee,
                   double balance,
                   String deadline,
                   Person contractor,
                   Person architect,
                   Person customer,
                   boolean  overdue)

    {   this.projectName = projectName;
        this.buildingType = buildingType;
        this.address = address;
        this.erf = erf;
        this.totalFee = totalFee;
        this.customer = customer;
        this.balance = balance;
        this.deadline = deadline;
        this.contractor = contractor;
        this.architect = architect;
        this.overdue = overdue;
    }

    public String toString()
    {   String output = "Project Name: " + this.projectName + "\n";
        output += "Building Type: " + this.buildingType + "\n";
        output += "Physical Address: " + this.address + "\n";
        output += "ERF Number: " + this.erf + "\n";
        output += "Total Fee: R" + this.totalFee + "\n";
        output += "Balance Outstanding: R" + (this.totalFee - this.balance) + "\n";
        output += "Deadline: " + this.deadline + "\n";
        output += "\nCustomer: " + "\n" + this.customer + "\n";
        output += "Contractor: " + "\n" + this.contractor + "\n";
        output += "Architect: " + "\n" + this.architect;
        return output;
    }

    public String getProjectName() {return projectName;}

    public String getAddress() {return address;}

    public double getBalance() {return balance;}

    public String getErf() {return erf;}

    public String getBuildingType() {return buildingType;}

    public String getDeadline() {return deadline;}

    public double getTotalFee() {return totalFee;}

    public boolean isFinalised() {return finalised;}

    public boolean isOverdue() {return overdue;}

    public void setAddress(String address) {this.address = address;}

    public void setBalance(String balance) {this.balance = Double.parseDouble(balance);}

    public void setBuildingType(String buildingType) {this.buildingType = buildingType;}

    public void setDeadline(String deadline) {this.deadline = deadline;}

    public void setErf(String erf) {this.erf = erf;}

    public void setTotalFee(String totalFee) {this.totalFee = Double.parseDouble(totalFee);}

    public void setTotalFee(double totalFee) {this.totalFee = totalFee;}

    public void setBalance(double balance) {this.balance = balance;}

    public Person getArchitect() {return architect;}

    public Person getContractor() {return contractor;}

    public void setFinalised(boolean finalised)
    {this.finalised = finalised;}

    public void setOverdue(boolean overdue) {this.overdue = overdue;}

    public void setProjectName(String projectName) {this.projectName = projectName;}

    public void setArchitect(Person architect) {this.architect = architect;}

    public void setContractor(Person contractor) {this.contractor = contractor;}

    public Person getCustomer() {return customer;}
}



