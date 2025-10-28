
FITUR 1: Menampilkan Ketersediaan Kamar Per Lantai
Pseudocode
ALGORITMA TampilkanKetersediaanKamar
DEKLARASI
    jumlahLantai, jumlahKamarPerLantai : integer
    lantai, nomorKamar : integer
    statusKamar : array[lantai][kamar] of boolean

DESKRIPSI
    INPUT jumlahLantai, jumlahKamarPerLantai
    
    OUTPUT "=== KETERSEDIAAN KAMAR HOTEL ==="
    
    UNTUK lantai ← 1 SAMPAI jumlahLantai LAKUKAN
        OUTPUT "Lantai ", lantai, ":"
        
        UNTUK nomorKamar ← 1 SAMPAI jumlahKamarPerLantai LAKUKAN
            nomorKamarLengkap ← (lantai * 100) + nomorKamar
            
            JIKA statusKamar[lantai][nomorKamar] = true MAKA
                OUTPUT "  Kamar ", nomorKamarLengkap, " : TERSEDIA"
            JIKA TIDAK
                OUTPUT "  Kamar ", nomorKamarLengkap, " : TERISI"
            AKHIR JIKA
        AKHIR UNTUK
        
        OUTPUT "" // baris kosong
    AKHIR UNTUK
AKHIR ALGORITMA
Flowchart Fitur 1
![alt text](<Untitled diagram-2025-10-28-041237.png>)

                    ┌──────────────┐
                    │    MULAI     │
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │ INPUT jumlah │
                    │ Lantai, Kamar│
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │  lantai ← 1  │
                    └──────┬───────┘
                           │
                    ┌──────▼────────┐
                    │lantai <=      │◄────────────┐
                    │jumlahLantai?  │             │
                    └──┬─────────┬──┘             │
                       │Ya       │Tidak           │
                       │         │                │
                       │    ┌────▼─────┐          │
                       │    │ SELESAI  │          │
                       │    └──────────┘          │
                       │                          │
                ┌──────▼──────┐                   │
                │ OUTPUT      │                   │
                │"Lantai X:"  │                   │
                └──────┬──────┘                   │
                       │                          │
                ┌──────▼──────┐                   │
                │nomorKamar←1 │                   │
                └──────┬──────┘                   │
                       │                          │
                ┌──────▼────────┐                 │
                │nomorKamar <=  │◄───────┐        │
                │jumlahKamarPer-│        │        │
                │Lantai?        │        │        │
                └──┬──────────┬─┘        │        │
                   │Ya        │Tidak     │        │
                   │          │          │        │
            ┌──────▼─────┐    │          │        │
            │ Hitung nomor│   │          │        │
            │kamar lengkap│   │          │        │
            └──────┬──────┘   │          │        │
                   │          │          │        │
            ┌──────▼──────┐   │          │        │
            │   Status    │   │          │        │
            │kamar tersedia│  │          │        │
            └──┬────────┬─┘   │          │        │
               │Ya      │Tidak│          │        │
               │        │     │          │        │
        ┌──────▼──┐  ┌──▼───┐ │          │        │
        │ OUTPUT  │  │OUTPUT│ │          │        │
        │TERSEDIA │  │TERISI│ │          │        │
        └──────┬──┘  └──┬───┘ │          │        │
               │        │     │          │        │
               └────┬───┘     │          │        │
                    │         │          │        │
             ┌──────▼──────┐  │          │        │
             │nomorKamar ← │  │          │        │
             │nomorKamar+1 │  │          │        │
             └──────┬──────┘  │          │        │
                    │         │          │        │
                    └─────────┘          │        │
                                         │        │
                                  ┌──────▼──────┐ │
                                  │ OUTPUT baris│ │
                                  │   kosong    │ │
                                  └──────┬──────┘ │
                                         │        │
                                  ┌──────▼──────┐ │
                                  │  lantai ←   │ │
                                  │  lantai + 1 │ │
                                  └──────┬──────┘ │
                                         │        │
                                         └────────┘


