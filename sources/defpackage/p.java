package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes.dex */
public final class p implements um3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3756a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3757b;
    public final /* synthetic */ ActionBarContextView c;

    public p(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // defpackage.um3
    public final void a(View view) {
        this.f3756a = true;
    }

    @Override // defpackage.um3
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3756a = false;
    }

    @Override // defpackage.um3
    public final void c() {
        if (this.f3756a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3757b);
    }
}
