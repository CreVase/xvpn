package defpackage;

import android.view.View;
import androidx.appcompat.widget.b;

/* loaded from: classes.dex */
public final class z4 extends a11 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ View l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4(View view, View view2, Object obj, int i) {
        super(view2);
        this.j = i;
        this.l = view;
        this.k = obj;
    }

    @Override // defpackage.a11
    public final gt2 b() {
        switch (this.j) {
            case 0:
                w4 w4Var = ((a5) this.l).d.s;
                if (w4Var == null) {
                    return null;
                }
                return w4Var.a();
            default:
                return (he) this.k;
        }
    }

    @Override // defpackage.a11
    public final boolean c() {
        int i = this.j;
        View view = this.l;
        switch (i) {
            case 0:
                ((a5) view).d.l();
                return true;
            default:
                b bVar = (b) view;
                if (!bVar.getInternalPopup().b()) {
                    bVar.f.n(ce.b(bVar), ce.a(bVar));
                }
                return true;
        }
    }

    @Override // defpackage.a11
    public final boolean d() {
        switch (this.j) {
            case 0:
                b5 b5Var = ((a5) this.l).d;
                if (b5Var.u != null) {
                    return false;
                }
                b5Var.i();
                return true;
            default:
                super.d();
                return true;
        }
    }
}
