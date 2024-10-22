package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.f;

/* loaded from: classes2.dex */
public final class xq1 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ f F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq1(f fVar, int i, int i2) {
        super(i, false);
        this.F = fVar;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A0(wh2 wh2Var, int[] iArr) {
        int i = this.E;
        f fVar = this.F;
        if (i == 0) {
            iArr[0] = fVar.h.getWidth();
            iArr[1] = fVar.h.getWidth();
        } else {
            iArr[0] = fVar.h.getHeight();
            iArr[1] = fVar.h.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final void x0(RecyclerView recyclerView, int i) {
        j42 j42Var = new j42(this, recyclerView.getContext(), 2);
        j42Var.f3477a = i;
        y0(j42Var);
    }
}
