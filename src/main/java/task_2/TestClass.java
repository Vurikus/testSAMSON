package task_2;

import org.testng.ITestNGListener;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
public class TestClass {
    
    @Test
    public void annotation() {
        assertEquals(1, 1);
    }
}


class AnnotationReader implements ITestNGListener {

    public static void readParam() {
        TestMethodInfo annotation = TestClass.class.getAnnotation(TestMethodInfo.class);
        System.out.println(annotation.priority() + " " + annotation.author() + " " + annotation.lastModified());
    }

    public static void main(String[] args) {
        readParam();
    }
}

