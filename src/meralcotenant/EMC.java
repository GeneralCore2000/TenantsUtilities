package meralcotenant;

import javax.swing.JOptionPane;

public class EMC {
    public static void errorMessages(int prompt) {
        switch (prompt) {
            case 1:
                JOptionPane.showMessageDialog(null, "Fill-up KWH Meralco bill");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Fill-up Total Meralco bill");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Fill-up Total Nawasa bill");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, TenantsUtility.getTenant1() + "'s Current Reading is blank.");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, TenantsUtility.getTenant2() + "'s Current Reading is blank.");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, TenantsUtility.getTenant3() + "'s Current Reading is blank.");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, TenantsUtility.getTenant4() + "'s Current Reading is blank.");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Error: Wrong computation. Manual computation is recommended", "Maching Computation Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Total computed > total bill of Meralco and Nawasa", "Maching Computation Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Total computed < total bill of Meralco and Nawasa", "Maching Computation Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
