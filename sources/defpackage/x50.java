package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.exoplayer2.drm.a;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfy;
import com.google.android.gms.internal.play_billing.zzfz;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class x50 implements v33, m32, mv0, wt1, vn0 {
    public static x50 d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5116a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5117b;
    public Object c;

    public /* synthetic */ x50(int i, Object obj, Object obj2) {
        this.f5116a = i;
        this.f5117b = obj;
        this.c = obj2;
    }

    public static synchronized x50 t() {
        x50 x50Var;
        synchronized (x50.class) {
            if (d == null) {
                d = new x50(0, (Object) null);
            }
            x50Var = d;
        }
        return x50Var;
    }

    public final void A(int i, int i2, int i3, int i4) {
        ((CardView) this.c).d.set(i, i2, i3, i4);
        Object obj = this.c;
        CardView.a((CardView) obj, i + ((CardView) obj).c.left, i2 + ((CardView) obj).c.top, i3 + ((CardView) obj).c.right, i4 + ((CardView) obj).c.bottom);
    }

    public final void B(tf3 tf3Var) {
        ((ey1) this.f5117b).j(tf3Var);
        if (tf3Var instanceof l32) {
            ((rr2) this.c).h((l32) tf3Var);
        } else if (tf3Var instanceof j32) {
            ((rr2) this.c).i(((j32) tf3Var).K);
        }
    }

    public final void C(zzfb zzfbVar) {
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfmVar = (zzfm) this.f5117b;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzi(zzfbVar);
            ((u93) this.c).i((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    public final void D(zzff zzffVar) {
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfmVar = (zzfm) this.f5117b;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzj(zzffVar);
            ((u93) this.c).i((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    @Override // defpackage.vn0
    public final void a(int i, rt1 rt1Var, Exception exc) {
        Pair o = o(i, rt1Var);
        if (o != null) {
            ((z43) ((fu1) this.c).i).c(new cq0(8, this, o, exc));
        }
    }

    @Override // defpackage.wt1
    public final void b(int i, rt1 rt1Var, et1 et1Var) {
        Pair o = o(i, rt1Var);
        if (o != null) {
            ((z43) ((fu1) this.c).i).c(new cq0(7, this, o, et1Var));
        }
    }

    @Override // defpackage.v33
    public final String c() {
        return (String) this.f5117b;
    }

    @Override // defpackage.vn0
    public final void d(int i, rt1 rt1Var, int i2) {
        Pair o = o(i, rt1Var);
        if (o != null) {
            ((z43) ((fu1) this.c).i).c(new vk0(this, o, i2, 2));
        }
    }

    @Override // defpackage.wt1
    public final void e(int i, rt1 rt1Var, xl1 xl1Var, et1 et1Var) {
        Pair o = o(i, rt1Var);
        if (o != null) {
            ((z43) ((fu1) this.c).i).c(new zt1(this, o, xl1Var, et1Var, 0));
        }
    }

    @Override // defpackage.wt1
    public final void f(int i, rt1 rt1Var, xl1 xl1Var, et1 et1Var) {
        Pair o = o(i, rt1Var);
        if (o != null) {
            ((z43) ((fu1) this.c).i).c(new zt1(this, o, xl1Var, et1Var, 1));
        }
    }

    public final void g(v50 v50Var) {
        synchronized (this.c) {
            boolean z = false;
            for (int size = ((ArrayList) this.f5117b).size() - 1; size >= 0; size--) {
                v50 v50Var2 = (v50) ((WeakReference) ((ArrayList) this.f5117b).get(size)).get();
                if (v50Var2 == null) {
                    ((ArrayList) this.f5117b).remove(size);
                } else if (v50Var2 == v50Var) {
                    z = true;
                }
            }
            if (!z) {
                ((ArrayList) this.f5117b).add(new WeakReference(v50Var));
            }
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new jw1((Context) ((Provider) this.f5117b).get(), (xb0) ((Provider) this.c).get());
    }

    @Override // defpackage.wt1
    public final void h(int i, rt1 rt1Var, xl1 xl1Var, et1 et1Var) {
        Pair o = o(i, rt1Var);
        if (o != null) {
            ((z43) ((fu1) this.c).i).c(new zt1(this, o, xl1Var, et1Var, 2));
        }
    }

    @Override // defpackage.wt1
    public final void i(int i, rt1 rt1Var, xl1 xl1Var, et1 et1Var, IOException iOException, boolean z) {
        Pair o = o(i, rt1Var);
        if (o != null) {
            ((z43) ((fu1) this.c).i).c(new au1(this, o, xl1Var, et1Var, iOException, z, 0));
        }
    }

    public final void j() {
        this.f5117b = null;
        this.c = null;
    }

    @Override // defpackage.vn0
    public final void k(int i, rt1 rt1Var) {
        Pair o = o(i, rt1Var);
        if (o != null) {
            ((z43) ((fu1) this.c).i).c(new bu1(this, o, 3));
        }
    }

    public final void l(se0 se0Var) {
        synchronized (se0Var) {
        }
        Object obj = this.f5117b;
        if (((Handler) obj) != null) {
            ((Handler) obj).post(new bi(this, se0Var, 0));
        }
    }

    @Override // defpackage.vn0
    public final void m(int i, rt1 rt1Var) {
        Pair o = o(i, rt1Var);
        if (o != null) {
            ((z43) ((fu1) this.c).i).c(new bu1(this, o, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.datatransport.cct.CctBackendFactory n(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Could not instantiate %s"
            java.lang.String r1 = "Could not instantiate %s."
            java.lang.Object r2 = r13.c
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L85
            java.lang.Object r2 = r13.f5117b
            android.content.Context r2 = (android.content.Context) r2
            android.content.pm.PackageManager r5 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r5 != 0) goto L17
            goto L2b
        L17:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r7 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
            r6.<init>(r2, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ServiceInfo r2 = r5.getServiceInfo(r6, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 != 0) goto L27
            goto L2b
        L27:
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            goto L2c
        L2a:
        L2b:
            r2 = r3
        L2c:
            if (r2 != 0) goto L33
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L83
        L33:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r6 = r2.keySet()
            java.util.Iterator r6 = r6.iterator()
        L40:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L82
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.get(r7)
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L40
            java.lang.String r9 = "backend:"
            boolean r9 = r7.startsWith(r9)
            if (r9 == 0) goto L40
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = ","
            r10 = -1
            java.lang.String[] r8 = r8.split(r9, r10)
            int r9 = r8.length
            r10 = 0
        L67:
            if (r10 >= r9) goto L40
            r11 = r8[r10]
            java.lang.String r11 = r11.trim()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L76
            goto L7f
        L76:
            r12 = 8
            java.lang.String r12 = r7.substring(r12)
            r5.put(r11, r12)
        L7f:
            int r10 = r10 + 1
            goto L67
        L82:
            r2 = r5
        L83:
            r13.c = r2
        L85:
            java.lang.Object r2 = r13.c
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r14 = r2.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L92
            return r3
        L92:
            r2 = 1
            java.lang.Class r5 = java.lang.Class.forName(r14)     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.NoSuchMethodException -> Lb4 java.lang.InstantiationException -> Lbc java.lang.IllegalAccessException -> Lc4 java.lang.ClassNotFoundException -> Lcc
            java.lang.Class<com.google.android.datatransport.cct.CctBackendFactory> r6 = com.google.android.datatransport.cct.CctBackendFactory.class
            java.lang.Class r5 = r5.asSubclass(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.NoSuchMethodException -> Lb4 java.lang.InstantiationException -> Lbc java.lang.IllegalAccessException -> Lc4 java.lang.ClassNotFoundException -> Lcc
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.NoSuchMethodException -> Lb4 java.lang.InstantiationException -> Lbc java.lang.IllegalAccessException -> Lc4 java.lang.ClassNotFoundException -> Lcc
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.NoSuchMethodException -> Lb4 java.lang.InstantiationException -> Lbc java.lang.IllegalAccessException -> Lc4 java.lang.ClassNotFoundException -> Lcc
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.NoSuchMethodException -> Lb4 java.lang.InstantiationException -> Lbc java.lang.IllegalAccessException -> Lc4 java.lang.ClassNotFoundException -> Lcc
            java.lang.Object r5 = r5.newInstance(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.NoSuchMethodException -> Lb4 java.lang.InstantiationException -> Lbc java.lang.IllegalAccessException -> Lc4 java.lang.ClassNotFoundException -> Lcc
            com.google.android.datatransport.cct.CctBackendFactory r5 = (com.google.android.datatransport.cct.CctBackendFactory) r5     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.NoSuchMethodException -> Lb4 java.lang.InstantiationException -> Lbc java.lang.IllegalAccessException -> Lc4 java.lang.ClassNotFoundException -> Lcc
            return r5
        Lac:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r14
            java.lang.String.format(r0, r1)
            goto Ld5
        Lb4:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r14
            java.lang.String.format(r0, r1)
            goto Ld5
        Lbc:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r14
            java.lang.String.format(r1, r0)
            goto Ld5
        Lc4:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r14
            java.lang.String.format(r1, r0)
            goto Ld5
        Lcc:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r14
            java.lang.String r14 = "Class %s is not found."
            java.lang.String.format(r14, r0)
        Ld5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x50.n(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public final Pair o(int i, rt1 rt1Var) {
        rt1 rt1Var2;
        rt1 rt1Var3 = null;
        if (rt1Var != null) {
            du1 du1Var = (du1) this.f5117b;
            int i2 = 0;
            while (true) {
                if (i2 < du1Var.c.size()) {
                    if (((rt1) du1Var.c.get(i2)).d == rt1Var.d) {
                        Object obj = du1Var.f1840b;
                        int i3 = d62.n;
                        rt1Var2 = rt1Var.b(Pair.create(obj, rt1Var.f3536a));
                        break;
                    }
                    i2++;
                } else {
                    rt1Var2 = null;
                    break;
                }
            }
            if (rt1Var2 == null) {
                return null;
            }
            rt1Var3 = rt1Var2;
        }
        return Pair.create(Integer.valueOf(i + ((du1) this.f5117b).d), rt1Var3);
    }

    @Override // defpackage.vn0
    public final void p(int i, rt1 rt1Var) {
        Pair o = o(i, rt1Var);
        if (o != null) {
            ((z43) ((fu1) this.c).i).c(new bu1(this, o, 2));
        }
    }

    @Override // defpackage.vn0
    public final void q(int i, rt1 rt1Var) {
        Pair o = o(i, rt1Var);
        if (o != null) {
            ((z43) ((fu1) this.c).i).c(new bu1(this, o, 0));
        }
    }

    @Override // defpackage.vn0
    public final /* synthetic */ void r() {
    }

    public final KeyListener s(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            return ((c02) ((gq0) this.c).c).i(keyListener);
        }
        return keyListener;
    }

    public final String toString() {
        switch (this.f5116a) {
            case 8:
                return "Bounds{lower=" + ((rc1) this.f5117b) + " upper=" + ((rc1) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public final void u(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.f5117b).getContext().obtainStyledAttributes(attributeSet, cg2.AppCompatTextView, i, 0);
        try {
            int i2 = cg2.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            ((c02) ((gq0) this.c).c).n(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection v(InputConnection inputConnection, EditorInfo editorInfo) {
        gq0 gq0Var = (gq0) this.c;
        if (inputConnection == null) {
            gq0Var.getClass();
            return null;
        }
        return ((c02) gq0Var.c).k(inputConnection, editorInfo);
    }

    @Override // defpackage.v33
    public final void w(n31 n31Var) {
        long j;
        Object[] objArr = (Object[]) this.c;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    n31Var.w(i);
                } else if (obj instanceof byte[]) {
                    n31Var.a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    n31Var.c(i, ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    n31Var.c(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    n31Var.d(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    n31Var.d(i, ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    n31Var.d(i, ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    n31Var.d(i, ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    n31Var.x(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    n31Var.d(i, j);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
            }
        }
    }

    public final void x(Exception exc, boolean z) {
        int i;
        this.c = null;
        hb1 l = hb1.l((Set) this.f5117b);
        ((Set) this.f5117b).clear();
        db1 listIterator = l.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            aVar.getClass();
            if (z) {
                i = 1;
            } else {
                i = 3;
            }
            aVar.j(i, exc);
        }
    }

    public final void y(d01 d01Var) {
        boolean z;
        int i = d01Var.f1715b;
        int i2 = 0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((Handler) this.c).post(new ku(i2, this, (v51) this.f5117b, d01Var.f1714a));
        } else {
            ((Handler) this.c).post(new l30(this, (v51) this.f5117b, i, 4, 0));
        }
    }

    public final void z(v50 v50Var) {
        for (int size = ((ArrayList) this.f5117b).size() - 1; size >= 0; size--) {
            v50 v50Var2 = (v50) ((WeakReference) ((ArrayList) this.f5117b).get(size)).get();
            if (v50Var2 == null || v50Var2 == v50Var) {
                ((ArrayList) this.f5117b).remove(size);
            }
        }
    }

    public /* synthetic */ x50(u50 u50Var) {
        this.f5116a = 25;
    }

    public /* synthetic */ x50(Object obj, Object obj2, int i) {
        this.f5116a = i;
        this.c = obj;
        this.f5117b = obj2;
    }

    public x50(Context context, zzfm zzfmVar) {
        this.f5116a = 15;
        this.c = new u93(context);
        this.f5117b = zzfmVar;
    }

    public x50(Context context, od2 od2Var, x50 x50Var) {
        this.f5116a = 17;
        this.f5117b = context;
        this.c = new by3(this, od2Var, x50Var);
    }

    public x50(int i, Object obj) {
        this.f5116a = i;
        if (i == 13) {
            this.f5117b = new ey1();
            this.c = new rr2();
            B(m32.f0);
        } else if (i == 23) {
            this.f5117b = "";
            this.c = new ArrayList();
        } else {
            if (i != 24) {
                switch (i) {
                    case 18:
                        return;
                    case 19:
                        return;
                    case 20:
                        return;
                    default:
                        this.f5117b = new ArrayList();
                        this.c = new Object();
                        return;
                }
            }
            this.c = new HashMap();
        }
    }

    public x50(TextView textView) {
        this.f5116a = 3;
        textView.getClass();
        this.f5117b = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x50(String str) {
        this(12, str, (Object) null);
        this.f5116a = 12;
    }

    public x50(EditText editText) {
        this.f5116a = 2;
        this.f5117b = editText;
        this.c = new gq0(editText);
    }

    public x50(Context context) {
        this.f5116a = 21;
        this.c = null;
        this.f5117b = context;
    }

    public x50(Handler handler, yt0 yt0Var) {
        this.f5116a = 28;
        this.f5117b = handler;
        this.c = yt0Var;
    }

    public x50(ArrayList arrayList, ArrayList arrayList2) {
        this.f5116a = 6;
        int size = arrayList.size();
        this.f5117b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f5117b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public x50(int i, int i2) {
        this.f5116a = 6;
        this.f5117b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public x50(int i, int i2, int i3) {
        this.f5116a = 6;
        this.f5117b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public x50(CardView cardView) {
        this.f5116a = 5;
        this.c = cardView;
    }

    public x50(hx2 hx2Var) {
        this.f5116a = 29;
        this.f5117b = new HashSet();
    }
}
