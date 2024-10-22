package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i91 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2556a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2557b;
    public Object c;
    public Object d;

    public i91(String str, boolean z, oh0 oh0Var) {
        cp3.e((z && TextUtils.isEmpty(str)) ? false : true);
        this.f2557b = oh0Var;
        this.c = str;
        this.f2556a = z;
        this.d = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #1 {all -> 0x004b, blocks: (B:5:0x0035, B:6:0x0040, B:8:0x0047, B:10:0x0050, B:18:0x0058, B:27:0x0089, B:31:0x00cf, B:33:0x006b, B:35:0x006f, B:37:0x0079, B:39:0x007f), top: B:4:0x0035, outer: #2, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf A[EDGE_INSN: B:30:0x00cf->B:31:0x00cf BREAK  A[LOOP:0: B:2:0x0030->B:29:0x00c6], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] d(defpackage.yd0 r38, java.lang.String r39, byte[] r40, java.util.Map r41) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i91.d(yd0, java.lang.String, byte[], java.util.Map):byte[]");
    }

    public final boolean a(y01 y01Var, qh qhVar) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(y01Var.l);
        int i = y01Var.y;
        if (equals && i == 16) {
            i = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(wi3.n(i));
        int i2 = y01Var.z;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        canBeSpatialized = ((Spatializer) this.f2557b).canBeSpatialized((AudioAttributes) qhVar.a().f4780b, channelMask.build());
        return canBeSpatialized;
    }

    public final void b(nj0 nj0Var, Looper looper) {
        if (((Spatializer.OnSpatializerStateChangedListener) this.d) == null && ((Handler) this.c) == null) {
            this.d = new ij0(nj0Var);
            Handler handler = new Handler(looper);
            this.c = handler;
            ((Spatializer) this.f2557b).addOnSpatializerStateChangedListener(new fg0(1, handler), (Spatializer.OnSpatializerStateChangedListener) this.d);
        }
    }

    public final byte[] c(UUID uuid, ht0 ht0Var) {
        String str;
        String str2 = ht0Var.f2482b;
        if (this.f2556a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = et.e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (et.c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((Map) this.d)) {
                hashMap.putAll((Map) this.d);
            }
            return d((yd0) this.f2557b, str2, ht0Var.f2481a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        cp3.p(uri, "The uri must be set.");
        throw new ps1(new ce0(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null), Uri.EMPTY, oi2.g, 0L, new IllegalStateException("No license URL"));
    }

    public final byte[] e(it0 it0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(it0Var.f2645b);
        sb.append("&signedRequest=");
        int i = wi3.f5017a;
        sb.append(new String(it0Var.f2644a, ex.c));
        return d((yd0) this.f2557b, sb.toString(), null, Collections.emptyMap());
    }

    public i91(jx0 jx0Var, boolean z) {
        this.d = jx0Var;
        this.c = new AtomicReference(null);
        this.f2556a = z;
        this.f2557b = new AtomicMarkableReference(new di1(z ? 8192 : UserVerificationMethods.USER_VERIFY_ALL), false);
    }

    public i91(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.f2557b = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f2556a = immersiveAudioLevel != 0;
    }
}
