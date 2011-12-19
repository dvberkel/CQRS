package org.effrafax.research.query.service;

import org.effrafax.research.infrastructure.bus.EventHandler;

public interface EventCountService extends EventHandler {

	Integer getEventCount();

}
