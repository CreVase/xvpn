package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class q20 extends e1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3951a;

    /* renamed from: b, reason: collision with root package name */
    public int f3952b;
    public final /* synthetic */ s20 c;

    public q20(s20 s20Var, int i) {
        this.c = s20Var;
        Object obj = s20.j;
        this.f3951a = s20Var.d(i);
        this.f3952b = i;
    }

    public final void a() {
        int i = this.f3952b;
        Object obj = this.f3951a;
        s20 s20Var = this.c;
        if (i == -1 || i >= s20Var.size() || !zf3.p(obj, s20Var.d(this.f3952b))) {
            Object obj2 = s20.j;
            this.f3952b = s20Var.c(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3951a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        s20 s20Var = this.c;
        Map a2 = s20Var.a();
        if (a2 != null) {
            return a2.get(this.f3951a);
        }
        a();
        int i = this.f3952b;
        if (i == -1) {
            return null;
        }
        return s20Var.l(i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        s20 s20Var = this.c;
        Map a2 = s20Var.a();
        Object obj2 = this.f3951a;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i = this.f3952b;
        if (i == -1) {
            s20Var.put(obj2, obj);
            return null;
        }
        Object l = s20Var.l(i);
        s20Var.j()[this.f3952b] = obj;
        return l;
    }
}
