package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kn3 extends qb3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2982b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ov0 d;

    public kn3(ov0 ov0Var, ViewGroup viewGroup, View view, View view2) {
        this.d = ov0Var;
        this.f2981a = viewGroup;
        this.f2982b = view;
        this.c = view2;
    }

    @Override // defpackage.qb3, defpackage.ob3
    public final void a() {
        this.f2981a.getOverlay().remove(this.f2982b);
    }

    @Override // defpackage.ob3
    public final void b(pb3 pb3Var) {
        this.c.setTag(we2.save_overlay_view, null);
        this.f2981a.getOverlay().remove(this.f2982b);
        pb3Var.v(this);
    }

    @Override // defpackage.qb3, defpackage.ob3
    public final void e() {
        View view = this.f2982b;
        if (view.getParent() == null) {
            this.f2981a.getOverlay().add(view);
            return;
        }
        ov0 ov0Var = this.d;
        ArrayList arrayList = ov0Var.m;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                ((Animator) arrayList.get(size)).cancel();
            }
        }
        ArrayList arrayList2 = ov0Var.q;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) ov0Var.q.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((ob3) arrayList3.get(i)).c();
            }
        }
    }
}
