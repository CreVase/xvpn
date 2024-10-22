package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.l;

/* loaded from: classes.dex */
public final /* synthetic */ class k30 implements u22 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f2877b;

    public /* synthetic */ k30(l lVar, int i) {
        this.f2876a = i;
        this.f2877b = lVar;
    }

    @Override // defpackage.u22
    public final void a(Context context) {
        int i = this.f2876a;
        ComponentActivity componentActivity = this.f2877b;
        switch (i) {
            case 0:
                ComponentActivity.H(componentActivity);
                return;
            default:
                l.I((l) componentActivity);
                return;
        }
    }
}
