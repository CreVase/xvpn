package defpackage;

import a.bx;
import a.du;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.security.xvpn.z35kb.AdvancedFeaturesActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.SplashActivity;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.browser.ChooseClearTypeActivity;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.view.b;
import com.vungle.ads.BannerView;
import com.vungle.ads.NativeAd;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
public final /* synthetic */ class ut0 implements rl1, t3, Continuation, jb3, wy2, aw3, pm1, az1, OnFailureListener, s61, ImpressionTracker.ImpressionListener, OnSuccessListener, EventListener.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4734b;

    public /* synthetic */ ut0(Object obj, int i) {
        this.f4734b = obj;
        this.f4733a = i;
    }

    @Override // defpackage.pm1
    public void a() {
        ((lt3) this.f4734b).getClass();
    }

    @Override // defpackage.jb3
    public Object apply(Object obj) {
        br2 br2Var = (br2) obj;
        ((fs0) this.f4734b).getClass();
        ia0 ia0Var = cr2.f1662a;
        ia0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            ia0Var.b(br2Var, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString().getBytes(dx.f1853a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    @Override // defpackage.t3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(android.view.View r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f4734b
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = com.google.android.material.sidesheet.SideSheetBehavior.w
            r6.getClass()
            r0 = 1
            int r1 = r5.f4733a
            if (r1 == r0) goto L4f
            r2 = 2
            if (r1 != r2) goto L12
            goto L4f
        L12:
            java.lang.ref.WeakReference r3 = r6.p
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L1d
            goto L4b
        L1d:
            java.lang.ref.WeakReference r3 = r6.p
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            gk2 r4 = new gk2
            r4.<init>(r1, r2, r6)
            android.view.ViewParent r6 = r3.getParent()
            if (r6 == 0) goto L40
            boolean r6 = r6.isLayoutRequested()
            if (r6 == 0) goto L40
            java.util.WeakHashMap r6 = defpackage.ll3.f3151a
            boolean r6 = defpackage.xk3.b(r3)
            if (r6 == 0) goto L40
            r6 = 1
            goto L41
        L40:
            r6 = 0
        L41:
            if (r6 == 0) goto L47
            r3.post(r4)
            goto L4e
        L47:
            r4.run()
            goto L4e
        L4b:
            r6.u(r1)
        L4e:
            return r0
        L4f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r1 != r0) goto L5d
            java.lang.String r0 = "DRAGGING"
            goto L5f
        L5d:
            java.lang.String r0 = "SETTLING"
        L5f:
            java.lang.String r1 = " should not be set externally."
            java.lang.String r0 = defpackage.hx2.s(r2, r0, r1)
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut0.b(android.view.View):boolean");
    }

    @Override // defpackage.s61
    public void c() {
        int i;
        r61 r61Var = (r61) this.f4734b;
        b bVar = r61Var.k;
        int i2 = bVar.e;
        if (i2 != 2) {
            if (i2 != 22) {
                if (i2 != 25) {
                    if (i2 == 30) {
                        i = 29;
                    } else {
                        throw new IllegalArgumentException("unsupport dialog type argument ： " + bVar.e);
                    }
                } else {
                    i = 24;
                }
            } else {
                i = 19;
            }
        } else {
            i = 8;
        }
        r61Var.getOwnerActivity();
        yc2.a();
        GoogleIABHelper.g.h(i);
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        EventListener m246asFactory$lambda8;
        m246asFactory$lambda8 = Util.m246asFactory$lambda8((EventListener) this.f4734b, call);
        return m246asFactory$lambda8;
    }

    @Override // defpackage.aw3
    public void d(boolean z) {
        AdvancedFeaturesActivity advancedFeaturesActivity = (AdvancedFeaturesActivity) this.f4734b;
        int i = AdvancedFeaturesActivity.n;
        if (z) {
            advancedFeaturesActivity.Z().l.fullScroll(130);
        }
    }

    public void e(int i) {
        boolean z;
        ChooseClearTypeActivity chooseClearTypeActivity = (ChooseClearTypeActivity) this.f4734b;
        SparseArray sparseArray = chooseClearTypeActivity.l;
        Long l = (Long) sparseArray.get(i, 0L);
        sparseArray.put(i, Long.valueOf(SystemClock.elapsedRealtime()));
        if (SystemClock.elapsedRealtime() - l.longValue() > 500) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            bx bxVar = new bx();
            bxVar.y(i);
            du.d(513, bxVar);
            boolean q = bxVar.q();
            bxVar.h();
            pe0.a("browser save clear type :" + q, new Object[0]);
            chooseClearTypeActivity.k.p(Integer.valueOf(i));
        }
    }

    public void f(wp wpVar, ArrayList arrayList) {
        v31 v31Var = (v31) this.f4734b;
        GoogleIABHelper googleIABHelper = GoogleIABHelper.g;
        if (wpVar.f5050a == 0) {
            HashMap hashMap = GoogleIABHelper.l;
            hashMap.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c92 c92Var = (c92) it.next();
                hashMap.put(c92Var.c, c92Var);
            }
            if (v31Var != null) {
                v31Var.invoke();
            }
        }
    }

    public void g(u93 u93Var) {
        Object obj = u93Var.f4640b;
        int i = this.f4733a;
        final int i2 = 0;
        Object obj2 = this.f4734b;
        switch (i) {
            case 2:
                ic icVar = (ic) obj2;
                x8 x8Var = x8.f5127a;
                XApplication.f = false;
                FrameLayout frameLayout = (FrameLayout) u93Var.f();
                ImageView imageView = (ImageView) ((az2) obj).b();
                final TextView textView = new TextView(icVar);
                textView.setAlpha(0.0f);
                textView.setTypeface(n01.c());
                textView.setTextSize(20.0f);
                textView.setTextColor(-16726311);
                textView.setText(pd0.y(R.string.app_name));
                int i3 = tf3.H;
                textView.measure(i3, i3);
                textView.setTranslationY(20 * tf3.F);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = tf3.K(88);
                frameLayout.addView(textView, layoutParams);
                final TextView textView2 = new TextView(icVar);
                textView2.setTypeface(n01.c());
                textView2.setTextSize(15.0f);
                textView2.setTextColor(-10987432);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setInputType(1);
                textView2.setText(pd0.y(R.string.app_features));
                int i4 = tf3.H;
                textView2.measure(i4, i4);
                LinearLayout linearLayout = new LinearLayout(icVar);
                linearLayout.addView(textView2);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(textView2.getMeasuredWidth(), -2);
                layoutParams2.gravity = 81;
                layoutParams2.bottomMargin = tf3.K(60);
                frameLayout.addView(linearLayout, layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                if (layoutParams3 != null) {
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.width = 0;
                    textView2.setLayoutParams(layoutParams4);
                    ub3 ub3Var = new ub3();
                    pb3 bwVar = new bw();
                    bwVar.c = 750L;
                    bwVar.f3818b = 250L;
                    bwVar.d = new uv0();
                    bwVar.b(imageView);
                    ub3Var.H(bwVar);
                    sb3.a(frameLayout, ub3Var);
                    ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                    if (layoutParams5 != null) {
                        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                        layoutParams6.width = tf3.K(110);
                        layoutParams6.height = tf3.K(110);
                        layoutParams6.gravity = 81;
                        layoutParams6.bottomMargin = tf3.K(151);
                        imageView.setLayoutParams(layoutParams6);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(950L);
                        duration.setStartDelay(1000L);
                        duration.setInterpolator(new mk1());
                        final float translationY = textView.getTranslationY();
                        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t8
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i5 = i2;
                                float f = translationY;
                                TextView textView3 = textView;
                                switch (i5) {
                                    case 0:
                                        textView3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        textView3.setTranslationY((1 - textView3.getAlpha()) * f);
                                        return;
                                    case 1:
                                        int i6 = SplashActivity.o;
                                        textView3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        textView3.setTranslationX((1 - textView3.getAlpha()) * f);
                                        return;
                                    default:
                                        textView3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        textView3.setTranslationX((1 - textView3.getAlpha()) * f);
                                        return;
                                }
                            }
                        });
                        ValueAnimator duration2 = ValueAnimator.ofInt(0, textView2.getMeasuredWidth()).setDuration(500L);
                        duration2.setStartDelay(1850L);
                        duration2.setInterpolator(new tv0());
                        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u8
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i5 = i2;
                                TextView textView3 = textView2;
                                switch (i5) {
                                    case 0:
                                        ViewGroup.LayoutParams layoutParams7 = textView3.getLayoutParams();
                                        if (layoutParams7 != null) {
                                            LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                                            layoutParams8.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            textView3.setLayoutParams(layoutParams8);
                                            return;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    case 1:
                                        int i6 = SplashActivity.o;
                                        ViewGroup.LayoutParams layoutParams9 = textView3.getLayoutParams();
                                        if (layoutParams9 != null) {
                                            LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
                                            layoutParams10.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            textView3.setLayoutParams(layoutParams10);
                                            return;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    default:
                                        ViewGroup.LayoutParams layoutParams11 = textView3.getLayoutParams();
                                        if (layoutParams11 != null) {
                                            LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) layoutParams11;
                                            layoutParams12.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            textView3.setLayoutParams(layoutParams12);
                                            return;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                }
                            }
                        });
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.setDuration(400L);
                        ofFloat.setStartDelay(2750L);
                        ofFloat.setInterpolator(new mk1());
                        ofFloat.addUpdateListener(new io0(frameLayout, 1));
                        animatorSet.playTogether(duration, duration2, ofFloat);
                        animatorSet.addListener(new w8(u93Var, i2));
                        animatorSet.start();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            case 3:
            default:
                Activity activity = (Activity) obj2;
                FrameLayout frameLayout2 = (FrameLayout) u93Var.f();
                ImageView imageView2 = (ImageView) ((az2) obj).b();
                final TextView textView3 = new TextView(activity);
                textView3.setAlpha(0.0f);
                textView3.setTypeface(n01.c());
                textView3.setTextSize(20.0f);
                textView3.setTextColor(-16726311);
                textView3.setText(pd0.y(R.string.app_name));
                int i5 = tf3.H;
                textView3.measure(i5, i5);
                textView3.setTranslationX((-50) * tf3.F);
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams7.gravity = 81;
                layoutParams7.bottomMargin = tf3.K(88);
                frameLayout2.addView(textView3, layoutParams7);
                final TextView textView4 = new TextView(activity);
                textView4.setTypeface(n01.c());
                textView4.setTextSize(15.0f);
                textView4.setTextColor(-10987432);
                textView4.setMaxLines(1);
                textView4.setLines(1);
                textView4.setInputType(1);
                textView4.setText(pd0.y(R.string.app_features));
                int i6 = tf3.H;
                textView4.measure(i6, i6);
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.addView(textView4);
                FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(textView4.getMeasuredWidth(), -2);
                layoutParams8.gravity = 81;
                layoutParams8.bottomMargin = tf3.K(60);
                frameLayout2.addView(linearLayout2, layoutParams8);
                ViewGroup.LayoutParams layoutParams9 = textView4.getLayoutParams();
                if (layoutParams9 != null) {
                    LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
                    layoutParams10.width = 0;
                    textView4.setLayoutParams(layoutParams10);
                    w42 w42Var = new w42(0.66f, 0.0f, 0.45f, 1.0f);
                    ub3 ub3Var2 = new ub3();
                    pb3 bwVar2 = new bw();
                    bwVar2.c = 750L;
                    bwVar2.f3818b = 250L;
                    bwVar2.d = w42Var;
                    bwVar2.b(imageView2);
                    ub3Var2.H(bwVar2);
                    sb3.a(frameLayout2, ub3Var2);
                    ViewGroup.LayoutParams layoutParams11 = imageView2.getLayoutParams();
                    if (layoutParams11 != null) {
                        FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
                        layoutParams12.width = tf3.K(110);
                        layoutParams12.height = tf3.K(110);
                        layoutParams12.gravity = 81;
                        layoutParams12.bottomMargin = tf3.K(151);
                        imageView2.setLayoutParams(layoutParams12);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        final int i7 = 2;
                        ValueAnimator duration3 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(700L);
                        duration3.setStartDelay(1000L);
                        duration3.setInterpolator(w42Var);
                        final float translationX = textView3.getTranslationX();
                        duration3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t8
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i52 = i7;
                                float f = translationX;
                                TextView textView32 = textView3;
                                switch (i52) {
                                    case 0:
                                        textView32.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        textView32.setTranslationY((1 - textView32.getAlpha()) * f);
                                        return;
                                    case 1:
                                        int i62 = SplashActivity.o;
                                        textView32.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        textView32.setTranslationX((1 - textView32.getAlpha()) * f);
                                        return;
                                    default:
                                        textView32.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        textView32.setTranslationX((1 - textView32.getAlpha()) * f);
                                        return;
                                }
                            }
                        });
                        ValueAnimator duration4 = ValueAnimator.ofInt(0, textView4.getMeasuredWidth()).setDuration(500L);
                        duration4.setStartDelay(2000L);
                        duration4.setInterpolator(w42Var);
                        duration4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u8
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i52 = i7;
                                TextView textView32 = textView4;
                                switch (i52) {
                                    case 0:
                                        ViewGroup.LayoutParams layoutParams72 = textView32.getLayoutParams();
                                        if (layoutParams72 != null) {
                                            LinearLayout.LayoutParams layoutParams82 = (LinearLayout.LayoutParams) layoutParams72;
                                            layoutParams82.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            textView32.setLayoutParams(layoutParams82);
                                            return;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    case 1:
                                        int i62 = SplashActivity.o;
                                        ViewGroup.LayoutParams layoutParams92 = textView32.getLayoutParams();
                                        if (layoutParams92 != null) {
                                            LinearLayout.LayoutParams layoutParams102 = (LinearLayout.LayoutParams) layoutParams92;
                                            layoutParams102.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            textView32.setLayoutParams(layoutParams102);
                                            return;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    default:
                                        ViewGroup.LayoutParams layoutParams112 = textView32.getLayoutParams();
                                        if (layoutParams112 != null) {
                                            LinearLayout.LayoutParams layoutParams122 = (LinearLayout.LayoutParams) layoutParams112;
                                            layoutParams122.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            textView32.setLayoutParams(layoutParams122);
                                            return;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                }
                            }
                        });
                        ValueAnimator duration5 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
                        duration5.setStartDelay(2500L);
                        animatorSet2.playTogether(duration3, duration4, duration5);
                        animatorSet2.addListener(new w8(u93Var, 1));
                        animatorSet2.start();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            case 4:
                SplashActivity splashActivity = (SplashActivity) obj2;
                int i8 = SplashActivity.o;
                XApplication.f = false;
                FrameLayout frameLayout3 = (FrameLayout) u93Var.f();
                ImageView imageView3 = (ImageView) ((az2) obj).b();
                final TextView textView5 = new TextView(splashActivity);
                textView5.setAlpha(0.0f);
                textView5.setTypeface(n01.c());
                textView5.setTextSize(20.0f);
                textView5.setTextColor(-16726311);
                textView5.setText(pd0.y(R.string.app_name));
                int i9 = tf3.H;
                textView5.measure(i9, i9);
                textView5.setTranslationX((-50) * tf3.F);
                FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams13.gravity = 81;
                layoutParams13.bottomMargin = tf3.K(88);
                frameLayout3.addView(textView5, layoutParams13);
                final TextView textView6 = new TextView(splashActivity);
                textView6.setTypeface(n01.c());
                textView6.setTextSize(15.0f);
                textView6.setTextColor(-10987432);
                textView6.setMaxLines(1);
                textView6.setLines(1);
                textView6.setInputType(1);
                textView6.setText(pd0.y(R.string.app_features));
                int i10 = tf3.H;
                textView6.measure(i10, i10);
                LinearLayout linearLayout3 = new LinearLayout(splashActivity);
                linearLayout3.addView(textView6);
                FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(textView6.getMeasuredWidth(), -2);
                layoutParams14.gravity = 81;
                layoutParams14.bottomMargin = tf3.K(60);
                frameLayout3.addView(linearLayout3, layoutParams14);
                ViewGroup.LayoutParams layoutParams15 = textView6.getLayoutParams();
                if (layoutParams15 != null) {
                    LinearLayout.LayoutParams layoutParams16 = (LinearLayout.LayoutParams) layoutParams15;
                    layoutParams16.width = 0;
                    textView6.setLayoutParams(layoutParams16);
                    new w42(0.66f, 0.0f, 0.45f, 1.0f);
                    ub3 ub3Var3 = new ub3();
                    pb3 bwVar3 = new bw();
                    bwVar3.c = 750L;
                    bwVar3.f3818b = 250L;
                    bwVar3.d = new uv0();
                    bwVar3.b(imageView3);
                    ub3Var3.H(bwVar3);
                    sb3.a(frameLayout3, ub3Var3);
                    ViewGroup.LayoutParams layoutParams17 = imageView3.getLayoutParams();
                    if (layoutParams17 != null) {
                        FrameLayout.LayoutParams layoutParams18 = (FrameLayout.LayoutParams) layoutParams17;
                        layoutParams18.width = tf3.K(110);
                        layoutParams18.height = tf3.K(110);
                        layoutParams18.gravity = 81;
                        layoutParams18.bottomMargin = tf3.K(151);
                        imageView3.setLayoutParams(layoutParams18);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        ValueAnimator duration6 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(700L);
                        duration6.setStartDelay(1000L);
                        duration6.setInterpolator(new uv0());
                        final float translationX2 = textView5.getTranslationX();
                        final int i11 = 1;
                        duration6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t8
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i52 = i11;
                                float f = translationX2;
                                TextView textView32 = textView5;
                                switch (i52) {
                                    case 0:
                                        textView32.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        textView32.setTranslationY((1 - textView32.getAlpha()) * f);
                                        return;
                                    case 1:
                                        int i62 = SplashActivity.o;
                                        textView32.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        textView32.setTranslationX((1 - textView32.getAlpha()) * f);
                                        return;
                                    default:
                                        textView32.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        textView32.setTranslationX((1 - textView32.getAlpha()) * f);
                                        return;
                                }
                            }
                        });
                        ValueAnimator duration7 = ValueAnimator.ofInt(0, textView6.getMeasuredWidth()).setDuration(500L);
                        duration7.setStartDelay(2000L);
                        duration7.setInterpolator(new tv0());
                        final int i12 = 1;
                        duration7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u8
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i52 = i12;
                                TextView textView32 = textView6;
                                switch (i52) {
                                    case 0:
                                        ViewGroup.LayoutParams layoutParams72 = textView32.getLayoutParams();
                                        if (layoutParams72 != null) {
                                            LinearLayout.LayoutParams layoutParams82 = (LinearLayout.LayoutParams) layoutParams72;
                                            layoutParams82.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            textView32.setLayoutParams(layoutParams82);
                                            return;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    case 1:
                                        int i62 = SplashActivity.o;
                                        ViewGroup.LayoutParams layoutParams92 = textView32.getLayoutParams();
                                        if (layoutParams92 != null) {
                                            LinearLayout.LayoutParams layoutParams102 = (LinearLayout.LayoutParams) layoutParams92;
                                            layoutParams102.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            textView32.setLayoutParams(layoutParams102);
                                            return;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    default:
                                        ViewGroup.LayoutParams layoutParams112 = textView32.getLayoutParams();
                                        if (layoutParams112 != null) {
                                            LinearLayout.LayoutParams layoutParams122 = (LinearLayout.LayoutParams) layoutParams112;
                                            layoutParams122.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            textView32.setLayoutParams(layoutParams122);
                                            return;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                }
                            }
                        });
                        ValueAnimator duration8 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
                        duration8.setStartDelay(2500L);
                        animatorSet3.playTogether(duration6, duration7, duration8);
                        animatorSet3.addListener(new py2(splashActivity, i2));
                        x8 x8Var2 = x8.f5127a;
                        AtomicBoolean atomicBoolean = x8.g;
                        if (atomicBoolean.get()) {
                            animatorSet3.cancel();
                        } else {
                            a72 a72Var = new a72(1, splashActivity, animatorSet3);
                            if (atomicBoolean.get()) {
                                a72Var.invoke();
                            } else {
                                x8.h = a72Var;
                            }
                        }
                        animatorSet3.start();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    @Override // defpackage.rl1
    public void invoke(Object obj) {
        ((v52) obj).onMediaItemTransition((dt1) this.f4734b, this.f4733a);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        uf ufVar = uf.f4657a;
        pe0.a("AppUpdateManager", hx2.p("update failed:", exc.getMessage()));
        if (exc instanceof tc1) {
            uf.g = ((tc1) exc).a();
        } else {
            uf.g = -9;
        }
        Runnable runnable = uf.f;
        if (runnable != null) {
            ew3.b0(runnable);
        }
        uf.f = null;
    }

    @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
    public void onImpression(View view) {
        int i = this.f4733a;
        Object obj = this.f4734b;
        switch (i) {
            case 14:
                ((BannerView) obj).onImpression();
                return;
            default:
                NativeAd.e((NativeAd) obj, view);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AndroidPlatform.b((AndroidPlatform) this.f4734b, (AppSetIdInfo) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((jx0) this.f4734b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString(MRAIDPresenter.ERROR);
            if (!"RST".equals(string2)) {
                if (string2 != null) {
                    throw new IOException(string2);
                }
                bundle.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
