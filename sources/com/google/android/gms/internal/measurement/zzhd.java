package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhd;
import com.google.android.gms.internal.measurement.zzhf;
import defpackage.hx2;
import defpackage.p71;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzhd<MessageType extends zzhd<MessageType, BuilderType>, BuilderType extends zzhf<MessageType, BuilderType>> implements zzkj {
    protected int zza = 0;

    public int zza(zzlb zzlbVar) {
        int zzbt = zzbt();
        if (zzbt != -1) {
            return zzbt;
        }
        int zza = zzlbVar.zza(this);
        zzc(zza);
        return zza;
    }

    public int zzbt() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final zzhm zzbu() {
        try {
            zzhv zzc = zzhm.zzc(zzbw());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e) {
            throw new RuntimeException(hx2.q("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final byte[] zzbv() {
        try {
            byte[] bArr = new byte[zzbw()];
            zzig zzb = zzig.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(hx2.q("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public void zzc(int i) {
        throw new UnsupportedOperationException();
    }

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zziz.zza(iterable);
        if (iterable instanceof zzjp) {
            List<?> zzb = ((zzjp) iterable).zzb();
            zzjp zzjpVar = (zzjp) list;
            int size = list.size();
            for (Object obj : zzb) {
                if (obj == null) {
                    String k = p71.k("Element at index ", zzjpVar.size() - size, " is null.");
                    int size2 = zzjpVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            zzjpVar.remove(size2);
                        }
                    }
                    throw new NullPointerException(k);
                }
                if (obj instanceof zzhm) {
                    zzjpVar.zza((zzhm) obj);
                } else {
                    zzjpVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzkv) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t : iterable) {
            if (t == null) {
                String k2 = p71.k("Element at index ", list.size() - size3, " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        break;
                    } else {
                        list.remove(size4);
                    }
                }
                throw new NullPointerException(k2);
            }
            list.add(t);
        }
    }
}
