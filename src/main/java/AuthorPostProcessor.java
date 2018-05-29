import io.beanmother.core.common.FixtureMap;
import io.beanmother.core.postprocessor.PostProcessor;

import java.util.Date;

public class AuthorPostProcessor extends PostProcessor<Author> {
    @Override
    public void process(Author bean, FixtureMap fixtureMap) {
        if (bean.getPolicies().get("id0").getId() == 3) {

        }
        for(Book book : bean.getPolicies().values()) {
            if (book.getPublishedAt().toString().equals("${current_date}")) {
                book.setPublishedAt(new Date());
            }
        }
    }
}