# RecursoPersonaRestfull

Servicio Web RESTful (JAX-RS / Jersey) para gestión de personas

## Requisitos

- JDK 26
- Maven 3.8+
- Apache Tomcat 10.x (compatible con Jakarta EE 6.0 / `jakarta.servlet`)

## Ejecutar en Eclipse

1. `File → Import → Maven → Existing Maven Projects` y selecciona la carpeta del proyecto.
2. Configura un servidor Tomcat 10 en la pestaña **Servers** (`Window → Show View → Servers` si no la ves).
3. Clic derecho sobre el proyecto → `Run As → Run on Server`, eligiendo el Tomcat configurado.
4. Espera a que despliegue el WAR.

## Ejecutar en IntelliJ IDEA

1. `File → Open` y selecciona la carpeta del proyecto (IntelliJ detecta el `pom.xml` automáticamente).
2. Instala el plugin **Smart Tomcat** (`Settings → Plugins → Marketplace → Smart Tomcat`) si no lo tienes.
3. Ve a `Run → Edit Configurations → + → Smart Tomcat`.
4. Configura:
   - **Tomcat server**: Apache Tomcat **10.1.x** (`Configure...` para agregarla si es la primera vez).
   - **Deployment directory**: `src/main/webapp`
   - **Use classpath of module**: `RecursoPersonaRestfull`
   - **Context path**: `/RecursoPersonaRestfull`
   - **Server port**: `8080`
5. Ejecuta la configuración (▶). Smart Tomcat despliega el proyecto "exploded", sin necesidad de generar el WAR manualmente.

## Probar el servicio

Con el servidor corriendo, el recurso queda disponible en:

```
http://localhost:8080/RecursoPersonaRestfull/api/personas
```
