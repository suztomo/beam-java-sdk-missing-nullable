package suztomo;

import java.lang.reflect.Field;
import org.apache.beam.sdk.schemas.FieldValueTypeInformation;
import org.junit.Test;

public class AppTest
{
    String f = "hello";

    @Test
    public void shouldExtractFieldValueInformation()
    {
        Field field = AppTest.class.getDeclaredFields()[0];

        // This fails
        FieldValueTypeInformation.forField(field);
    }
}
