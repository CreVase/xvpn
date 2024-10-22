package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzix.zzb;
import defpackage.hx2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzix<MessageType extends zzix<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhd<MessageType, BuilderType> {
    private static Map<Object, zzix<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzlz zzb = zzlz.zzc();

    /* loaded from: classes.dex */
    public static class zza<T extends zzix<T, ?>> extends zzhh<T> {
        private final T zza;

        public zza(T t) {
            this.zza = t;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzb<MessageType extends zzix<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhf<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (!messagetype.zzcj()) {
                this.zza = (MessageType) messagetype.zzbz();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzik zzikVar) throws zzji {
            if (!this.zza.zzcj()) {
                zzae();
            }
            try {
                zzkx.zza().zza((zzkx) this.zza).zza(this.zza, bArr, 0, i2, new zzhl(zzikVar));
                return this;
            } catch (zzji e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzji.zzh();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzhf
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final BuilderType zzb(zzib zzibVar, zzik zzikVar) throws IOException {
            if (!this.zza.zzcj()) {
                zzae();
            }
            try {
                zzkx.zza().zza((zzkx) this.zza).zza(this.zza, zzif.zza(zzibVar), zzikVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzac();
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        /* renamed from: zza */
        public final /* synthetic */ zzhf zzb(zzib zzibVar, zzik zzikVar) throws IOException {
            return (zzb) zzb(zzibVar, zzikVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzkm
        /* renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public MessageType zzac() {
            if (!this.zza.zzcj()) {
                return this.zza;
            }
            this.zza.zzcg();
            return this.zza;
        }

        public final void zzad() {
            if (!this.zza.zzcj()) {
                zzae();
            }
        }

        public void zzae() {
            MessageType messagetype = (MessageType) this.zzb.zzbz();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final /* synthetic */ zzkj zzcf() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final boolean zzci() {
            return zzix.zza(this.zza, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        /* renamed from: zzy */
        public final /* synthetic */ zzhf clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzkm
        /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public final MessageType zzab() {
            MessageType messagetype = (MessageType) zzac();
            if (messagetype.zzci()) {
                return messagetype;
            }
            throw new zzlx(messagetype);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final /* synthetic */ zzhf zza(byte[] bArr, int i, int i2) throws zzji {
            return zzb(bArr, 0, i2, zzik.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final /* synthetic */ zzhf zza(byte[] bArr, int i, int i2, zzik zzikVar) throws zzji {
            return zzb(bArr, 0, i2, zzikVar);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzcj()) {
                zzae();
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzkx.zza().zza((zzkx) messagetype).zza(messagetype, messagetype2);
        }
    }

    /* loaded from: classes.dex */
    public static final class zzc implements zzis<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final zzmn zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final zzmx zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final zzkm zza(zzkm zzkmVar, zzkj zzkjVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzis
        public final zzks zza(zzks zzksVar, zzks zzksVar2) {
            throw new NoSuchMethodError();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzix<MessageType, BuilderType> implements zzkl {
        protected zziq<zzc> zzc = zziq.zzb();

        public final zziq<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zziq) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* loaded from: classes.dex */
    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    /* loaded from: classes.dex */
    public static class zzf<ContainingType extends zzkj, Type> extends zzil<ContainingType, Type> {
    }

    private final int zza() {
        return zzkx.zza().zza((zzkx) this).zzb(this);
    }

    private final int zzb(zzlb<?> zzlbVar) {
        if (zzlbVar == null) {
            return zzkx.zza().zza((zzkx) this).zza(this);
        }
        return zzlbVar.zza(this);
    }

    public static zzjd zzca() {
        return zzja.zzd();
    }

    public static zzjg zzcb() {
        return zzjy.zzd();
    }

    public static <E> zzjf<E> zzcc() {
        return zzla.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzkx.zza().zza((zzkx) this).zzb(this, (zzix) obj);
    }

    public int hashCode() {
        if (zzcj()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzko.zza(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final int zzbt() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final int zzbw() {
        return zza((zzlb) null);
    }

    public final <MessageType extends zzix<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzbx() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzby() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza((zzb) this);
    }

    public final MessageType zzbz() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zzc(int i) {
        if (i >= 0) {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(hx2.m("serialized size must be non-negative, was ", i));
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final /* synthetic */ zzkm zzcd() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final /* synthetic */ zzkm zzce() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza((zzb) this);
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* synthetic */ zzkj zzcf() {
        return (zzix) zza(zze.zzf, (Object) null, (Object) null);
    }

    public final void zzcg() {
        zzkx.zza().zza((zzkx) this).zzc(this);
        zzch();
    }

    public final void zzch() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final boolean zzci() {
        return zza(this, true);
    }

    public final boolean zzcj() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final int zza(zzlb zzlbVar) {
        if (zzcj()) {
            int zzb2 = zzb(zzlbVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException(hx2.m("serialized size must be non-negative, was ", zzb2));
        }
        if (zzbt() != Integer.MAX_VALUE) {
            return zzbt();
        }
        int zzb3 = zzb(zzlbVar);
        zzc(zzb3);
        return zzb3;
    }

    public static <T extends zzix<?, ?>> T zza(Class<T> cls) {
        zzix<?, ?> zzixVar = zzc.get(cls);
        if (zzixVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzixVar = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzixVar == null) {
            zzixVar = (T) ((zzix) zzmg.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzixVar != null) {
                zzc.put(cls, zzixVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzixVar;
    }

    public static zzjg zza(zzjg zzjgVar) {
        int size = zzjgVar.size();
        return zzjgVar.zza(size == 0 ? 10 : size << 1);
    }

    public static <E> zzjf<E> zza(zzjf<E> zzjfVar) {
        int size = zzjfVar.size();
        return zzjfVar.zza(size == 0 ? 10 : size << 1);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
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

    public static Object zza(zzkj zzkjVar, String str, Object[] objArr) {
        return new zzkz(zzkjVar, str, objArr);
    }

    public static <T extends zzix<?, ?>> void zza(Class<T> cls, T t) {
        t.zzch();
        zzc.put(cls, t);
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final void zza(zzig zzigVar) throws IOException {
        zzkx.zza().zza((zzkx) this).zza((zzlb) this, (zzmw) zzij.zza(zzigVar));
    }

    public static final <T extends zzix<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zze.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzkx.zza().zza((zzkx) t).zzd(t);
        if (z) {
            t.zza(zze.zzb, zzd2 ? t : null, null);
        }
        return zzd2;
    }
}
