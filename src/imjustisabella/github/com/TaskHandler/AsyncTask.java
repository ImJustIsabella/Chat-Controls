package imjustisabella.github.com.TaskHandler;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CompletableFuture;

public class AsyncTask {

    public AsyncTask(Runnable run) {
        CompletableFuture.runAsync(run).join();
    }
}