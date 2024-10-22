package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.l;
import androidx.fragment.app.p;

/* loaded from: classes.dex */
public final /* synthetic */ class j30 implements ym2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2696b;

    public /* synthetic */ j30(Object obj, int i) {
        this.f2695a = i;
        this.f2696b = obj;
    }

    @Override // defpackage.ym2
    public final Bundle a() {
        int i = this.f2695a;
        Object obj = this.f2696b;
        switch (i) {
            case 0:
                return ComponentActivity.G((ComponentActivity) obj);
            case 1:
                return l.J((l) obj);
            default:
                return ((p) obj).W();
        }
    }
}
