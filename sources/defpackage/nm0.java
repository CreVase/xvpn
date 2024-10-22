package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.offline.DownloadRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class nm0 extends Handler {
    public static final /* synthetic */ int m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HandlerThread f3485a;

    /* renamed from: b, reason: collision with root package name */
    public final ht3 f3486b;
    public final ym0 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    public nm0(HandlerThread handlerThread, tg0 tg0Var, ug0 ug0Var, Handler handler, int i, boolean z) {
        super(handlerThread.getLooper());
        this.f3485a = handlerThread;
        this.f3486b = tg0Var;
        this.c = ug0Var;
        this.d = handler;
        this.i = i;
        this.j = 5;
        this.h = z;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public static jm0 a(jm0 jm0Var, int i, int i2) {
        return new jm0(jm0Var.f2790a, i, jm0Var.c, System.currentTimeMillis(), jm0Var.e, i2, 0, jm0Var.h);
    }

    public final jm0 b(String str, boolean z) {
        int c = c(str);
        if (c != -1) {
            return (jm0) this.e.get(c);
        }
        if (z) {
            try {
                return ((tg0) this.f3486b).d(str);
            } catch (IOException e) {
                sn1.d("DownloadManager", "Failed to load download: " + str, e);
                return null;
            }
        }
        return null;
    }

    public final int c(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                if (((jm0) arrayList.get(i)).f2790a.f1509a.equals(str)) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final void d(jm0 jm0Var) {
        boolean z;
        int i = jm0Var.f2791b;
        boolean z2 = true;
        if (i != 3 && i != 4) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        int c = c(jm0Var.f2790a.f1509a);
        ArrayList arrayList = this.e;
        if (c == -1) {
            arrayList.add(jm0Var);
            Collections.sort(arrayList, new xz0(2));
        } else {
            if (jm0Var.c == ((jm0) arrayList.get(c)).c) {
                z2 = false;
            }
            arrayList.set(c, jm0Var);
            if (z2) {
                Collections.sort(arrayList, new xz0(3));
            }
        }
        try {
            ((tg0) this.f3486b).j(jm0Var);
        } catch (IOException e) {
            sn1.d("DownloadManager", "Failed to update index.", e);
        }
        this.d.obtainMessage(2, new mm0(jm0Var, false, new ArrayList(arrayList), null)).sendToTarget();
    }

    public final jm0 e(jm0 jm0Var, int i, int i2) {
        boolean z;
        if (i != 3 && i != 4) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        jm0 a2 = a(jm0Var, i, i2);
        d(a2);
        return a2;
    }

    public final void f(jm0 jm0Var, int i) {
        if (i == 0) {
            if (jm0Var.f2791b == 1) {
                e(jm0Var, 0, 0);
            }
        } else if (i != jm0Var.f) {
            int i2 = jm0Var.f2791b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            d(new jm0(jm0Var.f2790a, i2, jm0Var.c, System.currentTimeMillis(), jm0Var.e, i, 0, jm0Var.h));
        }
    }

    public final void g() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                jm0 jm0Var = (jm0) arrayList.get(i);
                HashMap hashMap = this.f;
                pm0 pm0Var = (pm0) hashMap.get(jm0Var.f2790a.f1509a);
                boolean z = true;
                ym0 ym0Var = this.c;
                int i3 = jm0Var.f2791b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 5 && i3 != 7) {
                                throw new IllegalStateException();
                            }
                            if (pm0Var != null) {
                                if (!pm0Var.d) {
                                    pm0Var.a(false);
                                }
                            } else if (!this.l) {
                                DownloadRequest downloadRequest = jm0Var.f2790a;
                                pm0 pm0Var2 = new pm0(jm0Var.f2790a, ((ug0) ym0Var).a(downloadRequest), jm0Var.h, true, this.j, this);
                                hashMap.put(downloadRequest.f1509a, pm0Var2);
                                this.l = true;
                                pm0Var2.start();
                            }
                        } else {
                            pm0Var.getClass();
                            cp3.m(!pm0Var.d);
                            if (this.h || this.g != 0) {
                                z = false;
                            }
                            if (!z || i2 >= this.i) {
                                e(jm0Var, 0, 0);
                                pm0Var.a(false);
                            }
                        }
                    } else if (pm0Var != null) {
                        cp3.m(!pm0Var.d);
                        pm0Var.a(false);
                    }
                } else if (pm0Var != null) {
                    cp3.m(!pm0Var.d);
                    pm0Var.a(false);
                } else {
                    if (this.h || this.g != 0) {
                        z = false;
                    }
                    if (z && this.k < this.i) {
                        jm0 e = e(jm0Var, 2, 0);
                        DownloadRequest downloadRequest2 = e.f2790a;
                        pm0 pm0Var3 = new pm0(e.f2790a, ((ug0) ym0Var).a(downloadRequest2), e.h, false, this.j, this);
                        hashMap.put(downloadRequest2.f1509a, pm0Var3);
                        int i4 = this.k;
                        this.k = i4 + 1;
                        if (i4 == 0) {
                            sendEmptyMessageDelayed(11, 5000L);
                        }
                        pm0Var3.start();
                        pm0Var = pm0Var3;
                    } else {
                        pm0Var = null;
                    }
                }
                if (pm0Var != null && !pm0Var.d) {
                    i2++;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0317  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r35) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm0.handleMessage(android.os.Message):void");
    }
}
