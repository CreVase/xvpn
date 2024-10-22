package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import defpackage.b32;
import defpackage.bn2;
import defpackage.c21;
import defpackage.e7;
import defpackage.km3;
import defpackage.kv1;
import defpackage.lm3;
import defpackage.lu1;
import defpackage.q22;
import defpackage.r11;
import defpackage.t22;
import defpackage.vj1;
import defpackage.x22;
import defpackage.y22;
import defpackage.y70;
import defpackage.zm2;

/* loaded from: classes.dex */
public final class k extends r11 implements t22, b32, x22, y22, lm3, q22, e7, bn2, c21, lu1 {
    public final /* synthetic */ l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(lVar);
        this.e = lVar;
    }

    @Override // defpackage.c21
    public final void a(Fragment fragment) {
        this.e.onAttachFragment(fragment);
    }

    @Override // defpackage.lu1
    public final void addMenuProvider(kv1 kv1Var) {
        this.e.addMenuProvider(kv1Var);
    }

    @Override // defpackage.t22
    public final void addOnConfigurationChangedListener(y70 y70Var) {
        this.e.addOnConfigurationChangedListener(y70Var);
    }

    @Override // defpackage.x22
    public final void addOnMultiWindowModeChangedListener(y70 y70Var) {
        this.e.addOnMultiWindowModeChangedListener(y70Var);
    }

    @Override // defpackage.y22
    public final void addOnPictureInPictureModeChangedListener(y70 y70Var) {
        this.e.addOnPictureInPictureModeChangedListener(y70Var);
    }

    @Override // defpackage.b32
    public final void addOnTrimMemoryListener(y70 y70Var) {
        this.e.addOnTrimMemoryListener(y70Var);
    }

    @Override // defpackage.p11
    public final View b(int i) {
        return this.e.findViewById(i);
    }

    @Override // defpackage.p11
    public final boolean c() {
        Window window = this.e.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e7
    public final androidx.activity.result.a getActivityResultRegistry() {
        return this.e.getActivityResultRegistry();
    }

    @Override // defpackage.bk1
    public final vj1 getLifecycle() {
        return this.e.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.q22
    public final androidx.activity.b getOnBackPressedDispatcher() {
        return this.e.getOnBackPressedDispatcher();
    }

    @Override // defpackage.bn2
    public final zm2 getSavedStateRegistry() {
        return this.e.getSavedStateRegistry();
    }

    @Override // defpackage.lm3
    public final km3 getViewModelStore() {
        return this.e.getViewModelStore();
    }

    @Override // defpackage.lu1
    public final void removeMenuProvider(kv1 kv1Var) {
        this.e.removeMenuProvider(kv1Var);
    }

    @Override // defpackage.t22
    public final void removeOnConfigurationChangedListener(y70 y70Var) {
        this.e.removeOnConfigurationChangedListener(y70Var);
    }

    @Override // defpackage.x22
    public final void removeOnMultiWindowModeChangedListener(y70 y70Var) {
        this.e.removeOnMultiWindowModeChangedListener(y70Var);
    }

    @Override // defpackage.y22
    public final void removeOnPictureInPictureModeChangedListener(y70 y70Var) {
        this.e.removeOnPictureInPictureModeChangedListener(y70Var);
    }

    @Override // defpackage.b32
    public final void removeOnTrimMemoryListener(y70 y70Var) {
        this.e.removeOnTrimMemoryListener(y70Var);
    }
}
