 MENU 1: TAMBAH DATA
🔹 1. INPUT
java// Input nama
System.out.print("Nama Mahasiswa: ");
String nama = sc.nextLine();

// Input NIM
System.out.print("NIM: ");
String nim = sc.nextLine();
Penjelasan: User memasukkan data nama dan NIM dari keyboard.

🔹 2. VALIDASI
A. Validasi IPK:
javadouble ipk = 0;
boolean valid = false;
while(!valid) {
    System.out.print("IPK: ");
    ipk = sc.nextDouble();
    if(ipk >= 0 && ipk <= 4.0) {
        valid = true;  // ✅ Data valid
    } else {
        System.out.println("IPK harus 0-4!");  // ❌ Data salah, ulangi
    }
}
Penjelasan: Loop terus sampai IPK antara 0-4.
B. Validasi Jenis Beasiswa:
javaString jenis = "";
valid = false;
while(!valid) {
    System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
    jenis = sc.nextLine().toUpperCase();
    
    if(jenis.equals("REGULER") || jenis.equals("UNGGULAN") || jenis.equals("RISET")) {
        valid = true;  // ✅ Data valid
    } else {
        System.out.println("Jenis beasiswa tidak valid!");  // ❌ Data salah
    }
}
Penjelasan: Loop sampai input salah satu dari 3 jenis beasiswa.
C. Validasi Penghasilan:
javaint gaji = 0;
valid = false;
while(!valid) {
    System.out.print("Penghasilan Orang Tua (maks 2000000): ");
    gaji = sc.nextInt();
    sc.nextLine();
    
    if(gaji <= 2000000 && gaji >= 0) {
        valid = true;  // ✅ Data valid
    } else {
        System.out.println("Penghasilan melebihi batas!");  // ❌ Data salah
    }
}
Penjelasan: Loop sampai penghasilan maksimal 2 juta.

🔹 3. SIMPAN
java// Simpan data ke array 2D
dataMhs[jumlahData][0] = nama;                    // Kolom 0: Nama
dataMhs[jumlahData][1] = nim;                     // Kolom 1: NIM
dataMhs[jumlahData][2] = String.valueOf(ipk);     // Kolom 2: IPK
dataMhs[jumlahData][3] = jenis;                   // Kolom 3: Jenis
dataMhs[jumlahData][4] = String.valueOf(gaji);    // Kolom 4: Penghasilan

jumlahData++;  // Tambah counter
System.out.println("Data berhasil ditambahkan!");
Penjelasan: Semua data yang sudah valid disimpan ke array 2D.

📋 MENU 2: TAMPILKAN SEMUA DATA
🔹 4. PROSES (Ambil Data dari Array)
java// NESTED LOOP untuk menampilkan data
// Loop outer: iterasi setiap baris (mahasiswa)
for(int i = 0; i < jumlahData; i++) {
    System.out.printf("%-4d ", (i+1));
    
    // Loop inner: iterasi setiap kolom (atribut mahasiswa)
    for(int j = 0; j < 5; j++) {
        if(j == 0) {
            System.out.printf("%-25s ", dataMhs[i][j]); // Nama
        } else if(j == 1) {
            System.out.printf("%-15s ", dataMhs[i][j]); // NIM
        } else if(j == 2) {
            System.out.printf("%-6s ", dataMhs[i][j]);  // IPK
        } else if(j == 3) {
            System.out.printf("%-12s ", dataMhs[i][j]); // Jenis
        } else if(j == 4) {
            System.out.printf("Rp%-13s", dataMhs[i][j]); // Penghasilan
        }
    }
    System.out.println();
}
```
**Penjelasan Proses:**
- **Loop luar (i):** Ambil mahasiswa satu per satu
- **Loop dalam (j):** Ambil setiap data mahasiswa (5 kolom)

**Visualisasi:**
```
i=0 → ambil dataMhs[0][0], [0][1], [0][2], [0][3], [0][4]
i=1 → ambil dataMhs[1][0], [1][1], [1][2], [1][3], [1][4]
i=2 → ambil dataMhs[2][0], [2][1], [2][2], [2][3], [2][4]

🔹 5. TAMPILKAN
javaSystem.out.println("=======================================================================================");
System.out.printf("%-4s %-25s %-15s %-6s %-12s %-15s\n", 
    "No", "Nama", "NIM", "IPK", "Jenis", "Penghasilan");
System.out.println("=======================================================================================");

// (hasil dari nested loop di atas)

System.out.println("=======================================================================================");
```
**Output:**
```
No   Nama                      NIM            IPK    Jenis        Penghasilan
1    Budi                      123            3.5    REGULER      Rp1500000
2    Ani                       124            3.8    UNGGULAN     Rp1800000

📋 MENU 3: CARI DATA BERDASARKAN JENIS
🔹 1. INPUT
javaSystem.out.print("Masukkan jenis beasiswa: ");
String cari = sc.nextLine().toUpperCase();
Penjelasan: User input jenis beasiswa yang mau dicari.

