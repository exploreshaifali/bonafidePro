/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonafide;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;



/**
 *
 * @author student
 */
public class EmailTest {
     public void sendMail(String content)  {
    String host = "smtp.gmail.com";
    String from = "shaifaliagrawal@iips.edu.in";
    String pass = "kalyanidevi";
    Properties props = System.getProperties();
    props.put("mail.smtp.user", from);
    props.put("mail.smtp.host", host);
    props.put("mail.smtp.port", "25"); 
    props.put("mail.debug", "true");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true"); 
    props.put("mail.smtp.EnableSSL.enable","true");

    props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    props.setProperty("mail.smtp.socketFactory.fallback", "false");
    props.setProperty("mail.smtp.port", "465");
    props.setProperty("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.password", pass);
    //props.put("mail.smtp.starttls.required", true);
   

    String[] to = {"shaifaliagrawal@iips.edu.in"}; 

    Session session = Session.getDefaultInstance(props, null);
    MimeMessage message = new MimeMessage(session);
    try{
    message.setFrom(new InternetAddress(from));

    InternetAddress[] toAddress = new InternetAddress[to.length];

    // To get the array of addresses
    for( int i=0; i < to.length; i++ ) { // changed from a while loop
        toAddress[i] = new InternetAddress(to[i]);
    }
    //System.out.println(Message.RecipientType.TO);

    for( int i=0; i < toAddress.length; i++) { // changed from a while loop
        message.addRecipient(Message.RecipientType.TO, toAddress[i]);
    }
    message.setSubject("Bonafide Issued");
    message.setText(content);
    Transport transport = session.getTransport("smtp");
    transport.connect(host, from, pass);
    transport.sendMessage(message, message.getAllRecipients());
    transport.close();
         }
    catch (MessagingException mex) {
            // Prints all nested (chained) exceptions as well
            mex.printStackTrace();
    }
    }
public static void main(String args[]){
    
}


// Send a simple, single part, text/plain e-mail
/*
    public static void main(String[] args) {

        // SUBSTITUTE YOUR EMAIL ADDRESSES HERE!!!
        String to = "agrawalshaifali09@gmail.com";
        String from = "shaifali.agrawal09@gmail.com";
        // SUBSTITUTE YOUR ISP'S MAIL SERVER HERE!!!
        //String host = "smtp.yourisp.net";
        String host = "smtp.gmail.com";

        // Create properties, get Session
        Properties props = new Properties();

        // If using static Transport.send(),
        // need to specify which host to send it to
        props.put("mail.smtp.host", host);
        // To see what is going on behind the scene
        props.put("mail.debug", "true");
        Session session = Session.getInstance(props);

        try {
            // Instantiatee a message
            Message msg = new MimeMessage(session);

            //Set message attributes
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject("Test E-Mail through Java");
            msg.setSentDate(new Date());

            // Set message content
            msg.setText("This is a test of sending a " +
                        "plain text e-mail through Java.\n" +
                        "Here is line 2.");

            //Send the message
            Transport.send(msg);
        }
        catch (MessagingException mex) {
            // Prints all nested (chained) exceptions as well
            mex.printStackTrace();
        }
    }
}//End of class
 *
 */
    

/*
    public static void main(String [] args)
   {
      // Recipient's email ID needs to be mentioned.
      String to = "agrawalshaifali09@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "shaifali.agrawal09@gmail.com";

      // Assuming you are sending email from localhost
      String host = "smtp.gmail.com";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.smtp.host", host);

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);

      try{
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("This is the Subject Line!");

         // Now set the actual message
         message.setText("This is actual message");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
 *
 */



}
