package org.rajneesh.massanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rajneesh.massanger.database.DatabaseClasses;
import org.rajneesh.massanger.model.Message;

public class MessageService {
	
	private Map<Long,Message> messages = DatabaseClasses.getMessage();
	public MessageService()
	{
		messages.put(1L,new Message(1,"first message","Rajanmunna author"));
		messages.put(2L,new Message(2,"Second message","Rajanmunna author"));
	}
	
	public List<Message> getAllMessages()
	{
	
		return new ArrayList<Message>(messages.values());
	
	}
	
	public Message getMessages(long id)
	{
		return messages.get(id);
	
	}
	
	public Message addMessages(Message message)
	{
		if(message.getId()<=0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	
	}

	public Message updateMessages(Message message)
	{
		if(message.getId()<=0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	
	}
	
	public Message removeMessages(long id)
	{
	
		return messages.remove(id);
	
	}
	

}
