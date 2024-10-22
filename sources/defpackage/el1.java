package defpackage;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class el1 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1957b;

    public /* synthetic */ el1(Object obj, int i) {
        this.f1956a = i;
        this.f1957b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.f1956a;
        Object obj = this.f1957b;
        switch (i) {
            case 0:
                hl1 hl1Var = (hl1) obj;
                if (hl1Var.b()) {
                    hl1Var.show();
                    return;
                }
                return;
            default:
                kc0 kc0Var = (kc0) obj;
                kc0Var.f2929a = true;
                kc0Var.notifyDataSetChanged();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.f1956a;
        Object obj = this.f1957b;
        switch (i) {
            case 0:
                ((hl1) obj).dismiss();
                return;
            default:
                kc0 kc0Var = (kc0) obj;
                kc0Var.f2929a = false;
                kc0Var.notifyDataSetInvalidated();
                return;
        }
    }
}
