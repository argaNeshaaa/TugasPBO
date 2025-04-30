# Program Investasi Saham

Selamat datang di Tugas 1 Pemrograman Berbasis Objek. Ini adalah Tugas Pembuatan Program Investasi Saham Sederhana Berbasis Command Line. 

Program ini dibuat untuk mendukung dua kategori pengguna dengan perbedaan akses yang didapatkan tiap penggunanya.

1. Admin, dapat mengakses bagian Saham, SBN, dan fitur Logout. 
    - Pada Saham, admin dapat mengakses fitur menambahkan saham, mengubah harga saham, dan kembali. 
    - Pada SBN, admin dapat mengakses fitur menambahkan SBN dan kembali.

2. Customer, dapat mengakses fitur Beli Saham, Jual Saham, Beli SBN, Simulasi SBN, Portofolio, Logout.

# Identitas Kelompok

1. Anak Agung Istri Mas Gayatri Dewi (2405551016)
2. Arga Nesha Guntara Waruwu (2405551115)

# UML Program Investasi Saham
Berikut merupakan UML Program Investasi Sederhana Saham SBN:

![Diagram-UML](https://github.com/argaNeshaaa/TugasPBO/blob/main/UML%20Program%20Investasi.png?raw=true0)

# Dokumentasi Program
Program ini dijalankan melalui file Main.java. Berikut merupakan user datanya.

username: admin, password: 12345

username: user1, password: abcde

## Login Melalui Sisi Admin
Login menggunakan username: admin, password: 12345


## Hak Akses Admin
Ketika berhasil login, maka program akan menampilkan pilihan untuk admin berupa saham, sbn, dan logout.


## List Saham
Ketika memilih menu saham, maka tampilan program akan membawa admin pada halaman list saham.



## Tampilan Saham BBCA
Ketika membuka salah satu jenis saham, maka akan ada opsi untuk mengubah harga dan kembali untuk ke menu sebelumnya.


## Mengubah Harga Saham
Ketika memilih menu ubah harga saham, maka admin mendapatkan akses untuk mengubah harga saham yang tertera dalam program investasi sederhana ini.

## Berhasil Mengubah Harga Saham
Ketika sudah menambahkan harga saham yang baru, maka program akan menampilkan pesan seperti pada gambar.


## Menambah Saham
Ketika admin memilih opsi tambah saham, maka program akan mengarahkan user untuk mengisi semua data saham yang akan ditambahkan.


## Tampilan Setelah Menambahkan Saham
Ketika sudah mengisi semua data yang diminta, maka saham yang ditambahkan akan tertampil pada menu list saham.

## List SBN
Ketika admin memilih SBN, maka program akan menampilkan List SBN.

## Tampilan SBN ORI020
Ketika membuka salah satu jenis SBN, maka akan ada opsi kembali untuk ke menu sebelumnya.

## Tambah SBN
Ketika admin memilih menut tambah SBN, maka admin akan diminta untuk mengisi data SBN yang akan ditambahkan oleh program ini.

## SBN Berhasil Ditambahkan
Ketika SBN berhasil ditambahkan, maka data SBN yang sebelumnya ditambahkan akan tertampil pada List SBN.

## Login Melalui Sisi Customer
Login menggunakan username: user1, password: abcde

## Hak Akses Customer
Ketika berhasil login, customer akan dapat mengakses Saham, SBN, Portofolio, serta Logout.

## List Saham
Ketika memilih menu saham, maka akan menampilkan list saham kembali dan user akan diminta untuk memilih jenis saham yang akan dipilih.

## Jual Beli Saham
Ketika sudah memilih salah satu jenis saham, customer akan diberikan pilihan menu yaitu membeli saham, menjual saham, serta fitur kembali.

## Beli Saham
Ketika memilih menu beli saham, customer akan diminta untuk mengisi jumlah lot yang hendak dibeli.

## Berhasil Beli Saham
Ketika customer berhasil membeli saham, program akan menampilkan pesan seperti pada gambar dan jumlah lot yang dimiliki customer akan muncul disana.

## Jual Saham
Ketika memilih menu jual saham, customer akan diminta untuk mengisi jumlah lot yang hendak dijual.

## Berhasil Jual Saham
Ketika customer berhasil menjual saham, program akan menampilkan pesan seperti pada gambar dan jumlah lot yang dimiliki customer akan muncul disana.

## List SBN
Ketika memilih menu SBN, maka akan menampilkan list SBN kembali dan user akan diminta untuk memilih jenis SBN yang akan dipilih.

## Pembelian SBN
Ketika sudah memilih salah satu jenis SBN, customer akan diberikan pilihan menu yaitu membeli SBN, serta fitur kembali.

## Beli SBN
Ketika memilih menu beli SBN, customer akan diminta untuk mengisi nominal yang hendak dibeli.

## Berhasil Beli SBN
Ketika customer berhasil membeli SBN, program akan menampilkan pesan seperti pada gambar dan total SBN yang dimiliki customer akan muncul disana.

## Portofolio
Ketika customer memilih portofolio, maka akan ada menu pilihan saham, SBN, serta kembali.

## Portofolio Saham
Ketika memilih menu saham, maka akan menampilkan saham yang dimiliki oleh customer.

## Portofolio BBCA
Ketika memilih salah satu jenis sahamnya, mka akan ditampilkan portofolio namun hanya jenis saham yang dipilih.

## Protofolio SBN
Ketika memilih menu SBN, maka akan menampilkan SBN yang dimiliki oleh customer.

## Portofolio SR013
Ketika memilih salah satu jenis SBN, mka akan ditampilkan portofolio namun hanya jenis SBN yang dipilih.

## Logout
Ketika memilih Logout, maka program akan menampilkan pesan Logout Berhasil dan program akan berhenti.
