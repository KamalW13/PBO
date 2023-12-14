> [!NOTE]
> Ini adalah Jawaban dari Tugas Studi Kasus ke - 1

> Link Tugas: [Lihat](https://drive.google.com/drive/folders/1py3hlNHJYTGOSe8k-uWLASP9-VKuIKM-?usp=sharing)

<details>
    <summary>Penjelasan Code</summary>

```java
// Baris 5 - 39
class Persegi extends BangunDatar{
    int sisi;
    
    Persegi(int inputSisi){
        this.sisi = inputSisi;
    }
    
    void luas(){
        int luas = this.sisi * this.sisi;
        System.out.println(luas);
    }
    
    void keliling(){
        int keliling = 4 * this.sisi;
        System.out.println(keliling);
    }
}

class Lingkaran extends BangunDatar{
    int jariJari;
    
    Lingkaran(int inputJariJari){
        this.jariJari = inputJariJari;
    }
    
    void luas(){
        double luas = 3.14 * this.jariJari * this.jariJari;
        System.out.println(luas);
    }
    
    void keliling(){
        double keliling = 3.14 * 2 * this.jariJari;
        System.out.println(keliling);
    }
}
```

Pada kode diatas kita membuat Class "Persegi" dan "Lingkaran" yang masing-masing didalamnya ada variable untuk di proses pada function/method **luas** dan **keliling**.

> code "extends BangunDatar" pada masing-masing class disini artinya **Mendapat Warisan dari class BangunDatar/Bangun Datar menjadi Parentnya**

---

```java
// Baris 1 - 3
class BangunDatar{
    
}
```

ini adalah isi dari class "BangunDatar", tidak ada apa-apa 😅. Sebenarnya tanpa harus ada kode ini pun masih bisa berjalan, cuma karena diberi tugasnya harus ada pewarisan jadi harus ada.


--- 

![gambar](https://i.ibb.co/N76ZQvX/1-3.jpg)

Ini adalah Class Main-nya, dimana ini adalah tempat program akan dijalankan.
Pada baris ke 5 & 6 kita membuat object dan menginisialisasi class Lingkaran dan Persegi.

Lalu pada baris ke 8 - 11 kita menjalankan method/function luas dan keliling dari tiap-tiap class

</details>

