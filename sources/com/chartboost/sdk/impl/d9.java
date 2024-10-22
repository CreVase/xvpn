package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class d9 {
    public final File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        return new File(file, str.concat(".tmp"));
    }

    public final boolean b(File file, String str) {
        String unused;
        if (file != null && str != null) {
            try {
                File a2 = a(file, str);
                if (a2 == null) {
                    return false;
                }
                return a2.exists();
            } catch (Exception e) {
                unused = e9.f799a;
                e.toString();
            }
        }
        return false;
    }

    public final RandomAccessFile a(File file) {
        if (file != null) {
            return new RandomAccessFile(file, "rwd");
        }
        return null;
    }
}
