
package studentinternshipapplication;

public class StudentInternshipApplication {

    public static void main(String[] args) {
        final LoginInterface frame = new LoginInterface();
        //frame.setExtendedState(LoginInterface.MAXIMIZED_BOTH);
        frame.setTitle("Login");
        frame.setLoginInterface(frame);
        frame.setVisible(true);
        System.out.println("let the program begin");
    }
    
}
