# PENJELASAN PROGRAM SISTEM PENDAFTARAN BEASISWA

## 1. STRUKTUR PROGRAM

### Class Mahasiswa
- **Fungsi**: Menyimpan data setiap pendaftar beasiswa
- **Atribut yang disimpan**:
  - `nama` - nama lengkap mahasiswa
  - `nim` - nomor induk mahasiswa
  - `ipk` - IPK terakhir mahasiswa
  - `jenisBeasiswa` - jenis beasiswa yang didaftar
  - `penghasilanOrtu` - penghasilan orang tua
- **Constructor**: Digunakan untuk membuat objek mahasiswa baru dengan langsung mengisi semua atribut

### Class SistemBeasiswa
- **Fungsi**: Class utama yang menjalankan seluruh sistem
- **Komponen penting**:
  - `ArrayList<Mahasiswa> dataMhs` - untuk menyimpan semua data pendaftar secara dinamis
  - `Scanner sc` - untuk menerima input dari user
  - Fungsi-fungsi untuk setiap menu

---

## 2. IMPLEMENTASI FITUR (Sesuai Soal)

### Menu 1: Tambah Data Pendaftar (`tambahData()`)
**Alur kerja**:
1. Input nama mahasiswa
2. Input NIM
3. Input IPK dengan validasi (0-4.0)
4. Input jenis beasiswa dengan validasi (hanya Reguler/Unggulan/Riset)
5. Input penghasilan orang tua dengan validasi (maksimal Rp 2.000.000)
6. Buat objek Mahasiswa baru
7. Simpan ke ArrayList

**Validasi yang diterapkan**:
- IPK harus dalam rentang 0-4.0
- Jenis beasiswa hanya boleh: REGULER, UNGGULAN, atau RISET
- Penghasilan orang tua maksimal Rp 2.000.000

### Menu 2: Tampilkan Semua Pendaftar (`tampilData()`)
**Alur kerja**:
1. Cek apakah ArrayList kosong
2. Jika ada data, tampilkan header tabel
3. Loop semua data di ArrayList
4. Tampilkan setiap data dalam format tabel yang rapi

**Output**: Tabel berisi nomor, nama, NIM, IPK, jenis beasiswa, dan penghasilan orang tua

### Menu 3: Cari berdasarkan Jenis Beasiswa (`cariData()`)
**Alur kerja**:
1. Input jenis beasiswa yang ingin dicari
2. Ubah input ke huruf kapital (uppercase)
3. Loop semua data di ArrayList
4. Bandingkan jenis beasiswa dengan input user
5. Tampilkan data yang cocok dalam format tabel

**Logika pencarian**: Menggunakan `equals()` untuk membandingkan string

### Menu 4: Hitung Rata-rata IPK (`hitungRataIPK()`)
**Alur kerja**:
1. Siapkan variabel untuk menampung total IPK dan jumlah mahasiswa per jenis
2. Loop semua data di ArrayList
3. Kelompokkan berdasarkan jenis beasiswa
4. Jumlahkan IPK dan hitung jumlah mahasiswa per jenis
5. Hitung rata-rata: total IPK / jumlah mahasiswa
6. Tampilkan hasil untuk setiap jenis beasiswa

**Rumus**: Rata-rata = Total IPK / Jumlah Mahasiswa

---

## 3. KONSEP PEMROGRAMAN YANG DIGUNAKAN

### A. Pemilihan (Selection)
**Implementasi**:
- `if-else` untuk validasi input (IPK, jenis beasiswa, penghasilan)
- `switch-case` untuk memilih menu yang dipilih user

**Contoh**:
```java
if(ipk >= 0 && ipk <= 4.0) {
    valid = true;
} else {
    System.out.println("IPK harus 0-4!");
}
```

### B. Perulangan (Looping)
**Implementasi**:
- `while` untuk validasi input sampai data benar
- `for` untuk menampilkan semua data
- `for` untuk mencari data
- `for` untuk menghitung rata-rata
- `do-while` untuk menu utama

**Contoh**:
```java
// While untuk validasi
while(!valid) {
    // input dan validasi
}

// For untuk menampilkan data
for(int i = 0; i < dataMhs.size(); i++) {
    // tampilkan data
}
```

### C. Array (ArrayList)
**Implementasi**:
- `ArrayList<Mahasiswa>` untuk menyimpan data secara dinamis
- Ukuran ArrayList bisa bertambah otomatis
- Menggunakan method `add()`, `get()`, `size()`

**Keuntungan ArrayList**:
- Tidak perlu tentukan ukuran di awal
- Bisa tambah data kapan saja
- Ukuran fleksibel

### D. Fungsi/Method
**Implementasi**:
Setiap fitur dibuat sebagai fungsi terpisah:
- `tambahData()` - untuk menu 1
- `tampilData()` - untuk menu 2
- `cariData()` - untuk menu 3
- `hitungRataIPK()` - untuk menu 4

**Keuntungan**:
- Kode lebih rapi dan terorganisir
- Mudah dipahami dan di-maintain
- Fungsi bisa dipanggil berkali-kali

### E. Object-Oriented Programming (OOP)
**Implementasi**:
- Class `Mahasiswa` sebagai blueprint untuk objek mahasiswa
- Constructor untuk inisialisasi objek
- Penggunaan objek untuk menyimpan data yang kompleks

---

## 4. CARA KERJA PROGRAM

### Flow Program:
1. Program dimulai dari `main()`
2. Tampilkan menu utama (do-while loop)
3. User memilih menu (1-5)
4. Switch-case memanggil fungsi sesuai pilihan
5. Fungsi dijalankan
6. Kembali ke menu utama
7. Loop terus sampai user pilih keluar (5)

### Contoh Skenario Penggunaan:
1. User pilih menu 1 → tambah 3 data mahasiswa
2. User pilih menu 2 → lihat semua data (3 data tampil)
3. User pilih menu 3 → cari beasiswa "Unggulan"
4. User pilih menu 4 → lihat rata-rata IPK per jenis
5. User pilih menu 5 → program selesai

---

## 5. KEUNGGULAN PROGRAM

✓ **Validasi lengkap** - mencegah input yang salah
✓ **Modular** - setiap fitur adalah fungsi terpisah
✓ **Dinamis** - data bisa bertambah tanpa batas
✓ **User-friendly** - menu mudah dipahami
✓ **Format rapi** - output dalam bentuk tabel
✓ **Efisien** - menggunakan ArrayList untuk data dinamis

---

## 6. PENERAPAN MATERI PRAKTIKUM

| Materi | Penerapan di Program |
|--------|---------------------|
| **Pemilihan** | (if-else) Validasi input, (switch-case) switch menu |
| **Perulangan** | While untuk validasi, for untuk data |
| **Array** | ArrayList untuk simpan data dinamis |
| **Fungsi** | 4 fungsi untuk 4 menu |
| **OOP** | Class Mahasiswa sebagai objek |

---

## 7. CARA COMPILE DAN RUN

```bash
# Compile
javac SistemBeasiswa.java

# Jalankan
java SistemBeasiswa
```

---

## KESIMPULAN

Program ini berhasil mengimplementasikan:
- Semua fitur yang diminta dalam soal
- Validasi input sesuai ketentuan
- Struktur kode yang modular dan terorganisir
- Penerapan konsep pemrograman: pemilihan, perulangan, array, dan fungsi
- Output yang rapi dan informatif