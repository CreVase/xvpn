package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x21 implements ob3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f5107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5108b;

    public x21(View view, ArrayList arrayList) {
        this.f5107a = view;
        this.f5108b = arrayList;
    }

    @Override // defpackage.ob3
    public final void a() {
    }

    @Override // defpackage.ob3
    public final void b(pb3 pb3Var) {
        pb3Var.v(this);
        this.f5107a.setVisibility(8);
        ArrayList arrayList = this.f5108b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.ob3
    public final void c() {
    }

    @Override // defpackage.ob3
    public final void d() {
    }

    @Override // defpackage.ob3
    public final void e() {
    }
}
