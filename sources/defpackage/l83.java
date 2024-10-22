package defpackage;

import com.google.android.gms.internal.consent_sdk.zzl;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class l83 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f3083a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f3084b = new AtomicBoolean(true);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicBoolean e;
    public static zzl f;
    public static boolean g;

    static {
        new AtomicBoolean(false);
        e = new AtomicBoolean(false);
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bf, code lost:            if (r1 != false) goto L53;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l83.a(android.content.Context):void");
    }

    public static final void b() {
        FirebaseMessaging firebaseMessaging;
        uo uoVar = FirebaseMessaging.l;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(px0.b());
        }
        firebaseMessaging.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        firebaseMessaging.f.execute(new lf(28, firebaseMessaging, taskCompletionSource));
        taskCompletionSource.getTask().addOnCompleteListener(new qb0(0));
    }
}
