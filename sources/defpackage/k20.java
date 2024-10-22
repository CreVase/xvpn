package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class k20 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f2873a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(int i, Resources resources) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!r2.A(resources.getDrawable(i, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
