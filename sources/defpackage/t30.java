package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.b;

/* loaded from: classes.dex */
public class t30 extends Dialog implements bk1, q22, bn2 {

    /* renamed from: a, reason: collision with root package name */
    public ck1 f4445a;

    /* renamed from: b, reason: collision with root package name */
    public final an2 f4446b;
    public final b c;

    public t30(Context context, int i) {
        super(context, i);
        this.f4446b = new an2(this);
        this.c = new b(new nw3(this, 3));
    }

    public static void a(t30 t30Var) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        getWindow().getDecorView().setTag(ef2.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(hf2.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(gf2.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.bk1
    public final vj1 getLifecycle() {
        ck1 ck1Var = this.f4445a;
        if (ck1Var == null) {
            ck1 ck1Var2 = new ck1(this);
            this.f4445a = ck1Var2;
            return ck1Var2;
        }
        return ck1Var;
    }

    @Override // defpackage.q22
    public final b getOnBackPressedDispatcher() {
        return this.c;
    }

    @Override // defpackage.bn2
    public final zm2 getSavedStateRegistry() {
        return this.f4446b.f117b;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            b bVar = this.c;
            bVar.e = onBackInvokedDispatcher;
            bVar.c(bVar.g);
        }
        this.f4446b.b(bundle);
        ck1 ck1Var = this.f4445a;
        if (ck1Var == null) {
            ck1Var = new ck1(this);
            this.f4445a = ck1Var;
        }
        ck1Var.e(tj1.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        this.f4446b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        ck1 ck1Var = this.f4445a;
        if (ck1Var == null) {
            ck1Var = new ck1(this);
            this.f4445a = ck1Var;
        }
        ck1Var.e(tj1.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        ck1 ck1Var = this.f4445a;
        if (ck1Var == null) {
            ck1Var = new ck1(this);
            this.f4445a = ck1Var;
        }
        ck1Var.e(tj1.ON_DESTROY);
        this.f4445a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.setContentView(view, layoutParams);
    }
}
