package org.effrafax.research.infrastructure.bus.impl;

import java.util.ArrayList;
import java.util.List;

import org.effrafax.research.infrastructure.bus.EventBus;
import org.effrafax.research.infrastructure.bus.EventHandler;
import org.effrafax.research.infrastructure.event.Event;

public class SimpleEventBus implements EventBus {
	private final List<EventHandler> handlers = new ArrayList<EventHandler>();

	@Override
	public void add(EventHandler handler) {
		handlers.add(handler);
	}

	@Override
	public void notifyHandlersOf(Event event) {
		for (EventHandler handler : handlers) {
			handler.handle(event);
		}
	}
}
