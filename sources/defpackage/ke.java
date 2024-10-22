package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ke extends tf3 {
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ WeakReference M;
    public final /* synthetic */ re N;

    public ke(re reVar, int i, int i2, WeakReference weakReference) {
        this.N = reVar;
        this.K = i;
        this.L = i2;
        this.M = weakReference;
    }

    @Override // defpackage.tf3
    public final void l0(int i) {
    }

    @Override // defpackage.tf3
    public final void m0(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.K) != -1) {
            if ((this.L & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = qe.a(typeface, i, z);
        }
        re reVar = this.N;
        if (reVar.m) {
            reVar.l = typeface;
            TextView textView = (TextView) this.M.get();
            if (textView != null) {
                WeakHashMap weakHashMap = ll3.f3151a;
                if (xk3.b(textView)) {
                    textView.post(new le(reVar, textView, typeface, reVar.j));
                } else {
                    textView.setTypeface(typeface, reVar.j);
                }
            }
        }
    }
}
