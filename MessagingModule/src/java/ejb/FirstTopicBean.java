/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author root
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "clientId", propertyValue = "client1"),
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/icttopic"),
    @ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "Durable"),
    @ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "jms/icttopic"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
})
public class FirstTopicBean implements MessageListener {
    
    public FirstTopicBean() {
    }
    
    @Override
    public void onMessage(Message message) {
          try{
             if(message instanceof TextMessage)
             {
                 TextMessage tm = (TextMessage)message;
                 String msg = tm.getText();
                
                 System.out.println("FirstTopicBean got the message "+ msg);
                 
             }
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
