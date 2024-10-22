package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class bl1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f485b;

    public /* synthetic */ bl1(Object obj, int i) {
        this.f484a = i;
        this.f485b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        go0 go0Var;
        int i2 = this.f484a;
        Object obj = this.f485b;
        switch (i2) {
            case 0:
                if (i != -1 && (go0Var = ((hl1) obj).c) != null) {
                    go0Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) obj).q(i);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