FITUR 2: Menampilkan Laporan Booking Per Bulan Per Tipe Kamar
Pseudocode
ALGORITMA LaporanBookingBulanan
DEKLARASI
    jumlahBulan, jumlahTipeKamar : integer
    bulan, tipe : integer
    namaBulan : array[12] of string
    namaTipe : array[tipe] of string
    jumlahBooking : array[bulan][tipe] of integer
    totalPerBulan : integer

DESKRIPSI
    INPUT jumlahBulan, jumlahTipeKamar
    
    OUTPUT "=== LAPORAN BOOKING HOTEL ==="
    
    UNTUK bulan ← 1 SAMPAI jumlahBulan LAKUKAN
        OUTPUT "Bulan: ", namaBulan[bulan]
        totalPerBulan ← 0
        
        UNTUK tipe ← 1 SAMPAI jumlahTipeKamar LAKUKAN
            OUTPUT "  ", namaTipe[tipe], " : ", jumlahBooking[bulan][tipe], " booking"
            totalPerBulan ← totalPerBulan + jumlahBooking[bulan][tipe]
        AKHIR UNTUK
        
        OUTPUT "  Total bulan ini: ", totalPerBulan
        OUTPUT "" // baris kosong
    AKHIR UNTUK
AKHIR ALGORITMA

Flowchart Fitur 2
![alt text](<Untitled diagram-2025-10-28-041237.png>)
                    ┌──────────────┐
                    │    MULAI     │
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │ INPUT jumlah │
                    │Bulan, TipeKamar
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │  bulan ← 1   │
                    └──────┬───────┘
                           │
                    ┌──────▼────────┐
                    │  bulan <=     │◄────────────┐
                    │jumlahBulan?   │             │
                    └──┬─────────┬──┘             │
                       │Ya       │Tidak           │
                       │         │                │
                       │    ┌────▼─────┐          │
                       │    │ SELESAI  │          │
                       │    └──────────┘          │
                       │                          │
                ┌──────▼──────┐                   │
                │ OUTPUT      │                   │
                │"Bulan: X"   │                   │
                └──────┬──────┘                   │
                       │                          │
                ┌──────▼──────┐                   │
                │totalPerBulan│                   │
                │     ← 0     │                   │
                └──────┬──────┘                   │
                       │                          │
                ┌──────▼──────┐                   │
                │  tipe ← 1   │                   │
                └──────┬──────┘                   │
                       │                          │
                ┌──────▼────────┐                 │
                │  tipe <=      │◄───────┐        │
                │jumlahTipeKamar│        │        │
                └──┬─────────┬──┘        │        │
                   │Ya       │Tidak      │        │
                   │         │           │        │
            ┌──────▼─────┐   │           │        │
            │ OUTPUT tipe│   │           │        │
            │dan jumlah  │   │           │        │
            │  booking   │   │           │        │
            └──────┬─────┘   │           │        │
                   │         │           │        │
            ┌──────▼─────┐   │           │        │
            │totalPerBulan│  │           │        │
            │   += jumlah│   │           │        │
            │  Booking   │   │           │        │
            └──────┬─────┘   │           │        │
                   │         │           │        │
            ┌──────▼─────┐   │           │        │
            │  tipe ←    │   │           │        │
            │  tipe + 1  │   │           │        │
            └──────┬─────┘   │           │        │
                   │         │           │        │
                   └─────────┘           │        │
                                         │        │
                                  ┌──────▼──────┐ │
                                  │ OUTPUT total│ │
                                  │  per bulan  │ │
                                  └──────┬──────┘ │
                                         │        │
                                  ┌──────▼──────┐ │
                                  │ OUTPUT baris│ │
                                  │   kosong    │ │
                                  └──────┬──────┘ │
                                         │        │
                                  ┌──────▼──────┐ │
                                  │  bulan ←    │ │
                                  │  bulan + 1  │ │
                                  └──────┬──────┘ │
                                         │        │
                                         └────────┘

FITUR 3: Mencari Kamar Tersedia Dalam Rentang Tanggal
Pseudocode
ALGORITMA CariKamarTersedia
DEKLARASI
    tanggalMulai, tanggalSelesai : integer
    jumlahKamar : integer
    tanggal, kamar : integer
    kamarTersedia : array[kamar][tanggal] of boolean
    kamarKosong : boolean

