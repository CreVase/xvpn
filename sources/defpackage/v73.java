package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.security.xvpn.z35kb.R;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v73 implements t83, ac0, jb3, hs0, v30 {

    /* renamed from: a */
    public static final v73 f4790a = new v73();

    /* renamed from: b */
    public static final v73 f4791b = new v73();
    public static final v73 c = new v73();
    public static final v73 d = new v73();
    public static final /* synthetic */ v73 e = new v73();
    public static final /* synthetic */ v73 f = new v73();
    public static final /* synthetic */ v73 g = new v73();

    public static StateListDrawable A(boolean z, boolean z2, boolean z3) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(ew3.o, new tn3(z, true, z2, z3));
        stateListDrawable.addState(ew3.p, new tn3(z, false, z2, z3));
        stateListDrawable.addState(StateSet.WILD_CARD, new tn3(z, false, z2, z3));
        return stateListDrawable;
    }

    public static RippleDrawable b(int i, float f2, float f3) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{1621139616}), new sq(i, 1000096, f2, f3, 0.0f), null);
    }

    public static void c(long j, lr lrVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        boolean z;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        long j2;
        lr lrVar2;
        long j3;
        boolean z3;
        int i8 = i;
        if (i2 < i3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 < i3) {
                int i9 = i2;
                while (true) {
                    int i10 = i9 + 1;
                    if (((at) arrayList.get(i9)).c() >= i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (i10 >= i3) {
                            break;
                        } else {
                            i9 = i10;
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
            }
            at atVar = (at) arrayList.get(i2);
            at atVar2 = (at) arrayList.get(i3 - 1);
            if (i8 == atVar.c()) {
                int intValue = ((Number) arrayList2.get(i2)).intValue();
                int i11 = i2 + 1;
                at atVar3 = (at) arrayList.get(i11);
                i4 = i11;
                i5 = intValue;
                atVar = atVar3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (atVar.f(i8) != atVar2.f(i8)) {
                int i12 = i4 + 1;
                int i13 = 1;
                if (i12 < i3) {
                    while (true) {
                        int i14 = i12 + 1;
                        if (((at) arrayList.get(i12 - 1)).f(i8) != ((at) arrayList.get(i12)).f(i8)) {
                            i13++;
                        }
                        if (i14 >= i3) {
                            break;
                        } else {
                            i12 = i14;
                        }
                    }
                }
                long j4 = 4;
                long j5 = (i13 * 2) + (lrVar.f3176b / j4) + j + 2;
                lrVar.Y(i13);
                lrVar.Y(i5);
                if (i4 < i3) {
                    int i15 = i4;
                    while (true) {
                        int i16 = i15 + 1;
                        int f2 = ((at) arrayList.get(i15)).f(i8);
                        if (i15 == i4 || f2 != ((at) arrayList.get(i15 - 1)).f(i8)) {
                            lrVar.Y(f2 & 255);
                        }
                        if (i16 >= i3) {
                            break;
                        } else {
                            i15 = i16;
                        }
                    }
                }
                lr lrVar3 = new lr();
                while (i4 < i3) {
                    byte f3 = ((at) arrayList.get(i4)).f(i8);
                    int i17 = i4 + 1;
                    if (i17 < i3) {
                        int i18 = i17;
                        while (true) {
                            int i19 = i18 + 1;
                            if (f3 != ((at) arrayList.get(i18)).f(i8)) {
                                i7 = i18;
                                break;
                            } else if (i19 >= i3) {
                                break;
                            } else {
                                i18 = i19;
                            }
                        }
                    }
                    i7 = i3;
                    if (i17 == i7 && i8 + 1 == ((at) arrayList.get(i4)).c()) {
                        lrVar.Y(((Number) arrayList2.get(i4)).intValue());
                        j2 = j5;
                        lrVar2 = lrVar3;
                        j3 = j4;
                    } else {
                        lrVar.Y(((int) ((lrVar3.f3176b / j4) + j5)) * (-1));
                        j2 = j5;
                        lrVar2 = lrVar3;
                        j3 = j4;
                        c(j5, lrVar3, i8 + 1, arrayList, i4, i7, arrayList2);
                    }
                    i4 = i7;
                    lrVar3 = lrVar2;
                    j4 = j3;
                    j5 = j2;
                }
                lrVar.l(lrVar3);
                return;
            }
            int min = Math.min(atVar.c(), atVar2.c());
            if (i8 < min) {
                int i20 = i8;
                i6 = 0;
                while (true) {
                    int i21 = i20 + 1;
                    if (atVar.f(i20) != atVar2.f(i20)) {
                        break;
                    }
                    i6++;
                    if (i21 >= min) {
                        break;
                    } else {
                        i20 = i21;
                    }
                }
            } else {
                i6 = 0;
            }
            long j6 = 4;
            long j7 = (lrVar.f3176b / j6) + j + 2 + i6 + 1;
            lrVar.Y(-i6);
            lrVar.Y(i5);
            int i22 = i8 + i6;
            if (i8 < i22) {
                while (true) {
                    int i23 = i8 + 1;
                    lrVar.Y(atVar.f(i8) & 255);
                    if (i23 >= i22) {
                        break;
                    } else {
                        i8 = i23;
                    }
                }
            }
            if (i4 + 1 == i3) {
                if (i22 == ((at) arrayList.get(i4)).c()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    lrVar.Y(((Number) arrayList2.get(i4)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            lr lrVar4 = new lr();
            lrVar.Y(((int) ((lrVar4.f3176b / j6) + j7)) * (-1));
            c(j7, lrVar4, i22, arrayList, i4, i3, arrayList2);
            lrVar.l(lrVar4);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static void d(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            webView.evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
        }
    }

    public static final int e() {
        return j(1000008);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[LOOP:1: B:14:0x003a->B:25:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.at f(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v73.f(java.lang.String):at");
    }

    public static at g(String str) {
        boolean z;
        int i = 0;
        if (str.length() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            int i2 = length - 1;
            if (i2 >= 0) {
                while (true) {
                    int i3 = i + 1;
                    int i4 = i * 2;
                    bArr[i] = (byte) (bx3.d(str.charAt(i4 + 1)) + (bx3.d(str.charAt(i4)) << 4));
                    if (i3 > i2) {
                        break;
                    }
                    i = i3;
                }
            }
            return new at(bArr);
        }
        throw new IllegalArgumentException(m20.d1(str, "Unexpected hex string: ").toString());
    }

    public static at i(String str) {
        at atVar = new at(t9.l(str));
        atVar.c = str;
        return atVar;
    }

    public static final int j(int i) {
        return k(i, d83.f1748a);
    }

    public static int k(int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return e83.q.t(i);
                }
                throw new IllegalArgumentException(hx2.m("theme == ", i2));
            }
            return x73.q.t(i);
        }
        float f2 = d83.d;
        int k = k(i, d83.f1749b);
        int k2 = k(i, d83.c);
        if (f2 <= 0.0f) {
            return k;
        }
        if (f2 < 1.0f && k != k2) {
            return Color.argb(((int) ((Color.alpha(k2) - r1) * f2)) + Color.alpha(k), ((int) ((Color.red(k2) - r2) * f2)) + Color.red(k), ((int) ((Color.green(k2) - r3) * f2)) + Color.green(k), ((int) ((Color.blue(k2) - r0) * f2)) + Color.blue(k));
        }
        return k2;
    }

    public static final boolean l() {
        int i = d83.f1748a;
        if (d83.f1748a == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x014a, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.r32 m(defpackage.at... r13) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v73.m(at[]):r32");
    }

    public static at n(byte[] bArr) {
        int length = bArr.length;
        t9.u(bArr.length, 0, length);
        return new at(og.j1(0, bArr, length + 0));
    }

    public static final StateListDrawable o() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(ew3.q, new ya2(1000034, 1000037, true));
        stateListDrawable.addState(ew3.p, new ya2(1000034, 1000036, true));
        stateListDrawable.addState(ew3.o, new ya2(1000035, 1000036, false));
        stateListDrawable.addState(StateSet.WILD_CARD, new ya2(1000034, 1000036, false));
        return stateListDrawable;
    }

    public static final ColorStateList p() {
        return new ColorStateList(new int[][]{ew3.p, StateSet.WILD_CARD}, new int[]{j(1000039), j(1000038)});
    }

    public static StateListDrawable q() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(ew3.q, new ya2(1000034, 1000120, true));
        stateListDrawable.addState(ew3.p, new ya2(1000034, 1000120, true));
        stateListDrawable.addState(ew3.o, new ya2(1000035, 1000120, false));
        stateListDrawable.addState(StateSet.WILD_CARD, new ya2(1000034, 1000120, false));
        return stateListDrawable;
    }

    public static boolean r(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(String.format("market://details?id=%s", Arrays.copyOf(new Object[]{context.getPackageName()}, 1))));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return true;
        }
        try {
            intent.setData(Uri.parse(String.format("https://play.google.com/store/apps/details?id=%s", Arrays.copyOf(new Object[]{context.getPackageName()}, 1))));
        } catch (Exception unused) {
        }
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return true;
        }
        Toast.makeText(context, pd0.y(R.string.PlayStoreNotFound), 1).show();
        return false;
    }

    public static nl2 s(int i, float f2, float f3, float f4, int i2) {
        float f5;
        float f6;
        float f7;
        if ((i2 & 2) != 0) {
            f5 = 0.0f;
        } else {
            f5 = f2;
        }
        if ((i2 & 4) != 0) {
            f6 = 0.0f;
        } else {
            f6 = f3;
        }
        if ((i2 & 8) != 0) {
            f7 = 0.0f;
        } else {
            f7 = f4;
        }
        return new nl2(i, f5, f6, f7, 0.0f);
    }

    public static final RippleDrawable t(float f2, float f3, int i) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{1621139616}), new zg2(i, f2, f3, false), null);
    }

    public static final RippleDrawable u(int i) {
        return v(0.0f, i, 3);
    }

    public static /* synthetic */ RippleDrawable v(float f2, int i, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        return t(f2, 0.0f, i);
    }

    public static final sq w() {
        float f2 = tf3.F;
        sq sqVar = new sq(1000065, 1000064, 100.0f * f2, Math.max(1.0f, f2 * 0.5f), tf3.F * 2);
        sqVar.c = tf3.K(31);
        sqVar.d = tf3.K(31);
        return sqVar;
    }

    public static final StateListDrawable x() {
        float f2 = tf3.F * 15.5f;
        int K = tf3.K(64);
        int K2 = tf3.K(31);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = ew3.r;
        zg2 zg2Var = new zg2(1000061, f2);
        zg2Var.c = K;
        zg2Var.d = K2;
        stateListDrawable.addState(iArr, zg2Var);
        int[] iArr2 = StateSet.WILD_CARD;
        sq sqVar = new sq(1000062, 1000063, f2, 1.5f * tf3.F, 0.0f);
        sqVar.c = K;
        sqVar.d = K2;
        stateListDrawable.addState(iArr2, sqVar);
        return stateListDrawable;
    }

    public static final int y() {
        return j(1000013);
    }

    public static final int z() {
        return j(1000014);
    }

    public void a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append('\"');
                    } else {
                        if (obj instanceof String) {
                            String obj2 = obj.toString();
                            if (obj2.startsWith("{")) {
                                sb.append(obj2);
                            } else {
                                sb.append('\"');
                                sb.append(obj2);
                            }
                        } else {
                            sb.append(obj);
                        }
                        sb.append(",");
                    }
                    sb.append('\"');
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new ku(10, this, webView, sb2));
                return;
            } else {
                d(webView, sb2);
                return;
            }
        }
        String concat = "The WebView is null for ".concat(str);
        if (su3.f4416a.booleanValue() && !TextUtils.isEmpty(concat)) {
            Log.i("OMIDLIB", concat);
        }
    }

    @Override // defpackage.jb3
    public Object apply(Object obj) {
        return ((zzfz) obj).zzc();
    }

    @Override // defpackage.v30
    public Object h(aa3 aa3Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(aa3Var);
    }
}
