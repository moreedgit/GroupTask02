package GroupTask02;
public class Regis {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.contains("YAHOO")) {
            this.email = email;
        } else {
            System.out.println("Only Yahoo");
        }
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Username should be 6 char");
        }
    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Please enter valid username and password ");
        }
    }

    @Override
    public String toString() {
        return "regis{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class regisTester {
    public static void main(String[] args) {
        Regis regis = new Regis();
        regis.setEmail("user@YAHOO.com");
        regis.setUserName("student user");
        regis.setPassword("Camel@123");
        System.out.println(regis.toString());


    }

}