DESKRIPSI
    INPUT tanggalMulai, tanggalSelesai, jumlahKamar
    
    OUTPUT "=== KAMAR TERSEDIA ==="
    OUTPUT "Tanggal: ", tanggalMulai, " - ", tanggalSelesai
    OUTPUT ""
    
    UNTUK kamar ← 1 SAMPAI jumlahKamar LAKUKAN
        kamarKosong ← true
        
        UNTUK tanggal ← tanggalMulai SAMPAI tanggalSelesai LAKUKAN
            JIKA kamarTersedia[kamar][tanggal] = false MAKA
                kamarKosong ← false
                BREAK // keluar dari loop dalam
            AKHIR JIKA
        AKHIR UNTUK
        
        JIKA kamarKosong = true MAKA
            OUTPUT "Kamar ", kamar, " : TERSEDIA untuk seluruh periode"
        AKHIR JIKA
    AKHIR UNTUK
AKHIR ALGORITMA
Flowchart Fitur 3
![alt text](<Untitled diagram-2025-10-28-041237.png>)
                    ┌──────────────┐
                    │    MULAI     │
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │ INPUT tanggal│
                    │Mulai, Selesai│
                    │ jumlahKamar  │
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │ OUTPUT header│
                    │   laporan    │
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │  kamar ← 1   │
                    └──────┬───────┘
                           │
                    ┌──────▼────────┐
                    │  kamar <=     │◄────────────┐
                    │ jumlahKamar?  │             │
                    └──┬─────────┬──┘             │
                       │Ya       │Tidak           │
                       │         │                │
                       │    ┌────▼─────┐          │
                       │    │ SELESAI  │          │
                       │    └──────────┘          │
                       │                          │
                ┌──────▼──────┐                   │
                │ kamarKosong │                   │
                │   ← true    │                   │
                └──────┬──────┘                   │
                       │                          │
                ┌──────▼──────┐                   │
                │tanggal ←    │                   │
                │tanggalMulai │                   │
                └──────┬──────┘                   │
                       │                          │
                ┌──────▼────────┐                 │
                │tanggal <=     │◄───────┐        │
                │tanggalSelesai?│        │        │
                └──┬─────────┬──┘        │        │
                   │Ya       │Tidak      │        │
                   │         │           │        │
            ┌──────▼─────┐   │           │        │
            │Cek status  │   │           │        │
            │kamar[kamar]│   │           │        │
            │  [tanggal] │   │           │        │
            └──────┬─────┘   │           │        │
                   │         │           │        │
            ┌──────▼─────┐   │           │        │
            │  Kamar     │   │           │        │
            │ tersedia?  │   │           │        │
            └──┬──────┬──┘   │           │        │
               │Ya    │Tidak │           │        │
               │      │      │           │        │
               │   ┌──▼────┐ │           │        │
               │   │kamar- │ │           │        │
               │   │Kosong │ │           │        │
               │   │←false │ │           │        │
               │   └───┬───┘ │           │        │
               │       │     │           │        │
               │   ┌───▼───┐ │           │        │
               │   │ BREAK │ │           │        │
               │   │ (ke   │ │           │        │
               │   │cek if)│ │           │        │
               │   └───┬───┘ │           │        │
               │       │     │           │        │
               └───┬───┘     │           │        │
                   │         │           │        │
            ┌──────▼─────┐   │           │        │
            │ tanggal ←  │   │           │        │
            │tanggal + 1 │   │           │        │
            └──────┬─────┘   │           │        │
                   │         │           │        │
                   └─────────┘           │        │
                                         │        │
                                  ┌──────▼──────┐ │
                                  │ kamarKosong │ │
                                  │  = true?    │ │
                                  └──┬───────┬──┘ │
                                     │Ya     │Tidak
                                     │       │    │
                              ┌──────▼────┐  │    │
                              │  OUTPUT   │  │    │
                              │   KAMAR   │  │    │
                              │ TERSEDIA  │  │    │
                              └──────┬────┘  │    │
                                     │       │    │
                                     └───┬───┘    │
                                         │        │
                                  ┌──────▼──────┐ │
                                  │  kamar ←    │ │
                                  │  kamar + 1  │ │
                                  └──────┬──────┘ │
                                         │        │
                                         └────────┘

