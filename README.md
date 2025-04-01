# MediSync-backend 

Backend systemu **MediSync** to rozbudowany moduł zarządzania danymi medycznymi System umożliwia zarządzanie pacjentami, użytkownikami, rolami, salami operacyjnymi, zasobami, oceną przedoperacyjną oraz operacjami medycznymi.

## Spis treści

- [Funkcjonalności](#funkcjonalności)
- [Technologie i wersje](#technologie-i-wersje)
- [Instalacja i konfiguracja](#instalacja-i-konfiguracja)
- [Struktura projektu](#struktura-projektu)
- [Dokumentacja API](#dokumentacja-api)
- [Bezpieczeństwo](#bezpieczeństwo)
- [Uruchomienie projektu](#uruchomienie-projektu)

## Funkcjonalności

- **Pacjenci**: CRUD pacjentów
- **Użytkownicy i role**: rejestracja użytkowników, zarządzanie rolami
- **Ocena przedoperacyjna i operacje**: przypisanie lekarzy i pielęgniarek do pacjentów
- **Inwentarz i sale operacyjne**: monitoring zasobów i stanów sal

## Technologie i wersje

- Java 22
- Spring Boot 3.3.0
- Spring Security + JWT (jjwt 0.9.1)
- Spring Data JPA (Hibernate)
- PostgreSQL (port 5433)
- Lombok, ModelMapper
- Springdoc OpenAPI
- Maven

## Instalacja i konfiguracja

1. **Wymagania**:
    - Java 22
    - Maven
    - PostgreSQL

2. **Konfiguracja**:
    - `src/main/resources/application.properties`
    - `application-local.yml` (środowiskowe rozszerzenia)

3. **Inicjalizacja danych**:
    - Plik `data.sql` zawiera dane użytkowników, ról, pacjentów, sal, zasobów itd.

## Struktura projektu

```
src/
 └── main/
     ├── java/io/medsys/opteamer/
     │   ├── model/              # Encje
     │   ├── dto/                # DTO
     │   ├── repository/         # Repozytoria
     │   ├── service/            # Serwisy
     │   ├── rest/               # Kontrolery REST
     │   └── config/             # Konfiguracje (Security, JWT)
     └── resources/
         ├── application.properties
         ├── application-local.yml
         └── data.sql
```

## Dokumentacja API

- **Swagger UI**: `http://localhost:8080/swagger-ui/index.html`
![image](https://github.com/user-attachments/assets/6901c1fc-5d65-428f-8057-12773d647080)
![image](https://github.com/user-attachments/assets/5c1ba4d0-3dd0-439a-b278-91b4c52d84c1)
![image](https://github.com/user-attachments/assets/0a1734ca-04b2-4287-8dcc-badb51e90e8d)


## Bezpieczeństwo

- JWT do autoryzacji
- Spring Security
- Role i uprawnienia oparte na ENUM
- Globalna konfiguracja CORS
- Filtrowanie żądań poprzez `JwtRequestFilter`


## Uruchomienie projektu

```bash
git clone https://github.com/radson29/medisync-backend.git
cd medisync-backend
mvn clean install
mvn spring-boot:run
```

Domyślnie dostępne pod `http://localhost:8080`.

---

Dla pełnej funkcjonalności rekomendowane jest połączenie z frontendem [MediSync Frontend (Angular)].

