package defpackage;

import android.animation.Animator;
import android.content.Intent;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import androidx.fragment.app.l;
import androidx.fragment.app.p;
import com.chartboost.sdk.impl.q1;
import com.chartboost.sdk.impl.sa;
import com.chartboost.sdk.impl.z;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class ti0 implements wu, sa.b, i43, rl1, sl1, kj0, qj0, Continuation, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4511b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ti0(int i, Object obj, Object obj2) {
        this.f4510a = i;
        this.f4511b = obj;
        this.c = obj2;
    }

    @Override // com.chartboost.sdk.impl.sa.b
    public void a() {
        z.a((z) this.f4511b, (q1) this.c);
    }

    @Override // defpackage.wu
    public void b() {
        Animator animator = (Animator) this.f4511b;
        ux2 ux2Var = (ux2) this.c;
        animator.end();
        if (p.I(2)) {
            ux2Var.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    @Override // defpackage.kj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.ji2 c(int r21, defpackage.ua3 r22, int[] r23) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti0.c(int, ua3, int[]):ji2");
    }

    @Override // defpackage.i43
    public Object execute() {
        int i = this.f4510a;
        Object obj = this.c;
        Object obj2 = this.f4511b;
        switch (i) {
            case 3:
                Iterable iterable = (Iterable) obj;
                am2 am2Var = (am2) ((fi3) obj2).c;
                am2Var.getClass();
                if (iterable.iterator().hasNext()) {
                    am2Var.a().compileStatement("DELETE FROM events WHERE _id in " + am2.K(iterable)).execute();
                }
                return null;
            default:
                fi3 fi3Var = (fi3) obj2;
                fi3Var.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    long intValue = ((Integer) entry.getValue()).intValue();
                    vn1 vn1Var = vn1.INVALID_PAYLOD;
                    String str = (String) entry.getKey();
                    am2 am2Var2 = (am2) fi3Var.i;
                    am2Var2.getClass();
                    am2Var2.d(new ei3(str, intValue, vn1Var));
                }
                return null;
        }
    }

    @Override // defpackage.qj0
    public void g(fb2 fb2Var) {
        qj0 qj0Var = (qj0) this.f4511b;
        qj0 qj0Var2 = (qj0) this.c;
        qj0Var.g(fb2Var);
        qj0Var2.g(fb2Var);
    }

    @Override // defpackage.rl1
    public void invoke(Object obj) {
        String str;
        int i = this.f4510a;
        Object obj2 = this.c;
        switch (i) {
            case 5:
                ((xa) obj).getClass();
                return;
            case 6:
                ((xa) obj).getClass();
                return;
            case 7:
                ((xa) obj).getClass();
                return;
            case 8:
            default:
                lk3 lk3Var = (lk3) obj2;
                jt1 jt1Var = (jt1) ((xa) obj);
                f30 f30Var = jt1Var.o;
                if (f30Var != null) {
                    y01 y01Var = (y01) f30Var.c;
                    if (y01Var.r == -1) {
                        x01 x01Var = new x01(y01Var);
                        x01Var.p = lk3Var.f3145a;
                        x01Var.q = lk3Var.f3146b;
                        jt1Var.o = new f30(new y01(x01Var), f30Var.f2037b, (String) f30Var.d, 1);
                    }
                }
                int i2 = lk3Var.f3145a;
                return;
            case 9:
                ((xa) obj).getClass();
                return;
            case 10:
                wa waVar = (wa) this.f4511b;
                et1 et1Var = (et1) obj2;
                jt1 jt1Var2 = (jt1) ((xa) obj);
                jt1Var2.getClass();
                if (waVar.d != null) {
                    y01 y01Var2 = et1Var.c;
                    y01Var2.getClass();
                    mi0 mi0Var = jt1Var2.f2825b;
                    rt1 rt1Var = waVar.d;
                    rt1Var.getClass();
                    a93 a93Var = waVar.f4969b;
                    synchronized (mi0Var) {
                        str = mi0Var.b(a93Var.h(rt1Var.f3536a, mi0Var.f3302b).c, rt1Var).f3131a;
                    }
                    f30 f30Var2 = new f30(y01Var2, et1Var.d, str, 1);
                    int i3 = et1Var.f1993b;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    jt1Var2.q = f30Var2;
                                    return;
                                }
                                return;
                            }
                        } else {
                            jt1Var2.p = f30Var2;
                            return;
                        }
                    }
                    jt1Var2.o = f30Var2;
                    return;
                }
                return;
            case 11:
                ((xa) obj).getClass();
                return;
            case 12:
                ((xa) obj).getClass();
                return;
            case 13:
                ((xa) obj).getClass();
                return;
            case 14:
                ((xa) obj).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.f4510a;
        Object obj = this.c;
        Object obj2 = this.f4511b;
        switch (i) {
            case 0:
                ((sr0) obj2).a((Intent) obj);
                return;
            default:
                b bVar = (b) obj2;
                yk2 yk2Var = (yk2) obj;
                String str = null;
                l lVar = null;
                int i2 = 1;
                if (task.isSuccessful()) {
                    ReviewInfo reviewInfo = (ReviewInfo) task.getResult();
                    l lVar2 = yk2Var.f5354a;
                    if (lVar2 != null) {
                        lVar = lVar2;
                    }
                    bVar.a(lVar, reviewInfo).addOnCompleteListener(new qb0(i2));
                    return;
                }
                Object[] objArr = new Object[1];
                Exception exception = task.getException();
                if (exception != null) {
                    str = exception.getMessage();
                }
                objArr[0] = hx2.p("Error1:", str);
                pe0.a("wvuuc254m8", objArr);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        lj2 lj2Var = (lj2) this.f4511b;
        String str = (String) this.c;
        synchronized (lj2Var) {
            lj2Var.f3140b.remove(str);
        }
        return task;
    }

    @Override // defpackage.sl1
    public void a(Object obj, wy0 wy0Var) {
        int i;
        boolean z;
        int i2;
        kz1 kz1Var;
        kz1 kz1Var2;
        kz1 kz1Var3;
        kz1 kz1Var4;
        kz1 kz1Var5;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        f30 f30Var;
        boolean z2;
        int i3;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        int i4;
        DrmInitData drmInitData;
        int i5;
        uf0 uf0Var = (uf0) this.f4511b;
        x52 x52Var = (x52) this.c;
        xa xaVar = (xa) obj;
        SparseArray sparseArray = uf0Var.e;
        SparseArray sparseArray2 = new SparseArray(wy0Var.b());
        for (int i6 = 0; i6 < wy0Var.b(); i6++) {
            int a2 = wy0Var.a(i6);
            wa waVar = (wa) sparseArray.get(a2);
            waVar.getClass();
            sparseArray2.append(a2, waVar);
        }
        jt1 jt1Var = (jt1) xaVar;
        jt1Var.getClass();
        if (wy0Var.b() == 0) {
            return;
        }
        for (int i7 = 0; i7 < wy0Var.b(); i7++) {
            int a3 = wy0Var.a(i7);
            wa waVar2 = (wa) sparseArray2.get(a3);
            waVar2.getClass();
            if (a3 == 0) {
                mi0 mi0Var = jt1Var.f2825b;
                synchronized (mi0Var) {
                    mi0Var.d.getClass();
                    a93 a93Var = mi0Var.e;
                    mi0Var.e = waVar2.f4969b;
                    Iterator it = mi0Var.c.values().iterator();
                    while (it.hasNext()) {
                        li0 li0Var = (li0) it.next();
                        if (!li0Var.b(a93Var, mi0Var.e) || li0Var.a(waVar2)) {
                            it.remove();
                            if (li0Var.e) {
                                if (li0Var.f3131a.equals(mi0Var.f)) {
                                    mi0Var.f = null;
                                }
                                ((jt1) mi0Var.d).h(waVar2, li0Var.f3131a);
                            }
                        }
                    }
                    mi0Var.c(waVar2);
                }
            } else if (a3 == 11) {
                jt1Var.f2825b.e(waVar2, jt1Var.k);
            } else {
                jt1Var.f2825b.d(waVar2);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (wy0Var.f5085a.get(0)) {
            wa waVar3 = (wa) sparseArray2.get(0);
            waVar3.getClass();
            if (jt1Var.j != null) {
                jt1Var.f(waVar3.f4969b, waVar3.d);
            }
        }
        if (wy0Var.f5085a.get(2) && jt1Var.j != null) {
            bu0 bu0Var = (bu0) x52Var;
            bu0Var.C();
            db1 listIterator = bu0Var.a0.i.d.f2227a.listIterator(0);
            loop3: while (true) {
                if (!listIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                fb3 fb3Var = (fb3) listIterator.next();
                for (int i8 = 0; i8 < fb3Var.f2069a; i8++) {
                    if (fb3Var.e[i8] && (drmInitData = fb3Var.f2070b.d[i8].o) != null) {
                        break loop3;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder g = ht1.g(jt1Var.j);
                int i9 = 0;
                while (true) {
                    if (i9 >= drmInitData.d) {
                        i5 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.f1457a[i9].f1460b;
                    if (uuid.equals(et.d)) {
                        i5 = 3;
                        break;
                    } else if (uuid.equals(et.e)) {
                        i5 = 2;
                        break;
                    } else {
                        if (uuid.equals(et.c)) {
                            i5 = 6;
                            break;
                        }
                        i9++;
                    }
                }
                g.setDrmType(i5);
            }
        }
        if (wy0Var.f5085a.get(1011)) {
            jt1Var.z++;
        }
        o52 o52Var = jt1Var.n;
        if (o52Var == null) {
            i2 = 8;
        } else {
            boolean z3 = jt1Var.v == 4;
            int i10 = o52Var.f3604a;
            if (i10 == 1001) {
                kz1Var5 = new kz1(20, 0);
            } else {
                if (o52Var instanceof jt0) {
                    jt0 jt0Var = (jt0) o52Var;
                    z = jt0Var.h == 1;
                    i = jt0Var.l;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = o52Var.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    i2 = 8;
                    if (z && (i == 0 || i == 1)) {
                        kz1Var4 = new kz1(35, 0);
                    } else if (z && i == 3) {
                        kz1Var4 = new kz1(15, 0);
                    } else if (z && i == 2) {
                        kz1Var = new kz1(23, 0);
                        timeSinceCreatedMillis = ht1.e().setTimeSinceCreatedMillis(elapsedRealtime - jt1Var.d);
                        errorCode = timeSinceCreatedMillis.setErrorCode(kz1Var.f3039a);
                        subErrorCode = errorCode.setSubErrorCode(kz1Var.f3040b);
                        exception = subErrorCode.setException(o52Var);
                        build = exception.build();
                        jt1Var.c.reportPlaybackErrorEvent(build);
                        jt1Var.A = true;
                        jt1Var.n = null;
                    } else {
                        if (cause instanceof bs1) {
                            kz1Var = new kz1(13, wi3.p(((bs1) cause).d));
                        } else if (cause instanceof xr1) {
                            kz1Var2 = new kz1(14, wi3.p(((xr1) cause).f5207a));
                        } else if (cause instanceof OutOfMemoryError) {
                            kz1Var = new kz1(14, 0);
                        } else {
                            if (cause instanceof gi) {
                                kz1Var3 = new kz1(17, ((gi) cause).f2255a);
                            } else if (cause instanceof ii) {
                                kz1Var3 = new kz1(18, ((ii) cause).f2598a);
                            } else if (wi3.f5017a >= 16 && (cause instanceof MediaCodec.CryptoException)) {
                                int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                kz1Var2 = new kz1(jt1.c(errorCode2), errorCode2);
                            } else {
                                kz1Var = new kz1(22, 0);
                            }
                            kz1Var = kz1Var3;
                        }
                        timeSinceCreatedMillis = ht1.e().setTimeSinceCreatedMillis(elapsedRealtime - jt1Var.d);
                        errorCode = timeSinceCreatedMillis.setErrorCode(kz1Var.f3039a);
                        subErrorCode = errorCode.setSubErrorCode(kz1Var.f3040b);
                        exception = subErrorCode.setException(o52Var);
                        build = exception.build();
                        jt1Var.c.reportPlaybackErrorEvent(build);
                        jt1Var.A = true;
                        jt1Var.n = null;
                    }
                    kz1Var = kz1Var4;
                    timeSinceCreatedMillis = ht1.e().setTimeSinceCreatedMillis(elapsedRealtime - jt1Var.d);
                    errorCode = timeSinceCreatedMillis.setErrorCode(kz1Var.f3039a);
                    subErrorCode = errorCode.setSubErrorCode(kz1Var.f3040b);
                    exception = subErrorCode.setException(o52Var);
                    build = exception.build();
                    jt1Var.c.reportPlaybackErrorEvent(build);
                    jt1Var.A = true;
                    jt1Var.n = null;
                } else if (cause instanceof h91) {
                    kz1Var5 = new kz1(5, ((h91) cause).d);
                } else {
                    if (!(cause instanceof g91) && !(cause instanceof u42)) {
                        boolean z4 = cause instanceof f91;
                        if (z4 || (cause instanceof tg3)) {
                            if (wz1.b(jt1Var.f2824a).c() == 1) {
                                kz1Var5 = new kz1(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    kz1Var5 = new kz1(6, 0);
                                    kz1Var = kz1Var5;
                                    i2 = 8;
                                } else {
                                    if (cause2 instanceof SocketTimeoutException) {
                                        kz1Var5 = new kz1(7, 0);
                                    } else if (z4 && ((f91) cause).c == 1) {
                                        kz1Var5 = new kz1(4, 0);
                                    } else {
                                        i2 = 8;
                                        kz1Var = new kz1(8, 0);
                                    }
                                    kz1Var = kz1Var5;
                                    i2 = 8;
                                }
                            }
                        } else if (i10 == 1002) {
                            kz1Var5 = new kz1(21, 0);
                        } else if (cause instanceof qn0) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i11 = wi3.f5017a;
                            if (i11 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                int p = wi3.p(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                kz1Var2 = new kz1(jt1.c(p), p);
                                i2 = 8;
                            } else if (i11 >= 23 && vf0.B(cause3)) {
                                kz1Var5 = new kz1(27, 0);
                            } else if (i11 >= 18 && (cause3 instanceof NotProvisionedException)) {
                                kz1Var5 = new kz1(24, 0);
                            } else if (i11 >= 18 && (cause3 instanceof DeniedByServerException)) {
                                kz1Var5 = new kz1(29, 0);
                            } else if (cause3 instanceof ai3) {
                                kz1Var5 = new kz1(23, 0);
                            } else if (cause3 instanceof zg0) {
                                kz1Var5 = new kz1(28, 0);
                            } else {
                                kz1Var5 = new kz1(30, 0);
                            }
                        } else if ((cause instanceof ex0) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if (wi3.f5017a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                kz1Var5 = new kz1(32, 0);
                            } else {
                                kz1Var5 = new kz1(31, 0);
                            }
                        } else {
                            kz1Var5 = new kz1(9, 0);
                        }
                        kz1Var = kz1Var5;
                        i2 = 8;
                    } else {
                        i2 = 8;
                        kz1Var = new kz1(z3 ? 10 : 11, 0);
                    }
                    timeSinceCreatedMillis = ht1.e().setTimeSinceCreatedMillis(elapsedRealtime - jt1Var.d);
                    errorCode = timeSinceCreatedMillis.setErrorCode(kz1Var.f3039a);
                    subErrorCode = errorCode.setSubErrorCode(kz1Var.f3040b);
                    exception = subErrorCode.setException(o52Var);
                    build = exception.build();
                    jt1Var.c.reportPlaybackErrorEvent(build);
                    jt1Var.A = true;
                    jt1Var.n = null;
                }
                kz1Var = kz1Var2;
                timeSinceCreatedMillis = ht1.e().setTimeSinceCreatedMillis(elapsedRealtime - jt1Var.d);
                errorCode = timeSinceCreatedMillis.setErrorCode(kz1Var.f3039a);
                subErrorCode = errorCode.setSubErrorCode(kz1Var.f3040b);
                exception = subErrorCode.setException(o52Var);
                build = exception.build();
                jt1Var.c.reportPlaybackErrorEvent(build);
                jt1Var.A = true;
                jt1Var.n = null;
            }
            kz1Var = kz1Var5;
            i2 = 8;
            timeSinceCreatedMillis = ht1.e().setTimeSinceCreatedMillis(elapsedRealtime - jt1Var.d);
            errorCode = timeSinceCreatedMillis.setErrorCode(kz1Var.f3039a);
            subErrorCode = errorCode.setSubErrorCode(kz1Var.f3040b);
            exception = subErrorCode.setException(o52Var);
            build = exception.build();
            jt1Var.c.reportPlaybackErrorEvent(build);
            jt1Var.A = true;
            jt1Var.n = null;
        }
        if (wy0Var.f5085a.get(2)) {
            bu0 bu0Var2 = (bu0) x52Var;
            bu0Var2.C();
            gb3 gb3Var = bu0Var2.a0.i.d;
            boolean a4 = gb3Var.a(2);
            boolean a5 = gb3Var.a(1);
            boolean a6 = gb3Var.a(3);
            if (a4 || a5 || a6) {
                if (a4) {
                    i4 = 0;
                } else {
                    i4 = 0;
                    jt1Var.g(elapsedRealtime, null, 0);
                }
                if (!a5) {
                    jt1Var.d(elapsedRealtime, null, i4);
                }
                if (!a6) {
                    jt1Var.e(elapsedRealtime, null, i4);
                }
            }
        }
        if (jt1Var.a(jt1Var.o)) {
            f30 f30Var2 = jt1Var.o;
            y01 y01Var = (y01) f30Var2.c;
            if (y01Var.r != -1) {
                jt1Var.g(elapsedRealtime, y01Var, f30Var2.f2037b);
                jt1Var.o = null;
            }
        }
        if (jt1Var.a(jt1Var.p)) {
            f30 f30Var3 = jt1Var.p;
            jt1Var.d(elapsedRealtime, (y01) f30Var3.c, f30Var3.f2037b);
            f30Var = null;
            jt1Var.p = null;
        } else {
            f30Var = null;
        }
        if (jt1Var.a(jt1Var.q)) {
            f30 f30Var4 = jt1Var.q;
            jt1Var.e(elapsedRealtime, (y01) f30Var4.c, f30Var4.f2037b);
            jt1Var.q = f30Var;
        }
        switch (wz1.b(jt1Var.f2824a).c()) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 9;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
            case 8:
            default:
                i2 = 1;
                break;
            case 7:
                i2 = 3;
                break;
            case 9:
                break;
            case 10:
                i2 = 7;
                break;
        }
        if (i2 != jt1Var.m) {
            jt1Var.m = i2;
            networkType = ht1.a().setNetworkType(i2);
            timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - jt1Var.d);
            build3 = timeSinceCreatedMillis3.build();
            jt1Var.c.reportNetworkEvent(build3);
        }
        bu0 bu0Var3 = (bu0) x52Var;
        bu0Var3.C();
        if (bu0Var3.a0.e != 2) {
            z2 = false;
            jt1Var.u = false;
        } else {
            z2 = false;
        }
        bu0Var3.C();
        if (bu0Var3.a0.f == null) {
            jt1Var.w = z2;
        } else if (wy0Var.f5085a.get(10)) {
            jt1Var.w = true;
        }
        bu0Var3.C();
        int i12 = bu0Var3.a0.e;
        if (jt1Var.u) {
            i3 = 5;
        } else if (jt1Var.w) {
            i3 = 13;
        } else if (i12 == 4) {
            i3 = 11;
        } else {
            i3 = 2;
            if (i12 == 2) {
                int i13 = jt1Var.l;
                if (i13 != 0 && i13 != 2) {
                    if (bu0Var3.n()) {
                        bu0Var3.C();
                        i3 = bu0Var3.a0.m != 0 ? 10 : 6;
                    } else {
                        i3 = 7;
                    }
                }
            } else if (i12 == 3) {
                if (bu0Var3.n()) {
                    bu0Var3.C();
                    i3 = bu0Var3.a0.m != 0 ? 9 : 3;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = (i12 != 1 || jt1Var.l == 0) ? jt1Var.l : 12;
            }
        }
        if (jt1Var.l != i3) {
            jt1Var.l = i3;
            jt1Var.A = true;
            state = it1.i().setState(jt1Var.l);
            timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - jt1Var.d);
            build2 = timeSinceCreatedMillis2.build();
            jt1Var.c.reportPlaybackStateEvent(build2);
        }
        if (wy0Var.f5085a.get(1028)) {
            mi0 mi0Var2 = jt1Var.f2825b;
            wa waVar4 = (wa) sparseArray2.get(1028);
            waVar4.getClass();
            mi0Var2.a(waVar4);
        }
    }
}
