package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.fragment.app.p;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.StartError;
import com.chartboost.sdk.impl.u8;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.drm.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class lf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3114b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lf(int i, Object obj, Object obj2) {
        this.f3113a = i;
        this.f3114b = obj;
        this.c = obj2;
    }

    private final void a() {
        qj0 qj0Var;
        q32 q32Var = (q32) this.f3114b;
        fb2 fb2Var = (fb2) this.c;
        if (q32Var.f3956b == q32.d) {
            synchronized (q32Var) {
                qj0Var = q32Var.f3955a;
                q32Var.f3955a = null;
                q32Var.f3956b = fb2Var;
            }
            qj0Var.g(fb2Var);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void b() {
        cj1 cj1Var = (cj1) this.f3114b;
        fb2 fb2Var = (fb2) this.c;
        synchronized (cj1Var) {
            if (cj1Var.f648b == null) {
                cj1Var.f647a.add(fb2Var);
            } else {
                cj1Var.f648b.add(fb2Var.get());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        long j;
        boolean z;
        long j2;
        boolean z2;
        lo2 ty0Var;
        long j3 = -9223372036854775807L;
        final int i = 1;
        boolean z3 = false;
        z3 = false;
        switch (this.f3113a) {
            case 0:
                mf mfVar = (mf) this.f3114b;
                Runnable runnable = (Runnable) this.c;
                mfVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    mfVar.a();
                }
            case 1:
                ((tf3) this.f3114b).m0((Typeface) this.c);
                return;
            case 2:
                u93 u93Var = (u93) this.f3114b;
                wy2 wy2Var = (wy2) this.c;
                u93Var.f().bringToFront();
                ((ut0) wy2Var).g(u93Var);
                return;
            case 3:
                vi0 vi0Var = (vi0) this.f3114b;
                ux2 ux2Var = (ux2) this.c;
                vi0Var.a();
                if (p.I(2)) {
                    ux2Var.toString();
                    return;
                }
                return;
            case 4:
            case 5:
            case 23:
            default:
                ma1 ma1Var = (ma1) this.f3114b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                ma1Var.getClass();
                try {
                    taskCompletionSource.setResult(ma1Var.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 6:
                ProfileInstallerInitializer profileInstallerInitializer = (ProfileInstallerInitializer) this.f3114b;
                Context context = (Context) this.c;
                profileInstallerInitializer.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = h92.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new e92(context, z3 ? 1 : 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 7:
                u8.a((StartCallback) this.f3114b, (StartError) this.c);
                return;
            case 8:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f3114b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i2 = JobInfoSchedulerService.f1456a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 9:
                bu0 bu0Var = (bu0) this.f3114b;
                eu0 eu0Var = (eu0) this.c;
                int i3 = bu0Var.C - eu0Var.c;
                bu0Var.C = i3;
                if (eu0Var.d) {
                    bu0Var.D = eu0Var.e;
                    bu0Var.E = true;
                }
                if (eu0Var.f) {
                    bu0Var.F = eu0Var.g;
                }
                if (i3 == 0) {
                    a93 a93Var = eu0Var.f1997b.f3785a;
                    if (!bu0Var.a0.f3785a.q() && a93Var.q()) {
                        bu0Var.b0 = -1;
                        bu0Var.c0 = 0L;
                    }
                    if (!a93Var.q()) {
                        List asList = Arrays.asList(((d62) a93Var).k);
                        if (asList.size() == bu0Var.n.size()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        cp3.m(z2);
                        for (int i4 = 0; i4 < asList.size(); i4++) {
                            ((au0) bu0Var.n.get(i4)).f340b = (a93) asList.get(i4);
                        }
                    }
                    if (bu0Var.E) {
                        if (eu0Var.f1997b.f3786b.equals(bu0Var.a0.f3786b) && eu0Var.f1997b.d == bu0Var.a0.r) {
                            i = 0;
                        }
                        if (i != 0) {
                            if (!a93Var.q() && !eu0Var.f1997b.f3786b.a()) {
                                p52 p52Var = eu0Var.f1997b;
                                rt1 rt1Var = p52Var.f3786b;
                                long j4 = p52Var.d;
                                Object obj = rt1Var.f3536a;
                                y83 y83Var = bu0Var.m;
                                a93Var.h(obj, y83Var);
                                j2 = j4 + y83Var.e;
                            } else {
                                j2 = eu0Var.f1997b.d;
                            }
                            j3 = j2;
                        }
                        j = j3;
                        z = i;
                    } else {
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    bu0Var.E = false;
                    bu0Var.A(eu0Var.f1997b, 1, bu0Var.F, z, bu0Var.D, j);
                    return;
                }
                return;
            case 10:
                hu0 hu0Var = (hu0) this.f3114b;
                c62 c62Var = (c62) this.c;
                hu0Var.getClass();
                try {
                    hu0.d(c62Var);
                    return;
                } catch (jt0 e2) {
                    sn1.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
                    throw new RuntimeException(e2);
                }
            case 11:
                x50 x50Var = (x50) this.f3114b;
                final String str = (String) this.c;
                yt0 yt0Var = (yt0) x50Var.c;
                int i5 = wi3.f5017a;
                uf0 uf0Var = (uf0) yt0Var.f5387a.q;
                final wa n = uf0Var.n();
                uf0Var.o(n, 1012, new rl1(n, str, i) { // from class: pf0

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f3835a;

                    {
                        this.f3835a = i;
                    }

                    @Override // defpackage.rl1
                    public final void invoke(Object obj2) {
                        switch (this.f3835a) {
                            case 0:
                                ((xa) obj2).getClass();
                                return;
                            default:
                                ((xa) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
            case 12:
                AudioTrack audioTrack = (AudioTrack) this.f3114b;
                u93 u93Var2 = (u93) this.c;
                Object obj2 = ig0.d0;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    u93Var2.h();
                    synchronized (ig0.d0) {
                        int i6 = ig0.f0 - 1;
                        ig0.f0 = i6;
                        if (i6 == 0) {
                            ig0.e0.shutdown();
                            ig0.e0 = null;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    u93Var2.h();
                    synchronized (ig0.d0) {
                        int i7 = ig0.f0 - 1;
                        ig0.f0 = i7;
                        if (i7 == 0) {
                            ig0.e0.shutdown();
                            ig0.e0 = null;
                        }
                        throw th;
                    }
                }
            case 13:
                ah0 ah0Var = (ah0) this.f3114b;
                y01 y01Var = (y01) this.c;
                b bVar = ah0Var.d;
                if (bVar.o != 0 && !ah0Var.c) {
                    Looper looper = bVar.s;
                    looper.getClass();
                    ah0Var.f85b = bVar.a(looper, ah0Var.f84a, y01Var, false);
                    bVar.m.add(ah0Var);
                    return;
                }
                return;
            case 14:
                wm0.access$300((wm0) this.c, ((um0) this.f3114b).f4696b.m);
                return;
            case 15:
                u92 u92Var = (u92) this.f3114b;
                lo2 lo2Var = (lo2) this.c;
                if (u92Var.r == null) {
                    ty0Var = lo2Var;
                } else {
                    ty0Var = new ty0(-9223372036854775807L);
                }
                u92Var.y = ty0Var;
                u92Var.z = lo2Var.h();
                if (!u92Var.F && lo2Var.h() == -9223372036854775807L) {
                    z3 = true;
                }
                u92Var.A = z3;
                if (z3) {
                    i = 7;
                }
                u92Var.B = i;
                u92Var.g.s(u92Var.z, lo2Var.b(), u92Var.A);
                if (!u92Var.v) {
                    u92Var.w();
                    return;
                }
                return;
            case 16:
                p71.C(((uy0) this.f3114b).c);
                int i8 = g8.k;
                throw null;
            case 17:
                ((kg0) this.c).a(((wz1) this.f3114b).c());
                return;
            case 18:
                jk3 jk3Var = (jk3) this.f3114b;
                final String str2 = (String) this.c;
                jk3Var.getClass();
                int i9 = wi3.f5017a;
                uf0 uf0Var2 = (uf0) ((yt0) jk3Var.f2783b).f5387a.q;
                final wa n2 = uf0Var2.n();
                final int i10 = z3 ? 1 : 0;
                uf0Var2.o(n2, 1019, new rl1(n2, str2, i10) { // from class: pf0

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f3835a;

                    {
                        this.f3835a = i10;
                    }

                    @Override // defpackage.rl1
                    public final void invoke(Object obj22) {
                        switch (this.f3835a) {
                            case 0:
                                ((xa) obj22).getClass();
                                return;
                            default:
                                ((xa) obj22).getClass();
                                return;
                        }
                    }
                });
                return;
            case 19:
                jk3 jk3Var2 = (jk3) this.f3114b;
                lk3 lk3Var = (lk3) this.c;
                jk3Var2.getClass();
                int i11 = wi3.f5017a;
                bu0 bu0Var2 = ((yt0) jk3Var2.f2783b).f5387a;
                bu0Var2.getClass();
                bu0Var2.k.l(25, new z5(lk3Var, 18));
                return;
            case 20:
                jk3 jk3Var3 = (jk3) this.f3114b;
                Exception exc = (Exception) this.c;
                jk3Var3.getClass();
                int i12 = wi3.f5017a;
                uf0 uf0Var3 = (uf0) ((yt0) jk3Var3.f2783b).f5387a.q;
                wa n3 = uf0Var3.n();
                uf0Var3.o(n3, 1030, new lf0(n3, exc, 0));
                return;
            case 21:
                a();
                return;
            case 22:
                b();
                return;
            case 24:
                ad0 ad0Var = (ad0) this.f3114b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(ad0Var.c);
                StrictMode.ThreadPolicy threadPolicy = ad0Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 25:
                Callable callable = (Callable) this.f3114b;
                uo uoVar = (uo) this.c;
                try {
                    Object call = callable.call();
                    ek0 ek0Var = (ek0) uoVar.f4707a;
                    int i13 = ek0.i;
                    ek0Var.h(call);
                    return;
                } catch (Exception e3) {
                    ek0 ek0Var2 = (ek0) uoVar.f4707a;
                    int i14 = ek0.i;
                    ek0Var2.i(e3);
                    return;
                }
            case 26:
                kj2 kj2Var = (kj2) this.f3114b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                kj2Var.getClass();
                try {
                    bc3 bc3Var = kj2Var.h;
                    y72 y72Var = y72.HIGHEST;
                    if (bc3Var instanceof bc3) {
                        dc3.a().d.a(bc3Var.f447a.c(y72Var), 1);
                    } else if (Log.isLoggable(pe0.C("ForcedSender"), 5)) {
                        String.format("Expected instance of `TransportImpl`, got `%s`.", bc3Var);
                    }
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
            case 27:
                ew0 ew0Var = (ew0) this.f3114b;
                Intent intent = (Intent) this.c;
                ew0Var.getClass();
                ew0.a(intent);
                return;
            case 28:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f3114b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                uo uoVar2 = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource2.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e4) {
                    taskCompletionSource2.setException(e4);
                    return;
                }
        }
    }
}
