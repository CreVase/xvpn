package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzgxj {
    public static final zzgxj zza;
    public static final zzgxj zzb;
    public static final zzgxj zzc;
    public static final zzgxj zzd;
    public static final zzgxj zze;
    public static final zzgxj zzf;
    public static final zzgxj zzg;
    public static final zzgxj zzh;
    public static final zzgxj zzi;
    public static final zzgxj zzj;
    public static final zzgxj zzk;
    public static final zzgxj zzl;
    public static final zzgxj zzm;
    public static final zzgxj zzn;
    public static final zzgxj zzo;
    public static final zzgxj zzp;
    public static final zzgxj zzq;
    public static final zzgxj zzr;
    private static final /* synthetic */ zzgxj[] zzs;
    private final zzgxk zzt;

    static {
        zzgxj zzgxjVar = new zzgxj("DOUBLE", 0, zzgxk.DOUBLE, 1);
        zza = zzgxjVar;
        zzgxj zzgxjVar2 = new zzgxj("FLOAT", 1, zzgxk.FLOAT, 5);
        zzb = zzgxjVar2;
        zzgxk zzgxkVar = zzgxk.LONG;
        zzgxj zzgxjVar3 = new zzgxj("INT64", 2, zzgxkVar, 0);
        zzc = zzgxjVar3;
        zzgxj zzgxjVar4 = new zzgxj("UINT64", 3, zzgxkVar, 0);
        zzd = zzgxjVar4;
        zzgxk zzgxkVar2 = zzgxk.INT;
        zzgxj zzgxjVar5 = new zzgxj("INT32", 4, zzgxkVar2, 0);
        zze = zzgxjVar5;
        zzgxj zzgxjVar6 = new zzgxj("FIXED64", 5, zzgxkVar, 1);
        zzf = zzgxjVar6;
        zzgxj zzgxjVar7 = new zzgxj("FIXED32", 6, zzgxkVar2, 5);
        zzg = zzgxjVar7;
        zzgxj zzgxjVar8 = new zzgxj("BOOL", 7, zzgxk.BOOLEAN, 0);
        zzh = zzgxjVar8;
        zzgxj zzgxjVar9 = new zzgxj("STRING", 8, zzgxk.STRING, 2);
        zzi = zzgxjVar9;
        zzgxk zzgxkVar3 = zzgxk.MESSAGE;
        zzgxj zzgxjVar10 = new zzgxj("GROUP", 9, zzgxkVar3, 3);
        zzj = zzgxjVar10;
        zzgxj zzgxjVar11 = new zzgxj("MESSAGE", 10, zzgxkVar3, 2);
        zzk = zzgxjVar11;
        zzgxj zzgxjVar12 = new zzgxj("BYTES", 11, zzgxk.BYTE_STRING, 2);
        zzl = zzgxjVar12;
        zzgxj zzgxjVar13 = new zzgxj("UINT32", 12, zzgxkVar2, 0);
        zzm = zzgxjVar13;
        zzgxj zzgxjVar14 = new zzgxj("ENUM", 13, zzgxk.ENUM, 0);
        zzn = zzgxjVar14;
        zzgxj zzgxjVar15 = new zzgxj("SFIXED32", 14, zzgxkVar2, 5);
        zzo = zzgxjVar15;
        zzgxj zzgxjVar16 = new zzgxj("SFIXED64", 15, zzgxkVar, 1);
        zzp = zzgxjVar16;
        zzgxj zzgxjVar17 = new zzgxj("SINT32", 16, zzgxkVar2, 0);
        zzq = zzgxjVar17;
        zzgxj zzgxjVar18 = new zzgxj("SINT64", 17, zzgxkVar, 0);
        zzr = zzgxjVar18;
        zzs = new zzgxj[]{zzgxjVar, zzgxjVar2, zzgxjVar3, zzgxjVar4, zzgxjVar5, zzgxjVar6, zzgxjVar7, zzgxjVar8, zzgxjVar9, zzgxjVar10, zzgxjVar11, zzgxjVar12, zzgxjVar13, zzgxjVar14, zzgxjVar15, zzgxjVar16, zzgxjVar17, zzgxjVar18};
    }

    private zzgxj(String str, int i, zzgxk zzgxkVar, int i2) {
        this.zzt = zzgxkVar;
    }

    public static zzgxj[] values() {
        return (zzgxj[]) zzs.clone();
    }

    public final zzgxk zza() {
        return this.zzt;
    }
}
