package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzcfr extends zzgc implements zzhf {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhe zzf;
    private zzgn zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    public zzcfr(String str, zzhk zzhkVar, int i, int i2, long j, long j2) {
        super(true);
        zzdx.zzc(str);
        this.zze = str;
        this.zzf = new zzhe();
        this.zzc = i;
        this.zzd = i2;
        this.zzi = new ArrayDeque();
        this.zzr = j;
        this.zzs = j2;
        if (zzhkVar != null) {
            zzf(zzhkVar);
        }
    }

    private final void zzl() {
        while (!this.zzi.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzi.remove()).disconnect();
            } catch (Exception e) {
                zzcat.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.zzh = null;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzhb {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            long j2 = this.zzn;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.zzo + j2;
            long j4 = i2;
            long j5 = j3 + j4 + this.zzs;
            long j6 = this.zzq;
            long j7 = j6 + 1;
            if (j5 > j7) {
                long j8 = this.zzp;
                if (j6 < j8) {
                    long min = Math.min(j8, Math.max(((this.zzr + j7) - r3) - 1, (-1) + j7 + j4));
                    zzk(j7, min, 2);
                    this.zzq = min;
                    j6 = min;
                }
            }
            int read = this.zzj.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.zzo) - this.zzn));
            if (read != -1) {
                this.zzn += read;
                zzg(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzhb(e, this.zzg, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws zzhb {
        long min;
        this.zzg = zzgnVar;
        this.zzn = 0L;
        long j = zzgnVar.zzf;
        long j2 = zzgnVar.zzg;
        if (j2 == -1) {
            min = this.zzr;
        } else {
            min = Math.min(this.zzr, j2);
        }
        this.zzo = j;
        HttpURLConnection zzk = zzk(j, (min + j) - 1, 1);
        this.zzh = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j3 = zzgnVar.zzg;
                    if (j3 != -1) {
                        this.zzm = j3;
                        this.zzp = Math.max(parseLong, (this.zzo + j3) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        this.zzp = parseLong2 - 1;
                    }
                    this.zzq = parseLong;
                    this.zzk = true;
                    zzj(zzgnVar);
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzcat.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcfp(headerField, zzgnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() throws zzhb {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhb(e, this.zzg, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzl();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzgi
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j, long j2, int i) throws zzhb {
        String uri = this.zzg.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.zze);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzi.add(httpURLConnection);
            String uri2 = this.zzg.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzl = responseCode;
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.zzj != null) {
                            inputStream = new SequenceInputStream(this.zzj, inputStream);
                        }
                        this.zzj = inputStream;
                        return httpURLConnection;
                    } catch (IOException e) {
                        zzl();
                        throw new zzhb(e, this.zzg, 2000, i);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                zzl();
                throw new zzcfq(this.zzl, headerFields, this.zzg, i);
            } catch (IOException e2) {
                zzl();
                throw new zzhb("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.zzg, 2000, i);
            }
        } catch (IOException e3) {
            throw new zzhb("Unable to connect to ".concat(String.valueOf(uri)), e3, this.zzg, 2000, i);
        }
    }
}
