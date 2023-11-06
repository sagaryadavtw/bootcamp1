import org.example.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {


    @Test
    public void calculateAreaWithPositiveNumberAsInput(){
        Rectangle rectangle = new Rectangle(2,3);
       int area = rectangle.area();
       assertEquals(6, area);
    }


    @Test
    public void calculatePerimeterWithPositiveNumberAsInput(){
        Rectangle rectangle = new Rectangle(2,3);
        int parameter = rectangle.perimeter();
        assertEquals(10, parameter);
    }


    @Test
    public void throwsExceptionIfLengthIsNegative(){
        Throwable exception = assertThrows(IllegalArgumentException.class ,
                () -> new Rectangle(-4,3));

       assertEquals("Length or Breadth cannot be negative", exception.getMessage());
    }


}
