/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;
import javax.mail.*;

/**
 *
 * @author SHIVAM MALL
 */
public class MyAuthentication extends javax.mail.Authenticator
{
    public MyAuthentication()
    {
    }
    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication("wadhwanig8@gmail.com","gaurav@11");//change accordingly
    }
}
