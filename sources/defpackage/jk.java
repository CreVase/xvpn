package defpackage;

/* loaded from: classes.dex */
public final class jk {

    /* renamed from: a, reason: collision with root package name */
    public Object f2774a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2775b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public jk(int i) {
        if (i != 1) {
            return;
        }
        this.f2774a = new ql2();
        this.f2775b = new ql2();
        this.c = new ql2();
        this.d = new ql2();
        this.e = new s(0.0f);
        this.f = new s(0.0f);
        this.g = new s(0.0f);
        this.h = new s(0.0f);
        this.i = zf3.n();
        this.j = zf3.n();
        this.k = zf3.n();
        this.l = zf3.n();
    }

    public static void c(tf3 tf3Var) {
        if (tf3Var instanceof ql2) {
            ((ql2) tf3Var).getClass();
        } else if (tf3Var instanceof bd0) {
            ((bd0) tf3Var).getClass();
        }
    }

    public final wk a() {
        String str;
        if (((String) this.f2775b) == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (((String) this.c) == null) {
            str = str.concat(" identifier");
        }
        if (((Long) this.e) == null) {
            str = p71.l(str, " startedAt");
        }
        if (((Boolean) this.g) == null) {
            str = p71.l(str, " crashed");
        }
        if (((za0) this.h) == null) {
            str = p71.l(str, " app");
        }
        if (((Integer) this.f2774a) == null) {
            str = p71.l(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new wk((String) this.f2775b, (String) this.c, (String) this.d, ((Long) this.e).longValue(), (Long) this.f, ((Boolean) this.g).booleanValue(), (za0) this.h, (mb0) this.i, (lb0) this.j, (ab0) this.k, (gb1) this.l, ((Integer) this.f2774a).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final fs2 b() {
        return new fs2(this);
    }

    public jk(nb0 nb0Var) {
        wk wkVar = (wk) nb0Var;
        this.f2775b = wkVar.f5025a;
        this.c = wkVar.f5026b;
        this.d = wkVar.c;
        this.e = Long.valueOf(wkVar.d);
        this.f = wkVar.e;
        this.g = Boolean.valueOf(wkVar.f);
        this.h = wkVar.g;
        this.i = wkVar.h;
        this.j = wkVar.i;
        this.k = wkVar.j;
        this.l = wkVar.k;
        this.f2774a = Integer.valueOf(wkVar.l);
    }

    public jk(fs2 fs2Var) {
        this.f2774a = new ql2();
        this.f2775b = new ql2();
        this.c = new ql2();
        this.d = new ql2();
        this.e = new s(0.0f);
        this.f = new s(0.0f);
        this.g = new s(0.0f);
        this.h = new s(0.0f);
        this.i = zf3.n();
        this.j = zf3.n();
        this.k = zf3.n();
        this.l = zf3.n();
        this.f2774a = fs2Var.f2143a;
        this.f2775b = fs2Var.f2144b;
        this.c = fs2Var.c;
        this.d = fs2Var.d;
        this.e = fs2Var.e;
        this.f = fs2Var.f;
        this.g = fs2Var.g;
        this.h = fs2Var.h;
        this.i = fs2Var.i;
        this.j = fs2Var.j;
        this.k = fs2Var.k;
        this.l = fs2Var.l;
    }
}
