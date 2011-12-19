package org.effrafax.research.infrastructure.test;

import org.effrafax.research.infrastructure.bus.impl.SimpleEventBus;
import org.effrafax.research.infrastructure.event.Event;

public class TestEventBus extends SimpleEventBus {

	public void fire(Event event) {
		notifyHandlersOf(event);
	}
}
