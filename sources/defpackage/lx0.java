package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class lx0 implements fb2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3202b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lx0(int i, Object obj, Object obj2) {
        this.f3201a = i;
        this.f3202b = obj;
        this.c = obj2;
    }

    @Override // defpackage.fb2
    public final Object get() {
        int i = this.f3201a;
        Object obj = this.c;
        Object obj2 = this.f3202b;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj2;
                String c = px0Var.c();
                return new od0((Context) obj, c);
            case 1:
                b40 b40Var = (b40) obj2;
                h30 h30Var = (h30) obj;
                b40Var.getClass();
                return h30Var.f.h(new aa3(h30Var, b40Var));
            default:
                return new v71((Context) obj, (String) obj2);
        }
    }

    public /* synthetic */ lx0(Context context, String str) {
        this.f3201a = 2;
        this.c = context;
        this.f3202b = str;
    }
}
