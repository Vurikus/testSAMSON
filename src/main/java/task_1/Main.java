//
//        Вторую задачу сам соберешь вот подсказки
//
//        Это лиснр который тебе нужен для ServiceLoad
//
//public class AnnotationInterceptor implements IAnnotationTransformer {
//
//    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
//
//        TestMethodInfo anot = testMethod.getAnnotation(TestMethodInfo.class);
//
//        System.out.println(anot.priority() + " " + anot.author() + " " + anot.lastModified());
//    }
//}
//
//    Это твой класс с тестом
//
//public class TestClass {
//
//    @Test
//    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
//    public void annotation() {
//        assertEquals(1, 1);
//    }
//
//}
//
//enum Priority {
//    Blocker, Critical, Major, Minor
//}
//
//RUNTIME
//        { TYPE, METHOD }
//@interface TestMethodInfo {
//
//    //Приоритет теста
//    Priority priority() default Priority.Major;
//
//    //Автор теста
//    String author() default "Bill Gates";
//
//    //Дата последних изменений в тесте
//    String lastModified() default "01.01.2019";
//
//}
