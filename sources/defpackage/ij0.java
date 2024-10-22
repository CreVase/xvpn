package defpackage;

import android.media.Spatializer;

/* loaded from: classes.dex */
public final class ij0 implements Spatializer.OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nj0 f2607a;

    public ij0(nj0 nj0Var) {
        this.f2607a = nj0Var;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        nj0 nj0Var = this.f2607a;
        t32 t32Var = nj0.i;
        nj0Var.g();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        nj0 nj0Var = this.f2607a;
        t32 t32Var = nj0.i;
        nj0Var.g();
    }
}
