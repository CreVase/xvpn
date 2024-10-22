package defpackage;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class yn2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f5363b;

    public /* synthetic */ yn2(SearchView searchView, int i) {
        this.f5362a = i;
        this.f5363b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5362a;
        SearchView searchView = this.f5363b;
        switch (i) {
            case 0:
                searchView.u();
                return;
            default:
                kc0 kc0Var = searchView.O;
                if (kc0Var instanceof d33) {
                    kc0Var.b(null);
                    return;
                }
                return;
        }
    }
}
