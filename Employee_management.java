
package employee_management;

import javax.swing.SwingUtilities;


public class Employee_management {

   
    public static void main(String[] args) {
       
   SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeManagementSystem().setVisible(true);
            }
        });
    }
}
        
