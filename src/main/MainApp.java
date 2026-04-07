package main;

import model.*;

public class MainApp {
    public static void main(String[] args) {

        User user = new User(1, "Mahek");
        user.displayRole();
        user.showDetails();

        Admin admin = new Admin(2, "Aayushi");
        admin.displayRole();
        admin.showDetails();
    }
}
