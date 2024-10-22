package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.mi3;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1542b;
    public final /* synthetic */ f c;

    public /* synthetic */ c(f fVar, l lVar, int i) {
        this.f1541a = i;
        this.c = fVar;
        this.f1542b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1541a;
        l lVar = this.f1542b;
        f fVar = this.c;
        switch (i) {
            case 0:
                int L0 = ((LinearLayoutManager) fVar.h.getLayoutManager()).L0() - 1;
                if (L0 >= 0) {
                    Calendar b2 = mi3.b(lVar.d.f1533a.f1537a);
                    b2.add(2, L0);
                    fVar.m(new Month(b2));
                    return;
                }
                return;
            default:
                int K0 = ((LinearLayoutManager) fVar.h.getLayoutManager()).K0() + 1;
                if (K0 < fVar.h.getAdapter().c()) {
                    Calendar b3 = mi3.b(lVar.d.f1533a.f1537a);
                    b3.add(2, K0);
                    fVar.m(new Month(b3));
                    return;
                }
                return;
        }
    }
}
