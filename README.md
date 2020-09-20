Задание 1: Используя Java Dynamic Proxy (https://docs.oracle.com/javase/8/docs/technotes/guides/reflection/proxy.html) реализуйте метод

task_1.MainPage createPage(Class clazz)
класса task_1.MethodInterception, таким образом что бы проходил тест:

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({METHOD, TYPE})
public @interface task_1.Selector {

    String xpath();
}

public interface task_1.MainPage {

    @task_1.Selector(xpath = ".//*[@test-attr='input_search']")
    String textInputSearch();

    @task_1.Selector(xpath = ".//*[@test-attr='button_search']")
    String buttonSearch();
}

public class task_1.MethodInterception {

    @Test
    public void annotationValue() {
        task_1.MainPage mainPage = createPage(task_1.MainPage.class);
        assertNotNull(mainPage);
        assertEquals(mainPage.buttonSearch(), ".//*[@test-attr='button_search']");
        assertEquals(mainPage.textInputSearch(), ".//*[@test-attr='input_search']");
    }

    private task_1.MainPage createPage(Class clazz) {
        return null;
    }
}
Задание №2 - TestNG,ServiceLoader: Реализуйте перехват параметров анотации TestMethodInfo в тестовом методе и вывод их в консоль. Подключение TestNg Listener нужно сделать через ServiceLoader.

public enum Priority {
   Blocker, Critical, Major, Minor
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //on class level
public @interface TestMethodInfo {

//Приоритет теста
Priority priority() default Priority.Major;

//Автор теста	
String author() default "Bill Gates";

//Дата последних изменений в тесте
String lastModified() default "01.01.2019";
}

@Test
@TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
public void annotation() {
   assertEquals(1, 1);
}