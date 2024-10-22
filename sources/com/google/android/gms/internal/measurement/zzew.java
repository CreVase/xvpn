package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import java.util.List;

/* loaded from: classes.dex */
public final class zzew {

    /* loaded from: classes.dex */
    public static final class zza extends zzix<zza, C0002zza> implements zzkl {
        private static final zza zzc;
        private static volatile zzkw<zza> zzd;
        private int zze;
        private int zzf;
        private zzjf<zze> zzg = zzix.zzcc();
        private zzjf<zzb> zzh = zzix.zzcc();
        private boolean zzi;
        private boolean zzj;

        /* renamed from: com.google.android.gms.internal.measurement.zzew$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0002zza extends zzix.zzb<zza, C0002zza> implements zzkl {
            private C0002zza() {
                super(zza.zzc);
            }

            public final int zza() {
                return ((zza) this.zza).zzb();
            }

            public final int zzb() {
                return ((zza) this.zza).zzc();
            }

            public /* synthetic */ C0002zza(zzev zzevVar) {
                this();
            }

            public final C0002zza zza(int i, zzb.zza zzaVar) {
                zzad();
                ((zza) this.zza).zza(i, (zzb) ((zzix) zzaVar.zzab()));
                return this;
            }

            public final zze zzb(int i) {
                return ((zza) this.zza).zzb(i);
            }

            public final C0002zza zza(int i, zze.zza zzaVar) {
                zzad();
                ((zza) this.zza).zza(i, (zze) ((zzix) zzaVar.zzab()));
                return this;
            }

