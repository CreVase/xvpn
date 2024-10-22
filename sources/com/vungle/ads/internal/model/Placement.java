package com.vungle.ads.internal.model;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.cr0;
import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;
import defpackage.pd0;
import defpackage.uh1;
import defpackage.up2;
import defpackage.vp2;
import java.util.List;

@up2
/* loaded from: classes2.dex */
public final class Placement {
    public static final Companion Companion = new Companion(null);
    private final int adRefreshDuration;
    private final String adSize;
    private final boolean headerBidding;
    private final String identifier;
    private final Boolean incentivized;
    private final boolean isIncentivized;
    private final String placementAdType;
    private final String referenceId;
    private final List<String> supportedAdFormats;
    private final List<String> supportedTemplateTypes;
    private Long wakeupTime;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final uh1 serializer() {
            return Placement$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Placement(int i, String str, String str2, Boolean bool, List list, List list2, int i2, boolean z, String str3, boolean z2, String str4, vp2 vp2Var) {
        String str5;
        if (3 != (i & 3)) {
            pd0.R(i, 3, Placement$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.identifier = str;
        this.referenceId = str2;
        if ((i & 4) == 0) {
            this.incentivized = Boolean.FALSE;
        } else {
            this.incentivized = bool;
        }
        int i3 = i & 8;
        cr0 cr0Var = cr0.f1659a;
        if (i3 == 0) {
            this.supportedTemplateTypes = cr0Var;
        } else {
            this.supportedTemplateTypes = list;
        }
        if ((i & 16) == 0) {
            this.supportedAdFormats = cr0Var;
        } else {
            this.supportedAdFormats = list2;
        }
        if ((i & 32) == 0) {
            this.adRefreshDuration = Integer.MIN_VALUE;
        } else {
            this.adRefreshDuration = i2;
        }
        if ((i & 64) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z;
        }
        if ((i & 128) == 0) {
            this.adSize = null;
        } else {
            this.adSize = str3;
        }
        if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
            Boolean bool2 = this.incentivized;
            this.isIncentivized = bool2 != null ? bool2.booleanValue() : false;
        } else {
            this.isIncentivized = z2;
        }
        this.wakeupTime = null;
        if ((i & 512) != 0) {
            this.placementAdType = str4;
            return;
        }
        List<String> list3 = this.supportedTemplateTypes;
        if (list3.contains("banner")) {
            str5 = "TYPE_BANNER";
        } else if (list3.contains("mrec")) {
            str5 = "TYPE_MREC";
        } else {
            str5 = list3.contains("native") ? "TYPE_NATIVE" : "TYPE_DEFAULT";
        }
        this.placementAdType = str5;
    }

    public static /* synthetic */ void getAdRefreshDuration$annotations() {
    }

    public static /* synthetic */ void getAdSize$annotations() {
    }

    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    public static /* synthetic */ void getIdentifier$annotations() {
    }

    public static /* synthetic */ void getIncentivized$annotations() {
    }

    public static /* synthetic */ void getReferenceId$annotations() {
    }

    public static /* synthetic */ void getSupportedAdFormats$annotations() {
    }

    public static /* synthetic */ void getSupportedTemplateTypes$annotations() {
    }

    public static /* synthetic */ void getWakeupTime$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0107, code lost:            if (defpackage.m20.L(r0, r3) == false) goto L83;     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.vungle.ads.internal.model.Placement r6, defpackage.g40 r7, defpackage.mp2 r8) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.Placement.write$Self(com.vungle.ads.internal.model.Placement, g40, mp2):void");
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.referenceId;
    }

    public final Boolean component3() {
        return this.incentivized;
    }

    public final List<String> component4() {
        return this.supportedTemplateTypes;
    }

    public final List<String> component5() {
        return this.supportedAdFormats;
    }

    public final int component6() {
        return this.adRefreshDuration;
    }

    public final boolean component7() {
        return this.headerBidding;
    }

    public final String component8() {
        return this.adSize;
    }

    public final Placement copy(String str, String str2, Boolean bool, List<String> list, List<String> list2, int i, boolean z, String str3) {
        return new Placement(str, str2, bool, list, list2, i, z, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) obj;
        return m20.L(this.identifier, placement.identifier) && m20.L(this.referenceId, placement.referenceId) && m20.L(this.incentivized, placement.incentivized) && m20.L(this.supportedTemplateTypes, placement.supportedTemplateTypes) && m20.L(this.supportedAdFormats, placement.supportedAdFormats) && this.adRefreshDuration == placement.adRefreshDuration && this.headerBidding == placement.headerBidding && m20.L(this.adSize, placement.adSize);
    }

    public final int getAdRefreshDuration() {
        return this.adRefreshDuration;
    }

