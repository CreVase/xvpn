package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class fs1 implements js1, gv0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y01 f2142a;

    public /* synthetic */ fs1(y01 y01Var) {
        this.f2142a = y01Var;
    }

    public final dv0[] a() {
        dv0 hi0Var;
        dv0[] dv0VarArr = new dv0[1];
        mp0 mp0Var = y23.g0;
        y01 y01Var = this.f2142a;
        if (mp0Var.r(y01Var)) {
            hi0Var = new z23(mp0Var.d(y01Var), y01Var);
        } else {
            hi0Var = new hi0(y01Var);
        }
        dv0VarArr[0] = hi0Var;
        return dv0VarArr;
    }

    @Override // defpackage.js1
    public final int c(Object obj) {
        boolean z;
        zr1 zr1Var = (zr1) obj;
        zr1Var.getClass();
        y01 y01Var = this.f2142a;
        String str = y01Var.l;
        String str2 = zr1Var.f5536b;
        if (!str2.equals(str) && !str2.equals(ks1.b(y01Var))) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !zr1Var.c(y01Var, false)) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.gv0
    public final dv0[] e(Uri uri, Map map) {
        return a();
    }
}
