package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class zzhan implements Iterator, Closeable, zzant {
    private static final zzans zza = new zzham("eof ");
    private static final zzhau zzb = zzhau.zzb(zzhan.class);
    protected zzanp zzc;
    protected zzhao zzd;
    zzans zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzans zzansVar = this.zze;
        if (zzansVar == zza) {
            return false;
        }
        if (zzansVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzh.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzans) this.zzh.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzans next() {
        zzans zzb2;
        zzans zzansVar = this.zze;
        if (zzansVar != null && zzansVar != zza) {
            this.zze = null;
            return zzansVar;
        }
        zzhao zzhaoVar = this.zzd;
        if (zzhaoVar != null && this.zzf < this.zzg) {
            try {
                synchronized (zzhaoVar) {
                    this.zzd.zze(this.zzf);
                    zzb2 = this.zzc.zzb(this.zzd, this);
                    this.zzf = this.zzd.zzb();
                }
                return zzb2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.zze = zza;
        throw new NoSuchElementException();
    }

    public final List zze() {
        if (this.zzd != null && this.zze != zza) {
            return new zzhat(this.zzh, this);
        }
        return this.zzh;
    }

    public final void zzf(zzhao zzhaoVar, long j, zzanp zzanpVar) throws IOException {
        this.zzd = zzhaoVar;
        this.zzf = zzhaoVar.zzb();
        zzhaoVar.zze(zzhaoVar.zzb() + j);
        this.zzg = zzhaoVar.zzb();
        this.zzc = zzanpVar;
    }
}
