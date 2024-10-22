package defpackage;

/* loaded from: classes.dex */
public final class em {

    /* renamed from: a, reason: collision with root package name */
    public Object f1958a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1959b;
    public Object c;
    public Object d;
    public Object e;

    public em(al alVar) {
        this.f1958a = Long.valueOf(alVar.f104a);
        this.f1959b = alVar.f105b;
        this.c = alVar.c;
        this.d = alVar.d;
        this.e = alVar.e;
    }

    public final al a() {
        String str;
        if (((Long) this.f1958a) == null) {
            str = " timestamp";
        } else {
            str = "";
        }
        if (((String) this.f1959b) == null) {
            str = str.concat(" type");
        }
        if (((hb0) this.c) == null) {
            str = p71.l(str, " app");
        }
        if (((ib0) this.d) == null) {
            str = p71.l(str, " device");
        }
        if (str.isEmpty()) {
            return new al(((Long) this.f1958a).longValue(), (String) this.f1959b, (hb0) this.c, (ib0) this.d, (jb0) this.e);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final el b() {
        String str;
        if (((String) this.f1959b) == null) {
            str = " type";
        } else {
            str = "";
        }
        if (((gb1) this.c) == null) {
            str = str.concat(" frames");
        }
        if (((Integer) this.e) == null) {
            str = p71.l(str, " overflowCount");
        }
        if (str.isEmpty()) {
            return new el((String) this.f1959b, (String) this.f1958a, (gb1) this.c, (cb0) this.d, ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final il c() {
        String str;
        if (((Long) this.f1958a) == null) {
            str = " pc";
        } else {
            str = "";
        }
        if (((String) this.f1959b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = p71.l(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = p71.l(str, " importance");
        }
        if (str.isEmpty()) {
            return new il(((Long) this.f1958a).longValue(), (String) this.f1959b, (String) this.c, ((Long) this.d).longValue(), ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
