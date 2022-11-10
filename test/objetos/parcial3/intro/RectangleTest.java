package objetos.parcial3.intro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void testArea(){
        Rectangle rectangle = new Rectangle(10,5);

        double area = rectangle.getArea();

        Assertions.assertEquals(50.0, area);
        Assertions.assertEquals(10, rectangle.getWidth());
        Assertions.assertEquals(5, rectangle.getHeight());
    }

    @Test
    public void testPerimeter(){
        //inicializacion
        Rectangle rectangle = new Rectangle(10,5);
        //ejecucion
        double perimeter = rectangle.getPerimeter();
        //validacion
        Assertions.assertEquals(30.0, perimeter);
    }
}
