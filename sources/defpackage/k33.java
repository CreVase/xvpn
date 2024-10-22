package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* loaded from: classes.dex */
public final class k33 extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2880a;

    /* renamed from: b, reason: collision with root package name */
    public final h5 f2881b;

    public k33(Context context, h5 h5Var) {
        this.f2880a = context;
        this.f2881b = h5Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2881b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2881b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new nv1(this.f2880a, this.f2881b.d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2881b.e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2881b.f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2881b.f2365a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2881b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2881b.f2366b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2881b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2881b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2881b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2881b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2881b.f2365a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2881b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f2881b.o(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2881b.k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2881b.m(i);
    }
}
