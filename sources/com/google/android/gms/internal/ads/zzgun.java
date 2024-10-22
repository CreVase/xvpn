package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzgun {
    public static final zzgun zza;
    public static final zzgun zzb;
    public static final zzgun zzc;
    public static final zzgun zzd;
    public static final zzgun zze;
    public static final zzgun zzf;
    public static final zzgun zzg;
    public static final zzgun zzh;
    public static final zzgun zzi;
    public static final zzgun zzj;
    private static final /* synthetic */ zzgun[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzgun zzgunVar = new zzgun("VOID", 0, Void.class, Void.class, null);
        zza = zzgunVar;
        Class cls = Integer.TYPE;
        zzgun zzgunVar2 = new zzgun("INT", 1, cls, Integer.class, 0);
        zzb = zzgunVar2;
        zzgun zzgunVar3 = new zzgun("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgunVar3;
        zzgun zzgunVar4 = new zzgun("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgunVar4;
        zzgun zzgunVar5 = new zzgun("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgunVar5;
        zzgun zzgunVar6 = new zzgun("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgunVar6;
        zzgun zzgunVar7 = new zzgun("STRING", 6, String.class, String.class, "");
        zzg = zzgunVar7;
        zzgun zzgunVar8 = new zzgun("BYTE_STRING", 7, zzgsr.class, zzgsr.class, zzgsr.zzb);
        zzh = zzgunVar8;
        zzgun zzgunVar9 = new zzgun("ENUM", 8, cls, Integer.class, null);
        zzi = zzgunVar9;
        zzgun zzgunVar10 = new zzgun("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgunVar10;
        zzk = new zzgun[]{zzgunVar, zzgunVar2, zzgunVar3, zzgunVar4, zzgunVar5, zzgunVar6, zzgunVar7, zzgunVar8, zzgunVar9, zzgunVar10};
    }

    private zzgun(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzgun[] values() {
        return (zzgun[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
