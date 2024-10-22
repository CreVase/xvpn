package defpackage;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
public final class p50 implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q50 f3783a;

    public p50(q50 q50Var) {
        this.f3783a = q50Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        q50 q50Var = this.f3783a;
        q50Var.j.r.removeAllViews();
        q50Var.j.r.setVisibility(8);
    }
}
