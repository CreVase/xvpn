package com.vungle.ads.internal.omsdk;

import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.vungle.ads.BuildConfig;
import defpackage.dv3;
import defpackage.et2;
import defpackage.hc3;
import defpackage.hs2;
import defpackage.kv3;
import defpackage.mu3;
import defpackage.ng0;
import defpackage.nu3;
import defpackage.o40;
import defpackage.pe0;
import defpackage.qw3;
import defpackage.ru3;
import defpackage.sb2;
import defpackage.t7;
import defpackage.v7;
import defpackage.v73;
import defpackage.yu3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class OMTracker implements WebViewObserver {
    public static final Companion Companion = new Companion(null);
    private static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);
    private t7 adSession;
    private final boolean enabled;
    private boolean started;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public static /* synthetic */ void getDESTROY_DELAY_MS$annotations() {
        }

        public final long getDESTROY_DELAY_MS() {
            return OMTracker.DESTROY_DELAY_MS;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Factory {
        public final OMTracker make(boolean z) {
            return new OMTracker(z, null);
        }
    }

    public /* synthetic */ OMTracker(boolean z, ng0 ng0Var) {
        this(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vungle.ads.internal.omsdk.WebViewObserver
    public void onPageFinished(WebView webView) {
        boolean z;
        Date date;
        if (this.started && this.adSession == null) {
            et2 et2Var = new et2();
            if (!TextUtils.isEmpty(BuildConfig.OMSDK_PARTNER_NAME)) {
                if (!TextUtils.isEmpty(BuildConfig.VERSION_NAME)) {
                    o40 o40Var = new o40(new sb2(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME), webView);
                    if (pe0.m.f4027a) {
                        mu3 mu3Var = new mu3(et2Var, o40Var);
                        this.adSession = mu3Var;
                        if (!mu3Var.f && ((View) mu3Var.c.get()) != webView) {
                            mu3Var.c = new ru3(webView);
                            v7 v7Var = mu3Var.d;
                            v7Var.getClass();
                            v7Var.c = System.nanoTime();
                            v7Var.f4788b = 1;
                            Collection<mu3> unmodifiableCollection = Collections.unmodifiableCollection(dv3.c.f1844a);
                            if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                                for (mu3 mu3Var2 : unmodifiableCollection) {
                                    if (mu3Var2 != mu3Var && ((View) mu3Var2.c.get()) == webView) {
                                        mu3Var2.c.clear();
                                    }
                                }
                            }
                        }
                        t7 t7Var = this.adSession;
                        if (t7Var != null) {
                            mu3 mu3Var3 = (mu3) t7Var;
                            if (!mu3Var3.e) {
                                mu3Var3.e = true;
                                dv3 dv3Var = dv3.c;
                                if (dv3Var.f1845b.size() > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                dv3Var.f1845b.add(mu3Var3);
                                if (!z) {
                                    hs2 b2 = hs2.b();
                                    b2.getClass();
                                    yu3 yu3Var = yu3.d;
                                    yu3Var.c = b2;
                                    yu3Var.f2655a = true;
                                    boolean a2 = yu3Var.a();
                                    yu3Var.f2656b = a2;
                                    yu3Var.b(a2);
                                    hc3.g.getClass();
                                    hc3.c();
                                    kv3 kv3Var = (kv3) b2.d;
                                    kv3Var.e = kv3Var.a();
                                    kv3Var.b();
                                    kv3Var.f3022a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, kv3Var);
                                }
                                float f = hs2.b().f2479a;
                                v73.d.a(mu3Var3.d.e(), "setDeviceVolume", Float.valueOf(f));
                                v7 v7Var2 = mu3Var3.d;
                                Date date2 = nu3.f.f3547b;
                                if (date2 != null) {
                                    date = (Date) date2.clone();
                                } else {
                                    date = null;
                                }
                                v7Var2.c(date);
                                mu3Var3.d.a(mu3Var3, mu3Var3.f3356a);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Method called before OM SDK activation");
                }
                throw new IllegalArgumentException("Version is null or empty");
            }
            throw new IllegalArgumentException("Name is null or empty");
        }
    }

    public final void start() {
        if (this.enabled && pe0.m.f4027a) {
            this.started = true;
        }
    }

    public final long stop() {
        long j;
        t7 t7Var;
        boolean z;
        if (this.started && (t7Var = this.adSession) != null) {
            mu3 mu3Var = (mu3) t7Var;
            if (!mu3Var.f) {
                mu3Var.c.clear();
                if (!mu3Var.f) {
                    mu3Var.f3357b.clear();
                }
                boolean z2 = true;
                mu3Var.f = true;
                v73.d.a(mu3Var.d.e(), "finishSession", new Object[0]);
                dv3 dv3Var = dv3.c;
                if (dv3Var.f1845b.size() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                dv3Var.f1844a.remove(mu3Var);
                ArrayList arrayList = dv3Var.f1845b;
                arrayList.remove(mu3Var);
                if (z) {
                    if (arrayList.size() <= 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        hs2 b2 = hs2.b();
                        b2.getClass();
                        hc3 hc3Var = hc3.g;
                        hc3Var.getClass();
                        Handler handler = hc3.i;
                        if (handler != null) {
                            handler.removeCallbacks(hc3.k);
                            hc3.i = null;
                        }
                        hc3Var.f2401a.clear();
                        hc3.h.post(new qw3(hc3Var, 19));
                        yu3 yu3Var = yu3.d;
                        yu3Var.f2655a = false;
                        yu3Var.c = null;
                        kv3 kv3Var = (kv3) b2.d;
                        kv3Var.f3022a.getContentResolver().unregisterContentObserver(kv3Var);
                    }
                }
                mu3Var.d.d();
                mu3Var.d = null;
            }
            j = DESTROY_DELAY_MS;
        } else {
            j = 0;
        }
        this.started = false;
        this.adSession = null;
        return j;
    }

    private OMTracker(boolean z) {
        this.enabled = z;
    }
}
