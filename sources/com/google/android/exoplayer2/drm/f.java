package com.google.android.exoplayer2.drm;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.f;
import defpackage.cp3;
import defpackage.dc0;
import defpackage.df0;
import defpackage.et;
import defpackage.ex;
import defpackage.f31;
import defpackage.h31;
import defpackage.it0;
import defpackage.sn1;
import defpackage.v51;
import defpackage.wi3;
import defpackage.z52;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f implements e {
    public static final df0 d = new df0();

    /* renamed from: a, reason: collision with root package name */
    public final UUID f1465a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f1466b;
    public int c;

    public f(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = et.f1989b;
        cp3.f(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f1465a = uuid;
        MediaDrm mediaDrm = new MediaDrm((wi3.f5017a >= 27 || !et.c.equals(uuid)) ? uuid : uuid2);
        this.f1466b = mediaDrm;
        this.c = 1;
        if (et.d.equals(uuid) && "ASUS_Z00AD".equals(wi3.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final Map a(byte[] bArr) {
        return this.f1466b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final it0 b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f1466b.getProvisionRequest();
        return new it0(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final dc0 c(byte[] bArr) {
        boolean z;
        int i = wi3.f5017a;
        UUID uuid = this.f1465a;
        if (i < 21 && et.d.equals(uuid) && "L3".equals(this.f1466b.getPropertyString("securityLevel"))) {
            z = true;
        } else {
            z = false;
        }
        if (i < 27 && et.c.equals(uuid)) {
            uuid = et.f1989b;
        }
        return new f31(uuid, bArr, z);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final byte[] d() {
        return this.f1466b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void e(byte[] bArr, byte[] bArr2) {
        this.f1466b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void f(byte[] bArr) {
        this.f1466b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final byte[] g(byte[] bArr, byte[] bArr2) {
        if (et.c.equals(this.f1465a) && wi3.f5017a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, ex.c));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = wi3.x(sb.toString());
            } catch (JSONException e) {
                sn1.d("ClearKeyUtil", "Failed to adjust response data: ".concat(new String(bArr2, ex.c)), e);
            }
        }
        return this.f1466b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void h(final v51 v51Var) {
        this.f1466b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: g31
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                f fVar = f.this;
                v51 v51Var2 = v51Var;
                fVar.getClass();
                yg0 yg0Var = ((b) v51Var2.f4780b).x;
                yg0Var.getClass();
                yg0Var.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void i(byte[] bArr) {
        this.f1466b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ce, code lost:            if ("AFTT".equals(r7) == false) goto L94;     */
    @Override // com.google.android.exoplayer2.drm.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ht0 j(byte[] r16, java.util.List r17, int r18, java.util.HashMap r19) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.f.j(byte[], java.util.List, int, java.util.HashMap):ht0");
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final int k() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void l(byte[] bArr, z52 z52Var) {
        if (wi3.f5017a >= 31) {
            try {
                h31.b(this.f1466b, bArr, z52Var);
            } catch (UnsupportedOperationException unused) {
                sn1.f();
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final boolean m(String str, byte[] bArr) {
        if (wi3.f5017a >= 31) {
            return h31.a(this.f1466b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f1465a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.f1466b.release();
        }
    }
}
