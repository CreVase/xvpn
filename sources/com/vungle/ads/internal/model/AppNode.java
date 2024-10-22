package com.vungle.ads.internal.model;

import defpackage.g40;
import defpackage.hx2;
import defpackage.m20;
import defpackage.mp2;
import defpackage.ng0;
import defpackage.p71;
import defpackage.pd0;
import defpackage.uh1;
import defpackage.up2;
import defpackage.vp2;

@up2
/* loaded from: classes2.dex */
public final class AppNode {
    public static final Companion Companion = new Companion(null);
    private final String appId;
    private final String bundle;
    private final String ver;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final uh1 serializer() {
            return AppNode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AppNode(int i, String str, String str2, String str3, vp2 vp2Var) {
        if (7 != (i & 7)) {
            pd0.R(i, 7, AppNode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public static /* synthetic */ AppNode copy$default(AppNode appNode, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appNode.bundle;
        }
        if ((i & 2) != 0) {
            str2 = appNode.ver;
        }
        if ((i & 4) != 0) {
            str3 = appNode.appId;
        }
        return appNode.copy(str, str2, str3);
    }

    public static /* synthetic */ void getAppId$annotations() {
    }

    public static final void write$Self(AppNode appNode, g40 g40Var, mp2 mp2Var) {
        g40Var.o(0, appNode.bundle, mp2Var);
        g40Var.o(1, appNode.ver, mp2Var);
        g40Var.o(2, appNode.appId, mp2Var);
    }

    public final String component1() {
        return this.bundle;
    }

    public final String component2() {
        return this.ver;
    }

    public final String component3() {
        return this.appId;
    }

    public final AppNode copy(String str, String str2, String str3) {
        return new AppNode(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppNode)) {
            return false;
        }
        AppNode appNode = (AppNode) obj;
        return m20.L(this.bundle, appNode.bundle) && m20.L(this.ver, appNode.ver) && m20.L(this.appId, appNode.appId);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final String getVer() {
        return this.ver;
    }

    public int hashCode() {
        return this.appId.hashCode() + p71.h(this.ver, this.bundle.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.bundle;
        String str2 = this.ver;
        return hx2.s(p71.q("AppNode(bundle=", str, ", ver=", str2, ", appId="), this.appId, ")");
    }

    public AppNode(String str, String str2, String str3) {
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }
}
