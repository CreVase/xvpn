package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c01 implements y70 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f562b;

    public /* synthetic */ c01(Object obj, int i) {
        this.f561a = i;
        this.f562b = obj;
    }

    public final void a(d01 d01Var) {
        switch (this.f561a) {
            case 0:
                if (d01Var == null) {
                    d01Var = new d01(-3);
                }
                ((x50) this.f562b).y(d01Var);
                return;
            default:
                synchronized (e01.c) {
                    uu2 uu2Var = e01.d;
                    ArrayList arrayList = (ArrayList) uu2Var.getOrDefault((String) this.f562b, null);
                    if (arrayList != null) {
                        uu2Var.remove((String) this.f562b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((y70) arrayList.get(i)).accept(d01Var);
                        }
                        return;
                    }
                    return;
                }
        }
    }

    @Override // defpackage.y70
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f561a) {
            case 0:
                a((d01) obj);
                return;
            default:
                a((d01) obj);
                return;
        }
    }
}
