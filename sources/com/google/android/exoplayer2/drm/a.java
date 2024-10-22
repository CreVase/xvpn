package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import defpackage.ai3;
import defpackage.ao0;
import defpackage.ci1;
import defpackage.cp3;
import defpackage.d5;
import defpackage.dc0;
import defpackage.ht0;
import defpackage.i91;
import defpackage.it0;
import defpackage.ja1;
import defpackage.nw3;
import defpackage.o90;
import defpackage.qn0;
import defpackage.rn0;
import defpackage.sn1;
import defpackage.un0;
import defpackage.vg0;
import defpackage.wg0;
import defpackage.wi3;
import defpackage.x50;
import defpackage.xg0;
import defpackage.xl1;
import defpackage.yn0;
import defpackage.z52;
import defpackage.zg0;
import defpackage.zn0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class a implements rn0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f1461a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1462b;
    public final x50 c;
    public final ja1 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final o90 i;
    public final d5 j;
    public final z52 k;
    public final i91 l;
    public final UUID m;
    public final Looper n;
    public final xg0 o;
    public int p;
    public int q;
    public HandlerThread r;
    public vg0 s;
    public dc0 t;
    public qn0 u;
    public byte[] v;
    public byte[] w;
    public ht0 x;
    public it0 y;

    public a(UUID uuid, e eVar, x50 x50Var, ja1 ja1Var, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap hashMap, i91 i91Var, Looper looper, d5 d5Var, z52 z52Var) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = x50Var;
        this.d = ja1Var;
        this.f1462b = eVar;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.w = bArr;
            this.f1461a = null;
        } else {
            list.getClass();
            this.f1461a = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.l = i91Var;
        this.i = new o90();
        this.j = d5Var;
        this.k = z52Var;
        this.p = 2;
        this.n = looper;
        this.o = new xg0(this, looper);
    }

    @Override // defpackage.rn0
    public final UUID a() {
        o();
        return this.m;
    }

    @Override // defpackage.rn0
    public final boolean b() {
        o();
        return this.f;
    }

    @Override // defpackage.rn0
    public final void c(un0 un0Var) {
        o();
        int i = this.q;
        if (i <= 0) {
            sn1.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = 0;
            xg0 xg0Var = this.o;
            int i3 = wi3.f5017a;
            xg0Var.removeCallbacksAndMessages(null);
            vg0 vg0Var = this.s;
            synchronized (vg0Var) {
                vg0Var.removeCallbacksAndMessages(null);
                vg0Var.f4828a = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f1462b.f(bArr);
                this.v = null;
            }
        }
        if (un0Var != null) {
            this.i.c(un0Var);
            if (this.i.b(un0Var) == 0) {
                un0Var.f();
            }
        }
        ja1 ja1Var = this.d;
        int i4 = this.q;
        if (i4 == 1) {
            b bVar = (b) ja1Var.f2735b;
            if (bVar.o > 0 && bVar.k != -9223372036854775807L) {
                bVar.n.add(this);
                Handler handler = ((b) ja1Var.f2735b).t;
                handler.getClass();
                handler.postAtTime(new nw3(this, 17), this, SystemClock.uptimeMillis() + ((b) ja1Var.f2735b).k);
                ((b) ja1Var.f2735b).i();
            }
        }
        if (i4 == 0) {
            ((b) ja1Var.f2735b).l.remove(this);
            b bVar2 = (b) ja1Var.f2735b;
            if (bVar2.q == this) {
                bVar2.q = null;
            }
            if (bVar2.r == this) {
                bVar2.r = null;
            }
            x50 x50Var = bVar2.h;
            ((Set) x50Var.f5117b).remove(this);
            if (((a) x50Var.c) == this) {
                x50Var.c = null;
                if (!((Set) x50Var.f5117b).isEmpty()) {
                    a aVar = (a) ((Set) x50Var.f5117b).iterator().next();
                    x50Var.c = aVar;
                    it0 b2 = aVar.f1462b.b();
                    aVar.y = b2;
                    vg0 vg0Var2 = aVar.s;
                    int i5 = wi3.f5017a;
                    b2.getClass();
                    vg0Var2.getClass();
                    vg0Var2.obtainMessage(0, new wg0(xl1.f5178a.getAndIncrement(), true, SystemClock.elapsedRealtime(), b2)).sendToTarget();
                }
            }
            b bVar3 = (b) ja1Var.f2735b;
            if (bVar3.k != -9223372036854775807L) {
                Handler handler2 = bVar3.t;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                ((b) ja1Var.f2735b).n.remove(this);
            }
        }
        ((b) ja1Var.f2735b).i();
    }

    @Override // defpackage.rn0
    public final void d(un0 un0Var) {
        int i;
        o();
        boolean z = false;
        if (this.q < 0) {
            sn1.c("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (un0Var != null) {
            o90 o90Var = this.i;
            synchronized (o90Var.f3621a) {
                ArrayList arrayList = new ArrayList(o90Var.d);
                arrayList.add(un0Var);
                o90Var.d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) o90Var.f3622b.get(un0Var);
                if (num == null) {
                    HashSet hashSet = new HashSet(o90Var.c);
                    hashSet.add(un0Var);
                    o90Var.c = Collections.unmodifiableSet(hashSet);
                }
                HashMap hashMap = o90Var.f3622b;
                if (num != null) {
                    i = num.intValue() + 1;
                } else {
                    i = 1;
                }
                hashMap.put(un0Var, Integer.valueOf(i));
            }
        }
        int i2 = this.q + 1;
        this.q = i2;
        if (i2 == 1) {
            if (this.p == 2) {
                z = true;
            }
            cp3.m(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new vg0(this, this.r.getLooper());
            if (l()) {
                h(true);
            }
        } else if (un0Var != null && i() && this.i.b(un0Var) == 1) {
            un0Var.d(this.p);
        }
        ja1 ja1Var = this.d;
        b bVar = (b) ja1Var.f2735b;
        if (bVar.k != -9223372036854775807L) {
            bVar.n.remove(this);
            Handler handler = ((b) ja1Var.f2735b).t;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.rn0
    public final boolean e(String str) {
        o();
        byte[] bArr = this.v;
        cp3.o(bArr);
        return this.f1462b.m(str, bArr);
    }

    @Override // defpackage.rn0
    public final qn0 f() {
        o();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // defpackage.rn0
    public final dc0 g() {
        o();
        return this.t;
    }

    @Override // defpackage.rn0
    public final int getState() {
        o();
        return this.p;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:64|(2:65|66)|(6:68|69|70|71|(1:73)|75)|78|69|70|71|(0)|75) */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0098 A[Catch: NumberFormatException -> 0x009c, TRY_LEAVE, TryCatch #4 {NumberFormatException -> 0x009c, blocks: (B:71:0x0090, B:73:0x0098), top: B:70:0x0090 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(boolean r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.a.h(boolean):void");
    }

    public final boolean i() {
        int i = this.p;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final void j(int i, Exception exc) {
        int i2;
        Set set;
        int i3 = wi3.f5017a;
        if (i3 >= 21 && zn0.a(exc)) {
            i2 = zn0.b(exc);
        } else {
            if (i3 < 23 || !ao0.a(exc)) {
                if (i3 < 18 || !yn0.b(exc)) {
                    if (i3 >= 18 && yn0.a(exc)) {
                        i2 = 6007;
                    } else if (exc instanceof ai3) {
                        i2 = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
                    } else if (exc instanceof zg0) {
                        i2 = AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                    } else if (exc instanceof ci1) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i2 = AdError.ICONVIEW_MISSING_ERROR_CODE;
            }
            i2 = 6006;
        }
        this.u = new qn0(exc, i2);
        sn1.d("DefaultDrmSession", "DRM session error", exc);
        o90 o90Var = this.i;
        synchronized (o90Var.f3621a) {
            set = o90Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((un0) it.next()).e(exc);
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void k(Exception exc, boolean z) {
        int i;
        if (exc instanceof NotProvisionedException) {
            x50 x50Var = this.c;
            ((Set) x50Var.f5117b).add(this);
            if (((a) x50Var.c) == null) {
                x50Var.c = this;
                it0 b2 = this.f1462b.b();
                this.y = b2;
                vg0 vg0Var = this.s;
                int i2 = wi3.f5017a;
                b2.getClass();
                vg0Var.getClass();
                vg0Var.obtainMessage(0, new wg0(xl1.f5178a.getAndIncrement(), true, SystemClock.elapsedRealtime(), b2)).sendToTarget();
                return;
            }
            return;
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        j(i, exc);
    }

    public final boolean l() {
        Set set;
        if (i()) {
            return true;
        }
        try {
            byte[] d = this.f1462b.d();
            this.v = d;
            this.f1462b.l(d, this.k);
            this.t = this.f1462b.c(this.v);
            this.p = 3;
            o90 o90Var = this.i;
            synchronized (o90Var.f3621a) {
                set = o90Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((un0) it.next()).d(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            x50 x50Var = this.c;
            ((Set) x50Var.f5117b).add(this);
            if (((a) x50Var.c) == null) {
                x50Var.c = this;
                it0 b2 = this.f1462b.b();
                this.y = b2;
                vg0 vg0Var = this.s;
                int i = wi3.f5017a;
                b2.getClass();
                vg0Var.getClass();
                vg0Var.obtainMessage(0, new wg0(xl1.f5178a.getAndIncrement(), true, SystemClock.elapsedRealtime(), b2)).sendToTarget();
            }
            return false;
        } catch (Exception e) {
            j(1, e);
            return false;
        }
    }

    public final void m(byte[] bArr, int i, boolean z) {
        try {
            ht0 j = this.f1462b.j(bArr, this.f1461a, i, this.h);
            this.x = j;
            vg0 vg0Var = this.s;
            int i2 = wi3.f5017a;
            j.getClass();
            vg0Var.getClass();
            vg0Var.obtainMessage(1, new wg0(xl1.f5178a.getAndIncrement(), z, SystemClock.elapsedRealtime(), j)).sendToTarget();
        } catch (Exception e) {
            k(e, true);
        }
    }

    public final Map n() {
        o();
        byte[] bArr = this.v;
        if (bArr == null) {
            return null;
        }
        return this.f1462b.a(bArr);
    }

    public final void o() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.n;
        if (currentThread != looper.getThread()) {
            sn1.g("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
