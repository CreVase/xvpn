package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class jx3 implements yw3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2851a;

    /* renamed from: b, reason: collision with root package name */
    public final yw3 f2852b;

    public /* synthetic */ jx3(yw3 yw3Var, int i) {
        this.f2851a = i;
        this.f2852b = yw3Var;
    }

    @Override // defpackage.yw3
    public final Object zza() {
        int i = this.f2851a;
        yw3 yw3Var = this.f2852b;
        switch (i) {
            case 0:
                Context context = ((iy3) yw3Var).f2676a.f4268a;
                if (context != null) {
                    return new ix3(context);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                Context context2 = ((iy3) yw3Var).f2676a.f4268a;
                if (context2 != null) {
                    return new yy3(context2);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
