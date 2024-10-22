package defpackage;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioFocusRequest;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract /* synthetic */ class r2 {
    public static /* bridge */ /* synthetic */ boolean A(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ AudioFocusRequest.Builder f(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    public static /* synthetic */ AudioFocusRequest.Builder j(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* synthetic */ InMemoryDexClassLoader m(ByteBuffer byteBuffer, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBuffer, classLoader);
    }

    public static /* synthetic */ void p() {
    }
}
