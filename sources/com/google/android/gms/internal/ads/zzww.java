package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class zzww extends zzdc {
    public static final zzww zzE;

    @Deprecated
    public static final zzww zzF;
    public static final zzn zzG;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    private final SparseArray zzam;
    private final SparseBooleanArray zzan;

    static {
        zzww zzwwVar = new zzww(new zzwu());
        zzE = zzwwVar;
        zzF = zzwwVar;
        zzU = Integer.toString(1000, 36);
        zzV = Integer.toString(1001, 36);
        zzW = Integer.toString(1002, 36);
        zzX = Integer.toString(1003, 36);
        zzY = Integer.toString(1004, 36);
        zzZ = Integer.toString(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 36);
        zzaa = Integer.toString(1006, 36);
        zzab = Integer.toString(1007, 36);
        zzac = Integer.toString(1008, 36);
        zzad = Integer.toString(1009, 36);
        zzae = Integer.toString(1010, 36);
        zzaf = Integer.toString(1011, 36);
        zzag = Integer.toString(1012, 36);
        zzah = Integer.toString(1013, 36);
        zzai = Integer.toString(1014, 36);
        zzaj = Integer.toString(1015, 36);
        zzak = Integer.toString(1016, 36);
        zzal = Integer.toString(1017, 36);
        zzG = new zzn() { // from class: com.google.android.gms.internal.ads.zzws
        };
    }

    public /* synthetic */ zzww(zzwu zzwuVar, zzwv zzwvVar) {
        this(zzwuVar);
    }

    public static zzww zzd(Context context) {
        return new zzww(new zzwu(context));
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzww.class == obj.getClass()) {
            zzww zzwwVar = (zzww) obj;
            if (super.equals(zzwwVar) && this.zzH == zzwwVar.zzH && this.zzJ == zzwwVar.zzJ && this.zzL == zzwwVar.zzL && this.zzQ == zzwwVar.zzQ && this.zzR == zzwwVar.zzR && this.zzT == zzwwVar.zzT) {
                SparseBooleanArray sparseBooleanArray = this.zzan;
                SparseBooleanArray sparseBooleanArray2 = zzwwVar.zzan;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray sparseArray = this.zzam;
                            SparseArray sparseArray2 = zzwwVar.zzam;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzvx zzvxVar = (zzvx) entry.getKey();
                                                if (map2.containsKey(zzvxVar) && zzfk.zzE(entry.getValue(), map2.get(zzvxVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int hashCode() {
        return (((((((((((((super.hashCode() + 31) * 31) + (this.zzH ? 1 : 0)) * 961) + (this.zzJ ? 1 : 0)) * 961) + (this.zzL ? 1 : 0)) * 28629151) + (this.zzQ ? 1 : 0)) * 31) + (this.zzR ? 1 : 0)) * 961) + (this.zzT ? 1 : 0)) * 31;
    }

    public final zzwu zzc() {
        return new zzwu(this, null);
    }

    @Deprecated
    public final zzwy zze(int i, zzvx zzvxVar) {
        Map map = (Map) this.zzam.get(i);
        if (map != null) {
            return (zzwy) map.get(zzvxVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzan.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzvx zzvxVar) {
        Map map = (Map) this.zzam.get(i);
        if (map != null && map.containsKey(zzvxVar)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzww(zzwu zzwuVar) {
        super(zzwuVar);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z = zzwuVar.zza;
        this.zzH = z;
        this.zzI = false;
        z2 = zzwuVar.zzb;
        this.zzJ = z2;
        this.zzK = false;
        z3 = zzwuVar.zzc;
        this.zzL = z3;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        z4 = zzwuVar.zzd;
        this.zzQ = z4;
        z5 = zzwuVar.zze;
        this.zzR = z5;
        this.zzS = false;
        z6 = zzwuVar.zzf;
        this.zzT = z6;
        sparseArray = zzwuVar.zzg;
        this.zzam = sparseArray;
        sparseBooleanArray = zzwuVar.zzh;
        this.zzan = sparseBooleanArray;
    }
}
