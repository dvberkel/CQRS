package org.effrafax.research.query.service.impl;

import org.effrafax.research.infrastructure.event.Event;
import org.effrafax.research.query.service.EventCountService;

public class StandardEventCountService implements EventCountService {

	private int numberOfEvents = 0;

	@Override
	public Integer getEventCount() {
		return numberOfEvents;
	}

	@Override
	public void handle(Event event) {
		numberOfEvents++;
	}

}
