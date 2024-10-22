package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.security.xvpn.z35kb.livechat.a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class ua1 {
    public static volatile ua1 h;

    /* renamed from: a, reason: collision with root package name */
    public final oa1 f4641a;
    public final File e;
    public int g;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4642b = new HashMap();
    public final LinkedList c = new LinkedList();
    public final HashSet d = new HashSet();
    public final Object f = new Object();

    public ua1(Context context) {
        this.f4641a = new oa1(Math.min(15, ((ActivityManager) context.getSystemService("activity")).getMemoryClass() / 7) * UserVerificationMethods.USER_VERIFY_ALL * UserVerificationMethods.USER_VERIFY_ALL);
        File file = new File(context.getExternalCacheDir(), "livechat/image");
        this.e = file;
        file.mkdirs();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[Catch: all -> 0x0073, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0004, B:11:0x002e, B:13:0x003d, B:17:0x0040, B:19:0x0046, B:20:0x0049, B:22:0x0055, B:23:0x0070, B:26:0x0063, B:27:0x001e, B:28:0x0023, B:30:0x0027, B:32:0x002b), top: B:5:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[Catch: all -> 0x0073, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0004, B:11:0x002e, B:13:0x003d, B:17:0x0040, B:19:0x0046, B:20:0x0049, B:22:0x0055, B:23:0x0070, B:26:0x0063, B:27:0x001e, B:28:0x0023, B:30:0x0027, B:32:0x002b), top: B:5:0x0004, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.ua1 r7, java.io.File r8, int r9, int r10) {
        /*
            monitor-enter(r7)
            java.lang.Object r0 = r7.f     // Catch: java.lang.Throwable -> L76
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L76
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L73
            r1.<init>()     // Catch: java.lang.Throwable -> L73
            r2 = 1
            r1.inJustDecodeBounds = r2     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L73
            android.graphics.BitmapFactory.decodeFile(r3, r1)     // Catch: java.lang.Throwable -> L73
            int r3 = r1.outHeight     // Catch: java.lang.Throwable -> L73
            int r4 = r1.outWidth     // Catch: java.lang.Throwable -> L73
            if (r3 > r10) goto L1e
            if (r4 <= r9) goto L1c
            goto L1e
        L1c:
            r5 = 1
            goto L2e
        L1e:
            int r3 = r3 / 2
            int r4 = r4 / 2
            r5 = 1
        L23:
            int r6 = r3 / r5
            if (r6 <= r10) goto L2e
            int r6 = r4 / r5
            if (r6 <= r9) goto L2e
            int r5 = r5 * 2
            goto L23
        L2e:
            r1.inSampleSize = r5     // Catch: java.lang.Throwable -> L73
            r3 = 0
            r1.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L73
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r3, r1)     // Catch: java.lang.Throwable -> L73
            if (r1 != 0) goto L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r7)
            goto L72
        L40:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r1, r9, r10, r2)     // Catch: java.lang.Throwable -> L73
            if (r9 == r1) goto L49
            r1.recycle()     // Catch: java.lang.Throwable -> L73
        L49:
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = "http"
            boolean r10 = r10.startsWith(r1)     // Catch: java.lang.Throwable -> L73
            if (r10 == 0) goto L63
            oa1 r10 = r7.f4641a     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = java.net.URLDecoder.decode(r8)     // Catch: java.lang.Throwable -> L73
            r10.put(r8, r9)     // Catch: java.lang.Throwable -> L73
            goto L70
        L63:
            oa1 r10 = r7.f4641a     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = java.net.URLDecoder.decode(r8)     // Catch: java.lang.Throwable -> L73
            r10.put(r8, r9)     // Catch: java.lang.Throwable -> L73
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r7)
        L72:
            return
        L73:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            throw r8     // Catch: java.lang.Throwable -> L76
        L76:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua1.a(ua1, java.io.File, int, int):void");
    }

    public static ua1 b(Context context) {
        ua1 ua1Var = h;
        if (ua1Var == null) {
            synchronized (ua1.class) {
                ua1Var = h;
                if (ua1Var == null) {
                    ua1Var = new ua1(context);
                    h = ua1Var;
                    ua1 ua1Var2 = h;
                    new WeakReference(context);
                    ua1Var2.getClass();
                }
            }
        }
        return ua1Var;
    }

    public final void c(String str, int i, int i2, dz dzVar) {
        if (this.f4641a.get(str) != null) {
            a aVar = dzVar.f1865a;
            aVar.m = true;
            aVar.l = 1.0f;
            aVar.postInvalidate();
            return;
        }
        this.f4642b.put(str, dzVar);
        if (this.d.add(str)) {
            this.c.add(new pa1(this, str, i, i2));
            d(false);
        }
    }

    public final void d(boolean z) {
        if (z) {
            this.g--;
        }
        while (this.g < 4) {
            LinkedList linkedList = this.c;
            if (!linkedList.isEmpty()) {
                ((pa1) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.g++;
            } else {
                return;
            }
        }
    }
}
