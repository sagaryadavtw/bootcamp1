import org.example.AreaOfRectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfRectangleTest {

    @Test
    public void calculateAreaWithPositiveNumberAsInputAs2and3(){
       AreaOfRectangle areaOfRectangle = new AreaOfRectangle();

       int actualArea = areaOfRectangle.calculateArea(2,3);

       assertEquals(6, actualArea);

    }

    @Test
    public void calculateAreaWithPositiveNumberAsInputAs4and5(){
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();

        int actualArea = areaOfRectangle.calculateArea(4,5);

        assertEquals(20, actualArea);

    }
}
