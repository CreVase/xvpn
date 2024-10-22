package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class pb0 {
    public static final HashMap f;
    public static final String g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3813a;

    /* renamed from: b, reason: collision with root package name */
    public final ka1 f3814b;
    public final o40 c;
    public final j03 d;
    public final at3 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        p71.s(5, hashMap, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.5.1");
    }

    public pb0(Context context, ka1 ka1Var, o40 o40Var, f30 f30Var, at3 at3Var) {
        this.f3813a = context;
        this.f3814b = ka1Var;
        this.c = o40Var;
        this.d = f30Var;
        this.e = at3Var;
    }

    public static el c(wq2 wq2Var, int i) {
        String str = (String) wq2Var.f5057b;
        String str2 = (String) wq2Var.f5056a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) wq2Var.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        wq2 wq2Var2 = (wq2) wq2Var.d;
        if (i >= 8) {
            wq2 wq2Var3 = wq2Var2;
            while (wq2Var3 != null) {
                wq2Var3 = (wq2) wq2Var3.d;
                i2++;
            }
        }
        em emVar = new em();
        if (str != null) {
            emVar.f1959b = str;
            emVar.f1958a = str2;
            emVar.c = new gb1(d(stackTraceElementArr, 4));
            emVar.e = Integer.valueOf(i2);
            if (wq2Var2 != null && i2 == 0) {
                emVar.d = c(wq2Var2, i + 1);
            }
            return emVar.b();
        }
        throw new NullPointerException("Null type");
    }

    public static gb1 d(StackTraceElement[] stackTraceElementArr, int i) {
        long j;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            em emVar = new em();
            emVar.e = Integer.valueOf(i);
            long j2 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j2 = stackTraceElement.getLineNumber();
            }
            emVar.f1958a = Long.valueOf(j);
            if (str != null) {
                emVar.f1959b = str;
                emVar.c = fileName;
                emVar.d = Long.valueOf(j2);
                arrayList.add(emVar.c());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return new gb1(arrayList);
    }

    public static hl e(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        y33 y33Var = new y33(27);
        String name = thread.getName();
        if (name != null) {
            y33Var.f5263b = name;
            y33Var.c = Integer.valueOf(i);
            y33Var.d = new gb1(d(stackTraceElementArr, i));
            return y33Var.m();
        }
        throw new NullPointerException("Null name");
    }

    public final gb1 a() {
        bb0[] bb0VarArr = new bb0[1];
        wq2 wq2Var = new wq2(9);
        wq2Var.f5057b = 0L;
        wq2Var.c = 0L;
        o40 o40Var = this.c;
        String str = (String) o40Var.e;
        if (str != null) {
            wq2Var.f5056a = str;
            wq2Var.d = (String) o40Var.f3597b;
            bb0VarArr[0] = wq2Var.a();
            return new gb1(Arrays.asList(bb0VarArr));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.jl b(int r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb0.b(int):jl");
    }
}
