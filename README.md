# 🔥 Proyecto Android con Kotlin + Firebase Authentication

Este proyecto tiene como objetivo enseñar cómo **crear cuentas de usuario en Firebase Authentication** usando **Kotlin** y **Android Studio**.

---

## 🚀 Objetivo

Aprender paso a paso cómo conectar una aplicación Android con Firebase y registrar usuarios mediante **correo electrónico y contraseña**.

---

## 🧩 Requisitos previos

Antes de comenzar, asegúrate de tener:

- ✅ [Android Studio](https://developer.android.com/studio)
- ✅ Una cuenta en [Firebase](https://firebase.google.com/)
- ✅ Un emulador o dispositivo Android

---

## ⚙️ Configuración paso a paso

1. Entra a (https://firebase.google.com/?hl=es-419)
2. Crea un nuevo proyecto (por ejemplo, RegistroFirebaseKotlin)
3. Haz clic en Agregar aplicación → selecciona Android.
4. Copia el nombre del paquete de tu app (lo puedes ver en AndroidManifest.xml)
5. Descarga el archivo google-services.json.
6. Colócalo dentro de la carpeta (app/)
7. Agregar dependencias de Firebase (build.gradle (Project))
8. Luego abre build.gradle (Module: app)
9. Habilitar autenticación en Firebase:
   1. En tu consola de Firebase, ve a Authentication
   2. En la pestaña Método de inicio de sesión, habilita Correo electrónico y contraseña.

 
### 1️⃣ Clonar el proyecto

Abre una terminal y ejecuta:

```bash
git clone https://github.com/EduVale581/loginkotlin.git
