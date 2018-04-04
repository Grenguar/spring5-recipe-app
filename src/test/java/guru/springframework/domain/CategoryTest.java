package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    private Category category;

    @Before
    public void startUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long longValue = 4l;
        category.setId(longValue);
        assertEquals(longValue, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}