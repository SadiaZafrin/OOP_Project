/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee_management;

import javax.swing.SwingUtilities;

/**
 *
 * @author Ekushey Computer
 */
public class Employee_management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeManagementSystem().setVisible(true);
            }
        });
    }
}
        