🔹 4. PROSES (Filter Data)
javaint no = 1;
int ketemu = 0;

// Loop outer: iterasi setiap baris (mahasiswa)
for(int i = 0; i < jumlahData; i++) {
    // Cek apakah jenis beasiswa sesuai
    if(dataMhs[i][3].equals(cari)) {  // FILTER
        System.out.printf("%-4d ", no);
        
        // Loop inner: iterasi setiap kolom untuk mahasiswa yang cocok
        for(int j = 0; j < 5; j++) {
            if(j == 0) {
                System.out.printf("%-25s ", dataMhs[i][j]);
            } else if(j == 1) {
                System.out.printf("%-15s ", dataMhs[i][j]);
            } else if(j == 2) {
                System.out.printf("%-6s ", dataMhs[i][j]);
            } else if(j == 3) {
                System.out.printf("%-12s ", dataMhs[i][j]);
            } else if(j == 4) {
                System.out.printf("Rp%-13s", dataMhs[i][j]);
            }
        }
        System.out.println();
        no++;
        ketemu++;
    }
}
```
**Penjelasan Proses:**
- **Loop luar (i):** Cek setiap mahasiswa
- **IF:** Filter hanya yang jenis beasiswanya cocok
- **Loop dalam (j):** Cetak data mahasiswa yang cocok

**Visualisasi (cari "UNGGULAN"):**
```
i=0: dataMhs[0][3]="REGULER"  → SKIP (tidak cocok)
i=1: dataMhs[1][3]="UNGGULAN" → PROSES (cocok!) → cetak semua kolom
i=2: dataMhs[2][3]="RISET"    → SKIP (tidak cocok)
i=3: dataMhs[3][3]="UNGGULAN" → PROSES (cocok!) → cetak semua kolom

🔹 5. TAMPILKAN
javaif(ketemu == 0) {
    System.out.println("Data tidak ditemukan");
}
```
**Output (jika ada):**
```
Hasil Pencarian:
No   Nama                      NIM            IPK    Jenis        Penghasilan
1    Ani                       124            3.8    UNGGULAN     Rp1800000
2    Dedi                      126            3.7    UNGGULAN     Rp1600000
```

**Output (jika tidak ada):**
```
Data tidak ditemukan

📋 MENU 4: HITUNG RATA-RATA IPK
🔹 4. PROSES (Hitung Rata-rata)
javaString[] jenisBeasiswa = {"REGULER", "UNGGULAN", "RISET"};

// Loop outer: iterasi setiap jenis beasiswa
for(int i = 0; i < jenisBeasiswa.length; i++) {
    double total = 0;
    int jumlah = 0;
    
    // Loop inner: iterasi semua mahasiswa untuk hitung yang sesuai jenis
    for(int j = 0; j < jumlahData; j++) {
        if(dataMhs[j][3].equals(jenisBeasiswa[i])) {  // FILTER
            total += Double.parseDouble(dataMhs[j][2]);  // Jumlahkan IPK
            jumlah++;  // Hitung berapa mahasiswa
        }
    }
    
    // Hitung rata-rata
    if(jumlah > 0) {
        double rataRata = total / jumlah;
        // (tampilkan di bagian 5)
    }
}
```

**Penjelasan Proses:**

**Iterasi 1 (i=0, proses "REGULER"):**
```
j=0: dataMhs[0][3]="REGULER"  → total=0+3.5=3.5, jumlah=1
j=1: dataMhs[1][3]="UNGGULAN" → SKIP
j=2: dataMhs[2][3]="REGULER"  → total=3.5+3.6=7.1, jumlah=2
j=3: dataMhs[3][3]="RISET"    → SKIP

Hasil: total=7.1, jumlah=2
Rata-rata = 7.1 / 2 = 3.55
```

**Iterasi 2 (i=1, proses "UNGGULAN"):**
```
Reset: total=0, jumlah=0
Loop lagi untuk cari semua UNGGULAN
Hitung rata-rata UNGGULAN
```

**Iterasi 3 (i=2, proses "RISET"):**
```
Reset: total=0, jumlah=0
Loop lagi untuk cari semua RISET
Hitung rata-rata RISET

🔹 5. TAMPILKAN
javaif(jumlah > 0) {
    System.out.printf("%-9s: %.2f (dari %d mahasiswa)\n", 
        jenisBeasiswa[i], total/jumlah, jumlah);
} else {
    System.out.printf("%-9s: tidak ada data\n", jenisBeasiswa[i]);
}
```
**Output:**
```
=========================================
REGULER  : 3.55 (dari 2 mahasiswa)
UNGGULAN : 3.75 (dari 3 mahasiswa)
RISET    : 3.80 (dari 1 mahasiswa)
=========================================
