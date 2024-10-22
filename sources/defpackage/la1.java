package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes2.dex */
public final class la1 {
    public static final String[] c = {"*", "FCM", CodePackage.GCM, ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3090a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3091b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:            if (r1.isEmpty() != false) goto L12;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public la1(defpackage.px0 r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.Context r2 = r4.f3931a
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            r3.f3090a = r0
            r4.a()
            dy0 r0 = r4.c
            java.lang.String r1 = r0.e
            if (r1 == 0) goto L1b
            goto L48
        L1b:
            r4.a()
            java.lang.String r1 = r0.f1862b
            java.lang.String r4 = "1:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            goto L48
        L31:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3e
        L3c:
            r1 = r2
            goto L48
        L3e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L48
            goto L3c
        L48:
            r3.f3091b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la1.<init>(px0):void");
    }

    public final String a() {
        String string;
        synchronized (this.f3090a) {
            string = this.f3090a.getString("|S|id", null);
        }
        return string;
    }

    public final String b() {
        PublicKey publicKey;
        synchronized (this.f3090a) {
            String str = null;
            String string = this.f3090a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                e.toString();
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return str;
        }
    }
}
