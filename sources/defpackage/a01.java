package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a01 implements zp0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8a;

    /* renamed from: b, reason: collision with root package name */
    public final kc f9b;
    public final c02 c;
    public final Object d;
    public Handler e;
    public Executor f;
    public ThreadPoolExecutor g;
    public m20 h;
    public jc0 i;

    public a01(Context context, kc kcVar) {
        c02 c02Var = bq0.d;
        this.d = new Object();
        if (context != null) {
            this.f8a = context.getApplicationContext();
            this.f9b = kcVar;
            this.c = c02Var;
            return;
        }
        throw new NullPointerException("Context cannot be null");
    }

    @Override // defpackage.zp0
    public final void a(m20 m20Var) {
        synchronized (this.d) {
            this.h = m20Var;
        }
        c();
    }

    public final void b() {
        synchronized (this.d) {
            this.h = null;
            jc0 jc0Var = this.i;
            if (jc0Var != null) {
                c02 c02Var = this.c;
                Context context = this.f8a;
                c02Var.getClass();
                context.getContentResolver().unregisterContentObserver(jc0Var);
                this.i = null;
            }
            Handler handler = this.e;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.e = null;
            ThreadPoolExecutor threadPoolExecutor = this.g;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.f = null;
            this.g = null;
        }
    }

    public final void c() {
        synchronized (this.d) {
            if (this.h == null) {
                return;
            }
            final int i = 0;
            if (this.f == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new p40("emojiCompat", 0));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.g = threadPoolExecutor;
                this.f = threadPoolExecutor;
            }
            this.f.execute(new Runnable(this) { // from class: zz0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a01 f5574b;

                {
                    this.f5574b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            a01 a01Var = this.f5574b;
                            synchronized (a01Var.d) {
                                if (a01Var.h != null) {
                                    try {
                                        l01 d = a01Var.d();
                                        int i2 = d.e;
                                        if (i2 == 2) {
                                            synchronized (a01Var.d) {
                                            }
                                        }
                                        if (i2 == 0) {
                                            try {
                                                int i3 = qa3.f3976a;
                                                pa3.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                c02 c02Var = a01Var.c;
                                                Context context = a01Var.f8a;
                                                c02Var.getClass();
                                                Typeface z = jf3.f2758a.z(context, new l01[]{d}, 0);
                                                MappedByteBuffer e0 = tf3.e0(a01Var.f8a, d.f3043a);
                                                if (e0 != null && z != null) {
                                                    try {
                                                        pa3.a("EmojiCompat.MetadataRepo.create");
                                                        wq2 wq2Var = new wq2(z, ew3.b1(e0));
                                                        pa3.b();
                                                        pa3.b();
                                                        synchronized (a01Var.d) {
                                                            m20 m20Var = a01Var.h;
                                                            if (m20Var != null) {
                                                                m20Var.I0(wq2Var);
                                                            }
                                                        }
                                                        a01Var.b();
                                                        return;
                                                    } finally {
                                                        int i4 = qa3.f3976a;
                                                        pa3.b();
                                                    }
                                                }
                                                throw new RuntimeException("Unable to open file.");
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                                    } catch (Throwable th2) {
                                        synchronized (a01Var.d) {
                                            m20 m20Var2 = a01Var.h;
                                            if (m20Var2 != null) {
                                                m20Var2.H0(th2);
                                            }
                                            a01Var.b();
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                        default:
                            this.f5574b.c();
                            return;
                    }
                }
            });
        }
    }

    public final l01 d() {
        try {
            c02 c02Var = this.c;
            Context context = this.f8a;
            kc kcVar = this.f9b;
            c02Var.getClass();
            q9 y = cp3.y(context, kcVar);
            if (y.f3969a == 0) {
                l01[] l01VarArr = (l01[]) y.f3970b;
                if (l01VarArr != null && l01VarArr.length != 0) {
                    return l01VarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(hx2.r(new StringBuilder("fetchFonts failed ("), y.f3969a, ")"));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