    public final String getAdSize() {
        return this.adSize;
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Boolean getIncentivized() {
        return this.incentivized;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final List<String> getSupportedAdFormats() {
        return this.supportedAdFormats;
    }

    public final List<String> getSupportedTemplateTypes() {
        return this.supportedTemplateTypes;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int h = p71.h(this.referenceId, this.identifier.hashCode() * 31, 31);
        Boolean bool = this.incentivized;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int hashCode2 = (((this.supportedAdFormats.hashCode() + ((this.supportedTemplateTypes.hashCode() + ((h + hashCode) * 31)) * 31)) * 31) + this.adRefreshDuration) * 31;
        boolean z = this.headerBidding;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        String str = this.adSize;
        if (str != null) {
            i = str.hashCode();
        }
        return i3 + i;
    }

    public final boolean isBanner() {
        if (!m20.L(this.placementAdType, "TYPE_BANNER") && !isMREC()) {
            return false;
        }
        return true;
    }

    public final boolean isBannerNonMREC() {
        return m20.L(this.placementAdType, "TYPE_BANNER");
    }

    public final boolean isDefault() {
        return m20.L(this.placementAdType, "TYPE_DEFAULT");
    }

    public final boolean isIncentivized() {
        return this.isIncentivized;
    }

    public final boolean isInterstitial() {
        if (isDefault() && !this.isIncentivized) {
            return true;
        }
        return false;
    }

    public final boolean isMREC() {
        return m20.L(this.placementAdType, "TYPE_MREC");
    }

    public final boolean isNative() {
        return m20.L(this.placementAdType, "TYPE_NATIVE");
    }

    public final boolean isRewardedVideo() {
        if (isDefault() && this.isIncentivized) {
            return true;
        }
        return false;
    }

    public final void setWakeupTime(Long l) {
        this.wakeupTime = l;
    }

    public final void snooze(long j) {
        this.wakeupTime = Long.valueOf((j * 1000) + System.currentTimeMillis());
    }

    public String toString() {
        String str = this.identifier;
        String str2 = this.referenceId;
        Boolean bool = this.incentivized;
        List<String> list = this.supportedTemplateTypes;
        List<String> list2 = this.supportedAdFormats;
        int i = this.adRefreshDuration;
        boolean z = this.headerBidding;
        String str3 = this.adSize;
        StringBuilder q = p71.q("Placement(identifier=", str, ", referenceId=", str2, ", incentivized=");
        q.append(bool);
        q.append(", supportedTemplateTypes=");
        q.append(list);
        q.append(", supportedAdFormats=");
        q.append(list2);
        q.append(", adRefreshDuration=");
        q.append(i);
        q.append(", headerBidding=");
        q.append(z);
        q.append(", adSize=");
        q.append(str3);
        q.append(")");
        return q.toString();
    }

    public Placement(String str, String str2, Boolean bool, List<String> list, List<String> list2, int i, boolean z, String str3) {
        String str4;
        this.identifier = str;
        this.referenceId = str2;
        this.incentivized = bool;
        this.supportedTemplateTypes = list;
        this.supportedAdFormats = list2;
        this.adRefreshDuration = i;
        this.headerBidding = z;
        this.adSize = str3;
        this.isIncentivized = bool != null ? bool.booleanValue() : false;
        if (list.contains("banner")) {
            str4 = "TYPE_BANNER";
        } else if (list.contains("mrec")) {
            str4 = "TYPE_MREC";
        } else {
            str4 = list.contains("native") ? "TYPE_NATIVE" : "TYPE_DEFAULT";
        }
        this.placementAdType = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Placement(java.lang.String r12, java.lang.String r13, java.lang.Boolean r14, java.util.List r15, java.util.List r16, int r17, boolean r18, java.lang.String r19, int r20, defpackage.ng0 r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 4
            if (r1 == 0) goto La
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5 = r1
            goto Lb
        La:
            r5 = r14
        Lb:
            r1 = r0 & 8
            cr0 r2 = defpackage.cr0.f1659a
            if (r1 == 0) goto L13
            r6 = r2
            goto L14
        L13:
            r6 = r15
        L14:
            r1 = r0 & 16
            if (r1 == 0) goto L1a
            r7 = r2
            goto L1c
        L1a:
            r7 = r16
        L1c:
            r1 = r0 & 32
            if (r1 == 0) goto L25
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L27
        L25:
            r8 = r17
        L27:
            r1 = r0 & 64
            if (r1 == 0) goto L2e
            r1 = 0
            r9 = 0
            goto L30
        L2e:
            r9 = r18
        L30:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L37
            r0 = 0
            r10 = r0
            goto L39
        L37:
            r10 = r19
        L39:
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.Placement.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.util.List, java.util.List, int, boolean, java.lang.String, int, ng0):void");
    }
}