            public final zzb zza(int i) {
                return ((zza) this.zza).zza(i);
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzix.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public final int zza() {
            return this.zzf;
        }

        public final int zzb() {
            return this.zzh.size();
        }

        public final int zzc() {
            return this.zzg.size();
        }

        public final List<zzb> zze() {
            return this.zzh;
        }

        public final List<zze> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final zzb zza(int i) {
            return this.zzh.get(i);
        }

        public final zze zzb(int i) {
            return this.zzg.get(i);
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i, Object obj, Object obj2) {
            zzev zzevVar = null;
            switch (zzev.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0002zza(zzevVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzb.class, "zzi", "zzj"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zza> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zza.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zzb zzbVar) {
            zzbVar.getClass();
            zzjf<zzb> zzjfVar = this.zzh;
            if (!zzjfVar.zzc()) {
                this.zzh = zzix.zza(zzjfVar);
            }
            this.zzh.set(i, zzbVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zze zzeVar) {
            zzeVar.getClass();
            zzjf<zze> zzjfVar = this.zzg;
            if (!zzjfVar.zzc()) {
                this.zzg = zzix.zza(zzjfVar);
            }
            this.zzg.set(i, zzeVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class zzb extends zzix<zzb, zza> implements zzkl {
        private static final zzb zzc;
        private static volatile zzkw<zzb> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzjf<zzc> zzh = zzix.zzcc();
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        /* loaded from: classes.dex */
        public static final class zza extends zzix.zzb<zzb, zza> implements zzkl {
            private zza() {
                super(zzb.zzc);
            }

            public final int zza() {
                return ((zzb) this.zza).zza();
            }

            public final String zzb() {
                return ((zzb) this.zza).zzf();
            }

            public /* synthetic */ zza(zzev zzevVar) {
                this();
            }

            public final zza zza(String str) {
                zzad();
                ((zzb) this.zza).zza(str);
                return this;
            }

            public final zza zza(int i, zzc zzcVar) {
                zzad();
                ((zzb) this.zza).zza(i, zzcVar);
                return this;
            }

            public final zzc zza(int i) {
                return ((zzb) this.zza).zza(i);
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzix.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static zza zzc() {
            return zzc.zzbx();
        }

        public final int zza() {
            return this.zzh.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final zzd zze() {
            zzd zzdVar = this.zzj;
            if (zzdVar == null) {
                return zzd.zzc();
            }
            return zzdVar;
        }

        public final String zzf() {
            return this.zzg;
        }

        public final List<zzc> zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return this.zzl;
        }

        public final boolean zzj() {
            return this.zzm;
        }

        public final boolean zzk() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzl() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzm() {
            if ((this.zze & 64) != 0) {
                return true;
            }
            return false;
        }

        public final zzc zza(int i) {
            return this.zzh.get(i);
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i, Object obj, Object obj2) {
            zzev zzevVar = null;
            switch (zzev.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzevVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzb> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zzb.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zzc zzcVar) {
            zzcVar.getClass();
            zzjf<zzc> zzjfVar = this.zzh;
            if (!zzjfVar.zzc()) {
                this.zzh = zzix.zza(zzjfVar);
            }
            this.zzh.set(i, zzcVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class zzc extends zzix<zzc, zza> implements zzkl {
        private static final zzc zzc;
        private static volatile zzkw<zzc> zzd;
        private int zze;
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = "";

        /* loaded from: classes.dex */
        public static final class zza extends zzix.zzb<zzc, zza> implements zzkl {
            private zza() {
                super(zzc.zzc);
            }

            public final zza zza(String str) {
                zzad();
                ((zzc) this.zza).zza(str);
                return this;
            }

            public /* synthetic */ zza(zzev zzevVar) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzix.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        public static zzc zzb() {
            return zzc;
        }

        public final zzd zzc() {
            zzd zzdVar = this.zzg;
            if (zzdVar == null) {
                return zzd.zzc();
            }
            return zzdVar;
        }

        public final zzf zzd() {
            zzf zzfVar = this.zzf;
            if (zzfVar == null) {
                return zzf.zzd();
            }
            return zzfVar;
        }

        public final String zze() {
            return this.zzi;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzh() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i, Object obj, Object obj2) {
            zzev zzevVar = null;
            switch (zzev.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzevVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzc> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zzc.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 8;
            this.zzi = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class zze extends zzix<zze, zza> implements zzkl {
        private static final zze zzc;
        private static volatile zzkw<zze> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* loaded from: classes.dex */
        public static final class zza extends zzix.zzb<zze, zza> implements zzkl {
            private zza() {
                super(zze.zzc);
            }

            public final zza zza(String str) {
                zzad();
                ((zze) this.zza).zza(str);
                return this;
            }

            public /* synthetic */ zza(zzev zzevVar) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzix.zza((Class<zze>) zze.class, zzeVar);
        }

        private zze() {
        }

        public static zza zzc() {
            return zzc.zzbx();
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzc zzb() {
            zzc zzcVar = this.zzh;
            if (zzcVar == null) {
                return zzc.zzb();
            }
            return zzcVar;
        }

        public final String zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i, Object obj, Object obj2) {
            zzev zzevVar = null;
            switch (zzev.zza[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(zzevVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zze> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zze.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class zzf extends zzix<zzf, zzb> implements zzkl {
        private static final zzf zzc;
        private static volatile zzkw<zzf> zzd;
        private int zze;
        private int zzf;
        private boolean zzh;
        private String zzg = "";
        private zzjf<String> zzi = zzix.zzcc();

        /* loaded from: classes.dex */
        public enum zza implements zzjc {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);

            private static final zzjb<zza> zzh = new zzfa();
            private final int zzj;

            zza(int i) {
                this.zzj = i;
            }

            public static zzje zzb() {
                return zzez.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjc
            public final int zza() {
                return this.zzj;
            }

            public static zza zza(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }
        }

        /* loaded from: classes.dex */
        public static final class zzb extends zzix.zzb<zzf, zzb> implements zzkl {
            private zzb() {
                super(zzf.zzc);
            }

            public /* synthetic */ zzb(zzev zzevVar) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzix.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static zzf zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzi.size();
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzf);
            if (zza2 == null) {
                return zza.UNKNOWN_MATCH_TYPE;
            }
            return zza2;
        }

        public final String zze() {
            return this.zzg;
        }

        public final List<String> zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i, Object obj, Object obj2) {
            zzev zzevVar = null;
            switch (zzev.zza[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb(zzevVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zza.zzb(), "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzf> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zzf.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class zzd extends zzix<zzd, zza> implements zzkl {
        private static final zzd zzc;
        private static volatile zzkw<zzd> zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";

        /* loaded from: classes.dex */
        public static final class zza extends zzix.zzb<zzd, zza> implements zzkl {
            private zza() {
                super(zzd.zzc);
            }

            public /* synthetic */ zza(zzev zzevVar) {
                this();
            }
        }

        /* loaded from: classes.dex */
        public enum zzb implements zzjc {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);

            private static final zzjb<zzb> zzf = new zzex();
            private final int zzh;

            zzb(int i) {
                this.zzh = i;
            }

            public static zzje zzb() {
                return zzey.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjc
            public final int zza() {
                return this.zzh;
            }

            public static zzb zza(int i) {
                if (i == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i == 1) {
                    return LESS_THAN;
                }
                if (i == 2) {
                    return GREATER_THAN;
                }
                if (i == 3) {
                    return EQUAL;
                }
                if (i != 4) {
                    return null;
                }
                return BETWEEN;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzix.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static zzd zzc() {
            return zzc;
        }

        public final zzb zza() {
            zzb zza2 = zzb.zza(this.zzf);
            return zza2 == null ? zzb.UNKNOWN_COMPARISON_TYPE : zza2;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzj;
        }

        public final String zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzg;
        }

        public final boolean zzh() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzk() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzl() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i, Object obj, Object obj2) {
            zzev zzevVar = null;
            switch (zzev.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(zzevVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", "zzh", "zzi", "zzj"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzd> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zzd.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
