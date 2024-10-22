package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface u33 extends Closeable {
    String getDatabaseName();

    r33 q();

    void setWriteAheadLoggingEnabled(boolean z);
}
