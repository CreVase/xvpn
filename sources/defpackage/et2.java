package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class et2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1994a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1995b;
    public Object c;
    public Object d;
    public final Object e;

    public et2() {
        cc0 cc0Var = cc0.DEFINED_BY_JAVASCRIPT;
        sb1 sb1Var = sb1.DEFINED_BY_JAVASCRIPT;
        g42 g42Var = g42.JAVASCRIPT;
        this.d = cc0Var;
        this.e = sb1Var;
        this.f1995b = g42Var;
        this.c = g42Var;
        this.f1994a = false;
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        boolean z2;
        sf3[] sf3VarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && (sf3VarArr = (sf3[]) editable.getSpans(selectionStart, selectionEnd, sf3.class)) != null && sf3VarArr.length > 0) {
            for (sf3 sf3Var : sf3VarArr) {
                int spanStart = editable.getSpanStart(sf3Var);
                int spanEnd = editable.getSpanEnd(sf3Var);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final ft2 a() {
        String sb;
        String str;
        String[] strArr;
        ft2 ft2Var = (ft2) this.f1995b;
        if (!TextUtils.isEmpty(ft2Var.d)) {
            Intent[] intentArr = ft2Var.c;
            if (intentArr != null && intentArr.length != 0) {
                if (this.f1994a) {
                    if (ft2Var.g == null) {
                        ft2Var.g = new rn1(ft2Var.f2152b);
                    }
                    ft2Var.h = true;
                }
                if (((Set) this.c) != null) {
                    if (ft2Var.f == null) {
                        ft2Var.f = new HashSet();
                    }
                    ft2Var.f.addAll((Set) this.c);
                }
                if (((Map) this.d) != null) {
                    if (ft2Var.i == null) {
                        ft2Var.i = new PersistableBundle();
                    }
                    for (String str2 : ((Map) this.d).keySet()) {
                        Map map = (Map) ((Map) this.d).get(str2);
                        ft2Var.i.putStringArray(str2, (String[]) map.keySet().toArray(new String[0]));
                        for (String str3 : map.keySet()) {
                            List list = (List) map.get(str3);
                            PersistableBundle persistableBundle = ft2Var.i;
                            String m = p71.m(str2, "/", str3);
                            if (list == null) {
                                strArr = new String[0];
                            } else {
                                strArr = (String[]) list.toArray(new String[0]);
                            }
                            persistableBundle.putStringArray(m, strArr);
                        }
                    }
                }
                Uri uri = (Uri) this.e;
                if (uri != null) {
                    if (ft2Var.i == null) {
                        ft2Var.i = new PersistableBundle();
                    }
                    PersistableBundle persistableBundle2 = ft2Var.i;
                    String scheme = uri.getScheme();
                    String schemeSpecificPart = uri.getSchemeSpecificPart();
                    if (scheme != null) {
                        if (!scheme.equalsIgnoreCase("tel") && !scheme.equalsIgnoreCase("sip") && !scheme.equalsIgnoreCase("sms") && !scheme.equalsIgnoreCase("smsto") && !scheme.equalsIgnoreCase("mailto") && !scheme.equalsIgnoreCase("nfc")) {
                            if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                                StringBuilder sb2 = new StringBuilder("//");
                                String str4 = "";
                                if (uri.getHost() == null) {
                                    str = "";
                                } else {
                                    str = uri.getHost();
                                }
                                sb2.append(str);
                                if (uri.getPort() != -1) {
                                    str4 = ":" + uri.getPort();
                                }
                                schemeSpecificPart = hx2.s(sb2, str4, "/...");
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(64);
                            sb3.append(scheme);
                            sb3.append(':');
                            if (schemeSpecificPart != null) {
                                for (int i = 0; i < schemeSpecificPart.length(); i++) {
                                    char charAt = schemeSpecificPart.charAt(i);
                                    if (charAt != '-' && charAt != '@' && charAt != '.') {
                                        sb3.append('x');
                                    } else {
                                        sb3.append(charAt);
                                    }
                                }
                            }
                            sb = sb3.toString();
                            persistableBundle2.putString("extraSliceUri", sb);
                        }
                    }
                    StringBuilder sb4 = new StringBuilder(64);
                    if (scheme != null) {
                        sb4.append(scheme);
                        sb4.append(':');
                    }
                    if (schemeSpecificPart != null) {
                        sb4.append(schemeSpecificPart);
                    }
                    sb = sb4.toString();
                    persistableBundle2.putString("extraSliceUri", sb);
                }
                return ft2Var;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:            if (r6 >= r7) goto L39;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.CharSequence r10, int r11, int r12, defpackage.rf3 r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et2.c(java.lang.CharSequence, int, int, rf3):boolean");
    }

    public final synchronized void d() {
        if (this.f1994a) {
            return;
        }
        Boolean g = g();
        this.d = g;
        if (g == null) {
            df0 df0Var = new df0(this);
            this.c = df0Var;
            es0 es0Var = (es0) ((u23) this.f1995b);
            es0Var.a(es0Var.c, df0Var);
        }
        this.f1994a = true;
    }

    public final synchronized boolean e() {
        boolean f;
        d();
        Object obj = this.d;
        if (((Boolean) obj) != null) {
            f = ((Boolean) obj).booleanValue();
        } else {
            f = ((FirebaseMessaging) this.e).f1585a.f();
        }
        return f;
    }

    public final Object f(CharSequence charSequence, int i, int i2, int i3, boolean z, oq0 oq0Var) {
        int i4;
        ow1 ow1Var;
        boolean z2;
        boolean z3;
        char c;
        qq0 qq0Var = new qq0((ow1) ((wq2) this.c).c, this.f1994a, (int[]) this.e);
        boolean z4 = true;
        int i5 = i;
        int codePointAt = Character.codePointAt(charSequence, i);
        int i6 = 0;
        boolean z5 = true;
        loop0: while (true) {
            i4 = i5;
            while (i4 < i2 && i6 < i3 && z5) {
                SparseArray sparseArray = qq0Var.c.f3740a;
                if (sparseArray == null) {
                    ow1Var = null;
                } else {
                    ow1Var = (ow1) sparseArray.get(codePointAt);
                }
                if (qq0Var.f4038a != 2) {
                    if (ow1Var == null) {
                        qq0Var.a();
                        c = 1;
                    } else {
                        qq0Var.f4038a = 2;
                        qq0Var.c = ow1Var;
                        qq0Var.f = 1;
                        c = 2;
                    }
                } else {
                    if (ow1Var != null) {
                        qq0Var.c = ow1Var;
                        qq0Var.f++;
                    } else {
                        if (codePointAt == 65038) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            qq0Var.a();
                        } else {
                            if (codePointAt == 65039) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                ow1 ow1Var2 = qq0Var.c;
                                if (ow1Var2.f3741b != null) {
                                    if (qq0Var.f == 1) {
                                        if (qq0Var.b()) {
                                            qq0Var.d = qq0Var.c;
                                            qq0Var.a();
                                        } else {
                                            qq0Var.a();
                                        }
                                    } else {
                                        qq0Var.d = ow1Var2;
                                        qq0Var.a();
                                    }
                                    c = 3;
                                } else {
                                    qq0Var.a();
                                }
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                }
                qq0Var.e = codePointAt;
                if (c != 1) {
                    if (c != 2) {
                        if (c == 3) {
                            if (!z && c(charSequence, i5, i4, qq0Var.d.f3741b)) {
                                i5 = i4;
                            } else {
                                boolean b2 = oq0Var.b(charSequence, i5, i4, qq0Var.d.f3741b);
                                i6++;
                                i5 = i4;
                                z5 = b2;
                            }
                        }
                    } else {
                        i4 += Character.charCount(codePointAt);
                        if (i4 < i2) {
                            codePointAt = Character.codePointAt(charSequence, i4);
                        }
                    }
                } else {
                    i5 += Character.charCount(Character.codePointAt(charSequence, i5));
                    if (i5 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i5);
                    }
                }
            }
        }
        if (qq0Var.f4038a != 2 || qq0Var.c.f3741b == null || (qq0Var.f <= 1 && !qq0Var.b())) {
            z4 = false;
        }
        if (z4 && i6 < i3 && z5 && (z || !c(charSequence, i5, i4, qq0Var.c.f3741b))) {
            oq0Var.b(charSequence, i5, i4, qq0Var.c.f3741b);
        }
        return oq0Var.a();
    }

    public final Boolean g() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        px0 px0Var = ((FirebaseMessaging) this.e).f1585a;
        px0Var.a();
        Context context = px0Var.f3931a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public et2(wq2 wq2Var, s71 s71Var, lh0 lh0Var, Set set) {
        this.f1995b = s71Var;
        this.c = wq2Var;
        this.d = lh0Var;
        this.f1994a = false;
        this.e = null;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            f(str, 0, str.length(), 1, true, new pq0(str, 0, 0));
        }
    }

    public et2(Context context) {
        ft2 ft2Var = new ft2();
        this.f1995b = ft2Var;
        ft2Var.f2151a = context;
        ft2Var.f2152b = "toggle";
    }

    public et2(FirebaseMessaging firebaseMessaging, u23 u23Var) {
        this.e = firebaseMessaging;
        this.f1995b = u23Var;
    }
}
