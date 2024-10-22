package defpackage;

import android.net.Uri;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final /* synthetic */ class ef0 implements rl1, h41, gv0, js1, ga1, x70, as, st, g73, qj1, z30, qj0, rb0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1928a;

    public /* synthetic */ ef0(int i) {
        this.f1928a = i;
    }

    @Override // defpackage.z30
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.x70
    public void accept(Object obj) {
        ((om2) obj).f3695b.release();
    }

    @Override // defpackage.h41
    public Object apply(Object obj) {
        switch (this.f1928a) {
            case 0:
                return new uf0((f10) obj);
            default:
                return (ra3) obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d2 A[SYNTHETIC] */
    @Override // defpackage.rb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(android.util.JsonReader r9) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef0.b(android.util.JsonReader):java.lang.Object");
    }

    @Override // defpackage.js1
    public int c(Object obj) {
        switch (this.f1928a) {
            case 1:
                Pattern pattern = ks1.f3004a;
                String str = ((zr1) obj).f5535a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (wi3.f5017a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                Pattern pattern2 = ks1.f3004a;
                return ((zr1) obj).f5535a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    @Override // defpackage.as
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.bs d(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef0.d(android.os.Bundle):bs");
    }

    @Override // defpackage.gv0
    public dv0[] e(Uri uri, Map map) {
        return h();
    }

    @Override // defpackage.ga1
    public boolean f(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.qj0
    public void g(fb2 fb2Var) {
    }

    public dv0[] h() {
        return new dv0[]{new oo3()};
    }

    @Override // defpackage.rl1
    public void invoke(Object obj) {
        switch (this.f1928a) {
            case 0:
                ((xa) obj).getClass();
                return;
            default:
                ((xa) obj).getClass();
                return;
        }
    }

    public /* synthetic */ ef0(wa waVar, y01 y01Var, xe0 xe0Var, int i) {
        this.f1928a = i;
    }
}
