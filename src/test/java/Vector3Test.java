import com.badlogic.gdx.math.Vector3;
import org.junit.Assert;
import org.junit.Test;

public class Vector3Test {

    private static final float EPSILON = 0.01f;

    @Test
    public void testInit() {
        Vector3 vector = new Vector3(0,0,0);
        Assert.assertEquals(0, vector.x, EPSILON);
        Assert.assertEquals(0, vector.y, EPSILON);
        Assert.assertEquals(0, vector.z, EPSILON);
    }

    @Test
    public void testAdd() {
        Vector3 vector = new Vector3(0,0,0);
        vector.add(5);

        Assert.assertEquals(5, vector.x, EPSILON);
        Assert.assertEquals(5, vector.y, EPSILON);
        Assert.assertEquals(5, vector.z, EPSILON);
    }

}
