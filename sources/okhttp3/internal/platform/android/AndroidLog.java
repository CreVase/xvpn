package okhttp3.internal.platform.android;

import android.util.Log;
import defpackage.dr0;
import defpackage.i23;
import defpackage.j23;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

@SuppressSignatureCheck
/* loaded from: classes2.dex */
public final class AndroidLog {
    private static final int MAX_LOG_LENGTH = 4000;
    private static final Map<String, String> knownLoggers;
    public static final AndroidLog INSTANCE = new AndroidLog();
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    static {
        String name;
        Map<String, String> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = OkHttpClient.class.getPackage();
        if (r2 == null) {
            name = null;
        } else {
            name = r2.getName();
        }
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Http2.class.getName(), "okhttp.Http2");
        linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap<>(linkedHashMap);
            } else {
                Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                map = Collections.singletonMap(entry.getKey(), entry.getValue());
            }
        } else {
            map = dr0.f1824a;
        }
        knownLoggers = map;
    }

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String str2 = knownLoggers.get(str);
        if (str2 == null) {
            return j23.w1(23, str);
        }
        return str2;
    }

    public final void androidLog$okhttp(String str, int i, String str2, Throwable th) {
        int min;
        String loggerTag = loggerTag(str);
        if (Log.isLoggable(loggerTag, i)) {
            if (th != null) {
                str2 = str2 + '\n' + ((Object) Log.getStackTraceString(th));
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int Y0 = i23.Y0(str2, '\n', i2, false, 4);
                if (Y0 == -1) {
                    Y0 = length;
                }
                while (true) {
                    min = Math.min(Y0, i2 + MAX_LOG_LENGTH);
                    Log.println(i, loggerTag, str2.substring(i2, min));
                    if (min >= Y0) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            enableLogging(entry.getKey(), entry.getValue());
        }
    }
}
