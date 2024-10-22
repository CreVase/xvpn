package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class ma1 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final URL f3260a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Future f3261b;
    public Task c;

    public ma1(URL url) {
        this.f3260a = url;
    }

    public final Bitmap a() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f3260a;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] c0 = bx3.c0(new hs(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    int length = c0.length;
                    Objects.toString(url);
                }
                if (c0.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c0, 0, c0.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Objects.toString(url);
                        }
                        return decodeByteArray;
                    }
                    throw new IOException("Failed to decode image: " + url);
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3261b.cancel(true);
    }
}
