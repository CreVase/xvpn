package okhttp3.internal.ws;

import defpackage.fc1;
import defpackage.lr;
import defpackage.xg2;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public final class MessageInflater implements Closeable {
    private final lr deflatedBytes;
    private final Inflater inflater;
    private final fc1 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        lr lrVar = new lr();
        this.deflatedBytes = lrVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new fc1(new xg2(lrVar), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(lr lrVar) throws IOException {
        boolean z;
        if (this.deflatedBytes.f3176b == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.l(lrVar);
            this.deflatedBytes.Y(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.f3176b;
            do {
                this.inflaterSource.a(lrVar, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
