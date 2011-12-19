package org.effrafax.research.infrastructure.bus;

import org.effrafax.research.infrastructure.event.Event;

public interface EventBus {

	void add(EventHandler handler);

	void notifyHandlersOf(Event event);
}
