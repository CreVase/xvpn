package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class yt implements zt {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5385a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Cipher f5386b = null;
    public final SecretKeySpec c = null;
    public final SecureRandom d = null;
    public final uy0 e;
    public boolean f;
    public sk2 g;

    public yt(File file) {
        this.e = new uy0(file);
    }

    public static int i(wt wtVar, int i) {
        int hashCode = wtVar.f5068b.hashCode() + (wtVar.f5067a * 31);
        if (i < 2) {
            long b2 = hx2.b(wtVar.e);
            return (hashCode * 31) + ((int) (b2 ^ (b2 >>> 32)));
        }
        return (hashCode * 31) + wtVar.e.hashCode();
    }

    public static wt j(int i, DataInputStream dataInputStream) {
        og0 a2;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            uy0 uy0Var = new uy0(8);
            Long valueOf = Long.valueOf(readLong);
            Map map = (Map) uy0Var.f4757b;
            valueOf.getClass();
            map.put("exo_len", valueOf);
            ((List) uy0Var.c).remove("exo_len");
            a2 = og0.c.a(uy0Var);
        } else {
            a2 = jx0.a(dataInputStream);
        }
        return new wt(readInt, readUTF, a2);
    }

    @Override // defpackage.zt
    public final void a(HashMap hashMap) {
        DataOutputStream dataOutputStream;
        Cipher cipher = this.f5386b;
        uy0 uy0Var = this.e;
        try {
            mh r = uy0Var.r();
            sk2 sk2Var = this.g;
            if (sk2Var == null) {
                this.g = new sk2(r);
            } else {
                sk2Var.a(r);
            }
            sk2 sk2Var2 = this.g;
            dataOutputStream = new DataOutputStream(sk2Var2);
            try {
                dataOutputStream.writeInt(2);
                boolean z = this.f5385a;
                dataOutputStream.writeInt(z ? 1 : 0);
                if (z) {
                    byte[] bArr = new byte[16];
                    SecureRandom secureRandom = this.d;
                    int i = wi3.f5017a;
                    secureRandom.nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        cipher.init(1, this.c, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(sk2Var2, cipher));
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(hashMap.size());
                int i2 = 0;
                for (wt wtVar : hashMap.values()) {
                    dataOutputStream.writeInt(wtVar.f5067a);
                    dataOutputStream.writeUTF(wtVar.f5068b);
                    jx0.b(wtVar.e, dataOutputStream);
                    i2 += i(wtVar, 2);
                }
                dataOutputStream.writeInt(i2);
                dataOutputStream.close();
                ((File) uy0Var.c).delete();
                int i3 = wi3.f5017a;
                this.f = false;
            } catch (Throwable th) {
                th = th;
                wi3.g(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
    }

    @Override // defpackage.zt
    public final void b(wt wtVar, boolean z) {
        this.f = true;
    }

    @Override // defpackage.zt
    public final void c(wt wtVar) {
        this.f = true;
    }

    @Override // defpackage.zt
    public final boolean d() {
        uy0 uy0Var = this.e;
        if (!((File) uy0Var.f4757b).exists() && !((File) uy0Var.c).exists()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.zt
    public final void e(HashMap hashMap) {
        if (!this.f) {
            return;
        }
        a(hashMap);
    }

    @Override // defpackage.zt
    public final void f(long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.zt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.util.HashMap r12, android.util.SparseArray r13) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt.g(java.util.HashMap, android.util.SparseArray):void");
    }

    @Override // defpackage.zt
    public final void h() {
        uy0 uy0Var = this.e;
        ((File) uy0Var.f4757b).delete();
        ((File) uy0Var.c).delete();
    }
}
