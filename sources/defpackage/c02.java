package defpackage;

import a.bx;
import a.du;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.text.method.TransformationMethod;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.android.billingclient.api.Purchase;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c02 implements d92, t33, mv0, tr1, ua, nd2 {

    /* renamed from: b, reason: collision with root package name */
    public static c02 f563b;
    public static c02 c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f564a;

    public /* synthetic */ c02() {
        this.f564a = 15;
    }

    public static MediaCodec b(sr1 sr1Var) {
        sr1Var.f4400a.getClass();
        String str = sr1Var.f4400a.f5535a;
        m20.N("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        m20.e0();
        return createByCodecName;
    }

    public static byte[] g(List list) {
        ArrayList<? extends Parcelable> R = cp3.R(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", R);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // defpackage.tr1
    public ur1 a(sr1 sr1Var) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = b(sr1Var);
            m20.N("configureCodec");
            mediaCodec.configure(sr1Var.f4401b, sr1Var.d, sr1Var.e, 0);
            m20.e0();
            m20.N("startCodec");
            mediaCodec.start();
            m20.e0();
            return new l43(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    @Override // defpackage.ua
    public void c(Bundle bundle) {
    }

    @Override // defpackage.t33
    public u33 d(s33 s33Var) {
        return new m31(s33Var.f4265a, s33Var.f4266b, s33Var.c, s33Var.d);
    }

    @Override // defpackage.d92
    public void e() {
    }

    @Override // defpackage.d92
    public void f(int i, Object obj) {
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f564a) {
            case 18:
                return Integer.valueOf(qn2.d);
            default:
                return new gi3(0);
        }
    }

    public InputFilter[] h(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public KeyListener i(KeyListener keyListener) {
        return keyListener;
    }

    public boolean j() {
        return false;
    }

    public InputConnection k(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    public void l(wp wpVar, List list) {
        boolean z;
        boolean z2 = true;
        switch (this.f564a) {
            case 0:
                ew3.d0(new to1(14, wpVar, list));
                return;
            case 1:
                if (wpVar.f5050a == 0) {
                    GoogleIABHelper.g.getClass();
                    List<Purchase> list2 = list;
                    GoogleIABHelper.m.b(d20.K0(list2, "\n", null, null, null, 62));
                    ArrayList arrayList = new ArrayList(a20.C0(list2, 10));
                    for (Purchase purchase : list2) {
                        gc2 gc2Var = new gc2();
                        gc2Var.f2233b = (String) d20.H0(purchase.a());
                        gc2Var.f2232a = purchase.b();
                        arrayList.add(gc2Var);
                    }
                    ew3.d0(new g53(arrayList, 2));
                    return;
                }
                int i = GoogleIABHelper.g.d;
                if (i == 3841) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (i != 3842) {
                        z2 = false;
                    }
                    if (!z2) {
                        return;
                    }
                }
                ew3.d0(new g53(wpVar, 3));
                return;
            default:
                if (wpVar.f5050a == 0) {
                    GoogleIABHelper.g.getClass();
                    List<Purchase> list3 = list;
                    GoogleIABHelper.m.b(d20.K0(list3, "\n", null, null, null, 62));
                    ArrayList arrayList2 = new ArrayList(a20.C0(list3, 10));
                    for (Purchase purchase2 : list3) {
                        mb2 mb2Var = new mb2();
                        mb2Var.f3269b = (String) d20.H0(purchase2.a());
                        mb2Var.f3268a = purchase2.b();
                        arrayList2.add(mb2Var);
                    }
                    if (!arrayList2.isEmpty()) {
                        mb2[] mb2VarArr = (mb2[]) arrayList2.toArray(new mb2[0]);
                        bx bxVar = new bx();
                        if (mb2VarArr != null) {
                            bxVar.y(mb2VarArr.length);
                            for (mb2 mb2Var2 : mb2VarArr) {
                                if (mb2Var2 == null) {
                                    mb2Var2 = new mb2();
                                }
                                bxVar.z(mb2Var2.f3268a);
                                bxVar.z(mb2Var2.f3269b);
                            }
                        } else {
                            bxVar.y(0L);
                        }
                        du.d(375, bxVar);
                        String u = bxVar.u();
                        bxVar.h();
                        if (u.length() <= 0) {
                            z2 = false;
                        }
                        if (z2) {
                            ew3.d0(new le0(u, 6));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void m(boolean z) {
    }

    public void n(boolean z) {
    }

    public TransformationMethod o(TransformationMethod transformationMethod) {
        return transformationMethod;
    }

    public /* synthetic */ c02(int i) {
        this.f564a = i;
    }
}
