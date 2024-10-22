package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgtv;
import com.google.android.gms.internal.ads.zzgtz;
import com.google.protobuf.v;
import defpackage.hx2;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzgtz<MessageType extends zzgtz<MessageType, BuilderType>, BuilderType extends zzgtv<MessageType, BuilderType>> extends zzgsa<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzgwu zzc = zzgwu.zzc();

    private final int zza(zzgwc zzgwcVar) {
        return zzgvr.zza().zzb(getClass()).zza(this);
    }

    public static zzgtz zzaC(Class cls) {
        Map map = zzb;
        zzgtz zzgtzVar = (zzgtz) map.get(cls);
        if (zzgtzVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgtzVar = (zzgtz) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgtzVar == null) {
            zzgtzVar = (zzgtz) ((zzgtz) zzgxd.zzg(cls)).zzb(6, null, null);
            if (zzgtzVar != null) {
                map.put(cls, zzgtzVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgtzVar;
    }

    public static zzgtz zzaE(zzgtz zzgtzVar, zzgsr zzgsrVar) throws zzgul {
        zzgtl zzgtlVar = zzgtl.zza;
        zzgsz zzl = zzgsrVar.zzl();
        zzgtz zzaD = zzgtzVar.zzaD();
        try {
            zzgwc zzb2 = zzgvr.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgta.zzq(zzl), zzgtlVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                zzc(zzaD);
                return zzaD;
            } catch (zzgul e) {
                e.zzh(zzaD);
                throw e;
            }
        } catch (zzgul e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgul(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgws e3) {
            zzgul zza = e3.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgul) {
                throw ((zzgul) e4.getCause());
            }
            zzgul zzgulVar = new zzgul(e4);
            zzgulVar.zzh(zzaD);
            throw zzgulVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgul) {
                throw ((zzgul) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzgtz zzaF(zzgtz zzgtzVar, byte[] bArr) throws zzgul {
        zzgtz zzd = zzd(zzgtzVar, bArr, 0, bArr.length, zzgtl.zza);
        zzc(zzd);
        return zzd;
    }

    public static zzgtz zzaG(zzgtz zzgtzVar, zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        zzgsz zzl = zzgsrVar.zzl();
        zzgtz zzaD = zzgtzVar.zzaD();
        try {
            zzgwc zzb2 = zzgvr.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgta.zzq(zzl), zzgtlVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                return zzaD;
            } catch (zzgul e) {
                e.zzh(zzaD);
                throw e;
            }
        } catch (zzgul e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgul(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgws e3) {
            zzgul zza = e3.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgul) {
                throw ((zzgul) e4.getCause());
            }
            zzgul zzgulVar = new zzgul(e4);
            zzgulVar.zzh(zzaD);
            throw zzgulVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgul) {
                throw ((zzgul) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzgtz zzaH(zzgtz zzgtzVar, InputStream inputStream, zzgtl zzgtlVar) throws zzgul {
        zzgsz zzH = zzgsz.zzH(inputStream, v.DEFAULT_BUFFER_SIZE);
        zzgtz zzaD = zzgtzVar.zzaD();
        try {
            zzgwc zzb2 = zzgvr.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgta.zzq(zzH), zzgtlVar);
            zzb2.zzf(zzaD);
            zzc(zzaD);
            return zzaD;
        } catch (zzgul e) {
            e = e;
            if (e.zzl()) {
                e = new zzgul(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgws e2) {
            zzgul zza = e2.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgul) {
                throw ((zzgul) e3.getCause());
            }
            zzgul zzgulVar = new zzgul(e3);
            zzgulVar.zzh(zzaD);
            throw zzgulVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgul) {
                throw ((zzgul) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzgtz zzaI(zzgtz zzgtzVar, byte[] bArr, zzgtl zzgtlVar) throws zzgul {
        zzgtz zzd = zzd(zzgtzVar, bArr, 0, bArr.length, zzgtlVar);
        zzc(zzd);
        return zzd;
    }

    public static zzgue zzaJ() {
        return zzgua.zzf();
    }

    public static zzgue zzaK(zzgue zzgueVar) {
        int i;
        int size = zzgueVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzgueVar.zzd(i);
    }

    public static zzguh zzaL() {
        return zzguy.zzf();
    }

    public static zzguh zzaM(zzguh zzguhVar) {
        int i;
        int size = zzguhVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzguhVar.zzd(i);
    }

    public static zzgui zzaN() {
        return zzgvs.zze();
    }

    public static zzgui zzaO(zzgui zzguiVar) {
        int i;
        int size = zzguiVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzguiVar.zzd(i);
    }

    public static Object zzaQ(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zzaR(zzgvj zzgvjVar, String str, Object[] objArr) {
        return new zzgvt(zzgvjVar, str, objArr);
    }

    public static void zzaU(Class cls, zzgtz zzgtzVar) {
        zzgtzVar.zzaT();
        zzb.put(cls, zzgtzVar);
    }

    private static zzgtz zzc(zzgtz zzgtzVar) throws zzgul {
        if (zzgtzVar != null && !zzgtzVar.zzaX()) {
            zzgul zza = new zzgws(zzgtzVar).zza();
            zza.zzh(zzgtzVar);
            throw zza;
        }
        return zzgtzVar;
    }

    private static zzgtz zzd(zzgtz zzgtzVar, byte[] bArr, int i, int i2, zzgtl zzgtlVar) throws zzgul {
        zzgtz zzaD = zzgtzVar.zzaD();
        try {
            zzgwc zzb2 = zzgvr.zza().zzb(zzaD.getClass());
            zzb2.zzi(zzaD, bArr, 0, i2, new zzgsd(zzgtlVar));
            zzb2.zzf(zzaD);
            return zzaD;
        } catch (zzgul e) {
            e = e;
            if (e.zzl()) {
                e = new zzgul(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgws e2) {
            zzgul zza = e2.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgul) {
                throw ((zzgul) e3.getCause());
            }
            zzgul zzgulVar = new zzgul(e3);
            zzgulVar.zzh(zzaD);
            throw zzgulVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgul zzj = zzgul.zzj();
            zzj.zzh(zzaD);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgvr.zza().zzb(getClass()).zzj(this, (zzgtz) obj);
    }

    public final int hashCode() {
        if (!zzaY()) {
            int i = this.zza;
            if (i == 0) {
                int zzay = zzay();
                this.zza = zzay;
                return zzay;
            }
            return i;
        }
        return zzay();
    }

    public final String toString() {
        return zzgvl.zza(this, super.toString());
    }

    public final zzgtv zzaA() {
        return (zzgtv) zzb(5, null, null);
    }

    public final zzgtv zzaB() {
        zzgtv zzgtvVar = (zzgtv) zzb(5, null, null);
        zzgtvVar.zzaj(this);
        return zzgtvVar;
    }

    public final zzgtz zzaD() {
        return (zzgtz) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgvj
    public final /* synthetic */ zzgvi zzaP() {
        return (zzgtv) zzb(5, null, null);
    }

    public final void zzaS() {
        zzgvr.zza().zzb(getClass()).zzf(this);
        zzaT();
    }

    public final void zzaT() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzaV(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgvj
    public final void zzaW(zzgtg zzgtgVar) throws IOException {
        zzgvr.zza().zzb(getClass()).zzm(this, zzgth.zza(zzgtgVar));
    }

    public final boolean zzaX() {
        zzgtz<MessageType, BuilderType> zzgtzVar;
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgvr.zza().zzb(getClass()).zzk(this);
        if (true != zzk) {
            zzgtzVar = null;
        } else {
            zzgtzVar = this;
        }
        zzb(2, zzgtzVar, null);
        return zzk;
    }

    public final boolean zzaY() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final int zzat(zzgwc zzgwcVar) {
        if (zzaY()) {
            int zza = zzgwcVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(hx2.m("serialized size must be non-negative, was ", zza));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int zza2 = zzgwcVar.zza(this);
            if (zza2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
                return zza2;
            }
            throw new IllegalStateException(hx2.m("serialized size must be non-negative, was ", zza2));
        }
        return i;
    }

    public final int zzay() {
        return zzgvr.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvj
    public final int zzaz() {
        int i;
        if (zzaY()) {
            i = zza(null);
            if (i < 0) {
                throw new IllegalStateException(hx2.m("serialized size must be non-negative, was ", i));
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zza(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException(hx2.m("serialized size must be non-negative, was ", i));
                }
            }
        }
        return i;
    }

    public abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzgvk
    public final /* synthetic */ zzgvj zzbf() {
        return (zzgtz) zzb(6, null, null);
    }
}
