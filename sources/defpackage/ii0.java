package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ii0 implements qt1 {

    /* renamed from: a, reason: collision with root package name */
    public final aa3 f2600a;

    /* renamed from: b, reason: collision with root package name */
    public final yd0 f2601b;
    public d5 c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;

    public ii0(yd0 yd0Var, kh0 kh0Var) {
        this.f2601b = yd0Var;
        aa3 aa3Var = new aa3(kh0Var);
        this.f2600a = aa3Var;
        if (yd0Var != ((yd0) aa3Var.e)) {
            aa3Var.e = yd0Var;
            ((Map) aa3Var.f45b).clear();
            ((Map) aa3Var.d).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
    }

    public static qt1 d(Class cls, yd0 yd0Var) {
        try {
            return (qt1) cls.getConstructor(yd0.class).newInstance(yd0Var);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.qt1
    public final qt1 a(d5 d5Var) {
        if (d5Var != null) {
            this.c = d5Var;
            aa3 aa3Var = this.f2600a;
            aa3Var.g = d5Var;
            Iterator it = ((Map) aa3Var.d).values().iterator();
            while (it.hasNext()) {
                ((qt1) it.next()).a(d5Var);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // defpackage.qt1
    public final qt1 b(bh0 bh0Var) {
        if (bh0Var != null) {
            aa3 aa3Var = this.f2600a;
            aa3Var.f = bh0Var;
            Iterator it = ((Map) aa3Var.d).values().iterator();
            while (it.hasNext()) {
                ((qt1) it.next()).b(bh0Var);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // defpackage.qt1
    public final fo c(dt1 dt1Var) {
        long j;
        float f;
        float f2;
        long j2;
        long j3;
        d5 d5Var;
        dt1 dt1Var2 = dt1Var;
        dt1Var2.f1834b.getClass();
        zs1 zs1Var = dt1Var2.f1834b;
        String scheme = zs1Var.f5381a.getScheme();
        qt1 qt1Var = null;
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int y = wi3.y(zs1Var.f5381a, zs1Var.f5382b);
        aa3 aa3Var = this.f2600a;
        qt1 qt1Var2 = (qt1) ((Map) aa3Var.d).get(Integer.valueOf(y));
        if (qt1Var2 != null) {
            qt1Var = qt1Var2;
        } else {
            g33 i = aa3Var.i(y);
            if (i != null) {
                qt1Var = (qt1) i.get();
                bh0 bh0Var = (bh0) aa3Var.f;
                if (bh0Var != null) {
                    qt1Var.b(bh0Var);
                }
                d5 d5Var2 = (d5) aa3Var.g;
                if (d5Var2 != null) {
                    qt1Var.a(d5Var2);
                }
                ((Map) aa3Var.d).put(Integer.valueOf(y), qt1Var);
            }
        }
        cp3.p(qt1Var, "No suitable media source factory found for content type: " + y);
        xs1 xs1Var = dt1Var2.c;
        xs1Var.getClass();
        if (xs1Var.f5210a == -9223372036854775807L) {
            j = this.d;
        } else {
            j = xs1Var.f5210a;
        }
        long j4 = j;
        if (xs1Var.d == -3.4028235E38f) {
            f = this.g;
        } else {
            f = xs1Var.d;
        }
        float f3 = f;
        if (xs1Var.e == -3.4028235E38f) {
            f2 = this.h;
        } else {
            f2 = xs1Var.e;
        }
        float f4 = f2;
        if (xs1Var.f5211b == -9223372036854775807L) {
            j2 = this.e;
        } else {
            j2 = xs1Var.f5211b;
        }
        long j5 = j2;
        if (xs1Var.c == -9223372036854775807L) {
            j3 = this.f;
        } else {
            j3 = xs1Var.c;
        }
        xs1 xs1Var2 = new xs1(j4, j5, j3, f3, f4);
        if (!xs1Var2.equals(xs1Var)) {
            qs1 qs1Var = new qs1(dt1Var2);
            qs1Var.k = new ws1(xs1Var2);
            dt1Var2 = qs1Var.a();
        }
        fo c = qt1Var.c(dt1Var2);
        hb1 hb1Var = dt1Var2.f1834b.f;
        if (!hb1Var.isEmpty()) {
            fo[] foVarArr = new fo[hb1Var.size() + 1];
            int i2 = 0;
            foVarArr[0] = c;
            while (i2 < hb1Var.size()) {
                yd0 yd0Var = this.f2601b;
                yd0Var.getClass();
                d5 d5Var3 = new d5();
                d5 d5Var4 = this.c;
                if (d5Var4 != null) {
                    d5Var = d5Var4;
                } else {
                    d5Var = d5Var3;
                }
                int i3 = i2 + 1;
                foVarArr[i3] = new cw2(null, (bt1) hb1Var.get(i2), yd0Var, d5Var, true, null);
                i2 = i3;
            }
            c = new sv1(foVarArr);
        }
        fo foVar = c;
        ts1 ts1Var = dt1Var2.e;
        long j6 = ts1Var.f4406a;
        long j7 = ts1Var.f4407b;
        if (j6 != 0 || j7 != Long.MIN_VALUE || ts1Var.d) {
            foVar = new e10(foVar, wi3.C(j6), wi3.C(j7), !ts1Var.e, ts1Var.c, ts1Var.d);
        }
        dt1Var2.f1834b.getClass();
        return foVar;
    }
}
