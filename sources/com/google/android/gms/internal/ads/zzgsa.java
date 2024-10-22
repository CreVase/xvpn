package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgrz;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.protobuf.v;
import defpackage.hx2;
import defpackage.p71;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzgsa<MessageType extends zzgsa<MessageType, BuilderType>, BuilderType extends zzgrz<MessageType, BuilderType>> implements zzgvj {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzav(Iterable iterable, List list) {
        byte[] bArr = zzguj.zzd;
        iterable.getClass();
        if (iterable instanceof zzgur) {
            List zzh = ((zzgur) iterable).zzh();
            zzgur zzgurVar = (zzgur) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String k = p71.k("Element at index ", zzgurVar.size() - size, " is null.");
                    int size2 = zzgurVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            zzgurVar.remove(size2);
                        }
                    }
                    throw new NullPointerException(k);
                }
                if (obj instanceof zzgsr) {
                    zzgurVar.zzi((zzgsr) obj);
                } else {
                    zzgurVar.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof zzgvq)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
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
                list.add(obj2);
            }
            return;
        }
        list.addAll(iterable);
    }

    public int zzat(zzgwc zzgwcVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvj
    public final zzgsr zzau() {
        try {
            int zzaz = zzaz();
            zzgsr zzgsrVar = zzgsr.zzb;
            byte[] bArr = new byte[zzaz];
            zzgtg zzC = zzgtg.zzC(bArr, 0, zzaz);
            zzaW(zzC);
            zzC.zzD();
            return new zzgsn(bArr);
        } catch (IOException e) {
            throw new RuntimeException(hx2.q("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final void zzaw(OutputStream outputStream) throws IOException {
        int zzaz = zzaz();
        int i = zzgtg.zzf;
        if (zzaz > 4096) {
            zzaz = v.DEFAULT_BUFFER_SIZE;
        }
        zzgte zzgteVar = new zzgte(outputStream, zzaz);
        zzaW(zzgteVar);
        zzgteVar.zzI();
    }

    public final byte[] zzax() {
        try {
            int zzaz = zzaz();
            byte[] bArr = new byte[zzaz];
            zzgtg zzC = zzgtg.zzC(bArr, 0, zzaz);
            zzaW(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(hx2.q("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
