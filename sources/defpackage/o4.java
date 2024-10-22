package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.widget.EditText;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.checkbox.b;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.security.xvpn.z35kb.browser.BrowserToolbar;
import com.security.xvpn.z35kb.browser.PrivateBrowser;
import com.security.xvpn.z35kb.television.SplashActivity;
import com.security.xvpn.z35kb.widget.ConnectButton;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o4 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3595b;

    public /* synthetic */ o4(Object obj, int i) {
        this.f3594a = i;
        this.f3595b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f3594a;
        Object obj = this.f3595b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.k = false;
                return;
            case 10:
                super.onAnimationCancel(animator);
                uu3.f4743a.remove((String) obj);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f3594a;
        Object obj = this.f3595b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.k = false;
                return;
            case 1:
                ((pb3) obj).m();
                animator.removeListener(this);
                return;
            case 2:
                ob obVar = (ob) obj;
                ArrayList arrayList = new ArrayList(obVar.e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((ar1) arrayList.get(i2)).f323b.o;
                    if (colorStateList != null) {
                        bn0.h(obVar, colorStateList);
                    }
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).h = null;
                return;
            case 4:
            default:
                super.onAnimationEnd(animator);
                return;
            case 5:
                p71.C(obj);
                throw null;
            case 6:
                lo0 lo0Var = (lo0) obj;
                lo0Var.q();
                lo0Var.r.start();
                return;
            case 7:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
            case 8:
                super.onAnimationEnd(animator);
                BrowserToolbar browserToolbar = (BrowserToolbar) obj;
                if (browserToolbar.P) {
                    browserToolbar.C.setVisibility(8);
                    browserToolbar.A.setEnabled(true);
                    browserToolbar.A.setFocusable(true);
                    browserToolbar.A.setFocusableInTouchMode(true);
                    browserToolbar.A.setSelectAllOnFocus(true);
                    browserToolbar.A.requestFocusFromTouch();
                    browserToolbar.A.requestFocus();
                    EditText editText = browserToolbar.A;
                    editText.setSelection(editText.getText().length(), 0);
                    m20.J0(browserToolbar.A);
                    return;
                }
                browserToolbar.D.setVisibility(8);
                if (browserToolbar.H) {
                    return;
                }
                browserToolbar.A.setVisibility(4);
                browserToolbar.A.setAlpha(0.0f);
                browserToolbar.C.setAlpha(1.0f);
                return;
            case 9:
                super.onAnimationEnd(animator);
                PrivateBrowser privateBrowser = (PrivateBrowser) obj;
                privateBrowser.m.setAlpha(0.0f);
                privateBrowser.m.setScaleX(1.0f);
                privateBrowser.m.setVisibility(8);
                privateBrowser.m.setImageBitmap(null);
                Bitmap bitmap = privateBrowser.E;
                if (bitmap != null && !bitmap.isRecycled()) {
                    privateBrowser.E.recycle();
                    privateBrowser.E = null;
                }
                privateBrowser.q.setEnabled(true);
                return;
            case 10:
                super.onAnimationEnd(animator);
                uu3.f4743a.remove((String) obj);
                return;
            case 11:
                SplashActivity splashActivity = (SplashActivity) obj;
                splashActivity.f = true;
                SplashActivity.R(splashActivity);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f3594a;
        Object obj = this.f3595b;
        switch (i) {
            case 2:
                ob obVar = (ob) obj;
                ArrayList arrayList = new ArrayList(obVar.e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    b bVar = ((ar1) arrayList.get(i2)).f323b;
                    ColorStateList colorStateList = bVar.o;
                    if (colorStateList != null) {
                        bn0.g(obVar, colorStateList.getColorForState(bVar.s, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case 5:
                p71.C(obj);
                throw null;
            case 8:
                super.onAnimationStart(animator);
                BrowserToolbar browserToolbar = (BrowserToolbar) obj;
                if (browserToolbar.P) {
                    browserToolbar.D.setVisibility(0);
                    browserToolbar.A.setVisibility(0);
                    browserToolbar.A.setFocusable(true);
                    browserToolbar.A.setFocusableInTouchMode(true);
                    browserToolbar.A.setSelectAllOnFocus(true);
                    browserToolbar.A.requestFocusFromTouch();
                    browserToolbar.A.requestFocus();
                    browserToolbar.A.setEnabled(false);
                    EditText editText = browserToolbar.A;
                    editText.setSelection(editText.getText().length(), 0);
                    m20.J0(browserToolbar.A);
                    return;
                }
                browserToolbar.A.clearFocus();
                browserToolbar.A.setFocusable(false);
                browserToolbar.C.setVisibility(0);
                m20.v0(browserToolbar.A);
                return;
            case 9:
                super.onAnimationStart(animator);
                PrivateBrowser privateBrowser = (PrivateBrowser) obj;
                privateBrowser.m.setTranslationX(0.0f);
                privateBrowser.m.setTranslationY(0.0f);
                privateBrowser.m.setAlpha(1.0f);
                privateBrowser.m.setScaleX(1.0f);
                privateBrowser.m.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        int i = this.f3594a;
        Object obj = this.f3595b;
        switch (i) {
            case 12:
                m50 m50Var = (m50) obj;
                m50Var.v = 90.0f;
                m50Var.w = 360.0f;
                return;
            case 13:
                ConnectButton connectButton = (ConnectButton) obj;
                connectButton.c = 90.0f;
                connectButton.d = 360.0f;
                return;
            default:
                super.onAnimationEnd(animator, z);
                return;
        }
    }
}
