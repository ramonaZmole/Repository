package com.tools;

import javax.mail.*;
import javax.mail.Flags.Flag;
import javax.mail.search.FlagTerm;

import java.util.Properties;

public class EmailCheck {

	public static void check(String host, String storeType, String user,
			String password) {
		try {

			// create properties field
			Properties properties = new Properties();

			properties.put("mail.imap.host", host);
			properties.put("mail.imap.port", "995");
			properties.put("mail.imap.starttls.enable", "true");
			Session emailSession = Session.getDefaultInstance(properties);

			// create the imap store object and connect with the pop server
			Store store = emailSession.getStore("imaps");

			store.connect(host, user, password);

			// create the folder object and open it
			Folder emailFolder = store.getFolder("INBOX");
			emailFolder.open(Folder.READ_ONLY);

			// retrieve the messages from the folder in an array and print it
			Message[] messages = emailFolder.getMessages();
			Message unread[] = emailFolder.search(new FlagTerm(new Flags(
					Flag.SEEN), false));

			FetchProfile fp = new FetchProfile();
			fp.add(FetchProfile.Item.ENVELOPE);
			fp.add(FetchProfile.Item.CONTENT_INFO);
			emailFolder.fetch(messages, fp);
			emailFolder.fetch(unread, fp);

			System.out.println("messages.length---" + unread.length);

			for (int i = 0, n = unread.length; i <n; i++) {
				Message message = unread[i];
				System.out.println("---------------------------------");
				// System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + message.getSubject());
				// System.out.println("From: " + message.getFrom()[0]);
				System.out.println("Text: " + message.getContent().toString());

			}

			// close the store and folder objects
			emailFolder.close(false);
			store.close();

		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}