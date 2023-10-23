package Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.awt.*;
import java.util.Random;

public class TestDraw {
    private static final Random random = new Random();

    public static Color getSnakePartColor(int partIndex) {
        if(partIndex == 0) {
            return Color.green;
        } else {
            return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        }
    }
    @Test
    public void testGetSnakePartColorForHead() {
        Color result = getSnakePartColor(0);
        assertEquals(Color.green, result);
    }

    @Test
    public void testGetSnakePartColorForBody() {
        Color result = getSnakePartColor(1);
        assertNotEquals(Color.green, result);
    }
}
