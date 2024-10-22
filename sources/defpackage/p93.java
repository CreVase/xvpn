package defpackage;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h;

/* loaded from: classes.dex */
public final /* synthetic */ class p93 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3804b;

    public /* synthetic */ p93(Toolbar toolbar, int i) {
        this.f3803a = i;
        this.f3804b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        su1 su1Var;
        int i = this.f3803a;
        Toolbar toolbar = this.f3804b;
        switch (i) {
            case 0:
                toolbar.l();
                return;
            default:
                h hVar = toolbar.M;
                if (hVar == null) {
                    su1Var = null;
                } else {
                    su1Var = hVar.f180b;
                }
                if (su1Var != null) {
                    su1Var.collapseActionView();
                    return;
                }
                return;
        }
    }
}
