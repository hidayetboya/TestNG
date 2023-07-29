package Day04;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _02_XMLMultipleClasses {

    @Test
    void test1(){
        System.out.println("_02_XMLMultipleClasses test1");
    }

    @Test
    void test2(){
        System.out.println("_02_XMLMultipleClasses test2");
    }


    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class 2 is working");
    }
}
