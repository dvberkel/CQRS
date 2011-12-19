package org.effrafax.research.query.service;

import org.effrafax.research.infrastructure.event.impl.NullEvent;
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
		service.handle(new NullEvent());

		assertEquals(Integer.valueOf(1), service.getEventCount());
	}
}