FITUR 4: Menampilkan Tabel Harga Kamar Per Tipe Per Musim
Pseudocode
ALGORITMA TabelHargaKamar
DEKLARASI
    jumlahTipeKamar, jumlahMusim : integer
    tipe, musim : integer
    namaTipe : array[tipe] of string
    namaMusim : array[musim] of string
    hargaKamar : array[tipe][musim] of integer

DESKRIPSI
    INPUT jumlahTipeKamar, jumlahMusim
    
    OUTPUT "=== TABEL HARGA KAMAR HOTEL ==="
    OUTPUT ""
    
    // Header tabel
    OUTPUT "Tipe Kamar         |"
    UNTUK musim ← 1 SAMPAI jumlahMusim LAKUKAN
        OUTPUT " ", namaMusim[musim], " |"
    AKHIR UNTUK
    OUTPUT ""
    OUTPUT garis pemisah
    
    // Isi tabel
    UNTUK tipe ← 1 SAMPAI jumlahTipeKamar LAKUKAN
        OUTPUT namaTipe[tipe], " |"
        
        UNTUK musim ← 1 SAMPAI jumlahMusim LAKUKAN
            OUTPUT " Rp ", hargaKamar[tipe][musim], " |"
        AKHIR UNTUK
        
        OUTPUT ""
    AKHIR UNTUK
AKHIR ALGORITMA
Flowchart Fitur 4
![alt text](<Untitled diagram-2025-10-28-041237.png>)
                    ┌──────────────┐
                    │    MULAI     │
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │ INPUT jumlah │
                    │Tipe, Musim   │
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │ OUTPUT header│
                    │    tabel     │
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │  musim ← 1   │
                    └──────┬───────┘
                           │
                    ┌──────▼────────┐
                    │  musim <=     │◄───────┐
                    │ jumlahMusim?  │        │
                    └──┬─────────┬──┘        │
                       │Ya       │Tidak      │
                       │         │           │
                ┌──────▼─────┐   │           │
                │  OUTPUT    │   │           │
                │namaMusim[i]│   │           │
                └──────┬─────┘   │           │
                       │         │           │
                ┌──────▼─────┐   │           │
                │  musim ←   │   │           │
                │ musim + 1  │   │           │
                └──────┬─────┘   │           │
                       │         │           │
                       └─────────┘           │
                                             │
                                      ┌──────▼───────┐
                                      │OUTPUT garis  │
                                      │  pemisah     │
                                      └──────┬───────┘
                                             │
                                      ┌──────▼───────┐
                                      │  tipe ← 1    │
                                      └──────┬───────┘
                                             │
                                      ┌──────▼────────┐
                                      │  tipe <=      │◄─────────┐
                                      │jumlahTipeKamar│          │
                                      └──┬─────────┬──┘          │
                                         │Ya       │Tidak        │
                                         │         │             │
                                         │    ┌────▼─────┐       │
                                         │    │ SELESAI  │       │
                                         │    └──────────┘       │
                                         │                       │
                                  ┌──────▼──────┐                │
                                  │  OUTPUT     │                │
                                  │ namaTipe[i] │                │
                                  └──────┬──────┘                │
                                         │                       │
                                  ┌──────▼──────┐                │
                                  │  musim ← 1  │                │
                                  └──────┬──────┘                │
                                         │                       │
                                  ┌──────▼────────┐              │
                                  │  musim <=     │◄──────┐      │
                                  │ jumlahMusim?  │       │      │
                                  └──┬─────────┬──┘       │      │
                                     │Ya       │Tidak     │      │
                                     │         │          │      │
                              ┌──────▼─────┐   │          │      │
                              │  OUTPUT    │   │          │      │
                              │hargaKamar  │   │          │      │
                              │[tipe][musim]   │          │      │
                              └──────┬─────┘   │          │      │
                                     │         │          │      │
                              ┌──────▼─────┐   │          │      │
                              │  musim ←   │   │          │      │
                              │ musim + 1  │   │          │      │
                              └──────┬─────┘   │          │      │
                                     │         │          │      │
                                     └─────────┘          │      │
                                                          │      │
                                                   ┌──────▼────┐ │
                                                   │OUTPUT new │ │
                                                   │   line    │ │
                                                   └──────┬────┘ │
                                                          │      │
                                                   ┌──────▼────┐ │
                                                   │  tipe ←   │ │
                                                   │ tipe + 1  │ │
                                                   └──────┬────┘ │
                                                          │      │
                                                          └──────┘

