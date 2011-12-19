package org.effrafax.research.component;

import org.effrafax.research.infrastructure.event.impl.NullEvent;
import org.effrafax.research.infrastructure.test.TestEventBus;
import org.effrafax.research.query.service.EventCountService;
import org.effrafax.research.query.service.impl.StandardEventCountService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventBusComponentTest {
	private TestEventBus bus;

	@Before
	public void createEventBus() {
		bus = new TestEventBus();
	}

	@Test
	public void notifyHandlerOfEvent() {
		EventCountService service = new StandardEventCountService();
		bus.add(service);

		bus.fire(new NullEvent());

		assertEquals(Integer.valueOf(1), service.getEventCount());
	}
}
