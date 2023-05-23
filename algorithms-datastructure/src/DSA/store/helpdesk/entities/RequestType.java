package DSA.store.helpdesk.entities;

import static DSA.store.helpdesk.entities.Priority.*;

public enum RequestType {
	OTHER(LOW), CHANGE_ACCOUNT_DETAILS(LOW), CAN_NOT_LOGIN(MEDIUM), 
	ACCOUNT_IS_BLOCKED(MEDIUM), COOPERATION(MEDIUM), ACCOUNT_IS_HACKED(HIGH), 
	CAN_NOT_COMPLETE_PURCHASE(HIGH), ORDER_IS_NOT_RECEIVED(HIGH);
	
	private DSA.store.helpdesk.entities.Priority priority;
	
	private RequestType(DSA.store.helpdesk.entities.Priority priority) {
		this.priority = priority;
	}
	
	public DSA.store.helpdesk.entities.Priority getPriority() {
		return this.priority;
	}
}
