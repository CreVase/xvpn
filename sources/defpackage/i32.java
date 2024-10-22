package defpackage;

import android.util.SparseArray;
import androidx.recyclerview.widget.j;
import java.util.List;

/* loaded from: classes.dex */
public final class i32 implements g03, zm3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2530a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2531b;

    public /* synthetic */ i32(Object obj, int i) {
        this.f2530a = i;
        this.f2531b = obj;
    }

    @Override // defpackage.zm3
    public final cz1 a(int i) {
        List list = (List) ((SparseArray) this.f2531b).get(i);
        if (list != null && !list.isEmpty()) {
            return (cz1) list.get(0);
        }
        throw new IllegalArgumentException(hx2.m("Cannot find the wrapper for global view type ", i));
    }

    @Override // defpackage.g03
    public final long b(long j) {
        switch (this.f2530a) {
            case 1:
                return -1L;
            default:
                return j;
        }
    }

    @Override // defpackage.zm3
    public final ym3 d(cz1 cz1Var) {
        return new j(this, cz1Var);
    }
}
