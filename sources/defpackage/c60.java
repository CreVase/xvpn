package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class c60 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ RecyclerView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c60(RecyclerView recyclerView, int i) {
        super(1);
        this.f = i;
        this.g = recyclerView;
    }

    public final void a(Rect rect) {
        int i = this.f;
        RecyclerView recyclerView = this.g;
        switch (i) {
            case 0:
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), rect.bottom);
                return;
            default:
                recyclerView.setPadding(0, 0, 0, rect.bottom);
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((Rect) obj);
                return ch3Var;
            default:
                a((Rect) obj);
                return ch3Var;
        }
    }
}
