# SysVentas — Tienda de zapatillas Jhon

Esta versión adapta directamente la plantilla POO2026-2-G4-dev-Sesion07 proporcionada por el usuario.

## Abrir sin escribir en la terminal

1. Descomprime el ZIP completo.
2. Entra a la carpeta SysVentas.
3. Haz doble clic en ABRIR-TIENDA.bat (Windows).
4. Espera la descarga de Maven y JavaFX en el primer inicio.

Necesitas JDK 17 o 21 disponible mediante JAVA_HOME o PATH, e Internet para descargar dependencias.

## Abrir en IntelliJ

1. File > Open y selecciona la carpeta SysVentas, donde se encuentra pom.xml.
2. Selecciona JDK 17 o 21 como SDK del proyecto y espera la carga de Maven.
3. En la ventana Maven, abre Plugins > javafx > javafx:run y haz doble clic.
4. Alternativa en la terminal de Windows: `.\mvnw.cmd clean javafx:run`.

## Qué se conserva del archivo original

- Nombre del proyecto SysVentas y paquete pe.edu.upeu.sysventas.
- App.java y SysVentas.java como puntos de inicio.
- MainguiController y ProductoController.
- Las carpetas components, config, controller, dto, enums, exception, model, repository, service y service/impl.
- AppContext, interfaces de servicios, repositorios en memoria y TableViewHelper con iconos para editar y eliminar.
- Las vistas view/maingui.fxml y view/main_producto.fxml.
- La disposición principal: menú superior, pestaña de administración, formulario a la izquierda y tabla a la derecha.
- Los campos de precio, precio anterior, utilidad, stock, stock anterior, marca, categoría y unidad.

## Qué se adapta

- Marcas: Nike, Adidas, Jordan, Puma y New Atletic.
- Sesenta y cinco registros de ejemplo: por cada marca, Hombre del 38 al 43 y Mujer del 34 al 40.
- Modelo, público y talla tienen campos separados. Elige Mujer para habilitar 34 a 40; Hombre habilita 38 a 43. La talla también aparece en su propia columna.
- Menú Marcas para filtrar y búsqueda por modelo, talla, marca o público (Hombre / Mujer).
- Guardar crea o actualiza; Cancelar / Nuevo limpia el formulario.
- Iconos de la tabla para editar y eliminar, con confirmación antes de borrar.
- Validaciones de números, precio positivo y stock entero no negativo.
- Se corrigió la recarga automática de ejemplos después de eliminar el último registro.
- Constructores y getters/setters explícitos para facilitar la lectura, sin depender de Lombok.
- JavaFX y FXML son las únicas dependencias externas necesarias.

Los modelos adicionales de la plantilla se conservan como referencia de estructura; no todos tienen pantallas. Esta versión implementa la administración de zapatillas como el módulo de productos del archivo original. No incluye una pantalla de cobro o carrito.

## Uso rápido

1. Abre Marcas > Nike para ver sus zapatillas.
2. Usa Buscar para filtrar, por ejemplo Talla 40.
3. Completa el formulario y selecciona marca, categoría y unidad. Usa Par para controlar existencias por pares.
4. Pulsa Guardar. Al guardar se muestran todas las marcas para que puedas ver el registro nuevo.
5. Para editar, pulsa el icono de edición de una fila, cambia datos y pulsa Guardar.
6. Para borrar, pulsa el icono de eliminación y confirma.

Precios y nombres de modelo son ficticios. Los importes se expresan en soles. Precio anterior, utilidad y stock anterior pueden dejarse en cero. El proyecto conserva el tipo Double del modelo original para estos campos.

## Datos y verificación

Como la plantilla, utiliza listas en memoria: no necesita base de datos y reinicia los datos al cerrar. Se avisa antes de salir.

Se compilaron con Java 17 los modelos, DTO, enumeraciones, repositorios, servicios y excepciones. Se verificaron los 65 productos, las cinco marcas y los rangos de tallas por público y las operaciones de registro, edición y eliminación, incluida la eliminación de todos los registros. Se revisaron XML y enlaces de acciones FXML.

No se pudo ejecutar la interfaz JavaFX ni compilar el proyecto completo en el entorno de preparación, debido a que no dispone de las dependencias y no puede descargarlas de Maven Central. La prueba de apertura debe realizarse en tu equipo.

## Actualización visual y tallas

- Campo Público: Hombre o Mujer.
- Selector de Talla con opciones automáticas según el público.
- Columnas Público y Talla en la tabla; se conservan al guardar y editar.
- Fondo fotográfico de zapatillas incluido en `src/main/resources/img/fondo_zapatillas.png`, generado con IA para esta aplicación.
- Menús Archivo azul, Marcas morado, Editar verde y Ayuda naranja.
- Botones Guardar, Cancelar / Nuevo y Buscar con colores distintos.
- Se conserva el formulario a la izquierda y la tabla a la derecha de la plantilla.
- El archivo ABRIR-TIENDA.bat detecta primero el JDK `ms-21.0.12` de la carpeta `.jdks` de tu usuario, como el que mostraste en tu captura. Si no existe, usa JAVA_HOME.

Descomprime esta versión en una carpeta nueva y abre su carpeta SysVentas en IntelliJ para evitar mezclarla con la versión anterior.
