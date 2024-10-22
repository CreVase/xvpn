package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class b01 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f377b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ kc d;
    public final /* synthetic */ int e;

    public /* synthetic */ b01(String str, Context context, kc kcVar, int i, int i2) {
        this.f376a = i2;
        this.f377b = str;
        this.c = context;
        this.d = kcVar;
        this.e = i;
    }

    public final d01 a() {
        int i = this.f376a;
        Context context = this.c;
        String str = this.f377b;
        int i2 = this.e;
        kc kcVar = this.d;
        switch (i) {
            case 0:
                return e01.a(str, context, kcVar, i2);
            default:
                try {
                    return e01.a(str, context, kcVar, i2);
                } catch (Throwable unused) {
                    return new d01(-3);
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f376a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
