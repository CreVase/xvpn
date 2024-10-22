package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzdvi;
import com.google.android.gms.internal.ads.zzdvm;
import com.google.android.gms.internal.ads.zzgad;
import defpackage.hx2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzau {
    private final Context zza;
    private final zzdvm zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzau(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
            @Override // java.lang.Runnable
            public final void run() {
                zzau.this.zzg();
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.zzk = com.google.android.gms.ads.internal.zzt.zzt().zza();
        this.zzb = com.google.android.gms.ads.internal.zzt.zzs().zza();
    }

    private final void zzs(Context context) {
        final int i;
        ArrayList arrayList = new ArrayList();
        int zzu = zzu(arrayList, "None", true);
        final int zzu2 = zzu(arrayList, "Shake", true);
        final int zzu3 = zzu(arrayList, "Flick", true);
        zzdvi zzdviVar = zzdvi.NONE;
        int ordinal = this.zzb.zza().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                i = zzu;
            } else {
                i = zzu3;
            }
        } else {
            i = zzu2;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzJ = zzt.zzJ(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        zzJ.setTitle("Setup gesture");
        zzJ.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        zzJ.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzau.this.zzr();
            }
        });
        zzJ.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzar
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzau.this.zzh(atomicInteger, i, zzu2, zzu3, dialogInterface, i2);
            }
        });
        zzJ.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzas
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzau.this.zzr();
            }
        });
        zzJ.create().show();
    }

    private final boolean zzt(float f, float f2, float f3, float f4) {
        if (Math.abs(this.zzi.x - f) < this.zzh && Math.abs(this.zzi.y - f2) < this.zzh && Math.abs(this.zzj.x - f3) < this.zzh && Math.abs(this.zzj.y - f4) < this.zzh) {
            return true;
        }
        return false;
    }

    private static final int zzu(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        return hx2.s(sb, this.zzd, "}");
    }

    public final /* synthetic */ void zza() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzb() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzc(zzgad zzgadVar) {
        if (!com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.zza, this.zzd, this.zze);
        } else {
            zzgadVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzan
                @Override // java.lang.Runnable
                public final void run() {
                    zzau.this.zzb();
                }
            });
        }
    }

    public final /* synthetic */ void zzd(zzgad zzgadVar) {
        if (!com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.zza, this.zzd, this.zze);
        } else {
            zzgadVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzam
                @Override // java.lang.Runnable
                public final void run() {
                    zzau.this.zzf();
                }
            });
        }
    }

    public final /* synthetic */ void zze() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.zza);
    }

    public final /* synthetic */ void zzf() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.zza);
    }

    public final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzr();
    }

    public final /* synthetic */ void zzh(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.zzb.zzl(zzdvi.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.zzb.zzl(zzdvi.FLICK);
            } else {
                this.zzb.zzl(zzdvi.NONE);
            }
        }
        zzr();
    }

    public final /* synthetic */ void zzi(String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzt.zzS(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void zzj(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 == i) {
            if (!(this.zza instanceof Activity)) {
                zzcat.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = this.zzc;
            final String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                com.google.android.gms.ads.internal.zzt.zzp();
                Map zzO = zzt.zzO(build);
                for (String str3 : zzO.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append((String) zzO.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzJ = zzt.zzJ(this.zza);
            zzJ.setMessage(str2);
            zzJ.setTitle("Ad Information");
            zzJ.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i7) {
                    zzau.this.zzi(str2, dialogInterface2, i7);
                }
            });
            zzJ.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i7) {
                }
            });
            zzJ.create().show();
            return;
        }
        if (i6 == i2) {
            zzcat.zze("Debug mode [Creative Preview] selected.");
            zzcbg.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                @Override // java.lang.Runnable
                public final void run() {
                    zzau.this.zzl();
                }
            });
            return;
        }
        if (i6 == i3) {
            zzcat.zze("Debug mode [Troubleshooting] selected.");
            zzcbg.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                @Override // java.lang.Runnable
                public final void run() {
                    zzau.this.zzk();
                }
            });
            return;
        }
        if (i6 == i4) {
            zzdvm zzdvmVar = this.zzb;
            final zzgad zzgadVar = zzcbg.zze;
            zzgad zzgadVar2 = zzcbg.zza;
            if (zzdvmVar.zzp()) {
                zzgadVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzat
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.this.zze();
                    }
                });
                return;
            } else {
                zzgadVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.this.zzd(zzgadVar);
                    }
                });
                return;
            }
        }
        if (i6 == i5) {
            zzdvm zzdvmVar2 = this.zzb;
            final zzgad zzgadVar3 = zzcbg.zze;
            zzgad zzgadVar4 = zzcbg.zza;
            if (zzdvmVar2.zzp()) {
                zzgadVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.this.zza();
                    }
                });
            } else {
                zzgadVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzal
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.this.zzc(zzgadVar3);
                    }
                });
            }
        }
    }

    public final /* synthetic */ void zzk() {
        zzay zzs = com.google.android.gms.ads.internal.zzt.zzs();
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zzm = zzs.zzm();
        Context context = this.zza;
        zzs.zzh(zzs.zzj(context, str, str2));
        if (zzs.zzm()) {
            if (!zzm && !TextUtils.isEmpty(str3)) {
                zzs.zze(context, str2, str3, str);
            }
            zzcat.zze("Device is linked for debug signals.");
            zzs.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzs.zzd(context, str, str2);
    }

    public final /* synthetic */ void zzl() {
        zzay zzs = com.google.android.gms.ads.internal.zzt.zzs();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzs.zzk(context, str, str2)) {
            zzs.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(zzs.zza)) {
            zzcat.zze("Creative is not pushed for this device.");
            zzs.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzs.zza)) {
            zzcat.zze("The app is not linked for creative preview.");
            zzs.zzd(context, str, str2);
        } else if ("0".equals(zzs.zza)) {
            zzcat.zze("Device is linked for in app preview.");
            zzs.zzi(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.zzg;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzez)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked == 2) {
                    boolean z = false;
                    for (int i2 = 0; i2 < historySize; i2++) {
                        z |= !zzt(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                    }
                    if (zzt(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzn(String str) {
        this.zzd = str;
    }

    public final void zzo(String str) {
        this.zze = str;
    }

    public final void zzp(String str) {
        this.zzc = str;
    }

    public final void zzq(String str) {
        this.zzf = str;
    }

    public final void zzr() {
        try {
            if (!(this.zza instanceof Activity)) {
                zzcat.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzs().zzb())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != com.google.android.gms.ads.internal.zzt.zzs().zzm()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            final int zzu = zzu(arrayList, "Ad information", true);
            final int zzu2 = zzu(arrayList, str, true);
            final int zzu3 = zzu(arrayList, str2, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziU)).booleanValue();
            final int zzu4 = zzu(arrayList, "Open ad inspector", booleanValue);
            final int zzu5 = zzu(arrayList, "Ad inspector settings", booleanValue);
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzJ = zzt.zzJ(this.zza);
            zzJ.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzau.this.zzj(zzu, zzu2, zzu3, zzu4, zzu5, dialogInterface, i);
                }
            });
            zzJ.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public zzau(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
