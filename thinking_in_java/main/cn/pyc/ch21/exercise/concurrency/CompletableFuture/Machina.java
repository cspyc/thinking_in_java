package cn.pyc.ch21.exercise.concurrency.CompletableFuture;

import cn.pyc.ch21.exercise.concurrency.RunnableTool.Nap;

import java.nio.file.StandardOpenOption;

/**
 * @author pi
 * @date 2020/9/16 10:31:47
 */
public class Machina {
    public enum State {
        START, ONE, TWO, THREE, END;

        State step() {
            if (equals(END)) {
                return END;
            }
            return values()[ordinal() + 1];
        }
    }

    private State state = State.START;
    private final int id;

    public Machina(int id) {
        this.id = id;
    }

    public static Machina work(Machina m) {
        if (!m.state.equals(State.END)) {
            new Nap(1);

            m.state = m.state.step();
        }
        System.out.println(m);
        return m;
    }

    @Override
    public String toString() {
        return "Machina" + id + ": " + (state.equals(state.END) ? "complete" : state);
    }
}