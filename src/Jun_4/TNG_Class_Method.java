package Jun_4;
import org.testng.annotations.*;

public class TNG_Class_Method  extends TNG_Suite{
    @BeforeClass //similar to @BeforeAll in junit
    public void setUP() {
        System.out.println("Class1 - @BeforeClass method");
    }

    @AfterClass //similar to @AfterAll in junit
    public void TearDown() {
        System.out.println("Class1 - @AfterClass method");
    }

    @BeforeMethod //similar to @BeforeEach in junit
    public void init() {
        System.out.println("Class1 - @BeforeMethod method");
    }

    @AfterMethod //similar to @AfterEach in junit
    public void quit() {
        System.out.println("Class1 - @AfterMethod method");
    }

    @Test
    public void test1() {
        System.out.println("Class1 - @Test1 method");
    }

    @Test
    public void test2() {
        System.out.println("Class1 - @Test2 method");
    }

    @Test
    public void test3() {
        System.out.println("Class1 - @Test3 method");
    }
}
