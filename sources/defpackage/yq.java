package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class yq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5375a;

    /* renamed from: b, reason: collision with root package name */
    public int f5376b;
    public boolean c;
    public final Object d;
    public final Object e;

    public yq(Application application) {
        this.f5375a = 2;
        this.d = new ArrayList();
        this.f5376b = 0;
        this.e = application.getApplicationContext();
    }

    public final void a(int i) {
        int i2 = this.f5375a;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f5376b = i;
                    if (!this.c) {
                        WeakHashMap weakHashMap = ll3.f3151a;
                        uk3.m((View) bottomSheetBehavior.U.get(), (Runnable) obj);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f5376b = i;
                    if (!this.c) {
                        WeakHashMap weakHashMap2 = ll3.f3151a;
                        uk3.m((View) sideSheetBehavior.p.get(), (Runnable) obj);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public yq(SideSheetBehavior sideSheetBehavior) {
        this.f5375a = 1;
        this.e = sideSheetBehavior;
        this.d = new nw3(this, 21);
    }

    public yq(BottomSheetBehavior bottomSheetBehavior) {
        this.f5375a = 0;
        this.e = bottomSheetBehavior;
        this.d = new qw3(this, 17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yq(BottomSheetBehavior bottomSheetBehavior, int i) {
        this(bottomSheetBehavior);
        this.f5375a = 0;
    }
}
