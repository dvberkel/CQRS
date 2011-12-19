package org.effrafax.research.infrastructure.bus;

import org.effrafax.research.infrastructure.event.Event;

public interface EventHandler {

	void handle(Event event);

}
