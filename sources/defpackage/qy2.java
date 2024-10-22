package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class qy2 implements fc3, yl2, as, rl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4076a;

    public /* synthetic */ qy2(int i) {
        this.f4076a = i;
    }

    @Override // defpackage.fc3
    public final void a(Exception exc) {
    }

    @Override // defpackage.yl2
    public final Object apply(Object obj) {
        byte[] decode;
        boolean z = true;
        switch (this.f4076a) {
            case 3:
                lr0 lr0Var = am2.f;
                return (List) am2.L(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new qy2(7));
            case 4:
                lr0 lr0Var2 = am2.f;
                throw new h43("Timed out while trying to open db.", (Throwable) obj);
            case 5:
                Cursor cursor = (Cursor) obj;
                lr0 lr0Var3 = am2.f;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case 6:
                lr0 lr0Var4 = am2.f;
                throw new h43("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 7:
                Cursor cursor2 = (Cursor) obj;
                lr0 lr0Var5 = am2.f;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    y33 a2 = lm.a();
                    a2.G(cursor2.getString(1));
                    a2.H(b82.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    if (string == null) {
                        decode = null;
                    } else {
                        decode = Base64.decode(string, 0);
                    }
                    a2.c = decode;
                    arrayList.add(a2.o());
                }
                return arrayList;
            case 8:
                lr0 lr0Var6 = am2.f;
                if (((Cursor) obj).getCount() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 10:
                Cursor cursor3 = (Cursor) obj;
                lr0 lr0Var7 = am2.f;
                if (!cursor3.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor3.getLong(0));
            default:
                Cursor cursor4 = (Cursor) obj;
                lr0 lr0Var8 = am2.f;
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                while (cursor4.moveToNext()) {
                    byte[] blob = cursor4.getBlob(0);
                    arrayList2.add(blob);
                    i += blob.length;
                }
                byte[] bArr = new byte[i];
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i3);
                    System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
                    i2 += bArr2.length;
                }
                return bArr;
        }
    }

    @Override // defpackage.as
    public final bs d(Bundle bundle) {
        xs1 xs1Var;
        gt1 gt1Var;
        ts1 ts1Var;
        at1 at1Var;
        boolean z;
        Integer num;
        Bundle bundle2;
        Bundle bundle3;
        boolean z2 = true;
        int i = 0;
        switch (this.f4076a) {
            case 17:
                y01 y01Var = y01.I;
                x01 x01Var = new x01();
                if (bundle != null) {
                    ClassLoader classLoader = cp3.class.getClassLoader();
                    int i2 = wi3.f5017a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(y01.J);
                y01 y01Var2 = y01.I;
                String str = y01Var2.f5252a;
                if (string == null) {
                    string = str;
                }
                x01Var.f5098a = string;
                String string2 = bundle.getString(y01.K);
                if (string2 == null) {
                    string2 = y01Var2.f5253b;
                }
                x01Var.f5099b = string2;
                String string3 = bundle.getString(y01.L);
                if (string3 == null) {
                    string3 = y01Var2.c;
                }
                x01Var.c = string3;
                x01Var.d = bundle.getInt(y01.M, y01Var2.d);
                x01Var.e = bundle.getInt(y01.N, y01Var2.e);
                x01Var.f = bundle.getInt(y01.O, y01Var2.f);
                x01Var.g = bundle.getInt(y01.P, y01Var2.g);
                String string4 = bundle.getString(y01.Q);
                if (string4 == null) {
                    string4 = y01Var2.i;
                }
                x01Var.h = string4;
                Metadata metadata = (Metadata) bundle.getParcelable(y01.R);
                if (metadata == null) {
                    metadata = y01Var2.j;
                }
                x01Var.i = metadata;
                String string5 = bundle.getString(y01.X);
                if (string5 == null) {
                    string5 = y01Var2.k;
                }
                x01Var.j = string5;
                String string6 = bundle.getString(y01.Y);
                if (string6 == null) {
                    string6 = y01Var2.l;
                }
                x01Var.k = string6;
                x01Var.l = bundle.getInt(y01.Z, y01Var2.m);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(y01.d(i));
                    if (byteArray == null) {
                        x01Var.m = arrayList;
                        x01Var.n = (DrmInitData) bundle.getParcelable(y01.i0);
                        x01Var.o = bundle.getLong(y01.j0, y01Var2.p);
                        x01Var.p = bundle.getInt(y01.k0, y01Var2.q);
                        x01Var.q = bundle.getInt(y01.l0, y01Var2.r);
                        x01Var.r = bundle.getFloat(y01.m0, y01Var2.s);
                        x01Var.s = bundle.getInt(y01.n0, y01Var2.t);
                        x01Var.t = bundle.getFloat(y01.o0, y01Var2.u);
                        x01Var.u = bundle.getByteArray(y01.p0);
                        x01Var.v = bundle.getInt(y01.q0, y01Var2.w);
                        Bundle bundle4 = bundle.getBundle(y01.r0);
                        if (bundle4 != null) {
                            x01Var.w = (e20) e20.j.d(bundle4);
                        }
                        x01Var.x = bundle.getInt(y01.s0, y01Var2.y);
                        x01Var.y = bundle.getInt(y01.t0, y01Var2.z);
                        x01Var.z = bundle.getInt(y01.u0, y01Var2.A);
                        x01Var.A = bundle.getInt(y01.v0, y01Var2.B);
                        x01Var.B = bundle.getInt(y01.w0, y01Var2.C);
                        x01Var.C = bundle.getInt(y01.x0, y01Var2.D);
                        x01Var.D = bundle.getInt(y01.z0, y01Var2.E);
                        x01Var.E = bundle.getInt(y01.A0, y01Var2.F);
                        x01Var.F = bundle.getInt(y01.y0, y01Var2.G);
                        return new y01(x01Var);
                    }
                    arrayList.add(byteArray);
                    i++;
                }
            case 18:
                String str2 = w71.e;
                if (bundle.getInt(ig2.f2588a, -1) != 0) {
                    z2 = false;
                }
                cp3.e(z2);
                if (bundle.getBoolean(w71.e, false)) {
                    return new w71(bundle.getBoolean(w71.f, false));
                }
                return new w71();
            case 19:
                String string7 = bundle.getString(dt1.h, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(dt1.i);
                if (bundle5 == null) {
                    xs1Var = xs1.f;
                } else {
                    xs1Var = (xs1) xs1.l.d(bundle5);
                }
                xs1 xs1Var2 = xs1Var;
                Bundle bundle6 = bundle.getBundle(dt1.j);
                if (bundle6 == null) {
                    gt1Var = gt1.I;
                } else {
                    gt1Var = (gt1) gt1.C0.d(bundle6);
                }
                gt1 gt1Var2 = gt1Var;
                Bundle bundle7 = bundle.getBundle(dt1.k);
                if (bundle7 == null) {
                    ts1Var = ts1.m;
                } else {
                    ts1Var = (ts1) ss1.l.d(bundle7);
                }
                ts1 ts1Var2 = ts1Var;
                Bundle bundle8 = bundle.getBundle(dt1.l);
                if (bundle8 == null) {
                    at1Var = at1.d;
                } else {
                    at1Var = (at1) at1.h.d(bundle8);
                }
                return new dt1(string7, ts1Var2, null, xs1Var2, gt1Var2, at1Var);
            case 20:
                rs1 rs1Var = new rs1();
                ts1 ts1Var3 = ss1.f;
                long j = bundle.getLong(ss1.g, ts1Var3.f4406a);
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                cp3.e(z);
                rs1Var.f4204a = j;
                long j2 = bundle.getLong(ss1.h, ts1Var3.f4407b);
                if (j2 != Long.MIN_VALUE && j2 < 0) {
                    z2 = false;
                }
                cp3.e(z2);
                rs1Var.f4205b = j2;
                rs1Var.c = bundle.getBoolean(ss1.i, ts1Var3.c);
                rs1Var.d = bundle.getBoolean(ss1.j, ts1Var3.d);
                rs1Var.e = bundle.getBoolean(ss1.k, ts1Var3.e);
                return new ts1(rs1Var);
            case 21:
                return new xs1(bundle.getLong(xs1.g, -9223372036854775807L), bundle.getLong(xs1.h, -9223372036854775807L), bundle.getLong(xs1.i, -9223372036854775807L), bundle.getFloat(xs1.j, -3.4028235E38f), bundle.getFloat(xs1.k, -3.4028235E38f));
            case 22:
                y33 y33Var = new y33(15, i);
                y33Var.f5263b = (Uri) bundle.getParcelable(at1.e);
                y33Var.c = bundle.getString(at1.f);
                y33Var.d = bundle.getBundle(at1.g);
                return new at1(y33Var);
            case 23:
                ft1 ft1Var = new ft1();
                ft1Var.f2149a = bundle.getCharSequence(gt1.J);
                ft1Var.f2150b = bundle.getCharSequence(gt1.K);
                ft1Var.c = bundle.getCharSequence(gt1.L);
                ft1Var.d = bundle.getCharSequence(gt1.M);
                ft1Var.e = bundle.getCharSequence(gt1.N);
                ft1Var.f = bundle.getCharSequence(gt1.O);
                ft1Var.g = bundle.getCharSequence(gt1.P);
                byte[] byteArray2 = bundle.getByteArray(gt1.X);
                String str3 = gt1.x0;
                byte[] bArr = null;
                if (bundle.containsKey(str3)) {
                    num = Integer.valueOf(bundle.getInt(str3));
                } else {
                    num = null;
                }
                if (byteArray2 != null) {
                    bArr = (byte[]) byteArray2.clone();
                }
                ft1Var.j = bArr;
                ft1Var.k = num;
                ft1Var.l = (Uri) bundle.getParcelable(gt1.Y);
                ft1Var.x = bundle.getCharSequence(gt1.q0);
                ft1Var.y = bundle.getCharSequence(gt1.r0);
                ft1Var.z = bundle.getCharSequence(gt1.s0);
                ft1Var.C = bundle.getCharSequence(gt1.v0);
                ft1Var.D = bundle.getCharSequence(gt1.w0);
                ft1Var.E = bundle.getCharSequence(gt1.y0);
                ft1Var.G = bundle.getBundle(gt1.B0);
                String str4 = gt1.Q;
                if (bundle.containsKey(str4) && (bundle3 = bundle.getBundle(str4)) != null) {
                    ft1Var.h = (ig2) ig2.f2589b.d(bundle3);
                }
                String str5 = gt1.R;
                if (bundle.containsKey(str5) && (bundle2 = bundle.getBundle(str5)) != null) {
                    ft1Var.i = (ig2) ig2.f2589b.d(bundle2);
                }
                String str6 = gt1.Z;
                if (bundle.containsKey(str6)) {
                    ft1Var.m = Integer.valueOf(bundle.getInt(str6));
                }
                String str7 = gt1.h0;
                if (bundle.containsKey(str7)) {
                    ft1Var.n = Integer.valueOf(bundle.getInt(str7));
                }
                String str8 = gt1.i0;
                if (bundle.containsKey(str8)) {
                    ft1Var.o = Integer.valueOf(bundle.getInt(str8));
                }
                String str9 = gt1.A0;
                if (bundle.containsKey(str9)) {
                    ft1Var.p = Boolean.valueOf(bundle.getBoolean(str9));
                }
                String str10 = gt1.j0;
                if (bundle.containsKey(str10)) {
                    ft1Var.q = Boolean.valueOf(bundle.getBoolean(str10));
                }
                String str11 = gt1.k0;
                if (bundle.containsKey(str11)) {
                    ft1Var.r = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = gt1.l0;
                if (bundle.containsKey(str12)) {
                    ft1Var.s = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = gt1.m0;
                if (bundle.containsKey(str13)) {
                    ft1Var.t = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = gt1.n0;
                if (bundle.containsKey(str14)) {
                    ft1Var.u = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = gt1.o0;
                if (bundle.containsKey(str15)) {
                    ft1Var.v = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = gt1.p0;
                if (bundle.containsKey(str16)) {
                    ft1Var.w = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = gt1.t0;
                if (bundle.containsKey(str17)) {
                    ft1Var.A = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = gt1.u0;
                if (bundle.containsKey(str18)) {
                    ft1Var.B = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = gt1.z0;
                if (bundle.containsKey(str19)) {
                    ft1Var.F = Integer.valueOf(bundle.getInt(str19));
                }
                return new gt1(ft1Var);
            case 24:
                String str20 = b52.d;
                if (bundle.getInt(ig2.f2588a, -1) != 1) {
                    z2 = false;
                }
                cp3.e(z2);
                float f = bundle.getFloat(b52.d, -1.0f);
                if (f == -1.0f) {
                    return new b52();
                }
                return new b52(f);
            default:
                int i3 = bundle.getInt(ig2.f2588a, -1);
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                return (ig2) r83.g.d(bundle);
                            }
                            throw new IllegalArgumentException(hx2.m("Unknown RatingType: ", i3));
                        }
                        return (ig2) r03.g.d(bundle);
                    }
                    return (ig2) b52.e.d(bundle);
                }
                return (ig2) w71.g.d(bundle);
        }
    }

    @Override // defpackage.rl1
    public final void invoke(Object obj) {
        switch (this.f4076a) {
            case 14:
                int i = bu0.d0;
                ((v52) obj).onPlayerError(new jt0(2, new ju0(1), 1003));
                return;
            case 15:
                ((v52) obj).onSeekProcessed();
                return;
            default:
                ((v52) obj).onRenderedFirstFrame();
                return;
        }
    }
}
