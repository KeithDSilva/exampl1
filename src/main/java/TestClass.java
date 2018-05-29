import io.beanmother.core.ObjectMother;
import org.testng.annotations.Test;

package java;

public class TestClass {
    public static void main(String[] args){
   //public void testme() {
        MyObjectMother objectMother = MyObjectMother.getInstance();
        Book book = objectMother.bear("book", Book.class);
        New n = objectMother.bear("new", New.class);
        Author author = objectMother.bear("author", Author.class, new AuthorPostProcessor());

        System.out.println("test");
   //}

}
}