package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzajb implements zzakp {
    private final List zza;

    public zzajb(int i, List list) {
        this.zza = list;
    }

    private final zzakf zzb(zzako zzakoVar) {
        return new zzakf(zzd(zzakoVar));
    }

    private final zzakt zzc(zzako zzakoVar) {
        return new zzakt(zzd(zzakoVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zzd(zzako zzakoVar) {
        boolean z;
        String str;
        int i;
        List list;
        byte[] bArr;
        zzfb zzfbVar = new zzfb(zzakoVar.zzd);
        ArrayList arrayList = this.zza;
        while (zzfbVar.zza() > 0) {
            int zzl = zzfbVar.zzl();
            int zzc = zzfbVar.zzc() + zzfbVar.zzl();
            if (zzl == 134) {
                arrayList = new ArrayList();
                int zzl2 = zzfbVar.zzl() & 31;
                for (int i2 = 0; i2 < zzl2; i2++) {
                    String zzy = zzfbVar.zzy(3, zzfsi.zzc);
                    int zzl3 = zzfbVar.zzl();
                    if ((zzl3 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = zzl3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzl4 = (byte) zzfbVar.zzl();
                    zzfbVar.zzH(1);
                    if (z) {
                        if ((zzl4 & 64) != 0) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    zzak zzakVar = new zzak();
                    zzakVar.zzU(str);
                    zzakVar.zzM(zzy);
                    zzakVar.zzw(i);
                    zzakVar.zzK(list);
                    arrayList.add(zzakVar.zzac());
                }
            }
            zzfbVar.zzG(zzc);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzakp
    public final zzakr zza(int i, zzako zzakoVar) {
        if (i != 2) {
            if (i != 3 && i != 4) {
                if (i != 21) {
                    if (i != 27) {
                        if (i != 36) {
                            if (i != 89) {
                                if (i != 138) {
                                    if (i != 172) {
                                        if (i != 257) {
                                            if (i != 128) {
                                                if (i != 129) {
                                                    if (i != 134) {
                                                        if (i != 135) {
                                                            switch (i) {
                                                                case 15:
                                                                    return new zzajv(new zzaja(false, zzakoVar.zzb));
                                                                case 16:
                                                                    return new zzajv(new zzajj(zzc(zzakoVar)));
                                                                case 17:
                                                                    return new zzajv(new zzajr(zzakoVar.zzb));
                                                                default:
                                                                    return null;
                                                            }
                                                        }
                                                    } else {
                                                        return new zzake(new zzaju("application/x-scte35"));
                                                    }
                                                }
                                                return new zzajv(new zzaiu(zzakoVar.zzb));
                                            }
                                        } else {
                                            return new zzake(new zzaju("application/vnd.dvb.ait"));
                                        }
                                    } else {
                                        return new zzajv(new zzaix(zzakoVar.zzb));
                                    }
                                } else {
                                    return new zzajv(new zzajc(zzakoVar.zzb));
                                }
                            } else {
                                return new zzajv(new zzajd(zzakoVar.zzc));
                            }
                        } else {
                            return new zzajv(new zzajp(zzb(zzakoVar)));
                        }
                    } else {
                        return new zzajv(new zzajn(zzb(zzakoVar), false, false));
                    }
                } else {
                    return new zzajv(new zzajq());
                }
            } else {
                return new zzajv(new zzajs(zzakoVar.zzb));
            }
        }
        return new zzajv(new zzajg(zzc(zzakoVar)));
    }

    public zzajb() {
        this(0);
    }

    public zzajb(int i) {
        this.zza = zzfvs.zzl();
    }
}
