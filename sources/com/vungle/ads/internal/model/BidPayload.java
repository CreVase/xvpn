package com.vungle.ads.internal.model;

import android.util.Base64;
import defpackage.ch3;
import defpackage.dx;
import defpackage.gi2;
import defpackage.ji1;
import defpackage.kg1;
import defpackage.m20;
import defpackage.ng0;
import defpackage.pd0;
import defpackage.qf1;
import defpackage.t9;
import defpackage.uf1;
import defpackage.uh1;
import defpackage.up2;
import defpackage.vp2;
import defpackage.x31;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.GZIPInputStream;

@up2
/* loaded from: classes2.dex */
public final class BidPayload {
    public static final Companion Companion = new Companion(null);
    private final AdPayload ad;
    private final String adunit;
    private final List<String> impression;
    private final qf1 json;
    private final Integer version;

    /* renamed from: com.vungle.ads.internal.model.BidPayload$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ji1 implements x31 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.x31
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((uf1) obj);
            return ch3.f636a;
        }

        public final void invoke(uf1 uf1Var) {
            uf1Var.c = true;
            uf1Var.f4661a = true;
            uf1Var.f4662b = false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final uh1 serializer() {
            return BidPayload$$serializer.INSTANCE;
        }
    }

    public BidPayload() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BidPayload copy$default(BidPayload bidPayload, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bidPayload.version;
        }
        if ((i & 2) != 0) {
            str = bidPayload.adunit;
        }
        if ((i & 4) != 0) {
            list = bidPayload.impression;
        }
        return bidPayload.copy(num, str, list);
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    private final String gzipDecode(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
        StringBuilder sb = new StringBuilder();
        byte[] bArr2 = new byte[32];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read != -1) {
                sb.append(new String(bArr2, 0, read, dx.f1853a));
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                return sb.toString();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:            if (defpackage.m20.L(r0, r4) == false) goto L42;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.vungle.ads.internal.model.BidPayload r7, defpackage.g40 r8, defpackage.mp2 r9) {
        /*
            boolean r0 = r8.D()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L9
            goto Ld
        L9:
            java.lang.Integer r0 = r7.version
            if (r0 == 0) goto Lf
        Ld:
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L19
            ld1 r0 = defpackage.ld1.f3105a
            java.lang.Integer r3 = r7.version
            r8.A(r9, r1, r0, r3)
        L19:
            boolean r0 = r8.D()
            if (r0 == 0) goto L20
            goto L24
        L20:
            java.lang.String r0 = r7.adunit
            if (r0 == 0) goto L26
        L24:
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 == 0) goto L30
            b23 r0 = defpackage.b23.f390a
            java.lang.String r3 = r7.adunit
            r8.A(r9, r2, r0, r3)
        L30:
            boolean r0 = r8.D()
            if (r0 == 0) goto L37
            goto L3b
        L37:
            java.util.List<java.lang.String> r0 = r7.impression
            if (r0 == 0) goto L3d
        L3b:
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            if (r0 == 0) goto L4d
            ig r0 = new ig
            b23 r3 = defpackage.b23.f390a
            r0.<init>(r3, r1)
            java.util.List<java.lang.String> r3 = r7.impression
            r4 = 2
            r8.A(r9, r4, r0, r3)
        L4d:
            boolean r0 = r8.D()
            if (r0 == 0) goto L54
            goto L84
        L54:
            com.vungle.ads.internal.model.AdPayload r0 = r7.ad
            java.lang.String r3 = r7.adunit
            r4 = 0
            if (r3 == 0) goto L7e
            byte[] r3 = android.util.Base64.decode(r3, r1)
            if (r3 == 0) goto L66
            java.lang.String r3 = r7.gzipDecode(r3)
            goto L67
        L66:
            r3 = r4
        L67:
            if (r3 == 0) goto L7e
            qf1 r4 = r7.json
            d5 r5 = r4.f3990b
            java.lang.Class<com.vungle.ads.internal.model.AdPayload> r6 = com.vungle.ads.internal.model.AdPayload.class
            if3 r6 = defpackage.gi2.b(r6)
            uh1 r5 = defpackage.pd0.K(r5, r6)
            java.lang.Object r3 = r4.a(r5, r3)
            r4 = r3
            com.vungle.ads.internal.model.AdPayload r4 = (com.vungle.ads.internal.model.AdPayload) r4
        L7e:
            boolean r0 = defpackage.m20.L(r0, r4)
            if (r0 != 0) goto L85
        L84:
            r1 = 1
        L85:
            if (r1 == 0) goto L8f
            com.vungle.ads.internal.model.AdPayload$$serializer r0 = com.vungle.ads.internal.model.AdPayload$$serializer.INSTANCE
            com.vungle.ads.internal.model.AdPayload r7 = r7.ad
            r1 = 3
            r8.A(r9, r1, r0, r7)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.BidPayload.write$Self(com.vungle.ads.internal.model.BidPayload, g40, mp2):void");
    }

    public final Integer component1() {
        return this.version;
    }

    public final String component2() {
        return this.adunit;
    }

    public final List<String> component3() {
        return this.impression;
    }

    public final BidPayload copy(Integer num, String str, List<String> list) {
        return new BidPayload(num, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BidPayload)) {
            return false;
        }
        BidPayload bidPayload = (BidPayload) obj;
        return m20.L(this.version, bidPayload.version) && m20.L(this.adunit, bidPayload.adunit) && m20.L(this.impression, bidPayload.impression);
    }

    public final AdPayload getAdPayload() {
        return this.ad;
    }

    public final String getAdunit() {
        return this.adunit;
    }

    public final String getEventId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.eventId();
        }
        return null;
    }

    public final List<String> getImpression() {
        return this.impression;
    }

    public final String getPlacementId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.placementId();
        }
        return null;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ")";
    }

    public BidPayload(int i, Integer num, String str, List list, AdPayload adPayload, vp2 vp2Var) {
        AdPayload adPayload2 = null;
        if ((i & 0) != 0) {
            pd0.R(i, 0, BidPayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        kg1 d = t9.d(AnonymousClass1.INSTANCE);
        this.json = d;
        if ((i & 8) != 0) {
            this.ad = adPayload;
            return;
        }
        String str2 = this.adunit;
        if (str2 != null) {
            byte[] decode = Base64.decode(str2, 0);
            String gzipDecode = decode != null ? gzipDecode(decode) : null;
            if (gzipDecode != null) {
                adPayload2 = (AdPayload) d.a(pd0.K(d.f3990b, gi2.b(AdPayload.class)), gzipDecode);
            }
        }
        this.ad = adPayload2;
    }

    public BidPayload(Integer num, String str, List<String> list) {
        this.version = num;
        this.adunit = str;
        this.impression = list;
        kg1 d = t9.d(BidPayload$json$1.INSTANCE);
        this.json = d;
        AdPayload adPayload = null;
        if (str != null) {
            byte[] decode = Base64.decode(str, 0);
            String gzipDecode = decode != null ? gzipDecode(decode) : null;
            if (gzipDecode != null) {
                adPayload = (AdPayload) d.a(pd0.K(d.f3990b, gi2.b(AdPayload.class)), gzipDecode);
            }
        }
        this.ad = adPayload;
    }

    public /* synthetic */ BidPayload(Integer num, String str, List list, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
