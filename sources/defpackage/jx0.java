package defpackage;

import android.R;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class jx0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f2845a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2846b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public jx0(int i) {
        if (i != 2) {
            return;
        }
        this.f2845a = new int[]{ve2.abc_textfield_search_default_mtrl_alpha, ve2.abc_textfield_default_mtrl_alpha, ve2.abc_ab_share_pack_mtrl_alpha};
        this.f2846b = new int[]{ve2.abc_ic_commit_search_api_mtrl_alpha, ve2.abc_seekbar_tick_mark_material, ve2.abc_ic_menu_share_mtrl_alpha, ve2.abc_ic_menu_copy_mtrl_am_alpha, ve2.abc_ic_menu_cut_mtrl_alpha, ve2.abc_ic_menu_selectall_mtrl_alpha, ve2.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{ve2.abc_textfield_activated_mtrl_alpha, ve2.abc_textfield_search_activated_mtrl_alpha, ve2.abc_cab_background_top_mtrl_alpha, ve2.abc_text_cursor_material, ve2.abc_text_select_handle_left_mtrl, ve2.abc_text_select_handle_middle_mtrl, ve2.abc_text_select_handle_right_mtrl};
        this.d = new int[]{ve2.abc_popup_background_mtrl_mult, ve2.abc_cab_background_internal_bg, ve2.abc_menu_hardkey_panel_mtrl_mult};
        this.e = new int[]{ve2.abc_tab_indicator_material, ve2.abc_textfield_search_material};
        this.f = new int[]{ve2.abc_btn_check_material, ve2.abc_btn_radio_material, ve2.abc_btn_check_material_anim, ve2.abc_btn_radio_material_anim};
    }

    public static void B(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = in0.f2623a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = nd.f3438b;
        }
        PorterDuff.Mode mode2 = nd.f3438b;
        synchronized (nd.class) {
            h = bk2.h(i, mode);
        }
        mutate.setColorFilter(h);
    }

    public static og0 a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = wi3.f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(hx2.m("Invalid value size: ", readInt2));
            }
        }
        return new og0(hashMap);
    }

    public static void b(og0 og0Var, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = og0Var.f3656b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static al c(al alVar, xn1 xn1Var, jx0 jx0Var) {
        String str;
        em emVar = new em(alVar);
        String b2 = xn1Var.f5188b.b();
        if (b2 != null) {
            emVar.e = new kl(b2);
        }
        ArrayList p = p(((di1) ((AtomicMarkableReference) ((i91) jx0Var.d).f2557b).getReference()).a());
        ArrayList p2 = p(((di1) ((AtomicMarkableReference) ((i91) jx0Var.e).f2557b).getReference()).a());
        if (!p.isEmpty() || !p2.isEmpty()) {
            bl blVar = (bl) alVar.c;
            blVar.getClass();
            gb0 gb0Var = blVar.f482a;
            Boolean bool = blVar.d;
            Integer valueOf = Integer.valueOf(blVar.e);
            gb1 gb1Var = new gb1(p);
            gb1 gb1Var2 = new gb1(p2);
            if (gb0Var == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (valueOf == null) {
                str = str.concat(" uiOrientation");
            }
            if (str.isEmpty()) {
                emVar.c = new bl(gb0Var, gb1Var, gb1Var2, bool, valueOf.intValue());
            } else {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
        }
        return emVar.a();
    }

    public static boolean e(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static jx0 h(Context context, ka1 ka1Var, jx0 jx0Var, o40 o40Var, xn1 xn1Var, jx0 jx0Var2, f30 f30Var, at3 at3Var, uy0 uy0Var, ha0 ha0Var) {
        pb0 pb0Var = new pb0(context, ka1Var, o40Var, f30Var, at3Var);
        tb0 tb0Var = new tb0(jx0Var, at3Var, ha0Var);
        sb0 sb0Var = ee0.f1921b;
        dc3.b(context);
        return new jx0(pb0Var, tb0Var, new ee0(new kj2(dc3.a().c(new ft(ee0.c, ee0.d)).a("FIREBASE_CRASHLYTICS_REPORT", new lr0("json"), ee0.e), at3Var.d(), uy0Var)), xn1Var, jx0Var2, ka1Var);
    }

    public static ColorStateList i(Context context, int i) {
        int c = h83.c(context, ie2.colorControlHighlight);
        return new ColorStateList(new int[][]{h83.f2385b, h83.d, h83.c, h83.f}, new int[]{h83.b(context, ie2.colorButtonNormal), h20.b(c, i), h20.b(c, i), i});
    }

    public static LayerDrawable n(bk2 bk2Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable f = bk2Var.f(context, ve2.abc_star_black_48dp);
        Drawable f2 = bk2Var.f(context, ve2.abc_star_half_black_48dp);
        if ((f instanceof BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static ArrayList p(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new tk(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new xz0(23));
        return arrayList;
    }

    public static synchronized void u(File file) {
        synchronized (jx0.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                file.toString();
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        }
    }

    public static boolean v(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                v(file2);
            }
        }
        return file.delete();
    }

    public static List w(Object[] objArr) {
        if (objArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(objArr);
    }

    public final void A(String str) {
        i91 i91Var = (i91) this.e;
        synchronized (i91Var) {
            if (((di1) ((AtomicMarkableReference) i91Var.f2557b).getReference()).c(str)) {
                Object obj = i91Var.f2557b;
                int i = 1;
                ((AtomicMarkableReference) obj).set((di1) ((AtomicMarkableReference) obj).getReference(), true);
                li3 li3Var = new li3(i91Var, i);
                AtomicReference atomicReference = (AtomicReference) i91Var.c;
                while (true) {
                    if (atomicReference.compareAndSet(null, li3Var)) {
                        break;
                    } else if (atomicReference.get() != null) {
                        i = 0;
                        break;
                    }
                }
                if (i != 0) {
                    ((eb3) ((jx0) i91Var.d).f2846b).D(li3Var);
                }
            }
        }
    }

    public final void C(String str) {
        if (str != null) {
            this.f2845a = str;
            return;
        }
        throw new NullPointerException("Null transportName");
    }

    public final Task D(Bundle bundle, String str, String str2) {
        try {
            y(bundle, str, str2);
            return ((Rpc) this.c).send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    public final void E() {
        ((zt) this.e).e((HashMap) this.f2845a);
        int size = ((SparseBooleanArray) this.c).size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.f2846b).remove(((SparseBooleanArray) this.c).keyAt(i));
        }
        ((SparseBooleanArray) this.c).clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public final void d(String str, String str2) {
        l().put(str, str2);
    }

    public final jl f() {
        String str;
        if (((Integer) this.f2846b) == null) {
            str = " batteryVelocity";
        } else {
            str = "";
        }
        if (((Boolean) this.c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = p71.l(str, " orientation");
        }
        if (((Long) this.e) == null) {
            str = p71.l(str, " ramUsed");
        }
        if (((Long) this.f) == null) {
            str = p71.l(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new jl((Double) this.f2845a, ((Integer) this.f2846b).intValue(), ((Boolean) this.c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final pl g() {
        String str;
        if (((String) this.f2845a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((hr0) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = p71.l(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = p71.l(str, " uptimeMillis");
        }
        if (((Map) this.f) == null) {
            str = p71.l(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new pl((String) this.f2845a, (Integer) this.f2846b, (hr0) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (Map) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final Task j(Task task) {
        return task.continueWith(new zf(17), new ut0(this, 0));
    }

    public final wt k(String str) {
        return (wt) ((HashMap) this.f2845a).get(str);
    }

    public final Map l() {
        Object obj = this.f;
        if (((Map) obj) != null) {
            return (Map) obj;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public final wt m(String str) {
        int keyAt;
        wt wtVar = (wt) ((HashMap) this.f2845a).get(str);
        if (wtVar == null) {
            SparseArray sparseArray = (SparseArray) this.f2846b;
            int size = sparseArray.size();
            int i = 0;
            if (size == 0) {
                keyAt = 0;
            } else {
                keyAt = sparseArray.keyAt(size - 1) + 1;
            }
            if (keyAt < 0) {
                while (i < size && i == sparseArray.keyAt(i)) {
                    i++;
                }
                keyAt = i;
            }
            wt wtVar2 = new wt(keyAt, str, og0.c);
            ((HashMap) this.f2845a).put(str, wtVar2);
            ((SparseArray) this.f2846b).put(keyAt, str);
            ((SparseBooleanArray) this.d).put(keyAt, true);
            ((zt) this.e).c(wtVar2);
            return wtVar2;
        }
        return wtVar;
    }

    public final File o(String str, String str2) {
        File file = new File((File) this.c, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public final ColorStateList q(Context context, int i) {
        if (i == ve2.abc_edit_text_material) {
            return x80.getColorStateList(context, ne2.abc_tint_edittext);
        }
        if (i == ve2.abc_switch_track_mtrl_alpha) {
            return x80.getColorStateList(context, ne2.abc_tint_switch_track);
        }
        if (i == ve2.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i2 = ie2.colorSwitchThumbNormal;
            ColorStateList d = h83.d(context, i2);
            if (d != null && d.isStateful()) {
                int[] iArr3 = h83.f2385b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = h83.e;
                iArr2[1] = h83.c(context, ie2.colorControlActivated);
                iArr[2] = h83.f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = h83.f2385b;
                iArr2[0] = h83.b(context, i2);
                iArr[1] = h83.e;
                iArr2[1] = h83.c(context, ie2.colorControlActivated);
                iArr[2] = h83.f;
                iArr2[2] = h83.c(context, i2);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i == ve2.abc_btn_default_mtrl_shape) {
            return i(context, h83.c(context, ie2.colorButtonNormal));
        }
        if (i == ve2.abc_btn_borderless_material) {
            return i(context, 0);
        }
        if (i == ve2.abc_btn_colored_material) {
            return i(context, h83.c(context, ie2.colorAccent));
        }
        if (i != ve2.abc_spinner_mtrl_am_alpha && i != ve2.abc_spinner_textfield_background_material) {
            if (e((int[]) this.f2846b, i)) {
                return h83.d(context, ie2.colorControlNormal);
            }
            if (e((int[]) this.e, i)) {
                return x80.getColorStateList(context, ne2.abc_tint_default);
            }
            if (e((int[]) this.f, i)) {
                return x80.getColorStateList(context, ne2.abc_tint_btn_checkable);
            }
            if (i == ve2.abc_seekbar_thumb_material) {
                return x80.getColorStateList(context, ne2.abc_tint_seek_thumb);
            }
            return null;
        }
        return x80.getColorStateList(context, ne2.abc_tint_spinner);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(long r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.e
            zt r0 = (defpackage.zt) r0
            r0.f(r3)
            java.lang.Object r0 = r2.f
            r1 = r0
            zt r1 = (defpackage.zt) r1
            if (r1 == 0) goto L13
            zt r0 = (defpackage.zt) r0
            r0.f(r3)
        L13:
            java.lang.Object r3 = r2.e
            zt r3 = (defpackage.zt) r3
            boolean r3 = r3.d()
            if (r3 != 0) goto L47
            java.lang.Object r3 = r2.f
            r4 = r3
            zt r4 = (defpackage.zt) r4
            if (r4 == 0) goto L47
            zt r3 = (defpackage.zt) r3
            boolean r3 = r3.d()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r2.f
            zt r3 = (defpackage.zt) r3
            java.lang.Object r4 = r2.f2845a
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r2.f2846b
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            r3.g(r4, r0)
            java.lang.Object r3 = r2.e
            zt r3 = (defpackage.zt) r3
            java.lang.Object r4 = r2.f2845a
            java.util.HashMap r4 = (java.util.HashMap) r4
            r3.a(r4)
            goto L56
        L47:
            java.lang.Object r3 = r2.e
            zt r3 = (defpackage.zt) r3
            java.lang.Object r4 = r2.f2845a
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r2.f2846b
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            r3.g(r4, r0)
        L56:
            java.lang.Object r3 = r2.f
            r4 = r3
            zt r4 = (defpackage.zt) r4
            if (r4 == 0) goto L65
            zt r3 = (defpackage.zt) r3
            r3.h()
            r3 = 0
            r2.f = r3
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx0.r(long):void");
    }

    public final void s(String str) {
        wt wtVar = (wt) ((HashMap) this.f2845a).get(str);
        if (wtVar != null && wtVar.c.isEmpty() && wtVar.d.isEmpty()) {
            ((HashMap) this.f2845a).remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
            int i = wtVar.f5067a;
            boolean z = sparseBooleanArray.get(i);
            ((zt) this.e).b(wtVar, z);
            if (z) {
                ((SparseArray) this.f2846b).remove(i);
                ((SparseBooleanArray) this.d).delete(i);
            } else {
                ((SparseArray) this.f2846b).put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    public final void t(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        j03 j03Var;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        boolean z2;
        boolean equals = str2.equals(AppMeasurement.CRASH_ORIGIN);
        pb0 pb0Var = (pb0) this.f2845a;
        Context context = pb0Var.f3813a;
        int i = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        Boolean bool = null;
        wq2 wq2Var = null;
        while (true) {
            boolean isEmpty = stack.isEmpty();
            j03Var = pb0Var.d;
            if (isEmpty) {
                break;
            }
            Throwable th3 = (Throwable) stack.pop();
            wq2Var = new wq2(th3.getLocalizedMessage(), th3.getClass().getName(), j03Var.a(th3.getStackTrace()), wq2Var);
        }
        em emVar = new em();
        emVar.f1959b = str2;
        emVar.f1958a = Long.valueOf(j);
        String str3 = (String) pb0Var.c.e;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str3)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        }
        Boolean bool2 = bool;
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pb0.e(thread, (StackTraceElement[]) wq2Var.c, 4));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(pb0.e(key, j03Var.a(entry.getValue()), 0));
                }
            }
        }
        gb1 gb1Var = new gb1(arrayList);
        el c = pb0.c(wq2Var, 0);
        y33 y33Var = new y33(26);
        y33Var.f5263b = "0";
        y33Var.c = "0";
        y33Var.d = 0L;
        String str4 = "";
        cl clVar = new cl(gb1Var, c, null, y33Var.l(), pb0Var.a());
        if (valueOf == null) {
            str4 = "".concat(" uiOrientation");
        }
        if (str4.isEmpty()) {
            emVar.c = new bl(clVar, null, null, bool2, valueOf.intValue());
            emVar.d = pb0Var.b(i);
            ((tb0) this.f2846b).c(c(emVar.a(), (xn1) this.d, (jx0) this.e), str, equals);
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str4));
    }

    public final Task x(String str, Executor executor) {
        boolean z;
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b2 = ((tb0) this.f2846b).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                sb0 sb0Var = tb0.g;
                String d = tb0.d(file);
                sb0Var.getClass();
                arrayList.add(new qk(sb0.h(d), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            qk qkVar = (qk) it2.next();
            if (str == null || str.equals(qkVar.f4009b)) {
                ee0 ee0Var = (ee0) this.c;
                if (((pk) qkVar.f4008a).f == null) {
                    try {
                        str2 = (String) aj3.a(((wx0) ((ka1) this.f).d).d());
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    pk pkVar = (pk) qkVar.f4008a;
                    pkVar.getClass();
                    ok okVar = new ok(pkVar);
                    okVar.e = str2;
                    qkVar = new qk(okVar.a(), qkVar.f4009b, qkVar.c);
                }
                boolean z2 = false;
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                kj2 kj2Var = ee0Var.f1922a;
                synchronized (kj2Var.f) {
                    taskCompletionSource = new TaskCompletionSource();
                    if (z) {
                        ((AtomicInteger) kj2Var.i.f4757b).getAndIncrement();
                        if (kj2Var.f.size() < kj2Var.e) {
                            z2 = true;
                        }
                        if (z2) {
                            kj2Var.f.size();
                            kj2Var.g.execute(new ku(kj2Var, qkVar, taskCompletionSource));
                            taskCompletionSource.trySetResult(qkVar);
                        } else {
                            kj2Var.a();
                            ((AtomicInteger) kj2Var.i.c).getAndIncrement();
                            taskCompletionSource.trySetResult(qkVar);
                        }
                    } else {
                        kj2Var.b(qkVar, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new z5(this, 28)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    public final void y(Bundle bundle, String str, String str2) {
        int i;
        String str3;
        int a2;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        px0 px0Var = (px0) this.f2845a;
        px0Var.a();
        bundle.putString("gmp_app_id", px0Var.c.f1862b);
        f80 f80Var = (f80) this.f2846b;
        synchronized (f80Var) {
            if (f80Var.c == 0) {
                try {
                    packageInfo = ((Context) f80Var.f2059b).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e) {
                    e.toString();
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    f80Var.c = packageInfo.versionCode;
                }
            }
            i = f80Var.c;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((f80) this.f2846b).d());
        bundle.putString("app_ver_name", ((f80) this.f2846b).e());
        px0 px0Var2 = (px0) this.f2845a;
        px0Var2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(px0Var2.f3932b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String str4 = ((ul) Tasks.await(((wx0) ((xx0) this.f)).e())).f4690a;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e2);
        }
        bundle.putString(VungleConstants.KEY_APP_ID, (String) Tasks.await(((wx0) ((xx0) this.f)).d()));
        bundle.putString("cliv", "fcm-23.3.1");
        u71 u71Var = (u71) ((fb2) this.e).get();
        pj0 pj0Var = (pj0) ((fb2) this.d).get();
        if (u71Var != null && pj0Var != null && (a2 = ((nh0) u71Var).a()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(hx2.x(a2)));
            bundle.putString("Firebase-Client", pj0Var.a());
        }
    }

    public final void z(hr0 hr0Var) {
        if (hr0Var != null) {
            this.c = hr0Var;
            return;
        }
        throw new NullPointerException("Null encodedPayload");
    }

    public /* synthetic */ jx0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f2845a = obj;
        this.f2846b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public jx0(Context context) {
        String str;
        String processName;
        this.f2845a = context.getFilesDir();
        if (Build.VERSION.SDK_INT >= 28) {
            StringBuilder sb = new StringBuilder(".com.google.firebase.crashlytics.files.v2");
            sb.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb.append(processName.replaceAll("[^a-zA-Z0-9.]", "_"));
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File((File) this.f2845a, str);
        u(file);
        this.f2846b = file;
        File file2 = new File((File) this.f2846b, "open-sessions");
        u(file2);
        this.c = file2;
        File file3 = new File((File) this.f2846b, "reports");
        u(file3);
        this.d = file3;
        File file4 = new File((File) this.f2846b, "priority-reports");
        u(file4);
        this.e = file4;
        File file5 = new File((File) this.f2846b, "native-reports");
        u(file5);
        this.f = file5;
    }

    public jx0(String str, jx0 jx0Var, eb3 eb3Var) {
        this.d = new i91(this, false);
        this.e = new i91(this, true);
        this.f = new AtomicMarkableReference(null, false);
        this.c = str;
        this.f2845a = new iw1(jx0Var);
        this.f2846b = eb3Var;
    }

    public jx0(he0 he0Var, File file) {
        cp3.m((he0Var == null && file == null) ? false : true);
        this.f2845a = new HashMap();
        this.f2846b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        xt xtVar = he0Var != null ? new xt(he0Var) : null;
        yt ytVar = file != null ? new yt(new File(file, "cached_content_index.exi")) : null;
        if (xtVar != null) {
            this.e = xtVar;
            this.f = ytVar;
        } else {
            int i = wi3.f5017a;
            this.e = ytVar;
            this.f = xtVar;
        }
    }
}
