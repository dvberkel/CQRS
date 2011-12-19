package org.effrafax.research.query.service;

import org.effrafax.research.infrastructure.event.Event;
import org.effrafax.research.infrastructure.test.TestEventBus;
import org.effrafax.research.query.service.impl.StandardEventCountService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventCountServiceTest {

	private EventCountService service;

	@Before
	public void createEventCountService() {
		service = new StandardEventCountService();
	}

	@Test
	public void intiallyEventCountIsZero() {
		assertEquals(Integer.valueOf(0), service.getEventCount());
	}

	@Test
	public void whenEventIsFiredEventCountIsZero() {
		TestEventBus bus = new TestEventBus();
		bus.add(service);

		bus.fire(new NullEvent());

		assertEquals(Integer.valueOf(1), service.getEventCount());
	}
}

class NullEvent implements Event {

}
