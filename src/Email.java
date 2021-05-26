public class Email {


    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private String companyDomain;
    private int mailboxCapacity;


    public Email(String firstName, String lastName, String department,  String companyDomain, int mailboxCapacity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.companyDomain = companyDomain;
        this.mailboxCapacity = mailboxCapacity;
    }

    public Email(String firstName, String lastName, String department, String companyName) {
        this.email = this.firstName +"." + this.lastName  +this.department + "." + this.companyDomain;

    }



    private String getDepartment(String department) {
        if (department.equals("1")) {
            return "Accounting";
        }else if (department.equals("2")) {
            return "Sales";
        }else if (department.equals("3")) {
            return "Developement";
        }else if (department.equals("4")) {
            return "QA";
        }else {
            return "Department not found";
        }
    }


    private String getPassword(String password) {

        String [] strings = new String[10];
        for (int i = 0; i < strings.length; i++){
            password = "";
            for (int j= 0; j < 10; j++){
                int randomNo = (int)(Math.random()* 10);
                char randomL = (char)(97 + Math.random() * 26);
                char randomU = (char)(97 + Math.random() * 26);
                if (Math.random() > 0.66) {
                    password +=randomNo;
                }else if (Math.random() > 0.33){
                    password += randomL;
                } else{
                    password += randomU;
                }
                strings[i] = password;
            }
        }
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }



    public String getName() {
        return firstName + lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getInfo() {

        return
                "Name: " + firstName + lastName + "\n" +
                        "Department: " + department + "\n" +
                        "Generated email: " + email + "\n" +
                        "Generated password: " + password + "\n" +
                        "Alternative email: " + email + "\n" +
                        "Mailbox capacity: " + mailboxCapacity;
    }







}
