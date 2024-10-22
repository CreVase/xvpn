package okhttp3.internal.concurrent;

import defpackage.m20;
import defpackage.v31;
import java.util.Arrays;
import java.util.logging.Level;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class TaskLoggerKt {
    public static final /* synthetic */ void access$log(Task task, TaskQueue taskQueue, String str) {
        log(task, taskQueue, str);
    }

    public static final String formatDuration(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.Companion.getLogger().fine(taskQueue.getName$okhttp() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, v31 v31Var) {
        long j;
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            j = -1;
        }
        try {
            T t = (T) v31Var.invoke();
            if (isLoggable) {
                log(task, taskQueue, m20.d1(formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j), "finished run in "));
            }
            return t;
        } catch (Throwable th) {
            if (isLoggable) {
                log(task, taskQueue, m20.d1(formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j), "failed a run in "));
            }
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, v31 v31Var) {
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, (String) v31Var.invoke());
        }
    }
}
