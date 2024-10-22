package defpackage;

/* loaded from: classes2.dex */
public final class ok {

    /* renamed from: a, reason: collision with root package name */
    public String f3679a;

    /* renamed from: b, reason: collision with root package name */
    public String f3680b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public nb0 i;
    public xa0 j;
    public ua0 k;

    public ok() {
    }

    public final pk a() {
        String str;
        if (this.f3679a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f3680b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.c == null) {
            str = p71.l(str, " platform");
        }
        if (this.d == null) {
            str = p71.l(str, " installationUuid");
        }
        if (this.g == null) {
            str = p71.l(str, " buildVersion");
        }
        if (this.h == null) {
            str = p71.l(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new pk(this.f3679a, this.f3680b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public ok(ob0 ob0Var) {
        pk pkVar = (pk) ob0Var;
        this.f3679a = pkVar.f3858b;
        this.f3680b = pkVar.c;
        this.c = Integer.valueOf(pkVar.d);
        this.d = pkVar.e;
        this.e = pkVar.f;
        this.f = pkVar.g;
        this.g = pkVar.h;
        this.h = pkVar.i;
        this.i = pkVar.j;
        this.j = pkVar.k;
        this.k = pkVar.l;
    }
}
