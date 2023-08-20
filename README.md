# testing-api

1)Endpoint 1 /albums
link : https://jsonplaceholder.typicode.com/albums

-GET-A-> untuk menampilkan seluruh list album  
URL : https://jsonplaceholder.typicode.com/albums

-GET-B-> untuk menampilkan list albums dengan id:8
URL : https://jsonplaceholder.typicode.com/albums/8

-GET-C-> untuk menampilkan list albums dengan id:10
URL : https://jsonplaceholder.typicode.com/albums/10

-POST-A-> untuk menambahkan data dengan id:101
URL : https://jsonplaceholder.typicode.com/albums

-POST-B-Chaining-> chaining dengan menggunakan id:1
URL : https://jsonplaceholder.typicode.com/albums

-POST-C-> untuk menambahkan data dengan id:101
URL : https://jsonplaceholder.typicode.com/albums

-DELETE-A-> untuk menghapus data dengan id:2
URL : https://jsonplaceholder.typicode.com/albums/2

**Test Case** 
**TestGetA-1** sampai **TestGetA-6** -> menguji apakah response status codenya 200 (OK), memverifikasikan apakah jumlah elemen sudah sesuai, memverifikasikan apakah nilai properti dari elemen sudah sesuai. 

**TestGetB** dan **TestGetC** -> menguji menguji apakah response status codenya 200 (OK), memverifikasikan apakah nilai properti dari elemen sudah sesuai. 

**TestPostA** -> menguji apakah response status codenya 201 (CREATED), memverifikasikan apakah nilai properti dari elemen sudah sesuai.

**TestPostBChaining** -> chaining dengan id:1 dan globalVariable yaitu title.

**TestDeleteA** -> menguji apakah sudah berhasil mendapat respon 200 (OK) yang menandakan data berhasil terhapus.


2)Endpoint 2 /users
link : https://jsonplaceholder.typicode.com/todos

-GET-01-> untuk menampilkan seluruh list todos
URL :https://jsonplaceholder.typicode.com/todos

-GET-02-> untuk menampilkan list todos dengan id:8
URL : https://jsonplaceholder.typicode.com/todos/8

-GET-03-> untuk menampilkan list todos dengan id:10
URL : https://jsonplaceholder.typicode.com/todos/10

-POST-01-> untuk menambahkan data dengan id:201
URL : https://jsonplaceholder.typicode.com/todos

-POST-02-Chaining-> chaining dengan menggunakan id:1
URL : https://jsonplaceholder.typicode.com/todos

-DELETE-01-> untuk menghapus data dengan id:2
URL : https://jsonplaceholder.typicode.com/todos/2

**Test Case** 
**TestGet_01_A** sampai **TestGet_01_F** -> menguji apakah response status codenya 200 (OK), memverifikasikan apakah jumlah elemen sudah sesuai, memverifikasikan apakah nilai properti dari elemen sudah sesuai. 

**TestGet_02** dan **TestGet_03** -> menguji menguji apakah response status codenya 200 (OK), memverifikasikan apakah nilai properti dari elemen sudah sesuai. 

**TestPost_01** -> menguji apakah response status codenya 201 (CREATED), memverifikasikan apakah nilai properti dari elemen sudah sesuai.

**TestPost_02_Chaining** -> chaining dengan id:1 dan globalVariable yaitu title2.

**TestDelete_01** -> menguji apakah sudah berhasil mendapat respon 200 (OK) yang menandakan data berhasil terhapus.
