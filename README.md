# Pembelajaran Java

Panduan lengkap untuk mempelajari bahasa pemrograman Java dari dasar hingga tingkat menengah.

## 📚 Daftar Isi

1. [Pengenalan Java](#pengenalan-java)
2. [Instalasi dan Setup](#instalasi-dan-setup)
3. [Konsep Dasar](#konsep-dasar)
4. [Tipe Data](#tipe-data)
5. [Operator](#operator)
6. [Kontrol Alur](#kontrol-alur)
7. [Array dan Koleksi](#array-dan-koleksi)
8. [Object-Oriented Programming](#object-oriented-programming)
9. [Exception Handling](#exception-handling)
10. [File I/O](#file-io)
11. [Resources](#resources)

## Pengenalan Java

Java adalah bahasa pemrograman berorientasi objek yang populer, versatile, dan aman. Java menggunakan konsep "Write Once, Run Anywhere" (WORA) melalui Java Virtual Machine (JVM).

### Keunggulan Java

- Platform independent - berjalan di semua sistem operasi
- Object-oriented - mendukung konsep OOP
- Aman - memory management otomatis dengan garbage collector
- Robust - penanganan error yang baik
- Scalable - cocok untuk aplikasi besar

## Instalasi dan Setup

### 1. Install JDK (Java Development Kit)

Unduh dari [oracle.com](https://www.oracle.com/java/technologies/downloads/) atau gunakan OpenJDK.

### 2. Set Environment Variable

Tambahkan path JDK ke environment variable `JAVA_HOME` dan tambahkan `%JAVA_HOME%\bin` ke PATH.

### 3. Verifikasi Instalasi

```bash
java -version
javac -version
```

## Konsep Dasar

### Program Java Pertama

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Penjelasan:
- `public class HelloWorld` - deklarasi class
- `main()` - method utama yang dijalankan pertama kali
- `System.out.println()` - perintah untuk mencetak output

## Tipe Data

Java memiliki dua kategori tipe data: primitive dan non-primitive.

### Tipe Data Primitive

| Tipe | Ukuran | Contoh |
|------|--------|---------|
| byte | 1 byte | `byte b = 100;` |
| short | 2 bytes | `short s = 1000;` |
| int | 4 bytes | `int i = 100000;` |
| long | 8 bytes | `long l = 100000L;` |
| float | 4 bytes | `float f = 3.14f;` |
| double | 8 bytes | `double d = 3.14;` |
| boolean | 1 bit | `boolean flag = true;` |
| char | 2 bytes | `char c = 'A';` |

### Tipe Data Non-Primitive

- String: `String nama = "John";`
- Array: `int[] angka = {1, 2, 3};`
- Class dan Object

## Operator

### Operator Aritmatika

```java
int a = 10, b = 3;
System.out.println(a + b);  // 13
System.out.println(a - b);  // 7
System.out.println(a * b);  // 30
System.out.println(a / b);  // 3
System.out.println(a % b);  // 1
```

### Operator Perbandingan

```java
a == b   // sama dengan
a != b   // tidak sama dengan
a > b    // lebih besar dari
a < b    // lebih kecil dari
a >= b   // lebih besar atau sama dengan
a <= b   // lebih kecil atau sama dengan
```

### Operator Logika

```java
a && b   // AND (kedua kondisi harus benar)
a || b   // OR (salah satu kondisi benar)
!a       // NOT (negasi)
```

## Kontrol Alur

### If-Else

```java
int nilai = 80;
if (nilai >= 90) {
    System.out.println("Grade A");
} else if (nilai >= 80) {
    System.out.println("Grade B");
} else if (nilai >= 70) {
    System.out.println("Grade C");
} else {
    System.out.println("Grade D");
}
```

### Switch-Case

```java
int hari = 2;
switch(hari) {
    case 1:
        System.out.println("Senin");
        break;
    case 2:
        System.out.println("Selasa");
        break;
    default:
        System.out.println("Hari lain");
}
```

### Loop - For

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iterasi ke-" + i);
}
```

### Loop - While

```java
int i = 0;
while (i < 5) {
    System.out.println("Iterasi ke-" + i);
    i++;
}
```

### Loop - Do-While

```java
int i = 0;
do {
    System.out.println("Iterasi ke-" + i);
    i++;
} while (i < 5);
```

## Array dan Koleksi

### Array

```java
// Deklarasi dan inisialisasi
int[] angka = {1, 2, 3, 4, 5};
String[] nama = new String[3];

// Mengakses elemen
System.out.println(angka[0]);  // 1

// Iterasi dengan for-each
for (int num : angka) {
    System.out.println(num);
}
```

### ArrayList

```java
import java.util.ArrayList;

ArrayList<String> buah = new ArrayList<>();
buah.add("Apel");
buah.add("Mangga");
buah.add("Jeruk");

System.out.println(buah.get(0));  // Apel
System.out.println(buah.size());   // 3

buah.remove(1);  // Hapus Mangga
```

### HashMap

```java
import java.util.HashMap;

HashMap<String, Integer> umur = new HashMap<>();
umur.put("Ali", 25);
umur.put("Budi", 30);
umur.put("Citra", 28);

System.out.println(umur.get("Ali"));  // 25
```

## Object-Oriented Programming

### Class dan Object

```java
public class Mobil {
    // Atribut
    private String merk;
    private String warna;
    private int tahun;
    
    // Constructor
    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
    
    // Method
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }
    
    // Getter dan Setter
    public String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
}
```

### Penggunaan Class

```java
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Merah", 2020);
        mobil1.tampilkanInfo();
    }
}
```

### Enkapsulasi

Penggunaan access modifiers untuk mengontrol akses ke atribut dan method:
- `public` - dapat diakses dari mana saja
- `private` - hanya dapat diakses dalam class yang sama
- `protected` - dapat diakses dalam package yang sama dan subclass

### Inheritance (Pewarisan)

```java
public class Kendaraan {
    protected String merk;
    
    public void info() {
        System.out.println("Kendaraan merk: " + merk);
    }
}

public class Mobil extends Kendaraan {
    @Override
    public void info() {
        System.out.println("Mobil merk: " + merk);
    }
}
```

### Polymorphism

```java
Kendaraan kendaraan = new Mobil();
kendaraan.info();  // Akan memanggil method dari Mobil
```

### Abstraction

```java
abstract class Hewan {
    abstract void bersuara();
    
    void makan() {
        System.out.println("Hewan sedang makan");
    }
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meong!");
    }
}
```

## Exception Handling

### Try-Catch

```java
try {
    int hasil = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
} finally {
    System.out.println("Blok finally selalu dijalankan");
}
```

### Throw dan Throws

```java
public void prosesNilai(int nilai) throws IllegalArgumentException {
    if (nilai < 0 || nilai > 100) {
        throw new IllegalArgumentException("Nilai harus antara 0-100");
    }
}
```

## File I/O

### Membaca File

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

try {
    File file = new File("data.txt");
    Scanner scanner = new Scanner(file);
    
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
    }
    scanner.close();
} catch (FileNotFoundException e) {
    System.out.println("File tidak ditemukan: " + e.getMessage());
}
```

### Menulis File

```java
import java.io.FileWriter;
import java.io.IOException;

try {
    FileWriter writer = new FileWriter("output.txt");
    writer.write("Hello, World!");
    writer.close();
    System.out.println("File berhasil ditulis");
} catch (IOException e) {
    System.out.println("Error menulis file: " + e.getMessage());
}
```

## Resources

### Buku Referensi

- Head First Java oleh Kathy Sierra dan Bert Bates
- Effective Java oleh Joshua Bloch

### Website Pembelajaran

- [Oracle Java Documentation](https://docs.oracle.com/javase/)
- [W3Schools Java Tutorial](https://www.w3schools.com/java/)
- [GeeksforGeeks Java](https://www.geeksforgeeks.org/java/)

### Platform Online

- Codecademy
- Coursera
- Udemy
- edX

---

