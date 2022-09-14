import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Scanner;


public class PoisedProjectManager {

    // Initialize Scanner and empty lists
    static Scanner input = new Scanner(System.in);
    static ArrayList<Project> projectList = new ArrayList<>();
    static ArrayList<Person> customerList = new ArrayList<Person>();
    static ArrayList<Person> architectList = new ArrayList<Person>();
    static ArrayList<Person> contractorList = new ArrayList<Person>();

    public static void main(String[] args) {

        while (true) {

            // Output menu
            System.out.println("""
                    \n-----------------------------Welcome to Poised Project Manager-----------------------------\n
                                                    
                                                   Please select from the menu below:
                                    
                                                    1. Capture New Project
                                                    2. Update Project
                                                    3. Update Contractor's Details
                                                    4. Update Customer's Details
                                                    5. Update Architect's Details
                                                    6. Finalize Project
                                                    7. View All
                                                    8. Exit
                    \n""");

            // Initialize the menu choice
            int userChoice = input.nextInt();

            // Initializes the project list
            int Count = projectList.size();

            if (userChoice == 1) {

                //If user selects 1, prompt user for new project details
                //Customer Details
                System.out.println("\nPlease confirm Customer Name: ");
                input = new Scanner(System.in);
                String projCustomerName = input.nextLine();
                System.out.println("\nPlease confirm Customer Telephone Number: ");
                String projCustomerNumber = input.nextLine();
                System.out.println("\nPlease confirm Customer Email Address: ");
                String projCustomerEmail = input.nextLine();
                System.out.println("\nPlease confirm Customer Physical Address: ");
                String projCustomerAddress = input.nextLine();

                // Architect Details
                System.out.println("\nPlease confirm Architect Name: ");
                String projArchitectName = input.nextLine();
                System.out.println("\nPlease confirm Architect Telephone Number: ");
                String projArchitectNumber = input.nextLine();
                System.out.println("\nPlease confirm Architect Email Address: ");
                String projArchitectEmail = input.nextLine();
                System.out.println("\nPlease confirm Architect Physical Address: ");
                String projArchitectAddress = input.nextLine();

                // Contractor Details
                System.out.println("\nPlease confirm Contractor Name: ");
                String projContractorName = input.nextLine();
                System.out.println("\nPlease confirm Contractor Telephone Number: ");
                String projContractorNumber = input.nextLine();
                System.out.println("\nPlease confirm Contractor Email Address: ");
                String projContractorEmail = input.nextLine();
                System.out.println("\nPlease confirm Contractor Physical Address: ");
                String projContractorAddress = input.nextLine();

                // Project Details
                System.out.println("\nPlease confirm Project Name: ");
                String projName = input.nextLine();

                System.out.println("\nPlease confirm Building Type: ");
                String buildingType = input.nextLine();

                System.out.println("\nPlease confirm Physical Address: ");
                String projAddress = input.nextLine();

                System.out.println("\nPlease confirm ERF number: ");
                String projERF = input.nextLine();

                System.out.println("\nPlease confirm Project Fee: ");
                Double projFee = input.nextDouble();

                System.out.println("\nPlease confirm amount paid to date: ");
                Double proBalance = input.nextDouble();

                System.out.println("\nPlease confirm Project Deadline: i.e. 2022-10-12");
                input = new Scanner(System.in);
                String projDeadline = input.nextLine();

                LocalDate currentDate = LocalDate.of(2022, Month.SEPTEMBER, 11);
                LocalDate deadlineDate = LocalDate.parse(projDeadline);
                boolean isOverDue = false;
                if (deadlineDate.isAfter(LocalDate.now(ZoneId.of("Africa/Johannesburg")))) {
                    isOverDue = true;
                    System.out.println("Overdue: " + deadlineDate + "\n");
                }

                // Create new objects
                Person projCustomer = new Person(projCustomerName, projCustomerNumber, projCustomerEmail, projCustomerAddress);
                Person projArchitect = new Person(projArchitectName, projArchitectNumber, projArchitectEmail, projArchitectAddress);
                Person projContractor = new Person(projCustomerName, projCustomerNumber, projCustomerEmail, projCustomerAddress);
                Project newProject = new Project(projName, buildingType, projAddress, projERF, projFee, proBalance, projDeadline, projContractor, projArchitect, projCustomer, isOverDue);

                // Add details to each respective list
                projectList.add(newProject);
                customerList.add(projCustomer);
                architectList.add(projArchitect);
                contractorList.add(projArchitect);
                System.out.println(newProject.toString());

                System.out.println("Thank you, your new project has been added!");

            } else if (userChoice == 2)
            {

                // Print out each project using a or loop, with indexing
                // Call toString() method to display each project

                for (int i = 0; i < projectList.size(); i++)
                {
                    System.out.println(i + ":" + projectList.get(i).toString());
                }

                // Get specific project from user
                System.out.println("\nPlease confirm the project you would like to update: ");
                int userIndex = input.nextInt();

                Project updatedProject = (projectList.get(userIndex));

                // For selected project, output following menu
                while (true) {
                    System.out.println("""
                            \n-----------------------------Update Project Details-----------------------------\n
                                                        
                                                          Please select from the menu below:
                                            
                                                            1. Update Project Name
                                                            2. Update Building Type
                                                            3. Update Address
                                                            4. Update ERF Number
                                                            5. Update Total Fee
                                                            6. Update Balance
                                                            7. Update Deadline 
                                                            8. Return to Main Menu
                            \n""");

                    // Initialize userChoice
                    userChoice = input.nextInt();

                    // Prompt user accordingly
                    // Update new details using setters
                    if (userChoice == 1)
                    {
                        System.out.println("\nPlease confirm updated Project Name: ");
                        input = new Scanner(System.in);
                        String newProjName = input.nextLine();
                        updatedProject.setProjectName(newProjName);
                        System.out.println("\nThank you, information has been updated!");
                    }
                    else if (userChoice == 2)
                    {
                        System.out.println("\nPlease confirm updated Building Type: ");
                        input = new Scanner(System.in);
                        String newBuildType = input.nextLine();
                        updatedProject.setBuildingType(newBuildType);
                        System.out.println("\nThank you, information has been updated!");
                    }
                    else if (userChoice == 3)
                    {
                        System.out.println("\nPlease confirm updated Project Address: ");
                        input = new Scanner(System.in);
                        String newProjAddress = input.nextLine();
                        updatedProject.setAddress(newProjAddress);
                        System.out.println("\nThank you, information has been updated!");
                    }
                    else if (userChoice == 4)
                    {
                        System.out.println("\nPlease confirm updated Project ERF Number: ");
                        input = new Scanner(System.in);
                        String newERF = input.nextLine();
                        updatedProject.setErf(newERF);
                        System.out.println("\nThank you, information has been updated!");
                    }
                    else if (userChoice == 5)
                    {
                        System.out.println("\nPlease confirm updated Project Fee: ");
                        input = new Scanner(System.in);
                        double newFee = Double.parseDouble(input.nextLine());
                        updatedProject.setTotalFee(newFee);
                        System.out.println("\nThank you, information has been updated!");
                    }
                    else if (userChoice == 6)
                    {
                        System.out.println("\nPlease confirm updated Project Balance: ");
                        input = new Scanner(System.in);
                        double newBalance = Double.parseDouble(input.nextLine());
                        updatedProject.setBalance(newBalance);
                        System.out.println("\nThank you, information has been updated!");
                    }
                    else if (userChoice == 7)
                    {
                        System.out.println("\nPlease confirm updated Project Deadline: ");
                        input = new Scanner(System.in);
                        String newDeadline = input.nextLine();
                        updatedProject.setDeadline(newDeadline);
                        System.out.println("\nThank you, information has been updated!");
                    }
                    else if (userChoice == 8)
                    {
                        break;
                    }

                }

            } else if (userChoice == 3) {

                // Display projects with indexing
                // Get choice from user
                for (int i = 0; i < contractorList.size(); i++)
                {
                    System.out.println(i + ". " + contractorList.get(i).toString());
                }
                System.out.println("\nPlease confirm the contractor you would like to update: ");

                // Initialize userIndex
                int userIndex = input.nextInt();

                Person updatedContractor = (contractorList.get(userIndex));

                while (true) {

                    // Output contractor menu
                    System.out.println("""
                            \n-----------------------------Update Contractor Details-----------------------------\n
                                                        
                                                          Please select from the menu below:
                                            
                                                            1. Update Contractor Name
                                                            2. Update Contractor Number
                                                            3. Update Contractor Email Address
                                                            4. Update Contractor Physical Address
                                                            5. Return to Main Menu
                            \n""");

                    // Initialize userChoice
                    userChoice = input.nextInt();

                    // Prompt user accordingly
                    if (userChoice == 1)
                    {
                        System.out.println("\nPlease confirm updated Contractor Name: ");
                        input = new Scanner(System.in);
                        String newContractorName = input.nextLine();
                        updatedContractor.setName(newContractorName);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 2)
                    {
                        System.out.println("\nPlease confirm updated Contractor Number: ");
                        input = new Scanner(System.in);
                        String newContractorNumber = input.nextLine();
                        updatedContractor.setNumber(newContractorNumber);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 3)
                    {
                        System.out.println("\nPlease confirm updated Contractor Email Address: ");
                        input = new Scanner(System.in);
                        String newContractorEmail = input.nextLine();
                        updatedContractor.setEmail(newContractorEmail);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 4)
                    {
                        System.out.println("\nPlease confirm updated Contractor Physical Address: ");
                        input = new Scanner(System.in);
                        String newContractorAddress = input.nextLine();
                        updatedContractor.setAddress(newContractorAddress);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 5)
                    {
                        break;
                    }

                }

            } else if (userChoice == 4) {

                for (int i = 0; i < customerList.size(); i++)
                {
                    System.out.println(i + ". " + customerList.get(i).toString());
                }
                System.out.println("\nPlease confirm the contractor you would like to update: ");
                int userIndex = input.nextInt();

                Person updatedCustomer = (customerList.get(userIndex));

                while (true) {
                    System.out.println("""
                            \n-----------------------------Update Customer Details-----------------------------\n
                                                        
                                                          Please select from the menu below:
                                            
                            1. Update Customer Name
                            2. Update Customer Number
                            3. Update Customer Email Address
                            4. Update Customer Physical Address
                            5. Return to Main Menu
                            \n""");

                    userChoice = input.nextInt();

                    if (userChoice == 1)
                    {
                        System.out.println("\nPlease confirm updated Customer Name: ");
                        input = new Scanner(System.in);
                        String newCustomerName = input.nextLine();
                        updatedCustomer.setName(newCustomerName);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 2)
                    {
                        System.out.println("\nPlease confirm updated Customer Number: ");
                        input = new Scanner(System.in);
                        String newCustomerNumber = input.nextLine();
                        updatedCustomer.setNumber(newCustomerNumber);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 3)
                    {
                        System.out.println("\nPlease confirm updated Customer Email Address: ");
                        input = new Scanner(System.in);
                        String newCustomerEmail = input.nextLine();
                        updatedCustomer.setEmail(newCustomerEmail);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 4)
                    {
                        System.out.println("\nPlease confirm updated Customer Physical Address: ");
                        input = new Scanner(System.in);
                        String newCustomerAddress = input.nextLine();
                        updatedCustomer.setAddress(newCustomerAddress);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 5)
                    {
                        break;
                    }

                }

            } else if (userChoice == 5) {

                // Print out projects with indexing
                for (int i = 0; i < architectList.size(); i++)
                {
                    System.out.println(i + ". " + architectList.get(i).toString());
                }
                System.out.println("\nPlease confirm the architect you would like to update: ");

                // Initialize userIndex
                int userIndex = input.nextInt();

                Person updatedArchitect = (architectList.get(userIndex));

                while (true) {
                    System.out.println("""
                            \n-----------------------------Update Architect Details-----------------------------\n
                                                        
                                                          Please select from the menu below:
                                            
                                                            1. Update Architect Name
                                                            2. Update Architect Number
                                                            3. Update Architect Email Address
                                                            4. Update Architect Physical Address
                                                            5. Return to Main Menu
                            \n""");

                    //Initialize user Choice
                    userChoice = input.nextInt();

                    // Prompt accordingly
                    if (userChoice == 1)
                    {
                        System.out.println("\nPlease confirm updated Architect Name: ");
                        input = new Scanner(System.in);
                        String newArchitectName = input.nextLine();
                        updatedArchitect.setName(newArchitectName);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 2)
                    {
                        System.out.println("\nPlease confirm updated Architect Number: ");
                        input = new Scanner(System.in);
                        String newArchitectNumber = input.nextLine();
                        updatedArchitect.setNumber(newArchitectNumber);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 3)
                    {
                        System.out.println("\nPlease confirm updated Architect Email Address: ");
                        input = new Scanner(System.in);
                        String newArchitectEmail = input.nextLine();
                        updatedArchitect.setEmail(newArchitectEmail);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 4)
                    {
                        System.out.println("\nPlease confirm updated Architect Physical Address: ");
                        input = new Scanner(System.in);
                        String newArchitectAddress = input.nextLine();
                        updatedArchitect.setAddress(newArchitectAddress);
                        System.out.println("\nThank you, information has been updated!");
                    }

                    if (userChoice == 5)
                    {
                        break;
                    }
                }

            } else if (userChoice == 6) {

                // Display all projects with indexing
                for (int i = 0; i < projectList.size(); i++)
                {
                    System.out.println(i + ". " + projectList.get(i).toString());
                }
                System.out.println("\nPlease confirm the project you would like to finalize: ");

                // Initialize userIndex
                int userIndex = input.nextInt();


                // setFinalised to true
                // If money is owed, print out invoice
                // If balance is 0, print out statement
                Project finalizedProject = (projectList.get(userIndex));
                finalizedProject.setFinalised(true);

                if (finalizedProject.getBalance() > 0)
                {
                    System.out.printf(

                            "----------------------POISED INVOICE----------------------" + "\n" +

                            "Client Details:" + "\n" + finalizedProject.getCustomer() +
                            "Project Name:" + "\n" + finalizedProject.getProjectName() +
                            "Balance Owed: R" + finalizedProject.getBalance() +
                            "Completion Date:" + "\n" + finalizedProject.currentDate.getDayOfMonth()
                                    + "\n" + "\t"+ "Thank you for your business!" + "\n"
                    );
                }

                if (finalizedProject.getBalance() == 0)
                {
                    LocalDate date = finalizedProject.currentDate;
                    System.out.printf(

                            "----------------------POISED STATEMENT----------------------" + "\n" +

                                    "Client Details:"+ "\n" + finalizedProject.getCustomer() +
                                    "Project Name:" + "\n" + finalizedProject.getProjectName() +
                                    "Completion Date:" + "\n" + date.getDayOfWeek()+ "/" + date.getDayOfMonth() + "/" + date.getYear()
                            + "\n" + "\t" + "Thank you for your business!" + "\n"
                    );
                }

            }
            else if (userChoice == 7)
            {
                System.out.println("\n-----------------------------Viewing all Projects-----------------------------\n");

                for (int i = 0; i < projectList.size(); i++)
                {
                    System.out.println(i + ". " + projectList.get(i).toString());
                }
            }
            else if (userChoice == 8)
            {break;}

        }
    }
}