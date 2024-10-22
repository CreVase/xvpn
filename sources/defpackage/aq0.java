package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class aq0 {
    public static final Object j = new Object();
    public static volatile aq0 k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f316a;

    /* renamed from: b, reason: collision with root package name */
    public final ng f317b;
    public volatile int c;
    public final Handler d;
    public final vp0 e;
    public final zp0 f;
    public final s71 g;
    public final int h;
    public final lh0 i;

    public aq0(bq0 bq0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f316a = reentrantReadWriteLock;
        this.c = 3;
        this.f = bq0Var.f5052a;
        int i = bq0Var.f5053b;
        this.h = i;
        this.i = bq0Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.f317b = new ng(0);
        this.g = new s71(6);
        vp0 vp0Var = new vp0(this);
        this.e = vp0Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.f316a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                ((aq0) vp0Var.f2735b).f.a(new up0(vp0Var));
            } catch (Throwable th2) {
                ((aq0) vp0Var.f2735b).d(th2);
            }
        }
    }

    public static aq0 a() {
        aq0 aq0Var;
        boolean z;
        synchronized (j) {
            aq0Var = k;
            if (aq0Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return aq0Var;
    }

    public final int b() {
        this.f316a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.f316a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z;
        boolean z2 = true;
        if (this.h == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (b() != 1) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            this.f316a.writeLock().lock();
            try {
                if (this.c == 0) {
                    return;
                }
                this.c = 0;
                this.f316a.writeLock().unlock();
                vp0 vp0Var = this.e;
                vp0Var.getClass();
                try {
                    ((aq0) vp0Var.f2735b).f.a(new up0(vp0Var));
                    return;
                } catch (Throwable th) {
                    ((aq0) vp0Var.f2735b).d(th);
                    return;
                }
            } finally {
                this.f316a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f316a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.f317b);
            this.f317b.clear();
            this.f316a.writeLock().unlock();
            this.d.post(new l30(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.f316a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f316a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.f317b);
            this.f317b.clear();
            this.f316a.writeLock().unlock();
            this.d.post(new l30(this.c, arrayList));
        } catch (Throwable th) {
            this.f316a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence f(int i, int i2, CharSequence charSequence) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (b() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i <= i2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    tf3.u(z2, "start should be <= than end");
                    if (charSequence == null) {
                        return null;
                    }
                    if (i <= charSequence.length()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    tf3.u(z3, "start should be < than charSequence length");
                    if (i2 > charSequence.length()) {
                        z4 = false;
                    }
                    tf3.u(z4, "end should be < than charSequence length");
                    if (charSequence.length() != 0 && i != i2) {
                        return this.e.K(charSequence, i, i2, false);
                    }
                    return charSequence;
                }
                throw new IllegalArgumentException("end cannot be negative");
            }
            throw new IllegalArgumentException("start cannot be negative");
        }
        throw new IllegalStateException("Not initialized yet");
    }

    public final CharSequence g(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return f(0, length, charSequence);
    }

    public final void h(yp0 yp0Var) {
        if (yp0Var != null) {
            this.f316a.writeLock().lock();
            try {
                if (this.c != 1 && this.c != 2) {
                    this.f317b.add(yp0Var);
                    return;
                }
                this.d.post(new l30(yp0Var, this.c));
                return;
            } finally {
                this.f316a.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }
}
