package DSA.store.helpdesk.entities.impl;

import DSA.store.helpdesk.entities.Priority;
import DSA.store.helpdesk.entities.RequestType;
import DSA.store.helpdesk.entities.SupportTicket;

public class DefaultSupportTicket implements SupportTicket {
	
	private static int counter;
	
	private RequestType requestType;
	private int sequentialNumber;
	
	{
		sequentialNumber = ++counter;
	}
	
	public DefaultSupportTicket() {
		// Default empty constructor
	}
	
	public DefaultSupportTicket(RequestType requestType) {
		this.requestType = requestType;
	}

	@Override
	public Priority getPriority() {
		if (requestType == null) {
			return null;
		}
		return this.requestType.getPriority();
	}

	@Override
	public int getSequentialNumber() {
		return this.sequentialNumber;
	}

	@Override
	public RequestType getRequestType() {
		return this.requestType;
	}

}
