package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class kt0 implements g33 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3007b;

    public /* synthetic */ kt0(Object obj, int i) {
        this.f3006a = i;
        this.f3007b = obj;
    }

    @Override // defpackage.g33
    public final Object get() {
        int i = this.f3006a;
        Object obj = this.f3007b;
        switch (i) {
            case 0:
                return (qt1) obj;
            case 1:
                return (wl1) obj;
            case 2:
                return Boolean.valueOf(((hu0) obj).z);
            default:
                try {
                    return (qt1) ((Class) obj).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
