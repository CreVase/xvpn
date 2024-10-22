package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.b;

/* loaded from: classes.dex */
public final class ee implements ie, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public s9 f1919a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f1920b;
    public CharSequence c;
    public final /* synthetic */ b d;

    public ee(b bVar) {
        this.d = bVar;
    }

    @Override // defpackage.ie
    public final boolean b() {
        s9 s9Var = this.f1919a;
        if (s9Var != null) {
            return s9Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.ie
    public final int c() {
        return 0;
    }

    @Override // defpackage.ie
    public final void dismiss() {
        s9 s9Var = this.f1919a;
        if (s9Var != null) {
            s9Var.dismiss();
            this.f1919a = null;
        }
    }

    @Override // defpackage.ie
    public final void e(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ie
    public final CharSequence f() {
        return this.c;
    }

    @Override // defpackage.ie
    public final Drawable g() {
        return null;
    }

    @Override // defpackage.ie
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.ie
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ie
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ie
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ie
    public final void n(int i, int i2) {
        if (this.f1920b == null) {
            return;
        }
        b bVar = this.d;
        q9 q9Var = new q9(bVar.getPopupContext());
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            ((j9) q9Var.f3970b).d = charSequence;
        }
        ListAdapter listAdapter = this.f1920b;
        int selectedItemPosition = bVar.getSelectedItemPosition();
        j9 j9Var = (j9) q9Var.f3970b;
        j9Var.h = listAdapter;
        j9Var.i = this;
        j9Var.k = selectedItemPosition;
        j9Var.j = true;
        s9 l = q9Var.l();
        this.f1919a = l;
        AlertController$RecycleListView alertController$RecycleListView = l.f.e;
        ce.d(alertController$RecycleListView, i);
        ce.c(alertController$RecycleListView, i2);
        this.f1919a.show();
    }

    @Override // defpackage.ie
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        b bVar = this.d;
        bVar.setSelection(i);
        if (bVar.getOnItemClickListener() != null) {
            bVar.performItemClick(null, i, this.f1920b.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.ie
    public final void p(ListAdapter listAdapter) {
        this.f1920b = listAdapter;
    }
}
