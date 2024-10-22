package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final class zzapj extends zzgtz implements zzgvk {
    private static final zzapj zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private zzapl zzM;
    private zzape zzaC;
    private long zzaI;
    private zzaov zzaL;
    private zzaox zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private zzaps zzaW;
    private zzapg zzae;
    private zzapi zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private zzapu zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private zzgui zzaf = zzgtz.zzaN();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private zzgui zzaz = zzgtz.zzaN();
    private int zzaA = 1000;
    private zzgui zzaB = zzgtz.zzaN();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        zzapj zzapjVar = new zzapj();
        zzb = zzapjVar;
        zzgtz.zzaU(zzapj.class, zzapjVar);
    }

    private zzapj() {
    }

    public static /* synthetic */ void zzA(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 134217728;
        zzapjVar.zzH = j;
    }

    public static /* synthetic */ void zzB(zzapj zzapjVar, String str) {
        str.getClass();
        zzapjVar.zzd |= 268435456;
        zzapjVar.zzI = str;
    }

    public static /* synthetic */ void zzC(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 536870912;
        zzapjVar.zzJ = j;
    }

    public static /* synthetic */ void zzD(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 1073741824;
        zzapjVar.zzK = j;
    }

    public static /* synthetic */ void zzE(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= Integer.MIN_VALUE;
        zzapjVar.zzL = j;
    }

    public static /* synthetic */ void zzF(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 2;
        zzapjVar.zzN = j;
    }

    public static /* synthetic */ void zzG(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 4;
        zzapjVar.zzO = j;
    }

    public static /* synthetic */ void zzH(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 8;
        zzapjVar.zzP = j;
    }

    public static /* synthetic */ void zzI(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 16;
        zzapjVar.zzQ = j;
    }

    public static /* synthetic */ void zzJ(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 32;
        zzapjVar.zzR = j;
    }

    public static /* synthetic */ void zzK(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 64;
        zzapjVar.zzS = j;
    }

    public static /* synthetic */ void zzL(zzapj zzapjVar, String str) {
        str.getClass();
        zzapjVar.zze |= 128;
        zzapjVar.zzT = str;
    }

    public static /* synthetic */ void zzM(zzapj zzapjVar, String str) {
        str.getClass();
        zzapjVar.zze |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        zzapjVar.zzU = str;
    }

    public static /* synthetic */ void zzN(zzapj zzapjVar, long j) {
        zzapjVar.zze |= v.DEFAULT_BUFFER_SIZE;
        zzapjVar.zzY = j;
    }

    public static /* synthetic */ void zzO(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 8192;
        zzapjVar.zzZ = j;
    }

    public static /* synthetic */ void zzP(zzapj zzapjVar, long j) {
        zzapjVar.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzapjVar.zzaa = j;
    }

    public static /* synthetic */ void zzQ(zzapj zzapjVar, zzapg zzapgVar) {
        zzapgVar.getClass();
        zzapjVar.zzae = zzapgVar;
        zzapjVar.zze |= 262144;
    }

    public static /* synthetic */ void zzR(zzapj zzapjVar, zzapg zzapgVar) {
        zzapgVar.getClass();
        zzgui zzguiVar = zzapjVar.zzaf;
        if (!zzguiVar.zzc()) {
            zzapjVar.zzaf = zzgtz.zzaO(zzguiVar);
        }
        zzapjVar.zzaf.add(zzapgVar);
    }

    public static /* synthetic */ void zzT(zzapj zzapjVar, zzapi zzapiVar) {
        zzapiVar.getClass();
        zzapjVar.zzag = zzapiVar;
        zzapjVar.zze |= 524288;
    }

    public static /* synthetic */ void zzU(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 2097152;
        zzapjVar.zzai = j;
    }

    public static /* synthetic */ void zzV(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 4194304;
        zzapjVar.zzaj = j;
    }

    public static /* synthetic */ void zzW(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 8388608;
        zzapjVar.zzak = j;
    }

    public static /* synthetic */ void zzX(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 67108864;
        zzapjVar.zzan = j;
    }

    public static /* synthetic */ void zzY(zzapj zzapjVar, long j) {
        zzapjVar.zze |= 134217728;
        zzapjVar.zzao = j;
    }

    public static /* synthetic */ void zzZ(zzapj zzapjVar, String str) {
        str.getClass();
        zzapjVar.zze |= 268435456;
        zzapjVar.zzap = str;
    }

    public static zzaom zza() {
        return (zzaom) zzb.zzaA();
    }

    public static /* synthetic */ void zzaa(zzapj zzapjVar, long j) {
        zzapjVar.zzf |= 512;
        zzapjVar.zzaE = j;
    }

    public static /* synthetic */ void zzab(zzapj zzapjVar, long j) {
        zzapjVar.zzf |= UserVerificationMethods.USER_VERIFY_ALL;
        zzapjVar.zzaF = j;
    }

    public static /* synthetic */ void zzac(zzapj zzapjVar, long j) {
        zzapjVar.zzf |= 2048;
        zzapjVar.zzaG = j;
    }

    public static /* synthetic */ void zzad(zzapj zzapjVar, long j) {
        zzapjVar.zzf |= v.DEFAULT_BUFFER_SIZE;
        zzapjVar.zzaH = j;
    }

    public static /* synthetic */ void zzae(zzapj zzapjVar, String str) {
        str.getClass();
        zzapjVar.zzf |= 32768;
        zzapjVar.zzaK = str;
    }

    public static /* synthetic */ void zzaf(zzapj zzapjVar, String str) {
        str.getClass();
        zzapjVar.zzf |= 4194304;
        zzapjVar.zzaR = str;
    }

    public static /* synthetic */ void zzag(zzapj zzapjVar, boolean z) {
        zzapjVar.zzf |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzapjVar.zzaT = z;
    }

    public static /* synthetic */ void zzah(zzapj zzapjVar, long j) {
        zzapjVar.zzf |= 67108864;
        zzapjVar.zzaV = j;
    }

    public static /* synthetic */ void zzam(zzapj zzapjVar, int i) {
        zzapjVar.zzW = i - 1;
        zzapjVar.zze |= UserVerificationMethods.USER_VERIFY_ALL;
    }

    public static /* synthetic */ void zzan(zzapj zzapjVar, int i) {
        zzapjVar.zzX = i - 1;
        zzapjVar.zze |= 2048;
    }

    public static /* synthetic */ void zzao(zzapj zzapjVar, int i) {
        zzapjVar.zzad = i - 1;
        zzapjVar.zze |= 131072;
    }

    public static /* synthetic */ void zzap(zzapj zzapjVar, int i) {
        zzapjVar.zzaw = i - 1;
        zzapjVar.zzf |= 8;
    }

    public static /* synthetic */ void zzaq(zzapj zzapjVar, int i) {
        zzapjVar.zzax = i - 1;
        zzapjVar.zzf |= 16;
    }

    public static /* synthetic */ void zzar(zzapj zzapjVar, int i) {
        zzapjVar.zzaP = i - 1;
        zzapjVar.zzf |= 1048576;
    }

    public static /* synthetic */ void zzas(zzapj zzapjVar, int i) {
        zzapjVar.zzaS = 5;
        zzapjVar.zzf |= 8388608;
    }

    public static zzapj zzd() {
        return zzb;
    }

    public static zzapj zze(byte[] bArr, zzgtl zzgtlVar) throws zzgul {
        return (zzapj) zzgtz.zzaI(zzb, bArr, zzgtlVar);
    }

    public static /* synthetic */ void zzi(zzapj zzapjVar, String str) {
        str.getClass();
        zzapjVar.zzd |= 1;
        zzapjVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzapj zzapjVar, String str) {
        str.getClass();
        zzapjVar.zzd |= 2;
        zzapjVar.zzh = str;
    }

    public static /* synthetic */ void zzk(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 4;
        zzapjVar.zzi = j;
    }

    public static /* synthetic */ void zzl(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 16;
        zzapjVar.zzk = j;
    }

    public static /* synthetic */ void zzm(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 32;
        zzapjVar.zzl = j;
    }

    public static /* synthetic */ void zzn(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= UserVerificationMethods.USER_VERIFY_ALL;
        zzapjVar.zzq = j;
    }

    public static /* synthetic */ void zzo(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 2048;
        zzapjVar.zzr = j;
    }

    public static /* synthetic */ void zzp(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 8192;
        zzapjVar.zzt = j;
    }

    public static /* synthetic */ void zzq(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzapjVar.zzu = j;
    }

    public static /* synthetic */ void zzr(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 32768;
        zzapjVar.zzv = j;
    }

    public static /* synthetic */ void zzs(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 65536;
        zzapjVar.zzw = j;
    }

    public static /* synthetic */ void zzt(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 524288;
        zzapjVar.zzz = j;
    }

    public static /* synthetic */ void zzu(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 1048576;
        zzapjVar.zzA = j;
    }

    public static /* synthetic */ void zzv(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 2097152;
        zzapjVar.zzB = j;
    }

    public static /* synthetic */ void zzw(zzapj zzapjVar, String str) {
        str.getClass();
        zzapjVar.zzd |= 4194304;
        zzapjVar.zzC = str;
    }

    public static /* synthetic */ void zzx(zzapj zzapjVar, String str) {
        str.getClass();
        zzapjVar.zzd |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzapjVar.zzE = str;
    }

    public static /* synthetic */ void zzy(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 33554432;
        zzapjVar.zzF = j;
    }

    public static /* synthetic */ void zzz(zzapj zzapjVar, long j) {
        zzapjVar.zzd |= 67108864;
        zzapjVar.zzG = j;
    }

    public final boolean zzai() {
        return this.zzaT;
    }

    public final boolean zzaj() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean zzak() {
        return (this.zzf & 134217728) != 0;
    }

    public final int zzal() {
        int zza = zzaos.zza(this.zzaS);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzaol zzaolVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaom(zzaolVar);
                }
                return new zzapj();
            }
            zzgud zzgudVar = zzapp.zza;
            return zzgtz.zzaR(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", zzaor.zza, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", zzapg.class, "zzR", "zzS", "zzT", "zzU", "zzW", zzgudVar, "zzX", zzgudVar, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zzgudVar, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", zzapo.zza, "zzas", zzapq.zza, "zzap", "zzat", zzaon.zza, "zzau", "zzav", "zzal", "zzam", "zzaw", zzgudVar, "zzV", "zzD", "zzax", zzgudVar, "zzay", "zzaz", zzapc.class, "zzaA", zzgudVar, "zzaB", zzaop.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", zzaoz.zza, "zzaW", "zzaX", "zzaY"});
        }
        return (byte) 1;
    }

    public final zzaps zzf() {
        zzaps zzapsVar = this.zzaW;
        if (zzapsVar == null) {
            return zzaps.zzd();
        }
        return zzapsVar;
    }

    public final String zzg() {
        return this.zzaR;
    }

    public final String zzh() {
        return this.zzC;
    }
}
