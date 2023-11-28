package windpark;


import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import tradearea.model.WarehouseData;

import javax.jms.*;
import java.io.Serializable;

public class MOMSender {

  private static String user = ActiveMQConnection.DEFAULT_USER;
  private static String password = ActiveMQConnection.DEFAULT_PASSWORD;
  private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
  private static String subject = "windengine_001";
	
  // public MOMSender(WarehouseData wData) {
  public MOMSender(String wData) {
		
	  System.out.println( "Sender started." );

	  // Create the connection.
	  Session session = null;
	  Connection connection = null;
	  MessageProducer producer = null;
	  Destination destination = null;
			
	  try {
	    	
//			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory( user, password, url );
//			connection = connectionFactory.createConnection();
//			connection.start();
//
//			// Create the session
//			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//			destination = session.createTopic( subject );
//
//			// Create the producer.
//			producer = session.createProducer(destination);
//			producer.setDeliveryMode( DeliveryMode.NON_PERSISTENT );
//
//			// Create the message
//			ObjectMessage message = session.createObjectMessage((Serializable) wData);
//			producer.send(message);
//			System.out.println( message.getObject() );
//
//			connection.stop();

		  ConnectionFactory connectionFactory = new ActiveMQConnectionFactory( user, password, url );
		  connection = connectionFactory.createConnection();
		  connection.start();

		  // Create the session
		  session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		  destination = session.createTopic( subject );

		  // Create the producer.
		  producer = session.createProducer(destination);
		  producer.setDeliveryMode( DeliveryMode.NON_PERSISTENT );

		  // Create the message
		  TextMessage m = session.createTextMessage(wData);

		  producer.send(m);
		  System.out.println(m.getText());

		  connection.stop();
	      
	  } catch (Exception e) {
	  	
	  	System.out.println("[MessageProducer] Caught: " + e);
	  	e.printStackTrace();
	  	
	  } finally {
	  	
			try { producer.close(); } catch ( Exception e ) {}
			try { session.close(); } catch ( Exception e ) {}
			try { connection.close(); } catch ( Exception e ) {}
			
	  }
	  System.out.println( "Sender finished." );
      
  } // end main
	
}
