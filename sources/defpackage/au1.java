package defpackage;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class au1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xl1 f342b;
    public final /* synthetic */ et1 c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ au1(Object obj, Object obj2, xl1 xl1Var, et1 et1Var, IOException iOException, boolean z, int i) {
        this.f341a = i;
        this.f = obj;
        this.g = obj2;
        this.f342b = xl1Var;
        this.c = et1Var;
        this.d = iOException;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f341a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                xl1 xl1Var = this.f342b;
                et1 et1Var = this.c;
                IOException iOException = this.d;
                boolean z = this.e;
                ((uf0) ((fu1) ((x50) obj2).c).h).i(((Integer) pair.first).intValue(), (rt1) pair.second, xl1Var, et1Var, iOException, z);
                return;
            default:
                vt1 vt1Var = (vt1) obj2;
                ((wt1) obj).i(vt1Var.f4892a, vt1Var.f4893b, this.f342b, this.c, this.d, this.e);
                return;
        }
    }
}
