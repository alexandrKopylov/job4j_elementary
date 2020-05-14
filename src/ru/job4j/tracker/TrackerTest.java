package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);

        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void testfindAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);

        Item item2 = new Item("test2");
        tracker.add(item2);

        Item[] result = tracker.findAll();
        assertThat(result[0].getName(), is("test1"));
    }

    @Test
    public void testfindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);

        Item item2 = new Item("test2");
        tracker.add(item2);

        Item[] result = tracker.findByName("test2");
        assertThat(result[0].getName(), is("test2"));
    }
}