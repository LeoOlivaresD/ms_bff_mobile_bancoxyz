# 🏦 Proyecto Banco XYZ - Microservicios y BFFs

Este repositorio forma parte de una arquitectura distribuida compuesta por microservicios y BFFs que interactúan con una base de datos MySQL en contenedor Docker. Los BFFs están protegidos con HTTPS y Spring Security.

---

### ✅ `bff_mobile_bancoxyz`

```markdown
# 📁 ms_bff_mobile_bancoxyz

**Descripción:**  
BFF optimizado para clientes móviles. Expone respuestas ligeras y seguras, conectándose a los microservicios con DTOs filtrados.

**Tecnologías:**  
- Java 17 + Spring Boot  
- Spring Security  
- HTTPS (keystore.p12)  
- Maven
- OpenFeing

**Seguridad:**  
- Autenticación HTTP Basic  
- Certificado HTTPS

**Configuración rápida:**
```bash
git clone https://github.com/LeoOlivaresD/ms_bff_mobile_bancoxyz.git
mvn spring-boot:run
