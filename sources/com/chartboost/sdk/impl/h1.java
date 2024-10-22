package com.chartboost.sdk.impl;

import android.util.Base64;
import defpackage.dx;
import defpackage.i23;
import defpackage.m20;
import defpackage.p71;

/* loaded from: classes.dex */
public final class h1 {
    public final String a(String str) {
        int i;
        boolean z;
        String k1 = i23.k1(str, "\n", "", false);
        int length = k1.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (m20.W(k1.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else {
                if (!z) {
                    break;
                }
                length--;
            }
        }
        return k1.subSequence(i2, length + 1).toString();
    }

    public final String b(String str) {
        String str2;
        try {
            return new String(Base64.decode(a(str), 2), dx.f1853a);
        } catch (Exception e) {
            str2 = i1.f869a;
            p71.z("Cannot decode base64 string ", e, str2);
            return "";
        }
    }

    public final String c(String str) {
        String str2;
        try {
            return a(Base64.encodeToString(str.getBytes(dx.f1853a), 2));
        } catch (Exception e) {
            str2 = i1.f869a;
            p71.z("Cannot encode to base64 string ", e, str2);
            return "";
        }
    }
}
