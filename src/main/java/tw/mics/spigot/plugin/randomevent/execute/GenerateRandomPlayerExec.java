package tw.mics.spigot.plugin.randomevent.execute;

import java.util.List;

public class GenerateRandomPlayerExec implements AbstractExec {
    @Override
    public String getExecName() {
        return "GENERATE_RANDOM_PLAYER";
    }

    @Override
    public void setParameter(String para) {
        // TODO Auto-generated method stub
    }

    @Override
    public List<String> run(List<String> memory) {
        //TODO running
        return AbstractExec.initMemory(memory);
    }
}
