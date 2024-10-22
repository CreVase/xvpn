package com.google.android.exoplayer2.drm;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DrmInitData;
import defpackage.ah0;
import defpackage.ai3;
import defpackage.cp3;
import defpackage.d5;
import defpackage.db1;
import defpackage.df0;
import defpackage.ds0;
import defpackage.et;
import defpackage.f31;
import defpackage.hb1;
import defpackage.hx2;
import defpackage.i91;
import defpackage.ja1;
import defpackage.ji2;
import defpackage.kh3;
import defpackage.lf;
import defpackage.ob1;
import defpackage.qn0;
import defpackage.rn0;
import defpackage.sn1;
import defpackage.un0;
import defpackage.v51;
import defpackage.vw1;
import defpackage.wi3;
import defpackage.wn0;
import defpackage.x50;
import defpackage.xn0;
import defpackage.y01;
import defpackage.yg0;
import defpackage.z52;
import defpackage.zg0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b implements xn0 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f1463a;

    /* renamed from: b, reason: collision with root package name */
    public final df0 f1464b;
    public final i91 c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean g;
    public final x50 h;
    public final d5 i;
    public final ja1 j;
    public final long k;
    public final ArrayList l;
    public final Set m;
    public final Set n;
    public int o;
    public e p;
    public a q;
    public a r;
    public Looper s;
    public Handler t;
    public int u;
    public byte[] v;
    public z52 w;
    public volatile yg0 x;

    public b(UUID uuid, df0 df0Var, i91 i91Var, HashMap hashMap, boolean z, int[] iArr, boolean z2, d5 d5Var, long j) {
        uuid.getClass();
        cp3.f(!et.f1989b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f1463a = uuid;
        this.f1464b = df0Var;
        this.c = i91Var;
        this.d = hashMap;
        this.e = z;
        this.f = iArr;
        this.g = z2;
        this.i = d5Var;
        this.h = new x50((hx2) null);
        this.j = new ja1(this);
        this.u = 0;
        this.l = new ArrayList();
        this.m = Collections.newSetFromMap(new IdentityHashMap());
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.k = j;
    }

    public static boolean d(a aVar) {
        aVar.o();
        if (aVar.p == 1) {
            if (wi3.f5017a < 19) {
                return true;
            }
            qn0 f = aVar.f();
            f.getClass();
            if (f.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList h(DrmInitData drmInitData, UUID uuid, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList(drmInitData.d);
        for (int i = 0; i < drmInitData.d; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.f1457a[i];
            if (!schemeData.a(uuid) && (!et.c.equals(uuid) || !schemeData.a(et.f1989b))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && (schemeData.e != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    public final rn0 a(Looper looper, un0 un0Var, y01 y01Var, boolean z) {
        ArrayList arrayList;
        boolean z2;
        if (this.x == null) {
            this.x = new yg0(this, looper);
        }
        DrmInitData drmInitData = y01Var.o;
        int i = 0;
        a aVar = null;
        if (drmInitData == null) {
            int f = vw1.f(y01Var.l);
            e eVar = this.p;
            eVar.getClass();
            if (eVar.k() == 2 && f31.d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return null;
            }
            int[] iArr = this.f;
            while (true) {
                if (i < iArr.length) {
                    if (iArr[i] == f) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1 || eVar.k() == 1) {
                return null;
            }
            a aVar2 = this.q;
            if (aVar2 == null) {
                db1 db1Var = hb1.f2394b;
                a g = g(ji2.e, true, null, z);
                this.l.add(g);
                this.q = g;
            } else {
                aVar2.d(null);
            }
            return this.q;
        }
        if (this.v == null) {
            arrayList = h(drmInitData, this.f1463a, false);
            if (arrayList.isEmpty()) {
                zg0 zg0Var = new zg0(this.f1463a);
                sn1.d("DefaultDrmSessionMgr", "DRM error", zg0Var);
                if (un0Var != null) {
                    un0Var.e(zg0Var);
                }
                return new ds0(new qn0(zg0Var, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            arrayList = null;
        }
        if (!this.e) {
            aVar = this.r;
        } else {
            Iterator it = this.l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a aVar3 = (a) it.next();
                if (wi3.a(aVar3.f1461a, arrayList)) {
                    aVar = aVar3;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = g(arrayList, false, un0Var, z);
            if (!this.e) {
                this.r = aVar;
            }
            this.l.add(aVar);
        } else {
            aVar.d(un0Var);
        }
        return aVar;
    }

    @Override // defpackage.xn0
    public final rn0 b(un0 un0Var, y01 y01Var) {
        boolean z = false;
        j(false);
        if (this.o > 0) {
            z = true;
        }
        cp3.m(z);
        cp3.o(this.s);
        return a(this.s, un0Var, y01Var, true);
    }

    @Override // defpackage.xn0
    public final wn0 c(un0 un0Var, y01 y01Var) {
        boolean z;
        if (this.o > 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        cp3.o(this.s);
        ah0 ah0Var = new ah0(this, un0Var);
        Handler handler = this.t;
        handler.getClass();
        handler.post(new lf(13, ah0Var, y01Var));
        return ah0Var;
    }

    @Override // defpackage.xn0
    public final void e() {
        e dVar;
        j(true);
        int i = this.o;
        this.o = i + 1;
        if (i != 0) {
            return;
        }
        if (this.p == null) {
            UUID uuid = this.f1463a;
            this.f1464b.getClass();
            try {
                try {
                    dVar = new f(uuid);
                } catch (UnsupportedSchemeException e) {
                    throw new ai3(e);
                } catch (Exception e2) {
                    throw new ai3(e2);
                }
            } catch (ai3 unused) {
                sn1.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                dVar = new d();
            }
            this.p = dVar;
            dVar.h(new v51(this));
            return;
        }
        if (this.k != -9223372036854775807L) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.l;
                if (i2 < arrayList.size()) {
                    ((a) arrayList.get(i2)).d(null);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final a f(List list, boolean z, un0 un0Var) {
        this.p.getClass();
        boolean z2 = this.g | z;
        UUID uuid = this.f1463a;
        e eVar = this.p;
        x50 x50Var = this.h;
        ja1 ja1Var = this.j;
        int i = this.u;
        byte[] bArr = this.v;
        HashMap hashMap = this.d;
        i91 i91Var = this.c;
        Looper looper = this.s;
        looper.getClass();
        d5 d5Var = this.i;
        z52 z52Var = this.w;
        z52Var.getClass();
        a aVar = new a(uuid, eVar, x50Var, ja1Var, list, i, z2, z, bArr, hashMap, i91Var, looper, d5Var, z52Var);
        aVar.d(un0Var);
        if (this.k != -9223372036854775807L) {
            aVar.d(null);
        }
        return aVar;
    }

    public final a g(List list, boolean z, un0 un0Var, boolean z2) {
        a f = f(list, z, un0Var);
        boolean d = d(f);
        long j = this.k;
        Set set = this.n;
        if (d && !set.isEmpty()) {
            kh3 it = ob1.l(set).iterator();
            while (it.hasNext()) {
                ((rn0) it.next()).c(null);
            }
            f.c(un0Var);
            if (j != -9223372036854775807L) {
                f.c(null);
            }
            f = f(list, z, un0Var);
        }
        if (d(f) && z2) {
            Set set2 = this.m;
            if (!set2.isEmpty()) {
                kh3 it2 = ob1.l(set2).iterator();
                while (it2.hasNext()) {
                    ((ah0) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    kh3 it3 = ob1.l(set).iterator();
                    while (it3.hasNext()) {
                        ((rn0) it3.next()).c(null);
                    }
                }
                f.c(un0Var);
                if (j != -9223372036854775807L) {
                    f.c(null);
                }
                return f(list, z, un0Var);
            }
            return f;
        }
        return f;
    }

    public final void i() {
        if (this.p != null && this.o == 0 && this.l.isEmpty() && this.m.isEmpty()) {
            e eVar = this.p;
            eVar.getClass();
            eVar.release();
            this.p = null;
        }
    }

    public final void j(boolean z) {
        if (z && this.s == null) {
            sn1.g("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.s;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            sn1.g("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.s.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.xn0
    public final void k(Looper looper, z52 z52Var) {
        boolean z;
        synchronized (this) {
            Looper looper2 = this.s;
            if (looper2 == null) {
                this.s = looper;
                this.t = new Handler(looper);
            } else {
                if (looper2 == looper) {
                    z = true;
                } else {
                    z = false;
                }
                cp3.m(z);
                this.t.getClass();
            }
        }
        this.w = z52Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(defpackage.y01 r7) {
        /*
            r6 = this;
            r0 = 0
            r6.j(r0)
            com.google.android.exoplayer2.drm.e r1 = r6.p
            r1.getClass()
            int r1 = r1.k()
            com.google.android.exoplayer2.drm.DrmInitData r2 = r7.o
            if (r2 != 0) goto L2b
            java.lang.String r7 = r7.l
            int r7 = defpackage.vw1.f(r7)
            r2 = 0
        L18:
            int[] r3 = r6.f
            int r4 = r3.length
            r5 = -1
            if (r2 >= r4) goto L26
            r3 = r3[r2]
            if (r3 != r7) goto L23
            goto L27
        L23:
            int r2 = r2 + 1
            goto L18
        L26:
            r2 = -1
        L27:
            if (r2 == r5) goto L2a
            r0 = r1
        L2a:
            return r0
        L2b:
            byte[] r7 = r6.v
            r3 = 1
            if (r7 == 0) goto L31
            goto L80
        L31:
            java.util.UUID r7 = r6.f1463a
            java.util.ArrayList r4 = h(r2, r7, r3)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L53
            int r4 = r2.d
            if (r4 != r3) goto L81
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r4 = r2.f1457a
            r4 = r4[r0]
            java.util.UUID r5 = defpackage.et.f1989b
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L81
            java.util.Objects.toString(r7)
            defpackage.sn1.f()
        L53:
            java.lang.String r7 = r2.c
            if (r7 == 0) goto L80
            java.lang.String r2 = "cenc"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L60
            goto L80
        L60:
            java.lang.String r2 = "cbcs"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L6f
            int r7 = defpackage.wi3.f5017a
            r2 = 25
            if (r7 < r2) goto L81
            goto L80
        L6f:
            java.lang.String r2 = "cbc1"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L81
            java.lang.String r2 = "cens"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L80
            goto L81
        L80:
            r0 = 1
        L81:
            if (r0 == 0) goto L84
            goto L85
        L84:
            r1 = 1
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.b.l(y01):int");
    }

    @Override // defpackage.xn0
    public final void release() {
        j(true);
        int i = this.o - 1;
        this.o = i;
        if (i != 0) {
            return;
        }
        if (this.k != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.l);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((a) arrayList.get(i2)).c(null);
            }
        }
        kh3 it = ob1.l(this.m).iterator();
        while (it.hasNext()) {
            ((ah0) it.next()).release();
        }
        i();
    }
}
