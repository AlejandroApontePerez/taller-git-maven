# Taller Git y GitHub Maven

* **Autor:** Alejandro Aponte Pérez
* **Propósito:** Práctica guiada de control de versiones con Git y GitHub.
* **Requisitos:** JDK 17 y Maven.

## Compilación y Ejecución
- Compilar: `mvn clean package`
- Ejecutar: Ejecutar clase `Main.java` desde IntelliJ.
 ## Aprendizajes
 Taller git
## comandos usados
## Comandos Git Practicados

* `git config`: Configuración global del nombre, correo del usuario y rama predeterminada.
* `git init`: Inicialización del repositorio Git local en la raíz del proyecto.
* `git status`: Verificación del estado actual de los archivos y del área de staging.
* `git add <archivo>`: Preparación de archivos para ser incluidos en el staging area.
* `git commit -m "mensaje"`: Confirmación y registro de los cambios en el historial local.
* `git diff`: Visualización de las diferencias del código antes de pasarlo a staging.
* `git switch -c <nombre-rama>`: Creación y cambio a una nueva rama de trabajo.
* `git switch <rama>`: Cambio entre ramas existentes.
* `git merge <rama>`: Fusión de los cambios de una rama secundaria dentro de la rama actual.
* `git branch -d <rama>`: Eliminación de una rama de trabajo integrada.
* `git log --oneline --graph --decorate --all`: Visualización del historial completo de commits de forma gráfica y resumida.
* `git remote add origin <URL>`: Vinculación del repositorio local con el repositorio remoto en GitHub.
* `git push -u origin main`: Subida inicial de commits de la rama local al repositorio remoto.
* `git pull origin main`: Descarga e integración de los cambios del repositorio remoto al local.
* `git clone <URL>`: Clonación completa de un repositorio remoto en una nueva ubicación local.
