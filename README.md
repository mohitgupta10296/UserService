## 2. User Service
## Overview
The **User Service** manages user accounts (parents, guardians, staff) in the school system. It provides CRUD operations and REST endpoints.

It includes a **DataInitializer** to add dummy users at startup.

---

**Purpose:** Manages student information.

**Responsibilities:** CRUD operations for student records.
Provides student details to other services via REST APIs.

**Benefit:** Separates student management from fee processing, enabling independent updates or scaling of student data.
**File:** `README_UserService.md`

---

## API Endpoints

- `GET /api/users` : Get all users
- `GET /api/users/{id}` : Get user by ID
- `POST /api/users` : Add new user
- `DELETE /api/users/{id}` : Delete user

---

## POSTMAN 
End-Points are added in single project that is in Fee-Collection Service.

---

## Author
Mohit Gupta
```
