
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheGenius
 */
public class loadjdbc {
    public static void init(){
     try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, "Cannot load Jdbc Driver");
        }
    }
}
