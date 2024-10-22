package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import defpackage.a21;
import defpackage.a6;
import defpackage.ck1;
import defpackage.im1;
import defpackage.j30;
import defpackage.k30;
import defpackage.q11;
import defpackage.r11;
import defpackage.s5;
import defpackage.ss2;
import defpackage.t5;
import defpackage.tj1;
import defpackage.uj1;
import defpackage.x5;
import defpackage.y5;
import defpackage.y70;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class l extends ComponentActivity implements x5, y5 {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final q11 mFragments = new q11(new k(this));
    final ck1 mFragmentLifecycleRegistry = new ck1(this);
    boolean mStopped = true;

    public l() {
        final int i = 1;
        getSavedStateRegistry().c(LIFECYCLE_TAG, new j30(this, 1));
        final int i2 = 0;
        addOnConfigurationChangedListener(new y70(this) { // from class: androidx.fragment.app.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f231b;

            {
                this.f231b = this;
            }

            @Override // defpackage.y70
            public final void accept(Object obj) {
                int i3 = i2;
                l lVar = this.f231b;
                switch (i3) {
                    case 0:
                        lVar.mFragments.a();
                        return;
                    default:
                        lVar.mFragments.a();
                        return;
                }
            }
        });
        addOnNewIntentListener(new y70(this) { // from class: androidx.fragment.app.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f231b;

            {
                this.f231b = this;
            }

            @Override // defpackage.y70
            public final void accept(Object obj) {
                int i3 = i;
                l lVar = this.f231b;
                switch (i3) {
                    case 0:
                        lVar.mFragments.a();
                        return;
                    default:
                        lVar.mFragments.a();
                        return;
                }
            }
        });
        addOnContextAvailableListener(new k30(this, 1));
    }

    public static void I(l lVar) {
        r11 r11Var = lVar.mFragments.f3949a;
        r11Var.d.b(r11Var, r11Var, null);
    }

    public static /* synthetic */ Bundle J(l lVar) {
        lVar.markFragmentsCreated();
        lVar.mFragmentLifecycleRegistry.e(tj1.ON_STOP);
        return new Bundle();
    }

    public static boolean K(p pVar) {
        boolean z = false;
        for (Fragment fragment : pVar.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= K(fragment.getChildFragmentManager());
                }
                t tVar = fragment.mViewLifecycleOwner;
                uj1 uj1Var = uj1.STARTED;
                uj1 uj1Var2 = uj1.CREATED;
                if (tVar != null) {
                    tVar.b();
                    if (tVar.e.d.a(uj1Var)) {
                        ck1 ck1Var = fragment.mViewLifecycleOwner.e;
                        ck1Var.d("setCurrentState");
                        ck1Var.f(uj1Var2);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.d.a(uj1Var)) {
                    ck1 ck1Var2 = fragment.mLifecycleRegistry;
                    ck1Var2.d("setCurrentState");
                    ck1Var2.f(uj1Var2);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f3949a.d.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            im1.a(this).c(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.f3949a.d.u(str, fileDescriptor, printWriter, strArr);
    }

    public p getSupportFragmentManager() {
        return this.mFragments.f3949a.d;
    }

    @Deprecated
    public im1 getSupportLoaderManager() {
        return im1.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (K(getSupportFragmentManager()));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(tj1.ON_CREATE);
        a21 a21Var = this.mFragments.f3949a.d;
        a21Var.E = false;
        a21Var.F = false;
        a21Var.L.i = false;
        a21Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f3949a.d.k();
        this.mFragmentLifecycleRegistry.e(tj1.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f3949a.d.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f3949a.d.t(5);
        this.mFragmentLifecycleRegistry.e(tj1.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f3949a.d.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(tj1.ON_RESUME);
        a21 a21Var = this.mFragments.f3949a.d;
        a21Var.E = false;
        a21Var.F = false;
        a21Var.L.i = false;
        a21Var.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            a21 a21Var = this.mFragments.f3949a.d;
            a21Var.E = false;
            a21Var.F = false;
            a21Var.L.i = false;
            a21Var.t(4);
        }
        this.mFragments.f3949a.d.x(true);
        this.mFragmentLifecycleRegistry.e(tj1.ON_START);
        a21 a21Var2 = this.mFragments.f3949a.d;
        a21Var2.E = false;
        a21Var2.F = false;
        a21Var2.L.i = false;
        a21Var2.t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        a21 a21Var = this.mFragments.f3949a.d;
        a21Var.F = true;
        a21Var.L.i = true;
        a21Var.t(4);
        this.mFragmentLifecycleRegistry.e(tj1.ON_STOP);
    }

    public void setEnterSharedElementCallback(ss2 ss2Var) {
        int i = a6.f29a;
        t5.c(this, null);
    }

    public void setExitSharedElementCallback(ss2 ss2Var) {
        int i = a6.f29a;
        t5.d(this, null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            int i5 = a6.f29a;
            s5.c(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        int i = a6.f29a;
        t5.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        int i = a6.f29a;
        t5.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i = a6.f29a;
        t5.e(this);
    }

    @Override // defpackage.y5
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            int i2 = a6.f29a;
            s5.b(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
