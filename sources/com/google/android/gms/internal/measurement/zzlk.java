package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlk extends zzls {
    private final /* synthetic */ zzlg zza;

    @Override // com.google.android.gms.internal.measurement.zzls, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzli(this.zza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzlk(zzlg zzlgVar) {
        super(zzlgVar);
        this.zza = zzlgVar;
    }
}
