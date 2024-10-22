package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class pg0 implements yd0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3836a;

    /* renamed from: b, reason: collision with root package name */
    public final yd0 f3837b;

    public pg0(Context context) {
        oh0 oh0Var = new oh0();
        this.f3836a = context.getApplicationContext();
        this.f3837b = oh0Var;
    }

    @Override // defpackage.yd0
    public final zd0 a() {
        return new qg0(this.f3836a, this.f3837b.a());
    }
}
