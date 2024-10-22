package defpackage;

import a.bx;
import a.du;
import android.R;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.vungle.ads.internal.protos.Sdk;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public abstract class ew3 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ExecutorService f2012a;

    /* renamed from: b, reason: collision with root package name */
    public static zm f2013b;
    public static final int[] c = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] d = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] e = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] f = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] g = {R.attr.drawable};
    public static final int[] h = {R.attr.name, R.attr.animation};
    public static final int[] i = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] j = {R.attr.ordering};
    public static final int[] k = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] l = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] m = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
    public static final Object[] n = new Object[0];
    public static final int[] o = {R.attr.state_pressed};
    public static final int[] p = {R.attr.state_selected};
    public static final int[] q = {R.attr.state_focused};
    public static final int[] r = {R.attr.state_checked};
    public static final c02 s = new c02(12);
    public static final mp0 t = new mp0(13);
    public static final d5 u = new d5();
    public static final c02 v = new c02(19);
    public static final String[] w = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] x = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] y = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static final boolean A() {
        bx i2 = hx2.i(83);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static boolean A0(z42[] z42VarArr, z42[] z42VarArr2) {
        if (z42VarArr == null || z42VarArr2 == null || z42VarArr.length != z42VarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < z42VarArr.length; i2++) {
            z42 z42Var = z42VarArr[i2];
            char c2 = z42Var.f5423a;
            z42 z42Var2 = z42VarArr2[i2];
            if (c2 != z42Var2.f5423a || z42Var.f5424b.length != z42Var2.f5424b.length) {
                return false;
            }
        }
        return true;
    }

    public static final boolean B() {
        bx i2 = hx2.i(449);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static int B0(Context context, String str) {
        String str2;
        if (Binder.getCallingPid() == Process.myPid()) {
            str2 = context.getPackageName();
        } else {
            str2 = null;
        }
        return C0(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static final boolean C() {
        bx i2 = hx2.i(522);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int C0(android.content.Context r5, java.lang.String r6, int r7, int r8, java.lang.String r9) {
        /*
            int r7 = r5.checkPermission(r6, r7, r8)
            r0 = -1
            if (r7 != r0) goto L8
            return r0
        L8:
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r7 < r1) goto L13
            java.lang.String r6 = defpackage.pf.d(r6)
            goto L14
        L13:
            r6 = 0
        L14:
            r2 = 0
            if (r6 != 0) goto L18
            return r2
        L18:
            if (r9 != 0) goto L2c
            android.content.pm.PackageManager r9 = r5.getPackageManager()
            java.lang.String[] r9 = r9.getPackagesForUid(r8)
            if (r9 == 0) goto L2b
            int r3 = r9.length
            if (r3 > 0) goto L28
            goto L2b
        L28:
            r9 = r9[r2]
            goto L2c
        L2b:
            return r0
        L2c:
            int r0 = android.os.Process.myUid()
            java.lang.String r3 = r5.getPackageName()
            r4 = 1
            if (r0 != r8) goto L3f
            boolean r0 = defpackage.w12.a(r3, r9)
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            java.lang.Class<android.app.AppOpsManager> r3 = android.app.AppOpsManager.class
            if (r0 == 0) goto L6d
            r0 = 29
            if (r7 < r0) goto L60
            android.app.AppOpsManager r7 = defpackage.qf.c(r5)
            int r0 = android.os.Binder.getCallingUid()
            int r9 = defpackage.qf.a(r7, r6, r0, r9)
            if (r9 == 0) goto L57
            goto L7a
        L57:
            java.lang.String r5 = defpackage.qf.b(r5)
            int r9 = defpackage.qf.a(r7, r6, r8, r5)
            goto L7a
        L60:
            if (r7 < r1) goto L79
            java.lang.Object r5 = defpackage.pf.a(r5, r3)
            android.app.AppOpsManager r5 = (android.app.AppOpsManager) r5
            int r4 = defpackage.pf.c(r5, r6, r9)
            goto L79
        L6d:
            if (r7 < r1) goto L79
            java.lang.Object r5 = defpackage.pf.a(r5, r3)
            android.app.AppOpsManager r5 = (android.app.AppOpsManager) r5
            int r4 = defpackage.pf.c(r5, r6, r9)
        L79:
            r9 = r4
        L7a:
            if (r9 != 0) goto L7d
            goto L7e
        L7d:
            r2 = -2
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew3.C0(android.content.Context, java.lang.String, int, int, java.lang.String):int");
    }

    public static final bc2 D() {
        bx i2 = hx2.i(570);
        bc2 bc2Var = new bc2();
        u0(i2, bc2Var);
        i2.h();
        return bc2Var;
    }

    public static int D0(Context context, String str) {
        return C0(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static final String[] E() {
        bx i2 = hx2.i(555);
        int t2 = (int) i2.t();
        String[] strArr = new String[t2];
        for (int i3 = 0; i3 < t2; i3++) {
            strArr[i3] = i2.u();
        }
        i2.h();
        return strArr;
    }

    public static int E0(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static final zb2[] F() {
        bx i2 = hx2.i(238);
        int t2 = (int) i2.t();
        zb2[] zb2VarArr = new zb2[t2];
        for (int i3 = 0; i3 < t2; i3++) {
            zb2 zb2Var = new zb2();
            t0(i2, zb2Var);
            zb2VarArr[i3] = zb2Var;
        }
        i2.h();
        return zb2VarArr;
    }

    public static float[] F0(float[] fArr, int i2) {
        if (i2 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i3 = i2 - 0;
                int min = Math.min(i3, length - 0);
                float[] fArr2 = new float[i3];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static final ac2 G() {
        bx i2 = hx2.i(179);
        ac2 ac2Var = new ac2();
        ac2Var.f55a = i2.q();
        ac2Var.f56b = i2.u();
        ac2Var.c = i2.u();
        i2.h();
        return ac2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[EDGE_INSN: B:15:0x004b->B:16:0x004b BREAK  A[LOOP:0: B:5:0x002a->B:32:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[LOOP:0: B:5:0x002a->B:32:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.bq0 G0(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            fh0 r0 = new fh0
            r0.<init>()
            goto L11
        Lc:
            eh0 r0 = new eh0
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            defpackage.tf3.w(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L46
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L46
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L46
            goto L47
        L46:
            r7 = 0
        L47:
            if (r7 == 0) goto L2a
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4e
            goto L7c
        L4e:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            android.content.pm.Signature[] r0 = r0.l(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
        L5c:
            if (r3 >= r6) goto L6a
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            int r3 = r3 + 1
            goto L5c
        L6a:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            kc r1 = new kc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            goto L7d
        L76:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
        L7c:
            r1 = r5
        L7d:
            if (r1 != 0) goto L80
            goto L85
        L80:
            bq0 r5 = new bq0
            r5.<init>(r8, r1)
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew3.G0(android.content.Context):bq0");
    }

    public static final String H() {
        bx i2 = hx2.i(554);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static Handler H0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return zi0.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final qb2 I() {
        bx i2 = hx2.i(470);
        qb2 qb2Var = new qb2();
        int t2 = (int) i2.t();
        rb2[] rb2VarArr = new rb2[t2];
        for (int i3 = 0; i3 < t2; i3++) {
            rb2 rb2Var = new rb2();
            s0(i2, rb2Var);
            rb2VarArr[i3] = rb2Var;
        }
        qb2Var.f3978a = rb2VarArr;
        int t3 = (int) i2.t();
        rb2[] rb2VarArr2 = new rb2[t3];
        for (int i4 = 0; i4 < t3; i4++) {
            rb2 rb2Var2 = new rb2();
            s0(i2, rb2Var2);
            rb2VarArr2[i4] = rb2Var2;
        }
        qb2Var.f3979b = rb2VarArr2;
        int t4 = (int) i2.t();
        rb2[] rb2VarArr3 = new rb2[t4];
        for (int i5 = 0; i5 < t4; i5++) {
            rb2 rb2Var3 = new rb2();
            s0(i2, rb2Var3);
            rb2VarArr3[i5] = rb2Var3;
        }
        qb2Var.c = rb2VarArr3;
        int t5 = (int) i2.t();
        rb2[] rb2VarArr4 = new rb2[t5];
        for (int i6 = 0; i6 < t5; i6++) {
            rb2 rb2Var4 = new rb2();
            s0(i2, rb2Var4);
            rb2VarArr4[i6] = rb2Var4;
        }
        qb2Var.d = rb2VarArr4;
        int t6 = (int) i2.t();
        rb2[] rb2VarArr5 = new rb2[t6];
        for (int i7 = 0; i7 < t6; i7++) {
            rb2 rb2Var5 = new rb2();
            s0(i2, rb2Var5);
            rb2VarArr5[i7] = rb2Var5;
        }
        qb2Var.e = rb2VarArr5;
        int t7 = (int) i2.t();
        rb2[] rb2VarArr6 = new rb2[t7];
        for (int i8 = 0; i8 < t7; i8++) {
            rb2 rb2Var6 = new rb2();
            s0(i2, rb2Var6);
            rb2VarArr6[i8] = rb2Var6;
        }
        int t8 = (int) i2.t();
        rb2[] rb2VarArr7 = new rb2[t8];
        for (int i9 = 0; i9 < t8; i9++) {
            rb2 rb2Var7 = new rb2();
            s0(i2, rb2Var7);
            rb2VarArr7[i9] = rb2Var7;
        }
        int t9 = (int) i2.t();
        rb2[] rb2VarArr8 = new rb2[t9];
        for (int i10 = 0; i10 < t9; i10++) {
            rb2 rb2Var8 = new rb2();
            s0(i2, rb2Var8);
            rb2VarArr8[i10] = rb2Var8;
        }
        qb2Var.f = rb2VarArr8;
        int t10 = (int) i2.t();
        rb2[] rb2VarArr9 = new rb2[t10];
        for (int i11 = 0; i11 < t10; i11++) {
            rb2 rb2Var9 = new rb2();
            s0(i2, rb2Var9);
            rb2VarArr9[i11] = rb2Var9;
        }
        i2.u();
        i2.q();
        i2.u();
        i2.h();
        return qb2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x008b, code lost:            if (r13 == false) goto L42;     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[Catch: NumberFormatException -> 0x00b9, LOOP:3: B:29:0x006d->B:40:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:40:0x0098, B:44:0x009d, B:49:0x00ad, B:61:0x00b1), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:40:0x0098, B:44:0x009d, B:49:0x00ad, B:61:0x00b1), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:40:0x0098, B:44:0x009d, B:49:0x00ad, B:61:0x00b1), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.z42[] I0(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew3.I0(java.lang.String):z42[]");
    }

    public static final String J(String str) {
        bx j2 = hx2.j(str, 186);
        String u2 = j2.u();
        j2.h();
        return u2;
    }

    public static Path J0(String str) {
        Path path = new Path();
        z42[] I0 = I0(str);
        if (I0 != null) {
            try {
                z42.b(I0, path);
                return path;
            } catch (RuntimeException e2) {
                throw new RuntimeException(hx2.p("Error in parsing ", str), e2);
            }
        }
        return null;
    }

    public static final boolean K() {
        bx i2 = hx2.i(196);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static z42[] K0(z42[] z42VarArr) {
        if (z42VarArr == null) {
            return null;
        }
        z42[] z42VarArr2 = new z42[z42VarArr.length];
        for (int i2 = 0; i2 < z42VarArr.length; i2++) {
            z42VarArr2[i2] = new z42(z42VarArr[i2]);
        }
        return z42VarArr2;
    }

    public static final ec2[] L() {
        bx i2 = hx2.i(94);
        int t2 = (int) i2.t();
        ec2[] ec2VarArr = new ec2[t2];
        for (int i3 = 0; i3 < t2; i3++) {
            ec2 ec2Var = new ec2();
            i2.q();
            ec2Var.f1915a = i2.u();
            ec2Var.f1916b = i2.u();
            ec2Var.c = i2.u();
            ec2Var.d = i2.u();
            i2.u();
            ec2VarArr[i3] = ec2Var;
        }
        i2.h();
        return ec2VarArr;
    }

    public static final void L0(String str, String str2) {
        bx bxVar = new bx();
        bxVar.z(str);
        bxVar.z(str2);
        du.d(472, bxVar);
        bxVar.h();
    }

    public static final String M() {
        bx i2 = hx2.i(374);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static final View M0(ViewGroup viewGroup, int i2) {
        View childAt = viewGroup.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder o2 = p71.o("Index: ", i2, ", Size: ");
        o2.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(o2.toString());
    }

    public static final bc2[] N() {
        bx i2 = hx2.i(567);
        int t2 = (int) i2.t();
        bc2[] bc2VarArr = new bc2[t2];
        for (int i3 = 0; i3 < t2; i3++) {
            bc2 bc2Var = new bc2();
            u0(i2, bc2Var);
            bc2VarArr[i3] = bc2Var;
        }
        i2.h();
        return bc2VarArr;
    }

    public static final String[] N0() {
        bx i2 = hx2.i(531);
        int t2 = (int) i2.t();
        String[] strArr = new String[t2];
        for (int i3 = 0; i3 < t2; i3++) {
            strArr[i3] = i2.u();
        }
        i2.h();
        return strArr;
    }

    public static final dc2 O() {
        bx i2 = hx2.i(203);
        dc2 dc2Var = new dc2(0);
        v0(i2, dc2Var);
        i2.h();
        return dc2Var;
    }

    public static final yl3 O0(ViewGroup viewGroup) {
        return new yl3(viewGroup, 0);
    }

    public static final String P() {
        bx i2 = hx2.i(218);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static Drawable P0(Context context, int i2) {
        return bk2.d().f(context, i2);
    }

    public static final void Q(String str, String str2, String str3) {
        bx bxVar = new bx();
        bxVar.z(str);
        bxVar.z(str2);
        bxVar.z(str3);
        du.d(579, bxVar);
        bxVar.h();
    }

    public static Set Q0() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final boolean R() {
        bx i2 = hx2.i(133);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static final String[] R0() {
        bx i2 = hx2.i(529);
        int t2 = (int) i2.t();
        String[] strArr = new String[t2];
        for (int i3 = 0; i3 < t2; i3++) {
            strArr[i3] = i2.u();
        }
        i2.h();
        return strArr;
    }

    public static final void S() {
        bx bxVar = new bx();
        bxVar.v(true);
        du.d(Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE, bxVar);
        bxVar.h();
    }

    public static final String S0() {
        bx i2 = hx2.i(126);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static final boolean T() {
        bx i2 = hx2.i(72);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static final void T0(String str) {
        p71.x(str, 125);
    }

    public static final boolean U() {
        bx i2 = hx2.i(494);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static int U0(int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 != 32) {
                    if (i2 != 64) {
                        if (i2 != 128) {
                            if (i2 == 256) {
                                return 8;
                            }
                            throw new IllegalArgumentException(hx2.m("type needs to be >= FIRST and <= LAST, type=", i2));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    public static final boolean V() {
        bx i2 = hx2.i(365);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static final void V0(bx bxVar) {
        Object m8Var;
        String u2 = bxVar.u();
        String u3 = bxVar.u();
        String u4 = bxVar.u();
        String u5 = bxVar.u();
        if (pe0.f3833a != null) {
            boolean z = true;
            pe0.a("muusxwhpjx load ", u2 + " " + u3 + " " + u5);
            StringBuilder sb = new StringBuilder();
            sb.append(u2);
            sb.append(u3);
            sb.append(u4);
            sb.append(u5);
            String sb2 = sb.toString();
            HashMap hashMap = x8.f5128b;
            Object obj = hashMap.get(sb2);
            if (obj == null) {
                Locale locale = Locale.ROOT;
                if (!m20.L(u3.toLowerCase(locale), "admob")) {
                    String lowerCase = u3.toLowerCase(locale);
                    int hashCode = lowerCase.hashCode();
                    if (hashCode != -1183962098) {
                        if (hashCode != 497130182) {
                            if (hashCode == 1788315269 && lowerCase.equals("chartboost") && m20.L(u2, "AdBanner")) {
                                m8Var = new q8(u5, u2);
                                obj = m8Var;
                            }
                        } else if (lowerCase.equals("facebook") && m20.L(u2, "AdInterstitial")) {
                            m8Var = new s8(u5, u2);
                            obj = m8Var;
                        }
                    } else {
                        lowerCase.equals("inmobi");
                    }
                    obj = null;
                } else {
                    int hashCode2 = u2.hashCode();
                    if (hashCode2 != -2142898865) {
                        if (hashCode2 != -1303021809) {
                            if (hashCode2 == 1363348916 && u2.equals("AdOpenApp")) {
                                m8Var = new k8(u5, u2);
                                obj = m8Var;
                            }
                            obj = null;
                        } else {
                            if (u2.equals("AdInterstitial")) {
                                m8Var = new o8(u5, u2);
                                obj = m8Var;
                            }
                            obj = null;
                        }
                    } else {
                        if (u2.equals("AdBanner")) {
                            m8Var = new m8(u5, u2);
                            obj = m8Var;
                        }
                        obj = null;
                    }
                }
            }
            if (obj != null) {
                synchronized (hashMap) {
                    hashMap.put(sb2, obj);
                }
                if (m20.L(u2, "AdBanner")) {
                    ((kn) obj).c = x8.d;
                }
                kn knVar = (kn) obj;
                v31 v31Var = kn.d;
                if (v31Var == null || !((Boolean) v31Var.invoke()).booleanValue()) {
                    z = false;
                }
                if (!z) {
                    knVar.a("canRequestAds != true");
                } else {
                    zf3.f0(vl0.c, new gn(knVar, null));
                }
            }
        }
    }

    public static final boolean W() {
        bx i2 = hx2.i(534);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static final void W0() {
        x50 t2 = x50.t();
        synchronized (t2.c) {
            int size = ((ArrayList) t2.f5117b).size();
            while (true) {
                size--;
                if (size >= 0) {
                    v50 v50Var = (v50) ((WeakReference) ((ArrayList) t2.f5117b).get(size)).get();
                    if (v50Var != null) {
                        v50Var.v();
                    } else {
                        ((ArrayList) t2.f5117b).remove(size);
                    }
                }
            }
        }
    }

    public static final boolean X() {
        bx i2 = hx2.i(362);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static final void X0(bx bxVar) {
        String u2 = bxVar.u();
        boolean q2 = bxVar.q();
        boolean q3 = bxVar.q();
        x50 t2 = x50.t();
        synchronized (t2.c) {
            int size = ((ArrayList) t2.f5117b).size();
            while (true) {
                size--;
                if (size >= 0) {
                    v50 v50Var = (v50) ((WeakReference) ((ArrayList) t2.f5117b).get(size)).get();
                    if (v50Var != null) {
                        v50Var.y(u2, q2, q3);
                    } else {
                        ((ArrayList) t2.f5117b).remove(size);
                    }
                }
            }
        }
    }

    public static final boolean Y() {
        bx i2 = hx2.i(366);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static void Y0(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final void Z(String str, String str2) {
        bx bxVar = new bx();
        bxVar.z(str);
        bxVar.z(str2);
        du.d(597, bxVar);
        bxVar.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:            if (java.lang.Integer.parseInt(r9) == 1) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:            if (r7 == (-1)) goto L27;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.gw3 Z0(java.lang.String r20) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r20
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = defpackage.cp3.E(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld6
            db1 r2 = defpackage.hb1.f2394b
            ji2 r2 = defpackage.ji2.e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = defpackage.cp3.E(r0, r8)
            if (r8 == 0) goto La2
            java.lang.String[] r2 = defpackage.ew3.w
            r6 = 0
            r7 = 0
        L37:
            r8 = 4
            if (r7 >= r8) goto L4d
            r9 = r2[r7]
            java.lang.String r9 = defpackage.cp3.w(r0, r9)
            if (r9 == 0) goto L4a
            int r2 = java.lang.Integer.parseInt(r9)
            r7 = 1
            if (r2 != r7) goto L4d
            goto L4e
        L4a:
            int r7 = r7 + 1
            goto L37
        L4d:
            r7 = 0
        L4e:
            if (r7 != 0) goto L51
            return r3
        L51:
            java.lang.String[] r2 = defpackage.ew3.x
            r7 = 0
        L54:
            if (r7 >= r8) goto L6c
            r9 = r2[r7]
            java.lang.String r9 = defpackage.cp3.w(r0, r9)
            if (r9 == 0) goto L69
            long r7 = java.lang.Long.parseLong(r9)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L6d
            goto L6c
        L69:
            int r7 = r7 + 1
            goto L54
        L6c:
            r7 = r4
        L6d:
            java.lang.String[] r2 = defpackage.ew3.y
        L6f:
            r9 = 2
            if (r6 >= r9) goto L9c
            r9 = r2[r6]
            java.lang.String r9 = defpackage.cp3.w(r0, r9)
            if (r9 == 0) goto L99
            long r12 = java.lang.Long.parseLong(r9)
            ix1 r2 = new ix1
            java.lang.String r15 = "image/jpeg"
            r16 = 0
            r18 = 0
            r14 = r2
            r14.<init>(r15, r16, r18)
            ix1 r6 = new ix1
            java.lang.String r11 = "video/mp4"
            r14 = 0
            r10 = r6
            r10.<init>(r11, r12, r14)
            ji2 r2 = defpackage.hb1.r(r2, r6)
            goto La0
        L99:
            int r6 = r6 + 1
            goto L6f
        L9c:
            db1 r2 = defpackage.hb1.f2394b
            ji2 r2 = defpackage.ji2.e
        La0:
            r6 = r7
            goto Lc3
        La2:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = defpackage.cp3.E(r0, r8)
            if (r8 == 0) goto Lb3
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            ji2 r2 = a1(r0, r2, r8)
            goto Lc3
        Lb3:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = defpackage.cp3.E(r0, r8)
            if (r8 == 0) goto Lc3
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            ji2 r2 = a1(r0, r2, r8)
        Lc3:
            boolean r8 = defpackage.cp3.C(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld0
            return r3
        Ld0:
            gw3 r0 = new gw3
            r0.<init>(r6, r2)
            return r0
        Ld6:
            java.lang.String r0 = "Couldn't find xmp metadata"
            u42 r0 = defpackage.u42.a(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew3.Z0(java.lang.String):gw3");
    }

    public static final void a() {
        du.d(517, null);
    }

    public static final String a0() {
        bx i2 = hx2.i(519);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static ji2 a1(XmlPullParser xmlPullParser, String str, String str2) {
        long j2;
        long j3;
        db1 db1Var = hb1.f2394b;
        m20.T(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i2 = 0;
        do {
            xmlPullParser.next();
            if (cp3.E(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String w2 = cp3.w(xmlPullParser, concat3);
                String w3 = cp3.w(xmlPullParser, concat4);
                String w4 = cp3.w(xmlPullParser, concat5);
                String w5 = cp3.w(xmlPullParser, concat6);
                if (w2 != null && w3 != null) {
                    if (w4 != null) {
                        j2 = Long.parseLong(w4);
                    } else {
                        j2 = 0;
                    }
                    if (w5 != null) {
                        j3 = Long.parseLong(w5);
                    } else {
                        j3 = 0;
                    }
                    ix1 ix1Var = new ix1(w2, j2, j3);
                    int i3 = i2 + 1;
                    if (objArr.length < i3) {
                        objArr = Arrays.copyOf(objArr, pe0.q(objArr.length, i3));
                    }
                    objArr[i2] = ix1Var;
                    i2 = i3;
                } else {
                    return ji2.e;
                }
            }
        } while (!cp3.C(xmlPullParser, concat2));
        return hb1.j(i2, objArr);
    }

    public static final void b(String str) {
        p71.x(str, SubsamplingScaleImageView.ORIENTATION_180);
    }

    public static void b0(Runnable runnable) {
        new Thread(runnable, "55fvusxvw4-thread").start();
    }

    public static nw1 b1(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        v51 v51Var = new v51(duplicate);
        v51Var.s(4);
        int i2 = ((ByteBuffer) v51Var.f4780b).getShort() & 65535;
        if (i2 <= 100) {
            v51Var.s(6);
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    int i4 = ((ByteBuffer) v51Var.f4780b).getInt();
                    v51Var.s(4);
                    j2 = v51Var.q();
                    v51Var.s(4);
                    if (1835365473 == i4) {
                        break;
                    }
                    i3++;
                } else {
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                v51Var.s((int) (j2 - ((ByteBuffer) v51Var.f4780b).position()));
                v51Var.s(12);
                long q2 = v51Var.q();
                for (int i5 = 0; i5 < q2; i5++) {
                    int i6 = ((ByteBuffer) v51Var.f4780b).getInt();
                    long q3 = v51Var.q();
                    v51Var.q();
                    if (1164798569 == i6 || 1701669481 == i6) {
                        duplicate.position((int) (q3 + j2));
                        nw1 nw1Var = new nw1();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        nw1Var.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return nw1Var;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final boolean c(String str) {
        bx j2 = hx2.j(str, 181);
        boolean q2 = j2.q();
        j2.h();
        return q2;
    }

    public static void c0(Runnable runnable) {
        if (f2012a == null) {
            synchronized (ew3.class) {
                if (f2012a == null) {
                    f2012a = Executors.newFixedThreadPool(1, new cw3());
                }
            }
        }
        f2012a.submit(runnable);
    }

    public static void c1(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            x93.a(view, charSequence);
            return;
        }
        z93 z93Var = z93.k;
        if (z93Var != null && z93Var.f5448a == view) {
            z93.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            z93 z93Var2 = z93.l;
            if (z93Var2 != null && z93Var2.f5448a == view) {
                z93Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new z93(view, charSequence);
    }

    public static final yb2 d(String str) {
        bx j2 = hx2.j(str, 117);
        yb2 yb2Var = new yb2();
        yb2Var.f5311a = j2.u();
        yb2Var.f5312b = j2.t();
        int t2 = (int) j2.t();
        String[] strArr = new String[t2];
        for (int i2 = 0; i2 < t2; i2++) {
            strArr[i2] = j2.u();
        }
        j2.h();
        return yb2Var;
    }

    public static void d0(Runnable runnable) {
        boolean z;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static int d1(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final boolean e(String str) {
        bx j2 = hx2.j(str, 188);
        boolean q2 = j2.q();
        j2.h();
        return q2;
    }

    public static final void e0() {
        du.d(284, null);
    }

    public static final Object[] e1(Collection collection) {
        int size = collection.size();
        Object[] objArr = n;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (it.hasNext()) {
                            int i4 = ((i3 * 3) + 1) >>> 1;
                            if (i4 <= i3) {
                                i4 = 2147483645;
                                if (i3 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i4);
                        } else {
                            return objArr2;
                        }
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArr2, i3);
                    }
                    i2 = i3;
                }
            } else {
                return objArr;
            }
        } else {
            return objArr;
        }
    }

    public static final void f(String str) {
        p71.x(str, 145);
    }

    public static final void f0(boolean z) {
        bx bxVar = new bx();
        bxVar.v(z);
        du.d(525, bxVar);
        bxVar.h();
    }

    public static final Object[] f1(Collection collection, Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                return Arrays.copyOf(objArr2, i3);
            }
            i2 = i3;
        }
    }

    public static final void g(String str) {
        p71.x(str, 153);
    }

    public static final void g0(String str) {
        p71.x(str, 566);
    }

    public static final RippleDrawable g1(int i2) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), null, new ColorDrawable(-1));
    }

    public static final void h(String str, boolean z) {
        bx bxVar = new bx();
        bxVar.z(str);
        bxVar.v(z);
        du.d(152, bxVar);
        bxVar.h();
    }

    public static final void h0(boolean z) {
        bx bxVar = new bx();
        bxVar.v(z);
        du.d(523, bxVar);
        bxVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0274 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h1(android.content.Context r17, defpackage.zf r18, defpackage.d92 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew3.h1(android.content.Context, zf, d92, boolean):void");
    }

    public static final void i() {
        du.d(147, null);
    }

    public static final void i0(String str, String str2, String str3) {
        bx bxVar = new bx();
        bxVar.z(str);
        bxVar.z(str2);
        bxVar.z(str3);
        du.d(377, bxVar);
        long t2 = bxVar.t();
        HashMap hashMap = new HashMap((int) t2);
        for (int i2 = 0; i2 < t2; i2++) {
            hashMap.put(bxVar.u(), bxVar.u());
        }
        bxVar.h();
    }

    public static final void j() {
        du.d(149, null);
    }

    public static final void j0(String str, String str2, String str3, String str4) {
        bx bxVar = new bx();
        bxVar.z(str);
        bxVar.z(str2);
        bxVar.z(str3);
        bxVar.z(str4);
        du.d(378, bxVar);
        long t2 = bxVar.t();
        HashMap hashMap = new HashMap((int) t2);
        for (int i2 = 0; i2 < t2; i2++) {
            hashMap.put(bxVar.u(), bxVar.u());
        }
        bxVar.h();
    }

    public static final sb2 k() {
        bx i2 = hx2.i(95);
        sb2 sb2Var = new sb2((Object) null);
        sb2Var.f4307a = i2.u();
        sb2Var.f4308b = i2.u();
        i2.h();
        return sb2Var;
    }

    public static final void k0(boolean z) {
        bx bxVar = new bx();
        bxVar.v(z);
        du.d(195, bxVar);
        bxVar.h();
    }

    public static final void l(String str) {
        p71.x(str, 247);
    }

    public static final void l0(String str) {
        p71.x(str, 219);
    }

    public static final void m(boolean z) {
        bx bxVar = new bx();
        bxVar.v(z);
        du.d(495, bxVar);
        bxVar.h();
    }

    public static final boolean m0() {
        bx i2 = hx2.i(532);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static final String n() {
        bx i2 = hx2.i(475);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static final boolean n0() {
        bx i2 = hx2.i(516);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static final boolean o() {
        bx i2 = hx2.i(93);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static final boolean o0() {
        bx i2 = hx2.i(497);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static final String p() {
        bx i2 = hx2.i(474);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static final void p0(String str) {
        bx bxVar = new bx();
        bxVar.z(str);
        du.d(253, bxVar);
        bxVar.q();
        bxVar.h();
    }

    public static final void q() {
        du.d(92, null);
    }

    public static final boolean q0() {
        bx i2 = hx2.i(358);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static final ac2 r(String str, String str2, boolean z) {
        bx bxVar = new bx();
        bxVar.z(str);
        bxVar.z(str2);
        bxVar.v(z);
        du.d(102, bxVar);
        ac2 ac2Var = new ac2();
        ac2Var.f55a = bxVar.q();
        ac2Var.f56b = bxVar.u();
        ac2Var.c = bxVar.u();
        bxVar.t();
        bxVar.u();
        bxVar.h();
        return ac2Var;
    }

    public static void r0(bx bxVar, rb2 rb2Var) {
        bxVar.z(rb2Var.f4125a);
        bxVar.z(rb2Var.f4126b);
        if (rb2Var.c != null) {
            bxVar.y(r0.length);
            for (String str : rb2Var.c) {
                bxVar.z(str);
            }
        } else {
            bxVar.y(0L);
        }
        bxVar.z(rb2Var.d);
        bxVar.z(rb2Var.e);
        bxVar.z(rb2Var.f);
        bxVar.v(rb2Var.g);
        bxVar.v(rb2Var.h);
        bxVar.y(rb2Var.i);
        if (rb2Var.j != null) {
            bxVar.y(r0.length);
            for (rb2 rb2Var2 : rb2Var.j) {
                if (rb2Var2 == null) {
                    rb2Var2 = new rb2();
                }
                r0(bxVar, rb2Var2);
            }
        } else {
            bxVar.y(0L);
        }
        bxVar.v(rb2Var.k);
        if (rb2Var.l != null) {
            bxVar.y(r0.length);
            for (long j2 : rb2Var.l) {
                bxVar.y(j2);
            }
        } else {
            bxVar.y(0L);
        }
        bxVar.y(rb2Var.m);
        bxVar.z(rb2Var.n);
        bxVar.z(rb2Var.o);
        if (rb2Var.p == null) {
            rb2Var.p = new vb2();
        }
        vb2 vb2Var = rb2Var.p;
        bxVar.z(vb2Var.f4808a);
        if (vb2Var.f4809b == null) {
            vb2Var.f4809b = new wb2();
        }
        wb2 wb2Var = vb2Var.f4809b;
        bxVar.z(wb2Var.f4976a);
        bxVar.v(wb2Var.f4977b);
        bxVar.x(wb2Var.c);
        bxVar.z(wb2Var.d);
        bxVar.z(vb2Var.c);
        bxVar.z(vb2Var.d);
        bxVar.z(vb2Var.e);
        bxVar.y(vb2Var.f);
        if (rb2Var.q == null) {
            rb2Var.q = new jx0(1);
        }
        jx0 jx0Var = rb2Var.q;
        bxVar.z((String) jx0Var.f2845a);
        if (((xb2) jx0Var.f2846b) == null) {
            jx0Var.f2846b = new xb2();
        }
        xb2 xb2Var = (xb2) jx0Var.f2846b;
        bxVar.z(xb2Var.f5139a);
        bxVar.v(xb2Var.f5140b);
        bxVar.x(xb2Var.c);
        bxVar.z(xb2Var.d);
        bxVar.z(xb2Var.e);
        bxVar.y(xb2Var.f);
        bxVar.z((String) jx0Var.c);
        bxVar.z((String) jx0Var.d);
        bxVar.z((String) jx0Var.e);
        bxVar.z((String) jx0Var.f);
        bxVar.y(rb2Var.r);
        bxVar.z(rb2Var.s);
    }

    public static final lb2 s(String str) {
        lb2 lb2Var;
        bx j2 = hx2.j(str, 251);
        if (j2.q()) {
            lb2Var = new lb2();
            j2.t();
            lb2Var.f3096a = j2.u();
            lb2Var.f3097b = j2.u();
            j2.u();
            j2.q();
            lb2Var.c = j2.u();
            int t2 = (int) j2.t();
            String[] strArr = new String[t2];
            for (int i2 = 0; i2 < t2; i2++) {
                strArr[i2] = j2.u();
            }
            int t3 = (int) j2.t();
            String[] strArr2 = new String[t3];
            for (int i3 = 0; i3 < t3; i3++) {
                strArr2[i3] = j2.u();
            }
            j2.q();
            j2.u();
            j2.t();
        } else {
            lb2Var = null;
        }
        j2.h();
        return lb2Var;
    }

    public static void s0(bx bxVar, rb2 rb2Var) {
        rb2Var.f4125a = bxVar.u();
        rb2Var.f4126b = bxVar.u();
        int t2 = (int) bxVar.t();
        String[] strArr = new String[t2];
        for (int i2 = 0; i2 < t2; i2++) {
            strArr[i2] = bxVar.u();
        }
        rb2Var.c = strArr;
        rb2Var.d = bxVar.u();
        rb2Var.e = bxVar.u();
        rb2Var.f = bxVar.u();
        rb2Var.g = bxVar.q();
        rb2Var.h = bxVar.q();
        rb2Var.i = bxVar.t();
        int t3 = (int) bxVar.t();
        rb2[] rb2VarArr = new rb2[t3];
        for (int i3 = 0; i3 < t3; i3++) {
            rb2 rb2Var2 = new rb2();
            s0(bxVar, rb2Var2);
            rb2VarArr[i3] = rb2Var2;
        }
        rb2Var.j = rb2VarArr;
        rb2Var.k = bxVar.q();
        int t4 = (int) bxVar.t();
        long[] jArr = new long[t4];
        for (int i4 = 0; i4 < t4; i4++) {
            jArr[i4] = bxVar.t();
        }
        rb2Var.l = jArr;
        rb2Var.m = bxVar.t();
        rb2Var.n = bxVar.u();
        rb2Var.o = bxVar.u();
        vb2 vb2Var = new vb2();
        vb2Var.f4808a = bxVar.u();
        wb2 wb2Var = new wb2();
        wb2Var.f4976a = bxVar.u();
        wb2Var.f4977b = bxVar.q();
        wb2Var.c = bxVar.s();
        wb2Var.d = bxVar.u();
        vb2Var.f4809b = wb2Var;
        vb2Var.c = bxVar.u();
        vb2Var.d = bxVar.u();
        vb2Var.e = bxVar.u();
        vb2Var.f = bxVar.t();
        rb2Var.p = vb2Var;
        jx0 jx0Var = new jx0(1);
        jx0Var.f2845a = bxVar.u();
        xb2 xb2Var = new xb2();
        xb2Var.f5139a = bxVar.u();
        xb2Var.f5140b = bxVar.q();
        xb2Var.c = bxVar.s();
        xb2Var.d = bxVar.u();
        xb2Var.e = bxVar.u();
        xb2Var.f = bxVar.t();
        jx0Var.f2846b = xb2Var;
        jx0Var.c = bxVar.u();
        jx0Var.d = bxVar.u();
        jx0Var.e = bxVar.u();
        jx0Var.f = bxVar.u();
        rb2Var.q = jx0Var;
        rb2Var.r = bxVar.t();
        rb2Var.s = bxVar.u();
    }

    public static final sb2[] t() {
        bx i2 = hx2.i(217);
        int t2 = (int) i2.t();
        sb2[] sb2VarArr = new sb2[t2];
        for (int i3 = 0; i3 < t2; i3++) {
            sb2 sb2Var = new sb2((Object) null);
            sb2Var.f4307a = i2.u();
            sb2Var.f4308b = i2.u();
            sb2VarArr[i3] = sb2Var;
        }
        i2.h();
        return sb2VarArr;
    }

    public static void t0(bx bxVar, zb2 zb2Var) {
        zb2Var.f5459a = bxVar.u();
        zb2Var.f5460b = bxVar.u();
        bxVar.u();
        zb2Var.c = bxVar.t();
        zb2Var.d = bxVar.u();
        bxVar.u();
        zb2Var.e = bxVar.u();
        zb2Var.f = bxVar.u();
        bxVar.q();
        bxVar.q();
        zb2Var.g = bxVar.q();
    }

    public static final boolean u() {
        bx i2 = hx2.i(520);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static void u0(bx bxVar, bc2 bc2Var) {
        bc2Var.f445a = bxVar.u();
        bc2Var.f446b = bxVar.u();
        bc2Var.c = bxVar.u();
        bxVar.t();
        bxVar.t();
        bxVar.t();
        bxVar.t();
        bc2Var.d = bxVar.q();
        bxVar.t();
        bxVar.t();
        bc2Var.e = bxVar.u();
    }

    public static final boolean v() {
        bx i2 = hx2.i(524);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static void v0(bx bxVar, dc2 dc2Var) {
        dc2Var.f1757b = bxVar.u();
        dc2Var.c = bxVar.u();
        dc2Var.d = bxVar.u();
        dc2Var.e = bxVar.u();
        dc2Var.f = bxVar.u();
        dc2Var.i = new Date((bxVar.t() * 1000) + (bxVar.t() / 1000000));
        dc2Var.g = bxVar.u();
        dc2Var.f1756a = bxVar.q();
        dc2Var.h = bxVar.u();
    }

    public static final String w() {
        bx i2 = hx2.i(562);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static void w0(bx bxVar, fc2 fc2Var) {
        fc2Var.f2075a = bxVar.u();
        fc2Var.f2076b = bxVar.q();
    }

    public static final boolean x() {
        bx i2 = hx2.i(81);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static final void x0(String[] strArr) {
        bx bxVar = new bx();
        if (strArr != null) {
            bxVar.y(strArr.length);
            for (String str : strArr) {
                bxVar.z(str);
            }
        } else {
            bxVar.y(0L);
        }
        du.d(530, bxVar);
        bxVar.h();
    }

    public static final String y() {
        bx i2 = hx2.i(88);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static final void y0(String[] strArr) {
        bx bxVar = new bx();
        if (strArr != null) {
            bxVar.y(strArr.length);
            for (String str : strArr) {
                bxVar.z(str);
            }
        } else {
            bxVar.y(0L);
        }
        du.d(528, bxVar);
        bxVar.h();
    }

    public static final zb2 z() {
        bx i2 = hx2.i(239);
        zb2 zb2Var = new zb2();
        t0(i2, zb2Var);
        i2.h();
        return zb2Var;
    }

    public static final void z0(View view, int i2, int i3) {
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i3}), new ColorDrawable(i2), new ColorDrawable(-1)));
    }
}
