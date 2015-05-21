package com.tools;

import javax.mail.*;
import javax.mail.Flags.Flag;
import javax.mail.search.FlagTerm;

import org.junit.Assert;

import java.io.IOException;
import java.util.Properties;

public class EmailCheck {
	String firstName = "";
	String startDate = "";
	String endDate = "";
	String approver = "";
	
	public String check(String host, String storeType, String user, String password) throws MessagingException, IOException {
	
			
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
			Message msg = emailFolder.getMessage(emailFolder.getMessageCount());
			Address[] in = msg.getFrom();

			for (Address address : in) {
				System.out.println("FROM:" + address.toString());
			}

			String email = (String) msg.getContent();

			System.out.println("SENT DATE:" + msg.getSentDate());
			System.out.println("SUBJECT:" + msg.getSubject());
			System.out.println("CONTENT:" + msg.getContent());

			/*
			 * Message[] messages = emailFolder.getMessages(); Message unread[]
			 * = emailFolder.search(new FlagTerm(new Flags( Flag.SEEN), false));
			 * 
			 * FetchProfile fp = new FetchProfile();
			 * fp.add(FetchProfile.Item.ENVELOPE);
			 * fp.add(FetchProfile.Item.CONTENT_INFO);
			 * emailFolder.fetch(messages, fp); emailFolder.fetch(unread, fp);
			 * 
			 * System.out.println("messages.length---" + unread.length);
			 * 
			 * for (int i = 0, n = unread.length; i < n; i++) { Message message
			 * = unread[i];
			 * System.out.println("---------------------------------"); //
			 * System.out.println("Email Number " + (i + 1));
			 * System.out.println("Subject: " + message.getSubject()); //
			 * System.out.println("From: " + message.getFrom()[0]);
			 * System.out.println("Text: " + message.getContent().toString());
			 * 
			 * }
			 */

			email = email.replace("\r\n", "");

			String receivedEmail = email;
			String expectedEmail = "Dear " + firstName + ",<br /> <br />   ";
			expectedEmail = expectedEmail
					+ "You have submitted a new Vacation Request.Your holiday interval is: <strong>"
					+ startDate
					+ " -"
					+ endDate
					+ "</strong>.  <br />     Please check if the request was approved before going on holiday, if not please contact your vacation approver, <b>"
					+ approver
					+ "</b>.   <!-- <br/> <br/> Cheers, <br /> The EvoPortal Team--><br/> <br/> Cheers, <br /> The EvoPortal Team";
			
			//String expectedEmail2 = "Dear __firstNme__,<br /> <br />   You have submitted a new Vacation Request. Your holiday interval is: <strong>28/10/2015 - 30/10/2015</strong>.  <br />     Please check if the request was approved before going on holiday, if not please contact your vacation approver, <b>Alexandra Pandele</b>.   <!-- <br/> <br/> Cheers, <br /> The EvoPortal Team--><br/> <br/> Cheers, <br /> The EvoPortal Team";
			//expectedEmail2 = expectedEmail2.replace("__firstNme__", firstName);

			// close the store and folder objects
			emailFolder.close(false);
			store.close();
			return expectedEmail;
		
		
			}	}