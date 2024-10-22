package com.chartboost.sdk.impl;

import defpackage.dx;
import defpackage.i23;
import defpackage.m20;
import defpackage.p71;
import defpackage.tf3;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public final class n8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1014a = "n8";

    public final String a(File file, String str, String str2) {
        String str3;
        String str4;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), dx.f1853a);
            try {
                String N0 = m20.N0(inputStreamReader);
                tf3.y(inputStreamReader, null);
                str3 = o8.f1046a;
                String k1 = i23.k1(N0, str3, str, false);
                str4 = o8.f1047b;
                return i23.k1(k1, str4, str2, false);
            } finally {
            }
        } catch (Exception e) {
            p71.z("Parse sdk bidding template exception: ", e, this.f1014a);
            return null;
        }
    }
}
