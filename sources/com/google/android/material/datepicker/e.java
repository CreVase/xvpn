package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import defpackage.mi3;
import defpackage.rh2;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class e extends rh2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f1545b;
    public final /* synthetic */ f c;

    public e(f fVar, l lVar, MaterialButton materialButton) {
        this.c = fVar;
        this.f1544a = lVar;
        this.f1545b = materialButton;
    }

    @Override // defpackage.rh2
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f1545b.getText());
        }
    }

    @Override // defpackage.rh2
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int L0;
        f fVar = this.c;
        if (i < 0) {
            L0 = ((LinearLayoutManager) fVar.h.getLayoutManager()).K0();
        } else {
            L0 = ((LinearLayoutManager) fVar.h.getLayoutManager()).L0();
        }
        l lVar = this.f1544a;
        Calendar b2 = mi3.b(lVar.d.f1533a.f1537a);
        b2.add(2, L0);
        fVar.d = new Month(b2);
        Calendar b3 = mi3.b(lVar.d.f1533a.f1537a);
        b3.add(2, L0);
        this.f1545b.setText(new Month(b3).d());
    }
}
