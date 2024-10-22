package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ja1 implements hu1, f5, f22, pf3, g80, AudienceNetworkActivityApi, kv0, mv0, hp2, rq1, va, zq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2734a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2735b;

    public /* synthetic */ ja1(Object obj, int i) {
        this.f2734a = i;
        this.f2735b = obj;
    }

    public static Object C(Object[] objArr, int i, pf3 pf3Var) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        int i4 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(pf3Var.l(obj2) - i2) * 2;
            if (pf3Var.m(obj2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (obj == null || i4 > i5) {
                obj = obj2;
                i4 = i5;
            }
        }
        return obj;
    }

    public static String J(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public Typeface A(Context context, InputStream inputStream) {
        File T = tf3.T(context);
        if (T == null) {
            return null;
        }
        try {
            if (!tf3.B(T, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(T.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            T.delete();
        }
    }

    public Typeface B(Context context, Resources resources, int i, String str, int i2) {
        File T = tf3.T(context);
        if (T == null) {
            return null;
        }
        try {
            if (!tf3.A(T, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(T.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            T.delete();
        }
    }

    public l01 D(int i, l01[] l01VarArr) {
        return (l01) C(l01VarArr, i, new ja1(this, 6));
    }

    public final int E(String str) {
        int i;
        ((WorkDatabase) this.f2735b).c();
        try {
            Long b2 = ((WorkDatabase) this.f2735b).j().b(str);
            int i2 = 0;
            if (b2 != null) {
                i = b2.intValue();
            } else {
                i = 0;
            }
            if (i != Integer.MAX_VALUE) {
                i2 = i + 1;
            }
            ok0 j = ((WorkDatabase) this.f2735b).j();
            v62 v62Var = new v62(str, i2);
            gl2 gl2Var = j.f3681a;
            gl2Var.b();
            gl2Var.c();
            try {
                j.f3682b.e(v62Var);
                gl2Var.h();
                gl2Var.f();
                ((WorkDatabase) this.f2735b).h();
                return i;
            } catch (Throwable th) {
                gl2Var.f();
                throw th;
            }
        } finally {
            ((WorkDatabase) this.f2735b).f();
        }
    }

    public final int F(int i) {
        int E;
        synchronized (ja1.class) {
            E = E("next_job_scheduler_id");
            if (E < 0 || E > i) {
                ok0 j = ((WorkDatabase) this.f2735b).j();
                v62 v62Var = new v62("next_job_scheduler_id", 1);
                gl2 gl2Var = j.f3681a;
                gl2Var.b();
                gl2Var.c();
                try {
                    j.f3682b.e(v62Var);
                    gl2Var.h();
                    gl2Var.f();
                    E = 0;
                } catch (Throwable th) {
                    gl2Var.f();
                    throw th;
                }
            }
        }
        return E;
    }

    public final void G(Exception exc) {
        sn1.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        x50 x50Var = ((wr1) this.f2735b).P0;
        Handler handler = (Handler) x50Var.f5117b;
        if (handler != null) {
            handler.post(new ci(x50Var, exc, 0));
        }
    }

    public final void H(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((yo) this.f2735b).a(0);
    }

    public final Metadata I(ev0 ev0Var, ga1 ga1Var) {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                ev0Var.b(0, ((r42) this.f2735b).f4098a, 10);
                ((r42) this.f2735b).G(0);
                if (((r42) this.f2735b).x() != 4801587) {
                    break;
                }
                ((r42) this.f2735b).H(3);
                int u = ((r42) this.f2735b).u();
                int i2 = u + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(((r42) this.f2735b).f4098a, 0, bArr, 0, 10);
                    ev0Var.b(10, bArr, u);
                    metadata = new ia1(ga1Var).N0(i2, bArr);
                } else {
                    ev0Var.g(u);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        ev0Var.l();
        ev0Var.g(i);
        return metadata;
    }

    @Override // defpackage.g80
    public final ClipData a() {
        ClipData clip;
        clip = ((ContentInfo) this.f2735b).getClip();
        return clip;
    }

    @Override // defpackage.hu1
    public final boolean c(ju1 ju1Var, MenuItem menuItem) {
        boolean z;
        Object obj = this.f2735b;
        if (((ActionMenuView) obj).A == null) {
            return false;
        }
        ja1 ja1Var = (ja1) ((ActionMenuView) obj).A;
        if (((Toolbar) ja1Var.f2735b).G.a(menuItem)) {
            z = true;
        } else {
            s93 s93Var = ((Toolbar) ja1Var.f2735b).I;
            if (s93Var != null) {
                z = ((t93) s93Var).f4471a.f4801b.onMenuItemSelected(0, menuItem);
            } else {
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // defpackage.hp2
    public final long d() {
        long j = Long.MAX_VALUE;
        for (hp2 hp2Var : (hp2[]) this.f2735b) {
            long d = hp2Var.d();
            if (d != Long.MIN_VALUE) {
                j = Math.min(j, d);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AudienceNetworkActivity.access$1201((AudienceNetworkActivity) this.f2735b, str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i) {
        AudienceNetworkActivity.access$601((AudienceNetworkActivity) this.f2735b);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        String packageName = ((Context) ((Provider) this.f2735b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.hp2
    public final boolean h(long j) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long d = d();
            if (d == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (hp2 hp2Var : (hp2[]) this.f2735b) {
                long d2 = hp2Var.d();
                if (d2 != Long.MIN_VALUE && d2 <= j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (d2 == d || z2) {
                    z |= hp2Var.h(j);
                }
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    @Override // defpackage.hp2
    public final boolean i() {
        for (hp2 hp2Var : (hp2[]) this.f2735b) {
            if (hp2Var.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.va
    public final void j(Bundle bundle, String str) {
        oa0 oa0Var = (oa0) this.f2735b;
        if (oa0Var != null) {
            try {
                String str2 = "$A$:" + J(bundle, str);
                qa0 qa0Var = oa0Var.f3629a;
                qa0Var.getClass();
                long currentTimeMillis = System.currentTimeMillis() - qa0Var.d;
                na0 na0Var = qa0Var.g;
                na0Var.getClass();
                na0Var.e.D(new ka0(na0Var, currentTimeMillis, str2));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // defpackage.pf3
    public final int l(Object obj) {
        return ((l01) obj).c;
    }

    @Override // defpackage.pf3
    public final boolean m(Object obj) {
        return ((l01) obj).d;
    }

    @Override // defpackage.zq
    public final void o(oa0 oa0Var) {
        this.f2735b = oa0Var;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i, int i2, Intent intent) {
        AudienceNetworkActivity.access$1101((AudienceNetworkActivity) this.f2735b, i, i2, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        AudienceNetworkActivity.access$801((AudienceNetworkActivity) this.f2735b);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        AudienceNetworkActivity.access$901((AudienceNetworkActivity) this.f2735b, configuration);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(Bundle bundle) {
        AudienceNetworkActivity.access$001((AudienceNetworkActivity) this.f2735b, bundle);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onDestroy() {
        AudienceNetworkActivity.access$701((AudienceNetworkActivity) this.f2735b);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        AudienceNetworkActivity.access$201((AudienceNetworkActivity) this.f2735b);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        AudienceNetworkActivity.access$301((AudienceNetworkActivity) this.f2735b);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        AudienceNetworkActivity.access$501((AudienceNetworkActivity) this.f2735b, bundle);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        AudienceNetworkActivity.access$101((AudienceNetworkActivity) this.f2735b);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        AudienceNetworkActivity.access$401((AudienceNetworkActivity) this.f2735b);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return AudienceNetworkActivity.access$1001((AudienceNetworkActivity) this.f2735b, motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.f22
    public final wq3 q(View view, wq3 wq3Var) {
        wq3 wq3Var2;
        boolean z;
        int i = 0;
        boolean z2 = true;
        switch (this.f2734a) {
            case 5:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2735b;
                if (!w12.a(coordinatorLayout.n, wq3Var)) {
                    coordinatorLayout.n = wq3Var;
                    if (wq3Var.e() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    coordinatorLayout.o = z;
                    if (z || coordinatorLayout.getBackground() != null) {
                        z2 = false;
                    }
                    coordinatorLayout.setWillNotDraw(z2);
                    uq3 uq3Var = wq3Var.f5059a;
                    if (!uq3Var.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = ll3.f3151a;
                            if (!uk3.b(childAt) || ((k90) childAt.getLayoutParams()).f2909a == null || !uq3Var.m()) {
                                i++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return wq3Var;
            default:
                AppBarLayout appBarLayout = (AppBarLayout) this.f2735b;
                appBarLayout.getClass();
                WeakHashMap weakHashMap2 = ll3.f3151a;
                if (uk3.b(appBarLayout)) {
                    wq3Var2 = wq3Var;
                } else {
                    wq3Var2 = null;
                }
                if (!w12.a(appBarLayout.g, wq3Var2)) {
                    appBarLayout.g = wq3Var2;
                    if (appBarLayout.v != null && appBarLayout.getTopInset() > 0) {
                        i = 1;
                    }
                    appBarLayout.setWillNotDraw(i ^ 1);
                    appBarLayout.requestLayout();
                }
                return wq3Var;
        }
    }

    @Override // defpackage.g80
    public final int r() {
        int flags;
        flags = ((ContentInfo) this.f2735b).getFlags();
        return flags;
    }

    @Override // defpackage.g80
    public final ContentInfo s() {
        return (ContentInfo) this.f2735b;
    }

    @Override // defpackage.hp2
    public final long t() {
        long j = Long.MAX_VALUE;
        for (hp2 hp2Var : (hp2[]) this.f2735b) {
            long t = hp2Var.t();
            if (t != Long.MIN_VALUE) {
                j = Math.min(j, t);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final String toString() {
        switch (this.f2734a) {
            case 8:
                return "ContentInfoCompat{" + ((ContentInfo) this.f2735b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.hu1
    public final void u(ju1 ju1Var) {
        hu1 hu1Var = ((ActionMenuView) this.f2735b).v;
        if (hu1Var != null) {
            hu1Var.u(ju1Var);
        }
    }

    @Override // defpackage.g80
    public final int w() {
        int source;
        source = ((ContentInfo) this.f2735b).getSource();
        return source;
    }

    @Override // defpackage.hp2
    public final void x(long j) {
        for (hp2 hp2Var : (hp2[]) this.f2735b) {
            hp2Var.x(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface y(android.content.Context r9, defpackage.h01 r10, android.content.res.Resources r11, int r12) {
        /*
            r8 = this;
            v51 r0 = new v51
            r1 = 9
            r0.<init>(r8, r1)
            i01[] r1 = r10.f2350a
            java.lang.Object r0 = C(r1, r12, r0)
            i01 r0 = (defpackage.i01) r0
            if (r0 != 0) goto L13
            r9 = 0
            return r9
        L13:
            int r6 = r0.f
            java.lang.String r7 = r0.f2510a
            ja1 r0 = defpackage.jf3.f2758a
            r1 = r9
            r2 = r11
            r3 = r6
            r4 = r7
            r5 = r12
            android.graphics.Typeface r9 = r0.B(r1, r2, r3, r4, r5)
            if (r9 == 0) goto L2e
            r0 = 0
            java.lang.String r11 = defpackage.jf3.b(r11, r6, r7, r0, r12)
            mo1 r12 = defpackage.jf3.f2759b
            r12.put(r11, r9)
        L2e:
            java.lang.String r11 = "Could not retrieve font from family."
            java.lang.String r12 = "TypefaceCompatBaseImpl"
            r0 = 0
            if (r9 != 0) goto L38
        L36:
            r11 = r0
            goto L59
        L38:
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.String r3 = "native_instance"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.IllegalAccessException -> L4f java.lang.NoSuchFieldException -> L54
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L4f java.lang.NoSuchFieldException -> L54
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.IllegalAccessException -> L4f java.lang.NoSuchFieldException -> L54
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.IllegalAccessException -> L4f java.lang.NoSuchFieldException -> L54
            long r11 = r2.longValue()     // Catch: java.lang.IllegalAccessException -> L4f java.lang.NoSuchFieldException -> L54
            goto L59
        L4f:
            r2 = move-exception
            android.util.Log.e(r12, r11, r2)
            goto L36
        L54:
            r2 = move-exception
            android.util.Log.e(r12, r11, r2)
            goto L36
        L59:
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 == 0) goto L68
            java.lang.Object r0 = r8.f2735b
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r0.put(r11, r10)
        L68:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja1.y(android.content.Context, h01, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface z(Context context, l01[] l01VarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (l01VarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(D(i, l01VarArr).f3043a);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface A = A(context, inputStream);
            tf3.z(inputStream);
            return A;
        } catch (IOException unused2) {
            tf3.z(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            tf3.z(inputStream2);
            throw th;
        }
    }

    public ja1(int i) {
        this.f2734a = i;
        if (i == 9) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f2735b = new mq3();
                return;
            } else if (i2 >= 29) {
                this.f2735b = new lq3();
                return;
            } else {
                this.f2735b = new kq3();
                return;
            }
        }
        if (i == 14) {
            this.f2735b = new HashMap();
            return;
        }
        if (i == 18) {
            this.f2735b = null;
        } else if (i == 22) {
            this.f2735b = new r42(10);
        } else if (i != 29) {
            this.f2735b = new ConcurrentHashMap();
        }
    }

    public ja1(TextView textView) {
        this.f2734a = 13;
        if (textView != null) {
            this.f2735b = new sq0(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }

    public ja1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f2734a = 10;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f2735b = new mc1(uri, clipDescription, uri2);
        } else {
            this.f2735b = new y33(uri, clipDescription, uri2, 5);
        }
    }

    public ja1(ContentInfo contentInfo) {
        this.f2734a = 8;
        contentInfo.getClass();
        this.f2735b = vq.o(contentInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(materialButtonToggleGroup, 25);
        this.f2734a = 25;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(wr1 wr1Var) {
        this(wr1Var, 20);
        this.f2734a = 20;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(b bVar) {
        this(bVar, 21);
        this.f2734a = 21;
    }
}
