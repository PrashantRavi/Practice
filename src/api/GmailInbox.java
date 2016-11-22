package api;

import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

public class GmailInbox {

	public static void main(String[] args) {
		GmailInbox gmail = new GmailInbox();
		gmail.read("Welcome to OYO for Business!");
	}

	public void read(String subject) {

		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getDefaultInstance(props, null);

			Store store = session.getStore();
			store.connect("smtp.gmail.com", "testoyo22@gmail.com", "oyo@1234");

			Folder inbox = store.getFolder("inbox");
			inbox.open(Folder.READ_WRITE);
			int messageCount = inbox.getMessageCount();

			System.out.println("Total Messages:- " + messageCount);

			Message[] messages = inbox.getMessages();

			System.out.println("------------------------------");
			for (int i = 0; i < messages.length; i++) {

				// Multipart mp = (Multipart) messages[i].getContent();
				// BodyPart bp = mp.getBodyPart(0);
				// bp.getContent();
				
				if(messages[i].getSubject().equals(subject)){
					System.out.println("Mail Subject:- " + messages[i].getSubject() + " Message Time   " + messages[i].getSentDate());
				}
				
				System.out.println("Mail Subject:- " + messages[i].getSubject() + " Message Time   " + messages[i].getSentDate());
				
				// messages[0].setFlag(Flags.Flag.DELETED, true);

			}
			inbox.close(true);
			store.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}