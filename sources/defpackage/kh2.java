package defpackage;

import android.view.View;
import androidx.recyclerview.widget.h;

/* loaded from: classes.dex */
public final class kh2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2946a;

    /* renamed from: b, reason: collision with root package name */
    public int f2947b;
    public int c;
    public int d;

    public kh2(int i, int i2, int i3, int i4) {
        this.f2946a = i;
        this.f2947b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final void a(h hVar) {
        View view = hVar.f281a;
        this.f2946a = view.getLeft();
        this.f2947b = view.getTop();
        this.c = view.getRight();
        this.d = view.getBottom();
    }
}
