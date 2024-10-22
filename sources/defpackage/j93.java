package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class j93 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2729a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2730b;
    public boolean c;
    public Object d;
    public Object e;

    public j93(int i) {
        this.f2729a = i;
        if (i != 1) {
            return;
        }
        this.d = new SparseIntArray();
        this.e = new SparseIntArray();
        this.f2730b = false;
        this.c = false;
    }

    public final int a(int i, int i2) {
        if (!this.c) {
            return c(i, i2);
        }
        int i3 = ((SparseIntArray) this.e).get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int c = c(i, i2);
        ((SparseIntArray) this.e).put(i, c);
        return c;
    }

    public final int b(int i, int i2) {
        if (!this.f2730b) {
            return i % i2;
        }
        int i3 = ((SparseIntArray) this.d).get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int i4 = i % i2;
        ((SparseIntArray) this.d).put(i, i4);
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L48
            java.lang.Object r0 = r8.e
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = 0
        L11:
            if (r5 > r3) goto L22
            int r6 = r5 + r3
            int r6 = r6 >>> r2
            int r7 = r0.keyAt(r6)
            if (r7 >= r9) goto L1f
            int r5 = r6 + 1
            goto L11
        L1f:
            int r3 = r6 + (-1)
            goto L11
        L22:
            int r5 = r5 + r4
            if (r5 < 0) goto L30
            int r3 = r0.size()
            if (r5 >= r3) goto L30
            int r0 = r0.keyAt(r5)
            goto L31
        L30:
            r0 = -1
        L31:
            if (r0 == r4) goto L48
            java.lang.Object r3 = r8.e
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r0 = r8.b(r0, r10)
            int r0 = r0 + r2
            if (r0 != r10) goto L4b
            int r3 = r3 + 1
            r0 = 0
            goto L4b
        L48:
            r0 = 0
            r3 = 0
            r4 = 0
        L4b:
            if (r4 >= r9) goto L5d
            int r0 = r0 + 1
            if (r0 != r10) goto L55
            int r3 = r3 + 1
            r0 = 0
            goto L5a
        L55:
            if (r0 <= r10) goto L5a
            int r3 = r3 + 1
            r0 = 1
        L5a:
            int r4 = r4 + 1
            goto L4b
        L5d:
            int r0 = r0 + r2
            if (r0 <= r10) goto L62
            int r3 = r3 + 1
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j93.c(int, int):int");
    }

    public final void d() {
        ((SparseIntArray) this.d).clear();
    }

    public final void e() {
        switch (this.f2729a) {
            case 2:
                this.f2730b = false;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.e;
                if (wakeLock != null) {
                    wakeLock.release();
                    return;
                }
                return;
            default:
                this.f2730b = false;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.e;
                if (wifiLock != null) {
                    wifiLock.release();
                    return;
                }
                return;
        }
    }

    public final void f(boolean z) {
        switch (this.f2729a) {
            case 2:
                this.c = z;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.e;
                if (wakeLock != null) {
                    if (this.f2730b && z) {
                        wakeLock.acquire();
                        return;
                    } else {
                        wakeLock.release();
                        return;
                    }
                }
                return;
            default:
                this.c = z;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.e;
                if (wifiLock != null) {
                    if (this.f2730b && z) {
                        wifiLock.acquire();
                        return;
                    } else {
                        wifiLock.release();
                        return;
                    }
                }
                return;
        }
    }

    public j93(Context context, int i) {
        this.f2729a = i;
        if (i != 3) {
            this.d = (PowerManager) context.getApplicationContext().getSystemService("power");
        } else {
            this.d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        }
    }
}
