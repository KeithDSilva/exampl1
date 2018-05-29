import io.beanmother.core.AbstractBeanMother;
import io.beanmother.core.script.ScriptHandler;

public class MyObjectMother extends AbstractBeanMother {

    private static MyObjectMother myObjectMother = new MyObjectMother();

    private MyObjectMother() {
        super();
    }

    public static MyObjectMother getInstance() {
        return myObjectMother;
    }

    @Override
    protected void configureScriptHandler(ScriptHandler scriptHandler) {
        scriptHandler.register(new MyScriptRunner());
    }


    // Override for adding your default fixture directory paths.
    @Override
    public String[] defaultFixturePaths() {
        return new String[]{"test-models", "fixtures"};
    }

//    // Override for adding your custom Converter.
//    @Override
//    protected void configureConverterFactory(ConverterFactory converterFactory) {
//        converterFactory.register(new MyConverter());
//    }
//
//    // Override for adding your custom ScriptRunner.
//    @Override
//    protected void configureScriptHandler(ScriptHandler scriptHandler) {
//        scriptHandler.register(new MyScriptRunner);
//    }

    // Override for adding your custom PostProcessor.
//    @Override
//    protected void configurePostProcessorFactory(PostProcessorFactory postProcessorFactory) {
//        postProcessorFactory.register(new MyPostProcessor);
//    }
}