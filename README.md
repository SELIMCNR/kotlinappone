📱 Kotlin Mobil Uygulama   -tr
Bu proje, Kotlin kullanılarak geliştirilmiş, ancak görsel arayüz içermeyen bir mobil uygulamadır. Uygulama, temel sınıf, constructor ve nullability kavramlarını içeren kodlarla oluşturulmuştur.
🚀 Özellikler
- Sınıflar (class) ve constructor kullanılarak nesne yönelimli programlama teknikleri uygulanmıştır.
- Nullability kullanılarak hata yönetimi ve güvenli veri işlemleri gerçekleştirilmiştir.
- Unit ve Int veri türleri ile fonksiyonların nasıl çalıştığı gösterilmektedir.
- Elvis operatörü (?:) ve let fonksiyonu ile null güvenliği sağlanmaktadır.
- Matematiksel işlemler ve fonksiyon kullanımı örneklenmiştir.
🔧 Kurulum
- Projeyi klonlayın:
git clone https://github.com/kullanıcı_adı/proje_adı.git
- 
- Android Studio ile açın ve MainActivity.kt dosyasını inceleyin.
- Uygulamayı çalıştırın:
- Emülatör veya fiziksel cihazda çalıştırabilirsiniz.
🏗️ Kullanılan Teknolojiler
- Dil: Kotlin
- IDE: Android Studio
- Mobil Platform: Android (tasarım içermeyen)
📂 Dosya Yapısı
/proje_adı
│── /app
│    ├── /src/main/java/com/example/kotlinappone
│    │   ├── MainActivity.kt
│    │   ├── eskiClass.kt
│    │   ├── yeniClass.kt
│    │   ├── constructorClass.kt
│    │   ├── newConstructorClass.kt
│    │   ├── sehirConstructor.kt
│    │   ├── newConsClass.kt
│    ├── /src/main/res
│── README.md
│── build.gradle

📝 Örnek Kod
class User(val name: String, val age: Int?) {
    fun printInfo() {
        println("Kullanıcı adı: $name, Yaş: ${age ?: "Bilinmiyor"}")
    }
}

fun main() {
    val user1 = User("Selim", null)
    user1.printInfo()
}


📌 Proje İçeriği
🔹 Sınıf Tanımlamaları
Proje içinde eskiClass, yeniClass, constructorClass, newConstructorClass gibi farklı sınıflar yer almaktadır. Sınıfların temel özellikleri aşağıda belirtilmiştir:
- eskiClass: Şehir bilgilerini saklar.
- yeniClass: Kullanıcı bilgilerini (yaş, meslek, isim) yönetir.
- constructorClass: Kullanıcı bilgilerini constructor ile başlatır.
- newConstructorClass: Ekstra özel
- newConstructorClass: Ekstra özellikler içeren constructor yapısı kullanır.
- sehirConstructor: Şehir, ilçe ve mahalle verilerini saklayan bir constructor sınıfıdır.
- newConsClass: Oyuncu skorlarını yönetir ve günceller.
🔹 Fonksiyonlar ve İşlevleri
Kodda birinciFonksiyon ve ikinciFonksiyon gibi sayaç işlemleri yapan metodlar bulunmaktadır. Ayrıca:
- cikarma ve toplama fonksiyonları, veri işlemlerini yönetmektedir.
- Unit ve Int veri türleri ile fonksiyon dönüş değerleri gösterilmektedir.
- Nullability ile kullanıcı girdisi kontrol edilmektedir.
- Elvis operatörü (?:) ile varsayılan değerler atanmaktadır.
- let fonksiyonu ile güvenli işlem sağlanmaktadır.
📌 Katkıda Bulunma
- Fork alarak geliştirmeler yapabilirsiniz.
- Pull Request açarak önerilerinizi paylaşabilirsiniz.

📱 Kotlin Mobile Application   -en
This project is a mobile application developed using Kotlin, but does not include a visual interface. The application is created with codes that include the concepts of base class, constructor and nullability.

🚀 Features
- Object-oriented programming techniques are implemented using classes (class) and constructor.
- Error management and safe data operations are performed using nullability.
- It shows how functions work with Unit and Int data types.
- Null safety is provided with Elvis operator (?:) and let function.
- Mathematical operations and function usage are exemplified.

🔧 Installation
- Clone the project:
git clone https://github.com/user_name/project_name.git
-
- Open with Android Studio and examine the MainActivity.kt file.
- Run the application:
- You can run it on an emulator or physical device.
🏗️ Technologies Used
- Language: Kotlin
- IDE: Android Studio
- Mobile Platform: Android (non-design)
📂 File Structure
/project_name
│── /app
│ ├── /src/main/java/com/example/kotlinappone
│ │ ├── MainActivity.kt
│ │ ├── eskiClass.kt
│ │ ├── yeniClass.kt
│ │ ├── constructorClass.kt
│ │ ├── newConstructorClass.kt
│ │ ├── sehirConstructor.kt
│ │ ├── newConsClass.kt
│ ├── /src/main/res
│── README.md
│── build.gradle

📝 Sample Code
class User(val name: String, val age: Int?) {
fun printInfo() {
println("User name: $name, Age: ${age ?: "Unknown"}")
}
}

fun main() {
val user1 = User("Selim", null)
user1.printInfo()
}

📌 Project Content
🔹 Class Definitions
There are different classes such as eskiClass, yeniClass, constructorClass, newConstructorClass in the project. The basic features of the classes are as follows:
- eskiClass: Stores city information.
- yeniClass: Manages user information (age, profession, name).
- constructorClass: Initializes user information with constructor.
- newConstructorClass: Extra special
- newConstructorClass: Uses constructor structure with extra features.
- cityConstructor: A constructor class that stores city, district and neighborhood data.
- newConsClass: Manages and updates player scores.
🔹 Functions and Functions
There are methods that perform counter operations such as firstFunction and secondFunction in the code. In addition:
- Subtraction and addition functions manage data operations.
- Function return values ​​are shown with Unit and Int data types.
- User input is checked with Nullability.
- Default values ​​are assigned with Elvis operator (?:).
- Safe operation is provided with let function.
📌 Contribution
- You can make improvements by taking a fork.
- You can share your suggestions by opening a Pull Request.


