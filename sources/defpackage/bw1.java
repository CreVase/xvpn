package defpackage;

/* loaded from: classes.dex */
public final class bw1 implements mn2 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f539a;

    /* renamed from: b, reason: collision with root package name */
    public final ih3 f540b;
    public final av0 c;

    public bw1(ih3 ih3Var, av0 av0Var, i1 i1Var) {
        this.f540b = ih3Var;
        av0Var.getClass();
        this.c = av0Var;
        this.f539a = i1Var;
    }

    @Override // defpackage.mn2
    public final void a(Object obj, tg2 tg2Var, yu0 yu0Var) {
        this.f540b.getClass();
        m51 m51Var = (m51) obj;
        if (m51Var.unknownFields == hh3.f) {
            m51Var.unknownFields = hh3.b();
        }
        this.c.getClass();
        p71.C(obj);
        throw null;
    }

    @Override // defpackage.mn2
    public final void b(Object obj, v51 v51Var) {
        this.c.getClass();
        p71.C(obj);
        throw null;
    }

    @Override // defpackage.mn2
    public final boolean equals(Object obj, Object obj2) {
        ih3 ih3Var = this.f540b;
        ih3Var.getClass();
        hh3 hh3Var = ((m51) obj).unknownFields;
        ih3Var.getClass();
        if (!hh3Var.equals(((m51) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.mn2
    public final int getSerializedSize(Object obj) {
        this.f540b.getClass();
        hh3 hh3Var = ((m51) obj).unknownFields;
        int i = hh3Var.d;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < hh3Var.f2424a; i2++) {
                int i3 = hh3Var.f2425b[i2] >>> 3;
                vs vsVar = (vs) hh3Var.c[i2];
                i += v10.Z(3, vsVar) + v10.q0(2, i3) + (v10.p0(1) * 2);
            }
            hh3Var.d = i;
        }
        return i + 0;
    }

    @Override // defpackage.mn2
    public final int hashCode(Object obj) {
        this.f540b.getClass();
        return ((m51) obj).unknownFields.hashCode();
    }

    @Override // defpackage.mn2
    public final boolean isInitialized(Object obj) {
        this.c.getClass();
        p71.C(obj);
        throw null;
    }

    @Override // defpackage.mn2
    public final void makeImmutable(Object obj) {
        this.f540b.getClass();
        ((m51) obj).unknownFields.e = false;
        this.c.getClass();
        p71.C(obj);
        throw null;
    }

    @Override // defpackage.mn2
    public final void mergeFrom(Object obj, Object obj2) {
        sn2.B(this.f540b, obj, obj2);
    }

    @Override // defpackage.mn2
    public final Object newInstance() {
        return ((g51) ((m51) this.f539a).d(l51.NEW_BUILDER)).b();
    }
}
