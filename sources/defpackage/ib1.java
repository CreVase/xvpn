package defpackage;

/* loaded from: classes2.dex */
public final class ib1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2560a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2561b;
    public final Object c;

    public ib1(Object obj, Object obj2, Object obj3) {
        this.f2560a = obj;
        this.f2561b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f2560a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f2561b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