FITUR 5: Statistik Okupansi Per Lantai Per Hari
Pseudocode
ALGORITMA StatistikOkupansi
DEKLARASI
    jumlahLantai, jumlahHari, kamarPerLantai : integer
    lantai, hari : integer
    kamarTerisi : array[lantai][hari] of integer
    persenOkupansi : real

DESKRIPSI
    INPUT jumlahLantai, jumlahHari, kamarPerLantai
    
    OUTPUT "=== STATISTIK OKUPANSI HOTEL ==="
    
    UNTUK lantai ← 1 SAMPAI jumlahLantai LAKUKAN
        OUTPUT "Lantai ", lantai, ":"
        
        UNTUK hari ← 1 SAMPAI jumlahHari LAKUKAN
            persenOkupansi ← (kamarTerisi[lantai][hari] * 100) / kamarPerLantai
            OUTPUT "  Hari ", hari, " : ", kamarTerisi[lantai][hari], 
                   "/", kamarPerLantai, " kamar terisi (", persenOkupansi, "%)"
        AKHIR UNTUK
        
        OUTPUT ""
    AKHIR UNTUK
AKHIR ALGORITMA
Flowchart Fitur 5
![alt text](<Untitled diagram-2025-10-28-041237.png>)
                    ┌──────────────┐
                    │    MULAI     │
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │ INPUT jumlah │
                    │Lantai, Hari, │
                    │KamarPerLantai│
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │ OUTPUT header│
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │  lantai ← 1  │
                    └──────┬───────┘
                           │
                    ┌──────▼────────┐
                    │  lantai <=    │◄────────────┐
                    │jumlahLantai?  │             │
                    └──┬─────────┬──┘             │
                       │Ya       │Tidak           │
                       │         │                │
                       │    ┌────▼─────┐          │
                       │    │ SELESAI  │          │
                       │    └──────────┘          │
                       │                          │
                ┌──────▼──────┐                   │
                │ OUTPUT      │                   │
                │"Lantai X:"  │                   │
                └──────┬──────┘                   │
                       │                          │
                ┌──────▼──────┐                   │
                │  hari ← 1   │                   │
                └──────┬──────┘                   │
                       │                          │
                ┌──────▼────────┐                 │
                │  hari <=      │◄───────┐        │
                │  jumlahHari?  │        │        │
                └──┬─────────┬──┘        │        │
                   │Ya       │Tidak      │        │
                   │         │           │        │
            ┌──────▼─────┐   │           │        │
            │  Hitung    │   │           │        │
            │   persen   │   │           │        │
            │  okupansi  │   │           │        │
            └──────┬─────┘   │           │        │
                   │         │           │        │
            ┌──────▼─────┐   │           │        │
            │  OUTPUT    │   │           │        │
            │ statistik  │   │           │        │
            │   hari X   │   │           │        │
            └──────┬─────┘   │           │        │
                   │         │           │        │
            ┌──────▼─────┐   │           │        │
            │  hari ←    │   │           │        │
            │  hari + 1  │   │           │        │
            └──────┬─────┘   │           │        │
                   │         │           │        │
                   └─────────┘           │        │
                                         │        │
                                  ┌──────▼──────┐ │
                                  │ OUTPUT baris│ │
                                  │   kosong    │ │
                                  └──────┬──────┘ │
                                         │        │
                                  ┌──────▼──────┐ │
                                  │  lantai ←   │ │
                                  │  lantai + 1 │ │
                                  └──────┬──────┘ │
                                         │        │
                                         └────────┘