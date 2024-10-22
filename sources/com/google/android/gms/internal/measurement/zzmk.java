package com.google.android.gms.internal.measurement;

import defpackage.hx2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzmk extends IllegalArgumentException {
    public zzmk(int i, int i2) {
        super(hx2.n("Unpaired surrogate at index ", i, " of ", i2));
    }
}
