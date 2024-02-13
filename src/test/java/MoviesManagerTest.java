import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoviesManagerTest {
    @Test
    public void testFindAll() {
        MoviesManager manager = new MoviesManager();

        String film1 = "Железный человек";
        String film2 = "Мстители";
        String film3 = "Стражи Галактики";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        String[] actual = manager.findAll();
        String[] expected = {"Железный человек", "Мстители", "Стражи Галактики"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessThanSize1() {
        MoviesManager manager = new MoviesManager();
        String film1 = "Железный человек";
        String film2 = "Мстители";
        String film3 = "Стражи Галактики";
        String film4 = "Форсаж";
        String film5 = "Маска";
        String film6 = "Буратино";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);

        String[] actual = manager.findLast();
        String[] expected = {"Буратино", "Маска", "Форсаж", "Стражи Галактики", "Мстители"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessThanSize2() {
        MoviesManager manager = new MoviesManager(3);

        String film1 = "Железный человек";
        String film2 = "Мстители";
        String film3 = "Стражи Галактики";
        String film4 = "Форсаж";
        String film5 = "Маска";
        String film6 = "Буратино";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);

        String[] actual = manager.findLast();
        String[] expected = {"Буратино", "Маска", "Форсаж"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitMoreThanSize1() {
        MoviesManager manager = new MoviesManager(3);

        String film1 = "Железный человек";
        String film2 = "Мстители";
        String film3 = "Стражи Галактики";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        String[] actual = manager.findLast();
        String[] expected = {"Стражи Галактики", "Мстители", "Железный человек"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitMoreThanSize2() {
        MoviesManager manager = new MoviesManager(4);

        String film1 = "Железный человек";
        String film2 = "Мстители";
        String film3 = "Стражи Галактики";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        String[] actual = manager.findLast();
        String[] expected = {"Стражи Галактики", "Мстители", "Железный человек"};

        Assertions.assertArrayEquals(expected, actual);
    }


}