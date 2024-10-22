package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class iy3 implements yw3 {

    /* renamed from: a, reason: collision with root package name */
    public final s4 f2676a;

    public iy3(s4 s4Var) {
        this.f2676a = s4Var;
    }

    @Override // defpackage.yw3
    public final Object zza() {
        Context context = this.f2676a.f4268a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
