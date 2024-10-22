package com.google.android.gms.internal.measurement;

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
public final class zzjk {
    public static final zzjk zza;
    public static final zzjk zzb;
    public static final zzjk zzc;
    public static final zzjk zzd;
    public static final zzjk zze;
    public static final zzjk zzf;
    public static final zzjk zzg;
    public static final zzjk zzh;
    public static final zzjk zzi;
    public static final zzjk zzj;
    private static final /* synthetic */ zzjk[] zzk;
    private final Class<?> zzl;
    private final Class<?> zzm;
    private final Object zzn;

    static {
        zzjk zzjkVar = new zzjk("VOID", 0, Void.class, Void.class, null);
        zza = zzjkVar;
        Class cls = Integer.TYPE;
        zzjk zzjkVar2 = new zzjk("INT", 1, cls, Integer.class, 0);
        zzb = zzjkVar2;
        zzjk zzjkVar3 = new zzjk("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzjkVar3;
        zzjk zzjkVar4 = new zzjk("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzjkVar4;
        zzjk zzjkVar5 = new zzjk("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzjkVar5;
        zzjk zzjkVar6 = new zzjk("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzjkVar6;
        zzjk zzjkVar7 = new zzjk("STRING", 6, String.class, String.class, "");
        zzg = zzjkVar7;
        zzjk zzjkVar8 = new zzjk("BYTE_STRING", 7, zzhm.class, zzhm.class, zzhm.zza);
        zzh = zzjkVar8;
        zzjk zzjkVar9 = new zzjk("ENUM", 8, cls, Integer.class, null);
        zzi = zzjkVar9;
        zzjk zzjkVar10 = new zzjk("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzjkVar10;
        zzk = new zzjk[]{zzjkVar, zzjkVar2, zzjkVar3, zzjkVar4, zzjkVar5, zzjkVar6, zzjkVar7, zzjkVar8, zzjkVar9, zzjkVar10};
    }

    private zzjk(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzjk[] values() {
        return (zzjk[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzm;
    }
}
