package DSA.store.helpdesk.facades.impl;

import java.util.PriorityQueue;
import java.util.Queue;

import DSA.store.helpdesk.entities.SupportTicket;
import DSA.store.helpdesk.facades.HelpDeskFacade;
import DSA.store.helpdesk.utils.CustomSupportTicketsComparator;

public class DefaultHelpDeskFacade implements HelpDeskFacade {
	
	private Queue<SupportTicket> tickets;
	
	{
		tickets = new PriorityQueue<>(new CustomSupportTicketsComparator());
	}

	@Override
	public void addNewSupportTicket(SupportTicket supportTicket) {
		tickets.offer(supportTicket);
	}

	@Override
	public SupportTicket getNextSupportTicket() {
		return tickets.poll();
	}

	@Override
	public int getNumberOfTickets() {
		return tickets.size();
	}

}
