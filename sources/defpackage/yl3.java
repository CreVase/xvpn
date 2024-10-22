package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class yl3 implements fp2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5357b;

    public /* synthetic */ yl3(Object obj, int i) {
        this.f5356a = i;
        this.f5357b = obj;
    }

    @Override // defpackage.fp2
    public final Iterator iterator() {
        int i = this.f5356a;
        Object obj = this.f5357b;
        switch (i) {
            case 0:
                return new am3((ViewGroup) obj, 0);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                gp2 gp2Var = new gp2();
                gp2Var.d = t9.z(gp2Var, gp2Var, (l41) obj);
                return gp2Var;
            default:
                return (Iterator) obj;
        }
    }
}
