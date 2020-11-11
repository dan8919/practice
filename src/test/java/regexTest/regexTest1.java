package regexTest;

import org.junit.Test;
import static  org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class regexTest1 {
    @Test
    public void ex1(){
        String pattern = "ab.";
        assertFalse("ab".matches(pattern));
        assertFalse("ab".matches(pattern));
//        assertTrue("ab".matches(pattern));

        pattern = "ab\\s\\S";
        assertFalse("ab  ".matches(pattern));
        assertTrue("ab c".matches(pattern));
    }


    @Test
    public void ex2(){
        String result;
        result = "The cat sat on the mat.".replaceAll("[Tt]he","replacement");
        System.out.println(result);

    }

}
