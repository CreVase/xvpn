package defpackage;

import android.view.View;
import androidx.fragment.app.f;

/* loaded from: classes.dex */
public final class gl0 extends p11 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p11 f2272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2273b;

    public gl0(f fVar, p11 p11Var) {
        this.f2273b = fVar;
        this.f2272a = p11Var;
    }

    @Override // defpackage.p11
    public final View b(int i) {
        p11 p11Var = this.f2272a;
        if (p11Var.c()) {
            return p11Var.b(i);
        }
        return this.f2273b.onFindViewById(i);
    }

    @Override // defpackage.p11
    public final boolean c() {
        if (!this.f2272a.c() && !this.f2273b.onHasView()) {
            return false;
        }
        return true;
    }
}
