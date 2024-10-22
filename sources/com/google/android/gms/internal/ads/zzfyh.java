package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.ml1;
import defpackage.p71;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class zzfyh<V> extends zzgav implements ml1 {
    private static final Logger zzaZ;
    private static final zza zzba;
    private static final Object zzbd;
    static final boolean zzd;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class zza {
        public /* synthetic */ zza(zzfyg zzfygVar) {
        }

        public abstract zzd zza(zzfyh zzfyhVar, zzd zzdVar);

        public abstract zzk zzb(zzfyh zzfyhVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzfyh zzfyhVar, zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzfyh zzfyhVar, Object obj, Object obj2);

        public abstract boolean zzg(zzfyh zzfyhVar, zzk zzkVar, zzk zzkVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzfyh.zzd) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        public zzb(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzfyh.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* loaded from: classes.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzfyh, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzfyh, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzfyh, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final zzd zza(zzfyh zzfyhVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzfyhVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final zzk zzb(zzfyh zzfyhVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzfyhVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final boolean zze(zzfyh zzfyhVar, zzd zzdVar, zzd zzdVar2) {
            return zzfyi.zza(this.zzd, zzfyhVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final boolean zzf(zzfyh zzfyhVar, Object obj, Object obj2) {
            return zzfyi.zza(this.zze, zzfyhVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final boolean zzg(zzfyh zzfyhVar, zzk zzkVar, zzk zzkVar2) {
            return zzfyi.zza(this.zzc, zzfyhVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzf<V> implements Runnable {
        final zzfyh<V> zza;
        final ml1 zzb;

        public zzf(zzfyh zzfyhVar, ml1 ml1Var) {
            this.zza = zzfyhVar;
            this.zzb = ml1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzfyh) this.zza).value != this) {
                return;
            }
            ml1 ml1Var = this.zzb;
            if (zzfyh.zzba.zzf(this.zza, this, zzfyh.zze(ml1Var))) {
                zzfyh.zzx(this.zza, false);
            }
        }
    }

    /* loaded from: classes.dex */
    final class zzg extends zza {
        public /* synthetic */ zzg(zzfyj zzfyjVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final zzd zza(zzfyh zzfyhVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzfyhVar) {
                zzdVar2 = zzfyhVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzfyhVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final zzk zzb(zzfyh zzfyhVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzfyhVar) {
                zzkVar2 = zzfyhVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzfyhVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final boolean zze(zzfyh zzfyhVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzfyhVar) {
                if (zzfyhVar.listeners == zzdVar) {
                    zzfyhVar.listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final boolean zzf(zzfyh zzfyhVar, Object obj, Object obj2) {
            synchronized (zzfyhVar) {
                if (zzfyhVar.value == obj) {
                    zzfyhVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final boolean zzg(zzfyh zzfyhVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzfyhVar) {
                if (zzfyhVar.waiters == zzkVar) {
                    zzfyhVar.waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }

        private zzg() {
            super(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface zzh<V> extends ml1 {
        @Override // defpackage.ml1
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class zzi<V> extends zzfyh<V> implements zzh<V> {
    }

    /* loaded from: classes.dex */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzfyh.zzj.1
                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzfyh.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzfyh.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzfyh.class.getDeclaredField(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        public /* synthetic */ zzj(zzfyl zzfylVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final zzd zza(zzfyh zzfyhVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzfyhVar.listeners;
                if (zzdVar == zzdVar2) {
                    return zzdVar2;
                }
            } while (!zze(zzfyhVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final zzk zzb(zzfyh zzfyhVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzfyhVar.waiters;
                if (zzkVar == zzkVar2) {
                    return zzkVar2;
                }
            } while (!zzg(zzfyhVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final boolean zze(zzfyh zzfyhVar, zzd zzdVar, zzd zzdVar2) {
            return zzfyk.zza(zza, zzfyhVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final boolean zzf(zzfyh zzfyhVar, Object obj, Object obj2) {
            return zzfyk.zza(zza, zzfyhVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfyh.zza
        public final boolean zzg(zzfyh zzfyhVar, zzk zzkVar, zzk zzkVar2) {
            return zzfyk.zza(zza, zzfyhVar, zzc, zzkVar, zzkVar2);
        }

        private zzj() {
            super(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        public zzk() {
            zzfyh.zzba.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        zzaZ = Logger.getLogger(zzfyh.class.getName());
        byte b2 = 0;
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th = null;
                th2 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzfyh.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzfyh.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzfyh.class, Object.class, AppMeasurementSdk.ConditionalUserProperty.VALUE));
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                zzgVar = new zzg(b2 == true ? 1 : 0);
            }
        }
        zzba = zzgVar;
        if (th != null) {
            Logger logger = zzaZ;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzbd = new Object();
    }

    private static final Object zzA(Object obj) throws ExecutionException {
        if (!(obj instanceof zzb)) {
            if (!(obj instanceof zzc)) {
                if (obj == zzbd) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((zzc) obj).zzb);
        }
        Throwable th = ((zzb) obj).zzd;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(ml1 ml1Var) {
        Throwable zzl;
        if (ml1Var instanceof zzh) {
            Object obj = ((zzfyh) ml1Var).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        }
        if ((ml1Var instanceof zzgav) && (zzl = ((zzgav) ml1Var).zzl()) != null) {
            return new zzc(zzl);
        }
        boolean isCancelled = ml1Var.isCancelled();
        if ((!zzd) & isCancelled) {
            zzb zzbVar2 = zzb.zzb;
            zzbVar2.getClass();
            return zzbVar2;
        }
        try {
            Object zzf2 = zzf(ml1Var);
            if (isCancelled) {
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ml1Var))));
            }
            if (zzf2 == null) {
                return zzbd;
            }
            return zzf2;
        } catch (Error e) {
            e = e;
            return new zzc(e);
        } catch (CancellationException e2) {
            if (!isCancelled) {
                return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(ml1Var)), e2));
            }
            return new zzb(false, e2);
        } catch (RuntimeException e3) {
            e = e3;
            return new zzc(e);
        } catch (ExecutionException e4) {
            if (isCancelled) {
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ml1Var)), e4));
            }
            return new zzc(e4.getCause());
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzu(StringBuilder sb) {
        try {
            Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append("null");
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private final void zzv(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzw(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                concat = zzftl.zza(zza());
            } catch (RuntimeException | StackOverflowError e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzu(sb);
        }
    }

    private final void zzw(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzx(zzfyh zzfyhVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzba.zzb(zzfyhVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzfyhVar.zzq();
            }
            zzfyhVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzba.zza(zzfyhVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzfyhVar = zzfVar.zza;
                    if (zzfyhVar.value == zzfVar) {
                        if (zzba.zzf(zzfyhVar, zzfVar, zze(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    executor.getClass();
                    zzy(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            zzaZ.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    private final void zzz(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzba.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // defpackage.ml1
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfsw.zzc(runnable, "Runnable was null.");
        zzfsw.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzba.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:            return true;     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzfyh.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.ads.zzfyh.zzd
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzfyh$zzb r1 = new com.google.android.gms.internal.ads.zzfyh$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzfyh$zzb r1 = com.google.android.gms.internal.ads.zzfyh.zzb.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzfyh$zzb r1 = com.google.android.gms.internal.ads.zzfyh.zzb.zzb
        L26:
            r1.getClass()
        L29:
            r5 = 0
            r4 = r7
        L2b:
            com.google.android.gms.internal.ads.zzfyh$zza r6 = com.google.android.gms.internal.ads.zzfyh.zzba
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzx(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfyh.zzf
            if (r4 == 0) goto L56
            com.google.android.gms.internal.ads.zzfyh$zzf r0 = (com.google.android.gms.internal.ads.zzfyh.zzf) r0
            ml1 r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfyh.zzh
            if (r4 == 0) goto L53
            r4 = r0
            com.google.android.gms.internal.ads.zzfyh r4 = (com.google.android.gms.internal.ads.zzfyh) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = 1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfyh.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = 1
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            r2 = 1
            goto L5f
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfyh.zzf
            if (r6 != 0) goto L2b
            r2 = r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfyh.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                return zzA(obj2);
            }
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzba;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzz(zzkVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzA(obj);
                    }
                    zzkVar = this.waiters;
                } while (zzkVar != zzk.zza);
            }
            Object obj3 = this.value;
            obj3.getClass();
            return zzA(obj3);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.value != null) & (!(r0 instanceof zzf));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzu(sb);
        } else {
            zzv(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public void zzb() {
    }

    public boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzbd;
        }
        if (!zzba.zzf(this, null, obj)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    public boolean zzd(Throwable th) {
        th.getClass();
        if (!zzba.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgav
    public final Throwable zzl() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    public void zzq() {
    }

    public final void zzr(Future future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & isCancelled()) {
            future.cancel(zzt());
        }
    }

    public final boolean zzs(ml1 ml1Var) {
        zzc zzcVar;
        ml1Var.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (ml1Var.isDone()) {
                if (!zzba.zzf(this, null, zze(ml1Var))) {
                    return false;
                }
                zzx(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, ml1Var);
            if (zzba.zzf(this, null, zzfVar)) {
                try {
                    ml1Var.addListener(zzfVar, zzfzh.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        zzcVar = new zzc(e);
                    } catch (Error | RuntimeException unused) {
                        zzcVar = zzc.zza;
                    }
                    zzba.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            ml1Var.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzt() {
        Object obj = this.value;
        if ((obj instanceof zzb) && ((zzb) obj).zzc) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzA(obj);
            }
            long j2 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    do {
                        zza zzaVar = zzba;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzA(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzz(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzz(zzkVar2);
                            j2 = 0;
                        } else {
                            zzkVar = this.waiters;
                        }
                    } while (zzkVar != zzk.zza);
                }
                Object obj3 = this.value;
                obj3.getClass();
                return zzA(obj3);
            }
            while (nanos > j2) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzA(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                    j2 = 0;
                } else {
                    throw new InterruptedException();
                }
            }
            String zzfyhVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(p71.m(str, " for ", zzfyhVar));
        }
        throw new InterruptedException();
    }
}
