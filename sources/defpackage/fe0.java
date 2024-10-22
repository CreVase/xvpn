package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fe0 {

    /* renamed from: a, reason: collision with root package name */
    public final t33 f2083a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2084b;
    public final String c;
    public final ja1 d;
    public final List e;
    public final Executor f;
    public final Executor g;
    public final boolean h;
    public final boolean i;

    public fe0(Context context, String str, t33 t33Var, ja1 ja1Var, ArrayList arrayList, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.f2083a = t33Var;
        this.f2084b = context;
        this.c = str;
        this.d = ja1Var;
        this.e = arrayList;
        this.f = executor;
        this.g = executor2;
        this.h = z2;
        this.i = z3;
    }

    public final boolean a(int i, int i2) {
        boolean z;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        if ((!z || !this.i) && this.h) {
            return true;
        }
        return false;
    }
}
