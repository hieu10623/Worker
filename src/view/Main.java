package view;

import controller.Manager;
import model.History;
import model.Worker;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();
        Manager manager = new Manager();
        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.addWorker(lw);
                    break;
                case 2:
                    manager.changeSalary(lw, lh, 1);
                    break;
                case 3:
                    manager.changeSalary(lw, lh, 2);
                    break;
                case 4:
                    manager.printListHistory(lh);
                    break;
                case 5:
                    return;
            }
        }
    }
}
