package com.vungle.ads.internal.model;

import defpackage.g40;
import defpackage.jo1;
import defpackage.ld1;
import defpackage.m20;
import defpackage.mp2;
import defpackage.ng0;
import defpackage.pd0;
import defpackage.rq;
import defpackage.uh1;
import defpackage.up2;
import defpackage.vp2;

@up2
/* loaded from: classes2.dex */
public final class CleverCache {
    public static final Companion Companion = new Companion(null);
    private final Integer diskPercentage;
    private final Long diskSize;
    private final Boolean enabled;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final uh1 serializer() {
            return CleverCache$$serializer.INSTANCE;
        }
    }

    public CleverCache() {
        this((Boolean) null, (Long) null, (Integer) null, 7, (ng0) null);
    }

    public static /* synthetic */ CleverCache copy$default(CleverCache cleverCache, Boolean bool, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cleverCache.enabled;
        }
        if ((i & 2) != 0) {
            l = cleverCache.diskSize;
        }
        if ((i & 4) != 0) {
            num = cleverCache.diskPercentage;
        }
        return cleverCache.copy(bool, l, num);
    }

    public static /* synthetic */ void getDiskPercentage$annotations() {
    }

    public static /* synthetic */ void getDiskSize$annotations() {
    }

    public static /* synthetic */ void getEnabled$annotations() {
    }

    public static final void write$Self(CleverCache cleverCache, g40 g40Var, mp2 mp2Var) {
        boolean z;
        boolean z2;
        Integer num;
        Long l;
        boolean z3 = false;
        if (g40Var.D() || !m20.L(cleverCache.enabled, Boolean.FALSE)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            g40Var.A(mp2Var, 0, rq.f4201a, cleverCache.enabled);
        }
        if (g40Var.D() || (l = cleverCache.diskSize) == null || l.longValue() != 1000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            g40Var.A(mp2Var, 1, jo1.f2800a, cleverCache.diskSize);
        }
        if (g40Var.D() || (num = cleverCache.diskPercentage) == null || num.intValue() != 3) {
            z3 = true;
        }
        if (z3) {
            g40Var.A(mp2Var, 2, ld1.f3105a, cleverCache.diskPercentage);
        }
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final Long component2() {
        return this.diskSize;
    }

    public final Integer component3() {
        return this.diskPercentage;
    }

    public final CleverCache copy(Boolean bool, Long l, Integer num) {
        return new CleverCache(bool, l, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CleverCache)) {
            return false;
        }
        CleverCache cleverCache = (CleverCache) obj;
        return m20.L(this.enabled, cleverCache.enabled) && m20.L(this.diskSize, cleverCache.diskSize) && m20.L(this.diskPercentage, cleverCache.diskPercentage);
    }

    public final Integer getDiskPercentage() {
        return this.diskPercentage;
    }

    public final Long getDiskSize() {
        return this.diskSize;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.diskSize;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.diskPercentage;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ")";
    }

    public /* synthetic */ CleverCache(int i, Boolean bool, Long l, Integer num, vp2 vp2Var) {
        if ((i & 0) != 0) {
            pd0.R(i, 0, CleverCache$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.enabled = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.diskSize = 1000L;
        } else {
            this.diskSize = l;
        }
        if ((i & 4) == 0) {
            this.diskPercentage = 3;
        } else {
            this.diskPercentage = num;
        }
    }

    public CleverCache(Boolean bool, Long l, Integer num) {
        this.enabled = bool;
        this.diskSize = l;
        this.diskPercentage = num;
    }

    public /* synthetic */ CleverCache(Boolean bool, Long l, Integer num, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 1000L : l, (i & 4) != 0 ? 3 : num);
    }
}
