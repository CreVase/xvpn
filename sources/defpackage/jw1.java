package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class jw1 {

    /* renamed from: a, reason: collision with root package name */
    public final x50 f2840a;

    /* renamed from: b, reason: collision with root package name */
    public final xb0 f2841b;
    public final HashMap c;

    public jw1(Context context, xb0 xb0Var) {
        x50 x50Var = new x50(context);
        this.c = new HashMap();
        this.f2840a = x50Var;
        this.f2841b = xb0Var;
    }

    public final synchronized yb3 a(String str) {
        if (this.c.containsKey(str)) {
            return (yb3) this.c.get(str);
        }
        CctBackendFactory n = this.f2840a.n(str);
        if (n == null) {
            return null;
        }
        xb0 xb0Var = this.f2841b;
        yb3 create = n.create(new nl(xb0Var.f5135a, xb0Var.f5136b, xb0Var.c, str));
        this.c.put(str, create);
        return create;
    }
}
