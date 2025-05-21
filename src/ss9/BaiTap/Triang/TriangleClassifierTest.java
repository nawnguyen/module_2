package ss9.BaiTap.Triang;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleClassifierTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("tam giác đều", TriangleClassifier.classify(2, 2, 2));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("tam giác cân", TriangleClassifier.classify(2, 2, 3));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("tam giác thường", TriangleClassifier.classify(3, 4, 5));
    }

    @Test
    public void testNotATriangle1() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(1, 2, 3));
    }

    @Test
    public void testNotATriangle2() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(-1, 2, 1));
    }

    @Test
    public void testNotATriangle3() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(0, 1, 1));
    }
}
