package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzfkg extends zzfkc {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzfke zzb;
    private final zzfkd zzc;
    private zzfmj zze;
    private zzflh zzf;
    private final List zzd = new ArrayList();
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi = UUID.randomUUID().toString();

    public zzfkg(zzfkd zzfkdVar, zzfke zzfkeVar) {
        this.zzc = zzfkdVar;
        this.zzb = zzfkeVar;
        zzk(null);
        if (zzfkeVar.zzd() != zzfkf.HTML && zzfkeVar.zzd() != zzfkf.JAVASCRIPT) {
            this.zzf = new zzfll(zzfkeVar.zzi(), null);
        } else {
            this.zzf = new zzfli(zzfkeVar.zza());
        }
        this.zzf.zzk();
        zzfku.zza().zzd(this);
        zzfla.zza().zzd(this.zzf.zza(), zzfkdVar.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfmj(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfkc
    public final void zzb(View view, zzfkj zzfkjVar, String str) {
        zzfkx zzfkxVar;
        if (!this.zzh) {
            if (zza.matcher("Ad overlay").matches()) {
                Iterator it = this.zzd.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzfkxVar = (zzfkx) it.next();
                        if (zzfkxVar.zzb().get() == view) {
                            break;
                        }
                    } else {
                        zzfkxVar = null;
                        break;
                    }
                }
                if (zzfkxVar == null) {
                    this.zzd.add(new zzfkx(view, zzfkjVar, "Ad overlay"));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkc
    public final void zzc() {
        if (this.zzh) {
            return;
        }
        this.zze.clear();
        if (!this.zzh) {
            this.zzd.clear();
        }
        this.zzh = true;
        zzfla.zza().zzc(this.zzf.zza());
        zzfku.zza().zze(this);
        this.zzf.zzc();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfkc
    public final void zzd(View view) {
        if (this.zzh || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzf.zzb();
        Collection<zzfkg> zzc = zzfku.zza().zzc();
        if (zzc != null && !zzc.isEmpty()) {
            for (zzfkg zzfkgVar : zzc) {
                if (zzfkgVar != this && zzfkgVar.zzf() == view) {
                    zzfkgVar.zze.clear();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkc
    public final void zze() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        zzfku.zza().zzf(this);
        this.zzf.zzi(zzflb.zzb().zza());
        this.zzf.zze(zzfks.zza().zzb());
        this.zzf.zzg(this, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzflh zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}
