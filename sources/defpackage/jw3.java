package defpackage;

import com.chartboost.sdk.impl.p2;
import java.util.Comparator;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final /* synthetic */ class jw3 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2843b;

    public /* synthetic */ jw3(Object obj, int i) {
        this.f2842a = i;
        this.f2843b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f2842a;
        Object obj3 = this.f2843b;
        switch (i) {
            case 0:
                return p2.a.a((l41) obj3, obj, obj2);
            default:
                js1 js1Var = (js1) obj3;
                Pattern pattern = ks1.f3004a;
                return js1Var.c(obj2) - js1Var.c(obj);
        }
    }
}
