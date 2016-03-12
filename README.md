# Plan-Alimenticio
Sistema experto para dietas

## Proceso de producción usando control de versiones
1. Se detecta una característica o componente a desarrollar en la aplicación.
2. El programador deberá crear una branch a partir de master. Comandos:
	* `git branch --list` (para verificar que efectivamente este en la branch *master).
	* `git checkout -b ` + nombre de la branch (para crear la branch y trabajar en ella).
3. Los cambios realizados deberán ser guardados primeramente en commits locales. Comandos:
	* `git status` (para ver los archivos que han sido modificados).
	* `git add` + nombre del archivo, la carpeta o --all (para preparar los cambios a guardar en el siguiente commit).
	* `git commit -m "Descripcion del commit"` (para crear el commit con un mensaje descriptivo).
4. Los commits guardados localmente se deben subir a la branch remota. Comandos:
	* `git push origin` + nombre de la branch (para subir los commits al repositorio).
5. Para pasar los cambios de la branch actual a master, se debe crear un `pull request` desde [Github](https://github.com). Se debe escribir la descripción de las características que se unirán al proyecto, para que el resto del equipo de desarrollo pueda hacer comentarios respecto al código desarrollado.
6. Después de realizar las correcciones pertinentes y que el equipo de desarrollo esté conforme con el resultado en la branch, se aprueba el `pull request`. Si Github detecta conflicto, se deben solucionar antes de hacer merge a master

## Características especiales

* Java JDK 1.8
* Netbeans IDE 8.1

# Instrucciones de Ejecucion
## Inicializacion de Base de Datos (phpmyadmin)
1. Arrancar phpmyadmin.
2. Dar click en 'Importar'.
3. Seleccionar archivo DB/script.sql y dar click en cargar.
4. Enjoy!!
