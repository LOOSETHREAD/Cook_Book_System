
package controller;


import Model.User;

public class UserController {
    private AddUserController theDAO;
    
    public UserController() {
        this.theDAO = new AddUserController();
    }
    
    public boolean addUserToDatabase(User theUser) {
        String encryptedPassword = theDAO.encryptPass(new String(theUser.getPassword()));
        theUser.setPassword(encryptedPassword.toCharArray());
        return theDAO.addUserToDatabase(theUser);
    }
    
    public User getUser(User theUser) {
        String encryptedPassword = theDAO.encryptPass(new String(theUser.getPassword()));
        theUser.setPassword(encryptedPassword.toCharArray());
        return this.theDAO.getUser(theUser);
    }
}
