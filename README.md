
---

# 📱 Kotlin Mobil Uygulama -tr

Bu proje, **Kotlin** kullanılarak geliştirilmiş, ancak görsel arayüz içermeyen bir **mobil uygulamadır**. Uygulama, temel **sınıf**, **constructor** ve **nullability** kavramlarını içeren kodlarla oluşturulmuştur.

## 🚀 Özellikler

- **Sınıflar** (`class`) ve **constructor** kullanılarak nesne yönelimli programlama teknikleri uygulanmıştır.
- **Nullability** kullanılarak hata yönetimi ve güvenli veri işlemleri gerçekleştirilmiştir.
- **Unit ve Int veri türleri** ile fonksiyonların nasıl çalıştığı gösterilmektedir.
- **Elvis operatörü (`?:`)** ve **`let` fonksiyonu** ile null güvenliği sağlanmaktadır.
- **Matematiksel işlemler ve fonksiyon kullanımı** örneklenmiştir.

## 🔧 Kurulum 

1. **Projeyi klonlayın**:
   ```bash
   git clone https://github.com/kullanıcı_adı/proje_adı.git
   ```

2. **Android Studio ile açın** ve `MainActivity.kt` dosyasını inceleyin.

3. **Uygulamayı çalıştırın**:
   - Emülatör veya fiziksel cihazda çalıştırabilirsiniz.

## 🏗️ Kullanılan Teknolojiler

- **Dil:** Kotlin
- **IDE:** Android Studio
- **Mobil Platform:** Android (tasarım içermeyen)

## 📂 Dosya Yapısı

```
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
```

## 📝 Örnek Kod

```kotlin
class User(val name: String, val age: Int?) {
    fun printInfo() {
        println("Kullanıcı adı: $name, Yaş: ${age ?: "Bilinmiyor"}")
    }
}

fun main() {
    val user1 = User("Selim", null)
    user1.printInfo()
}
```

## 📌 Proje İçeriği

### 🔹 **Sınıf Tanımlamaları**
Proje içinde **eskiClass**, **yeniClass**, **constructorClass**, **newConstructorClass** gibi farklı sınıflar yer almaktadır. Sınıfların temel özellikleri aşağıda belirtilmiştir:

- **eskiClass**: Şehir bilgilerini saklar.
- **yeniClass**: Kullanıcı bilgilerini (yaş, meslek, isim) yönetir.
- **constructorClass**: Kullanıcı bilgilerini **constructor** ile başlatır.
- **newConstructorClass**: Ekstra özellikler içeren constructor yapısı kullanır.
- **sehirConstructor**: Şehir, ilçe ve mahalle verilerini saklayan bir constructor sınıfıdır.
- **newConsClass**: Oyuncu skorlarını yönetir ve günceller.

### 🔹 **Fonksiyonlar ve İşlevleri**
Kodda **birinciFonksiyon** ve **ikinciFonksiyon** gibi sayaç işlemleri yapan metodlar bulunmaktadır. Ayrıca:

- **cikarma** ve **toplama** fonksiyonları, veri işlemlerini yönetmektedir.
- **Unit ve Int veri türleri** ile fonksiyon dönüş değerleri gösterilmektedir.
- **Nullability** ile kullanıcı girdisi kontrol edilmektedir.
- **Elvis operatörü** (`?:`) ile varsayılan değerler atanmaktadır.
- **`let` fonksiyonu** ile güvenli işlem sağlanmaktadır.

## 📌 Katkıda Bulunma

- **Fork** alarak geliştirmeler yapabilirsiniz.
- `Pull Request` açarak önerilerinizi paylaşabilirsiniz.


---

# 📱 Kotlin Mobile Application  -eng

This project is a **mobile application** developed using **Kotlin**, but does not include a visual interface. The application is created with codes that include the basic **class**, **constructor** and **nullability** concepts.

## 🚀 Features

- Object-oriented programming techniques are implemented using **classes** (`class`) and **constructor**.
- Error management and safe data operations are implemented using **Nullability**.
- How functions work with **Unit and Int data types** are shown.
- Null safety is provided with **Elvis operator (`?:`)** and **`let` function**.
- **Mathematical operations and function usage** are illustrated.

## 🔧 Installation

1. **Clone the project**:
```bash
git clone https://github.com/user_name/project_name.git
```

2. **Open with Android Studio** and examine the `MainActivity.kt` file.

3. **Run the application**:
- You can run it on an emulator or a physical device.

## 🏗️ Technologies Used

- **Language:** Kotlin
- **IDE:** Android Studio
- **Mobile Platform:** Android (non-design)

## 📂 File Structure

```
/project_name
│── /app
│ ├── /src/main/java/com/example/kotlinappone
│ │ ├── MainActivity.kt
│ │ ├── oldClass.kt
│ │ ├── newClass.kt
│ │ ├── constructorClass.kt
│ │ ├── newConstructorClass.kt
│ │ ├── sehirConstructor.kt
│ │ ├── newConsClass.kt
│ ├── /src/main/res
│── README.md
│── build.gradle
```

## 📝 Sample Code

```kotlin
class User(val name: String, val age: Int?) {
fun printInfo() {
println("User name: $name, Age: ${age ?: "Unknown"}")
}
}

fun main() {
val user1 = User("Selim", null)
user1.printInfo()
}
```

## 📌 Project Content

### 🔹 **Class Definitions**
In the project **eskiClass**, There are different classes such as **newClass**, **constructorClass**, **newConstructorClass**. The basic features of the classes are as follows:

- **oldClass**: Stores city information.
- **newClass**: Manages user information (age, profession, name).
- **constructorClass**: Initializes user information with **constructor**.
- **newConstructorClass**: Uses a constructor structure with extra features.
- **cityConstructor**: A constructor class that stores city, district and neighborhood data.
- **newConsClass**: Manages and updates player scores.

### 🔹 **Functions and Their Functions**
There are methods in the code that perform counter operations such as **firstFunction** and **secondFunction**. In addition:

- **subtraction** and **addition** functions manage data operations.
- **Unit and Int data types** are used to show function return values.

- **Nullability** is used to check user input.

- **Elvis operator** (`?:`) is used to assign default values.

- **`let` function** provides secure operation.

## 📌 Contribution

- You can make improvements by getting a **Fork**.

- You can share your suggestions by opening a `Pull Request`.

---
