package defpackage;

import androidx.activity.result.a;
import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i11 extends k11 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u41 f2515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2516b;
    public final /* synthetic */ x6 c;
    public final /* synthetic */ w6 d;
    public final /* synthetic */ Fragment e;

    public i11(Fragment fragment, u41 u41Var, AtomicReference atomicReference, x6 x6Var, w6 w6Var) {
        this.e = fragment;
        this.f2515a = u41Var;
        this.f2516b = atomicReference;
        this.c = x6Var;
        this.d = w6Var;
    }

    @Override // defpackage.k11
    public final void a() {
        Fragment fragment = this.e;
        this.f2516b.set(((a) this.f2515a.apply(null)).d(fragment.generateActivityResultKey(), fragment, this.c, this.d));
    }
}
