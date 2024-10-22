package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z11 implements y11 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5414a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5415b;
    public final int c;
    public final /* synthetic */ p d;

    public z11(p pVar, String str, int i, int i2) {
        this.d = pVar;
        this.f5414a = str;
        this.f5415b = i;
        this.c = i2;
    }

    @Override // defpackage.y11
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.d.w;
        if (fragment != null && this.f5415b < 0 && this.f5414a == null && fragment.getChildFragmentManager().Q()) {
            return false;
        }
        return this.d.S(arrayList, arrayList2, this.f5414a, this.f5415b, this.c);
    }
}
