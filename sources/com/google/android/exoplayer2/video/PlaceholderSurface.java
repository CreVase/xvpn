package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import defpackage.cp3;
import defpackage.j52;
import defpackage.jp0;
import defpackage.wi3;

/* loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {
    public static int d;
    public static boolean e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1514a;

    /* renamed from: b, reason: collision with root package name */
    public final j52 f1515b;
    public boolean c;

    public PlaceholderSurface(j52 j52Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f1515b = j52Var;
        this.f1514a = z;
    }

    public static int a(Context context) {
        boolean z;
        String eglQueryString;
        String eglQueryString2;
        int i = wi3.f5017a;
        boolean z2 = false;
        if (i >= 24 && ((i >= 26 || (!"samsung".equals(wi3.c) && !"XT1650".equals(wi3.d))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_EXT_protected_content")))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        if (i >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z2 = true;
        }
        if (z2) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (PlaceholderSurface.class) {
            z = true;
            if (!e) {
                d = a(context);
                e = true;
            }
            if (d == 0) {
                z = false;
            }
        }
        return z;
    }

    public static PlaceholderSurface d(Context context, boolean z) {
        boolean z2;
        int i;
        boolean z3 = false;
        if (z && !b(context)) {
            z2 = false;
        } else {
            z2 = true;
        }
        cp3.m(z2);
        j52 j52Var = new j52();
        if (z) {
            i = d;
        } else {
            i = 0;
        }
        j52Var.start();
        Handler handler = new Handler(j52Var.getLooper(), j52Var);
        j52Var.f2704b = handler;
        j52Var.f2703a = new jp0(handler);
        synchronized (j52Var) {
            j52Var.f2704b.obtainMessage(1, i, 0).sendToTarget();
            while (j52Var.e == null && j52Var.d == null && j52Var.c == null) {
                try {
                    j52Var.wait();
                } catch (InterruptedException unused) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = j52Var.d;
        if (runtimeException == null) {
            Error error = j52Var.c;
            if (error == null) {
                PlaceholderSurface placeholderSurface = j52Var.e;
                placeholderSurface.getClass();
                return placeholderSurface;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f1515b) {
            if (!this.c) {
                j52 j52Var = this.f1515b;
                j52Var.f2704b.getClass();
                j52Var.f2704b.sendEmptyMessage(2);
                this.c = true;
            }
        }
    }
}
