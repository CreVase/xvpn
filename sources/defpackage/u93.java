package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfz;

/* loaded from: classes.dex */
public final class u93 implements iv1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4639a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4640b;

    public /* synthetic */ u93(Object obj) {
        this.f4640b = obj;
    }

    @Override // defpackage.iv1
    public final void a(ju1 ju1Var, boolean z) {
        b5 b5Var;
        if (this.f4639a) {
            return;
        }
        this.f4639a = true;
        v93 v93Var = (v93) this.f4640b;
        ActionMenuView actionMenuView = v93Var.f4800a.f4966a.f170a;
        if (actionMenuView != null && (b5Var = actionMenuView.t) != null) {
            b5Var.i();
            w4 w4Var = b5Var.t;
            if (w4Var != null && w4Var.b()) {
                w4Var.j.dismiss();
            }
        }
        v93Var.f4801b.onPanelClosed(108, ju1Var);
        this.f4639a = false;
    }

    public final void b(int i) {
        cp3.m(!this.f4639a);
        ((SparseBooleanArray) this.f4640b).append(i, true);
    }

    public final synchronized void c() {
        while (!this.f4639a) {
            wait();
        }
    }

    public final wy0 d() {
        cp3.m(!this.f4639a);
        this.f4639a = true;
        return new wy0((SparseBooleanArray) this.f4640b);
    }

    public final synchronized void e() {
        this.f4639a = false;
    }

    public final ViewGroup f() {
        return ((az2) this.f4640b).c();
    }

    public final synchronized boolean g() {
        return this.f4639a;
    }

    public final synchronized boolean h() {
        if (this.f4639a) {
            return false;
        }
        this.f4639a = true;
        notifyAll();
        return true;
    }

    public final void i(zzfz zzfzVar) {
        if (this.f4639a) {
            zzb.zzj("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            bc3 bc3Var = (bc3) this.f4640b;
            ol olVar = new ol(zzfzVar, y72.DEFAULT);
            bc3Var.getClass();
            bc3Var.a(olVar, new qy2(2));
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "logging failed.");
        }
    }

    @Override // defpackage.iv1
    public final boolean n(ju1 ju1Var) {
        ((v93) this.f4640b).f4801b.onMenuOpened(108, ju1Var);
        return true;
    }

    public /* synthetic */ u93(Object obj, boolean z) {
        this.f4640b = obj;
        this.f4639a = z;
    }

    public u93(Context context) {
        try {
            dc3.b(context);
            this.f4640b = dc3.a().c(ft.e).a("PLAY_BILLING_LIBRARY", new lr0("proto"), v73.e);
        } catch (Throwable unused) {
            this.f4639a = true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u93(int i) {
        this(f10.f2029a);
        if (i != 5) {
        } else {
            this.f4640b = new SparseBooleanArray();
        }
    }

    public u93(boolean z, Activity activity) {
        az2 zy2Var;
        this.f4639a = z;
        if (z) {
            zy2Var = new az2(activity);
        } else {
            zy2Var = Build.VERSION.SDK_INT >= 31 ? new zy2(activity) : new az2(activity);
        }
        zy2Var.a();
        this.f4640b = zy2Var;
    }

    public u93(boolean z, String str) {
        this.f4639a = z;
        this.f4640b = str;
    }
}
