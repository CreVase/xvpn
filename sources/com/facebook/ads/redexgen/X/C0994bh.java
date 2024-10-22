package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0994bh<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public List<InterfaceC0996bj<ModelType, StateType>> A01 = null;
    public C0993bg A00 = C0993bg.A08;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bh != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C0994bh(ModelType model, StateType state, String str) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
    }

    public static /* synthetic */ C0993bg A00(C0994bh c0994bh) {
        return c0994bh.A00;
    }

    public static /* synthetic */ Object A01(C0994bh c0994bh) {
        return c0994bh.A02;
    }

    public static /* synthetic */ Object A02(C0994bh c0994bh) {
        return c0994bh.A03;
    }

    public static /* synthetic */ String A03(C0994bh c0994bh) {
        return c0994bh.A04;
    }

    public static /* synthetic */ List A04(C0994bh c0994bh) {
        return c0994bh.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bh != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bj != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C0994bh<ModelType, StateType> A05(InterfaceC0996bj<ModelType, StateType> interfaceC0996bj) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC0996bj);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bh != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C0993bg<ModelType, StateType> A06() {
        return new C0993bg<>(this);
    }
}
