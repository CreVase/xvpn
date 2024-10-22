package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class gc implements ym2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2228a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2229b;

    public gc(zm2 zm2Var) {
        this.f2228a = 1;
        this.f2229b = new LinkedHashSet();
        zm2Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.ym2
    public final Bundle a() {
        int i = this.f2228a;
        Object obj = this.f2229b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((ic) obj).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle2;
        }
    }

    public gc(ic icVar) {
        this.f2228a = 0;
        this.f2229b = icVar;
    }
}
