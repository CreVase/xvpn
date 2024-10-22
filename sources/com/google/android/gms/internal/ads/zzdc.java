package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class zzdc {
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzJ;
    private static final String zzK;
    private static final String zzL;
    private static final String zzM;
    private static final String zzN;
    private static final String zzO;
    private static final String zzP;
    private static final String zzQ;
    private static final String zzR;
    private static final String zzS;
    private static final String zzT;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    public static final zzdc zza;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;

    @Deprecated
    public static final zzdc zzb;

    @Deprecated
    public static final zzn zzc;
    public final boolean zzA;
    public final boolean zzB;
    public final zzfvv zzC;
    public final zzfvx zzD;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = Integer.MAX_VALUE;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfvs zzo;
    public final int zzp;
    public final zzfvs zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzfvs zzu;
    public final int zzv;
    public final zzfvs zzw;
    public final int zzx;
    public final int zzy;
    public final boolean zzz;

    static {
        zzdc zzdcVar = new zzdc(new zzdb());
        zza = zzdcVar;
        zzb = zzdcVar;
        zzE = Integer.toString(1, 36);
        zzF = Integer.toString(2, 36);
        zzG = Integer.toString(3, 36);
        zzH = Integer.toString(4, 36);
        zzI = Integer.toString(5, 36);
        zzJ = Integer.toString(6, 36);
        zzK = Integer.toString(7, 36);
        zzL = Integer.toString(8, 36);
        zzM = Integer.toString(9, 36);
        zzN = Integer.toString(10, 36);
        zzO = Integer.toString(11, 36);
        zzP = Integer.toString(12, 36);
        zzQ = Integer.toString(13, 36);
        zzR = Integer.toString(14, 36);
        zzS = Integer.toString(15, 36);
        zzT = Integer.toString(16, 36);
        zzU = Integer.toString(17, 36);
        zzV = Integer.toString(18, 36);
        zzW = Integer.toString(19, 36);
        zzX = Integer.toString(20, 36);
        zzY = Integer.toString(21, 36);
        zzZ = Integer.toString(22, 36);
        zzaa = Integer.toString(23, 36);
        zzab = Integer.toString(24, 36);
        zzac = Integer.toString(25, 36);
        zzad = Integer.toString(26, 36);
        zzae = Integer.toString(27, 36);
        zzaf = Integer.toString(28, 36);
        zzag = Integer.toString(29, 36);
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzda
        };
    }

    public zzdc(zzdb zzdbVar) {
        int i;
        int i2;
        boolean z;
        zzfvs zzfvsVar;
        zzfvs zzfvsVar2;
        zzfvs zzfvsVar3;
        zzfvs zzfvsVar4;
        int i3;
        HashMap hashMap;
        HashSet hashSet;
        i = zzdbVar.zze;
        this.zzl = i;
        i2 = zzdbVar.zzf;
        this.zzm = i2;
        z = zzdbVar.zzg;
        this.zzn = z;
        zzfvsVar = zzdbVar.zzh;
        this.zzo = zzfvsVar;
        this.zzp = 0;
        zzfvsVar2 = zzdbVar.zzi;
        this.zzq = zzfvsVar2;
        this.zzr = 0;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        zzfvsVar3 = zzdbVar.zzl;
        this.zzu = zzfvsVar3;
        this.zzv = 0;
        zzfvsVar4 = zzdbVar.zzm;
        this.zzw = zzfvsVar4;
        i3 = zzdbVar.zzn;
        this.zzx = i3;
        this.zzy = 0;
        this.zzz = false;
        this.zzA = false;
        this.zzB = false;
        hashMap = zzdbVar.zzo;
        this.zzC = zzfvv.zzc(hashMap);
        hashSet = zzdbVar.zzp;
        this.zzD = zzfvx.zzl(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzdc zzdcVar = (zzdc) obj;
            if (this.zzn == zzdcVar.zzn && this.zzl == zzdcVar.zzl && this.zzm == zzdcVar.zzm && this.zzo.equals(zzdcVar.zzo) && this.zzq.equals(zzdcVar.zzq) && this.zzu.equals(zzdcVar.zzu) && this.zzw.equals(zzdcVar.zzw) && this.zzx == zzdcVar.zzx && this.zzC.equals(zzdcVar.zzC) && this.zzD.equals(zzdcVar.zzD)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.zzn ? 1 : 0) - 1048002209;
        return this.zzD.hashCode() + ((this.zzC.hashCode() + ((((this.zzw.hashCode() + ((this.zzu.hashCode() + ((((((this.zzq.hashCode() + ((this.zzo.hashCode() + (((((i * 31) + this.zzl) * 31) + this.zzm) * 31)) * 961)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 923521)) * 31) + this.zzx) * 28629151)) * 31);
    }
}
