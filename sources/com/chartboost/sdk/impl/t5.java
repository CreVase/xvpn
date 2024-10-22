package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public enum t5 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");


    /* renamed from: a, reason: collision with root package name */
    public final String f1150a;

    t5(String str) {
        this.f1150a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1150a;
    }
}
