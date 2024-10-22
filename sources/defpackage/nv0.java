package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nv0 extends qb3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3551b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nv0(int i, Object obj, Object obj2) {
        this.f3550a = i;
        this.c = obj;
        this.f3551b = obj2;
    }

    @Override // defpackage.ob3
    public final void b(pb3 pb3Var) {
        int i = this.f3550a;
        Object obj = this.f3551b;
        switch (i) {
            case 0:
                dn3 dn3Var = an3.f118a;
                dn3Var.t((View) obj, 1.0f);
                dn3Var.getClass();
                pb3Var.v(this);
                return;
            case 1:
                ((ArrayList) ((kg) obj).getOrDefault(((rb3) this.c).f4128b, null)).remove(pb3Var);
                pb3Var.v(this);
                return;
            default:
                ((pb3) obj).y();
                pb3Var.v(this);
                return;
        }
    }
}
