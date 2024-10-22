package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* loaded from: classes2.dex */
public final class AndroidLogHandler extends Handler {
    public static final AndroidLogHandler INSTANCE = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        int androidLevel;
        AndroidLog androidLog = AndroidLog.INSTANCE;
        String loggerName = logRecord.getLoggerName();
        androidLevel = AndroidLogKt.getAndroidLevel(logRecord);
        androidLog.androidLog$okhttp(loggerName, androidLevel, logRecord.getMessage(), logRecord.getThrown());
    }
}
