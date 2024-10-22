package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgta implements zzgvu {
    private final zzgsz zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgta(zzgsz zzgszVar) {
        byte[] bArr = zzguj.zzd;
        this.zza = zzgszVar;
        zzgszVar.zzc = this;
    }

    private final void zzP(Object obj, zzgwc zzgwcVar, zzgtl zzgtlVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgwcVar.zzh(obj, this, zzgtlVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzgul.zzg();
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzQ(Object obj, zzgwc zzgwcVar, zzgtl zzgtlVar) throws IOException {
        zzgsz zzgszVar = this.zza;
        int zzn = zzgszVar.zzn();
        if (zzgszVar.zza < zzgszVar.zzb) {
            int zze = this.zza.zze(zzn);
            this.zza.zza++;
            zzgwcVar.zzh(obj, this, zzgtlVar);
            this.zza.zzz(0);
            r4.zza--;
            this.zza.zzA(zze);
            return;
        }
        throw new zzgul("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i) throws IOException {
        if (this.zza.zzd() == i) {
        } else {
            throw zzgul.zzj();
        }
    }

    private final void zzS(int i) throws IOException {
        if ((this.zzb & 7) == i) {
        } else {
            throw zzgul.zza();
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 3) == 0) {
        } else {
            throw zzgul.zzg();
        }
    }

    private static final void zzU(int i) throws IOException {
        if ((i & 7) == 0) {
        } else {
            throw zzgul.zzg();
        }
    }

    public static zzgta zzq(zzgsz zzgszVar) {
        zzgta zzgtaVar = zzgszVar.zzc;
        if (zzgtaVar != null) {
            return zzgtaVar;
        }
        return new zzgta(zzgszVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzA(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzguy) {
            zzguy zzguyVar = (zzguy) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzguyVar.zzg(this.zza.zzo());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzgul.zza();
            }
            do {
                zzguyVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            throw zzgul.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzo()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzB(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgts) {
            zzgts zzgtsVar = (zzgts) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i != 5) {
                    throw zzgul.zza();
                }
                do {
                    zzgtsVar.zze(this.zza.zzc());
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm2 = this.zza.zzm();
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            int zzn = this.zza.zzn();
            zzT(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                zzgtsVar.zze(this.zza.zzc());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 != 5) {
                throw zzgul.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        int zzn2 = this.zza.zzn();
        zzT(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            list.add(Float.valueOf(this.zza.zzc()));
        } while (this.zza.zzd() < zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    @Deprecated
    public final void zzC(List list, zzgwc zzgwcVar, zzgtl zzgtlVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzgul.zza();
        }
        do {
            Object zze = zzgwcVar.zze();
            zzP(zze, zzgwcVar, zzgtlVar);
            zzgwcVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzD(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzguaVar = (zzgua) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzgsz zzgszVar = this.zza;
                    int zzd = zzgszVar.zzd() + zzgszVar.zzn();
                    do {
                        zzguaVar.zzh(this.zza.zzh());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgul.zza();
            }
            do {
                zzguaVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgsz zzgszVar2 = this.zza;
                int zzd2 = zzgszVar2.zzd() + zzgszVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgul.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzh()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzE(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzguy) {
            zzguy zzguyVar = (zzguy) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzgsz zzgszVar = this.zza;
                    int zzd = zzgszVar.zzd() + zzgszVar.zzn();
                    do {
                        zzguyVar.zzg(this.zza.zzp());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgul.zza();
            }
            do {
                zzguyVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgsz zzgszVar2 = this.zza;
                int zzd2 = zzgszVar2.zzd() + zzgszVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgul.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzp()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzF(List list, zzgwc zzgwcVar, zzgtl zzgtlVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzgul.zza();
        }
        do {
            Object zze = zzgwcVar.zze();
            zzQ(zze, zzgwcVar, zzgtlVar);
            zzgwcVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzG(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzguaVar = (zzgua) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i != 5) {
                    throw zzgul.zza();
                }
                do {
                    zzguaVar.zzh(this.zza.zzk());
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm2 = this.zza.zzm();
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            int zzn = this.zza.zzn();
            zzT(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                zzguaVar.zzh(this.zza.zzk());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 != 5) {
                throw zzgul.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        int zzn2 = this.zza.zzn();
        zzT(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            list.add(Integer.valueOf(this.zza.zzk()));
        } while (this.zza.zzd() < zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzH(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzguy) {
            zzguy zzguyVar = (zzguy) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzguyVar.zzg(this.zza.zzt());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzgul.zza();
            }
            do {
                zzguyVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            throw zzgul.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzt()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzI(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzguaVar = (zzgua) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzgsz zzgszVar = this.zza;
                    int zzd = zzgszVar.zzd() + zzgszVar.zzn();
                    do {
                        zzguaVar.zzh(this.zza.zzl());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgul.zza();
            }
            do {
                zzguaVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgsz zzgszVar2 = this.zza;
                int zzd2 = zzgszVar2.zzd() + zzgszVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgul.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzl()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzJ(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzguy) {
            zzguy zzguyVar = (zzguy) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzgsz zzgszVar = this.zza;
                    int zzd = zzgszVar.zzd() + zzgszVar.zzn();
                    do {
                        zzguyVar.zzg(this.zza.zzu());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgul.zza();
            }
            do {
                zzguyVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgsz zzgszVar2 = this.zza;
                int zzd2 = zzgszVar2.zzd() + zzgszVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgul.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzu()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    public final void zzK(List list, boolean z) throws IOException {
        String zzr;
        int zzm;
        int zzm2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzgur) && !z) {
                zzgur zzgurVar = (zzgur) list;
                do {
                    zzgurVar.zzi(zzp());
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm2 = this.zza.zzm();
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            do {
                if (z) {
                    zzr = zzs();
                } else {
                    zzr = zzr();
                }
                list.add(zzr);
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        throw zzgul.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzL(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzguaVar = (zzgua) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzgsz zzgszVar = this.zza;
                    int zzd = zzgszVar.zzd() + zzgszVar.zzn();
                    do {
                        zzguaVar.zzh(this.zza.zzn());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgul.zza();
            }
            do {
                zzguaVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgsz zzgszVar2 = this.zza;
                int zzd2 = zzgszVar2.zzd() + zzgszVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgul.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzn()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzM(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzguy) {
            zzguy zzguyVar = (zzguy) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzgsz zzgszVar = this.zza;
                    int zzd = zzgszVar.zzd() + zzgszVar.zzn();
                    do {
                        zzguyVar.zzg(this.zza.zzv());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgul.zza();
            }
            do {
                zzguyVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgsz zzgszVar2 = this.zza;
                int zzd2 = zzgszVar2.zzd() + zzgszVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgul.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzv()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final boolean zzO() throws IOException {
        int i;
        if (!this.zza.zzC() && (i = this.zzb) != this.zzc) {
            return this.zza.zzE(i);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzm();
            this.zzb = i;
        }
        if (i != 0 && i != this.zzc) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final zzgsr zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzt(Object obj, zzgwc zzgwcVar, zzgtl zzgtlVar) throws IOException {
        zzS(3);
        zzP(obj, zzgwcVar, zzgtlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzu(Object obj, zzgwc zzgwcVar, zzgtl zzgtlVar) throws IOException {
        zzS(2);
        zzQ(obj, zzgwcVar, zzgtlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzv(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgsf) {
            zzgsf zzgsfVar = (zzgsf) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzgsz zzgszVar = this.zza;
                    int zzd = zzgszVar.zzd() + zzgszVar.zzn();
                    do {
                        zzgsfVar.zze(this.zza.zzD());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgul.zza();
            }
            do {
                zzgsfVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgsz zzgszVar2 = this.zza;
                int zzd2 = zzgszVar2.zzd() + zzgszVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgul.zza();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzD()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzw(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzgul.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzx(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgti) {
            zzgti zzgtiVar = (zzgti) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzgtiVar.zze(this.zza.zzb());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzgul.zza();
            }
            do {
                zzgtiVar.zze(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            throw zzgul.zza();
        }
        do {
            list.add(Double.valueOf(this.zza.zzb()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzy(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzguaVar = (zzgua) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzgsz zzgszVar = this.zza;
                    int zzd = zzgszVar.zzd() + zzgszVar.zzn();
                    do {
                        zzguaVar.zzh(this.zza.zzf());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgul.zza();
            }
            do {
                zzguaVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgsz zzgszVar2 = this.zza;
                int zzd2 = zzgszVar2.zzd() + zzgszVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgul.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzf()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final void zzz(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzguaVar = (zzgua) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i != 5) {
                    throw zzgul.zza();
                }
                do {
                    zzguaVar.zzh(this.zza.zzg());
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm2 = this.zza.zzm();
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            int zzn = this.zza.zzn();
            zzT(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                zzguaVar.zzh(this.zza.zzg());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 != 5) {
                throw zzgul.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        int zzn2 = this.zza.zzn();
        zzT(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            list.add(Integer.valueOf(this.zza.zzg()));
        } while (this.zza.zzd() < zzd2);
    }
}
