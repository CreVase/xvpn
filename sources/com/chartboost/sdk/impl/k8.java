package com.chartboost.sdk.impl;

import android.content.res.Resources;
import defpackage.dx;
import defpackage.m20;
import defpackage.p71;
import defpackage.tf3;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* loaded from: classes.dex */
public final class k8 {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f954a;

    public k8(Resources resources) {
        this.f954a = resources;
    }

    public final String a(int i) {
        String str;
        BufferedReader bufferedReader;
        try {
            InputStream openRawResource = this.f954a.openRawResource(i);
            try {
                Reader inputStreamReader = new InputStreamReader(openRawResource, dx.f1853a);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                }
                try {
                    String N0 = m20.N0(bufferedReader);
                    tf3.y(bufferedReader, null);
                    tf3.y(openRawResource, null);
                    return N0;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            str = l8.f965a;
            p71.z("Raw resource file exception: ", e, str);
            return null;
        }
    }
}
