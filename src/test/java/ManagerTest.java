import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {


    @Test
    public void shouldAddFilm() {
        Manager manager = new Manager();

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");

        String[] actual = manager.findAll();
        String[] expected = {"Movie I", "Movie II", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddFilm1() {
        Manager manager = new Manager();

        manager.addFilm("Movie I");

        String[] actual = manager.findAll();
        String[] expected = {"Movie I"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddFilm0() {
        Manager manager = new Manager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast5() {
        Manager manager = new Manager();

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");

        String[] actual = manager.findLast();
        String[] expected = {"Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast3() {
        Manager manager = new Manager();

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");

        String[] actual = manager.findLast();
        String[] expected = {"Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast7() {
        Manager manager = new Manager();

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");
        manager.addFilm("Movie VI");
        manager.addFilm("Movie VII");

        String[] actual = manager.findLast();
        String[] expected = {"Movie VII", "Movie VI", "Movie V", "Movie IV", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast0() {
        Manager manager = new Manager();

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }

}
