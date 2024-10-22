package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class rb3 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final pb3 f4127a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f4128b;

    public rb3(ViewGroup viewGroup, pb3 pb3Var) {
        this.f4127a = pb3Var;
        this.f4128b = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ee A[EDGE_INSN: B:128:0x01ee->B:129:0x01ee BREAK  A[LOOP:1: B:17:0x0087->B:29:0x01e4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb3.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f4128b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        sb3.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) sb3.b().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((pb3) it.next()).x(viewGroup);
            }
        }
        this.f4127a.i(true);
    }
}
