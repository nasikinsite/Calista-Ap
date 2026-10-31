# CALISTA DIGITAL STORE — Android APK Project

Ini adalah **proyek source Android** berupa aplikasi Android native shell (Kotlin + WebView lokal) dengan UI CALISTA offline. Paket ini bukan APK hasil kompilasi; APK perlu dibangun memakai Android Studio/Android SDK.

## Status dan batasan
- UI berfungsi offline: navigasi, katalog contoh, pencarian/filter, detail, kalkulator USD.
- Produk pada aplikasi adalah **data demo**, bukan katalog provider.
- Login, checkout, riwayat, pembayaran, TopUp, saldo, dan transaksi nyata belum dihubungkan.
- Tidak ada token/secret di aplikasi.
- Untuk produksi, hubungkan ke alur native BukaOlshop/API resmi dari backend yang aman. Jangan menaruh token rahasia di APK.

## Build APK dengan Android Studio
1. Instal Android Studio di komputer.
2. Buka folder `CALISTA-Android` sebagai project.
3. Izinkan Gradle sync dan unduh Android SDK Platform 35.
4. Pilih **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
5. APK debug akan berada di `app/build/outputs/apk/debug/app-debug.apk`.

## Persyaratan
- Android Studio yang mendukung Android Gradle Plugin 8.9.2.
- JDK 17.
- Android SDK Platform 35.
- Min Android: Android 6.0 (API 23).

## Menjalankan di perangkat
Instal `app-debug.apk` di Android. Untuk distribusi di luar perangkat uji, siapkan signing key dan build release melalui Android Studio.

## Catatan integrasi BukaOlshop
Aplikasi ini adalah prototipe Android mandiri. Tema website BukaOlshop tetap dipasang melalui Developer BukaOlshop dan tidak otomatis menjadi APK native. Sebelum transaksi live, verifikasi dokumentasi API, kredensial, callback, provider, dan uji sandbox. Tidak ada klaim pembayaran atau TopUp aktif pada versi ini.
