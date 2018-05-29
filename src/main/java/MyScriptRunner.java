import io.beanmother.core.script.ScriptFragment;
import io.beanmother.core.script.ScriptOperationException;
import io.beanmother.core.script.ScriptRunner;

import java.util.Date;

public class MyScriptRunner implements ScriptRunner {
    private static final String NAMESPACE = "current";
    private static final String NUMBER_SEQUENCE_METHOD_NAME = "date";
    private static final String camp = "camp";

    @Override
    public Object run(ScriptFragment scriptFragment) {
        if (!canHandle(scriptFragment)) {
            throw new ScriptOperationException(scriptFragment.getMethodName() + " is not support.");
        }
        if (scriptFragment.getNext() == null
                || scriptFragment.getNext().getMethodName().equals(NUMBER_SEQUENCE_METHOD_NAME)) {
            return new Date();
        } else if (scriptFragment.getNext().getMethodName().equals(camp) && scriptFragment.getNext().hasArguments()) {
            return "bla " + scriptFragment.getNext().getArguments().get(0);
        }
        else {
            throw new ScriptOperationException(scriptFragment.getMethodName() + " is not support.");
        }
    }

    @Override
    public boolean canHandle(ScriptFragment scriptFragment) {
        return scriptFragment.getMethodName().equals(NAMESPACE);
    }

    public String getScriptNamespace() {
        return NAMESPACE;
    }
}