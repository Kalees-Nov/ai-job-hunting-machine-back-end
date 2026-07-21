# 🚀 AI Job Hunting Machine

> An AI-powered Job Hunting Platform built using **Java, Spring Boot, Microservices, Spring Security, JWT, and AI** to simplify the job search process.

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![Spring Security](https://img.shields.io/badge/Security-JWT-blue)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![Docker](https://img.shields.io/badge/Docker-Containerized-2496ED)
![License](https://img.shields.io/badge/License-MIT-green)

---

# 📌 About

AI Job Hunting Machine is an intelligent recruitment platform designed to connect job seekers and recruiters through automation and AI.

The application provides secure authentication, AI-powered resume analysis, job matching, interview preparation, and application tracking while following modern software engineering practices.

This project is also part of my **90-Day Java Full Stack Developer Journey**, where I build one enterprise-level feature every day and document the complete learning process.

---

# ✨ Features

## Authentication

- User Registration
- Secure Login
- JWT Authentication
- Refresh Token
- BCrypt Password Encryption
- Spring Security
- Role-Based Access Control (RBAC)

Roles

- USER
- RECRUITER
- ADMIN

---

## User Module

- User Profile
- Update Profile
- Skills Management
- Experience Management

---

## Resume Module

- Resume Upload
- Resume Download
- Resume Parsing (AI)
- Resume Analysis

---

## Job Module

- Create Job
- Update Job
- Delete Job
- Search Jobs
- Filter Jobs
- Save Jobs

---

## Application Module

- Apply for Job
- Withdraw Application
- Track Application Status

---

## Recruiter Module

- Manage Job Posts
- View Applications
- Shortlist Candidates
- Reject Applications

---

## AI Features

- Resume Analysis
- Skill Gap Analysis
- AI Job Recommendation
- ATS Resume Score
- Resume Improvement Suggestions
- AI Interview Questions
- AI Career Guidance

---

## Admin Module

- Manage Users
- Manage Recruiters
- Manage Jobs
- Assign Roles
- Dashboard Analytics

---

# 🛠 Tech Stack

## Backend

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- Spring Validation
- Spring Cloud

---

## Database

- MySQL

---

## Security

- JWT
- Refresh Token
- BCrypt
- RBAC

---

## DevOps

- Docker
- Git
- GitHub
- GitHub Actions
- CI/CD

---

## Cloud

- AWS EC2
- AWS S3

---

## AI

- OpenAI API
- Resume Parsing
- AI Recommendation Engine

---

# 🏗 Architecture

```text
                Client
                   │
                   ▼
            API Gateway
                   │
        ┌──────────┴──────────┐
        ▼                     ▼
 Authentication         Job Service
 Service                    │
        ▼                    ▼
 User Service        Resume Service
        ▼                    ▼
 AI Service         Notification Service
        │                    │
        └──────────┬──────────┘
                   ▼
                 MySQL
```

---

# 🔐 Authentication Flow

```text
Client
    │
    ▼
Login
    │
    ▼
Authentication Manager
    │
    ▼
UserDetailsService
    │
    ▼
Password Verification
    │
    ▼
Generate JWT
    │
    ▼
Return Access Token
```

---

# 🔄 Request Flow

```text
Client Request
      │
Authorization Header
      │
Bearer JWT
      │
      ▼
Spring Security Filter Chain
      │
      ▼
JWT Authentication Filter
      │
      ▼
Validate JWT
      │
      ▼
Load User
      │
      ▼
Load Roles
      │
      ▼
SecurityContext
      │
      ▼
Controller
      │
      ▼
Business Logic
      │
      ▼
Database
```

---

# 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   ├── config
│   │   ├── controller
│   │   ├── dto
│   │   ├── entity
│   │   ├── exception
│   │   ├── repository
│   │   ├── security
│   │   ├── service
│   │   ├── util
│   │   └── Application.java
│   │
│   └── resources
│       ├── application.yml
│       └── static
│
└── test
```

---

# 🚀 Getting Started

## Clone Repository

```bash
git clone https://github.com/<your-username>/AI-Job-Hunting-Machine.git
```

---

## Navigate

```bash
cd AI-Job-Hunting-Machine
```

---

## Run

```bash
mvn clean install
```

```bash
mvn spring-boot:run
```

---

# 🔑 Environment Variables

```properties
DB_URL=
DB_USERNAME=
DB_PASSWORD=

JWT_SECRET=
JWT_EXPIRATION=

AWS_ACCESS_KEY=
AWS_SECRET_KEY=

OPENAI_API_KEY=
```

---

# 📸 Screenshots

Coming Soon...

- Login
- Dashboard
- Resume Upload
- Job Search
- Recruiter Dashboard

---

# 🛣 Roadmap

## Phase 1

- [x] Spring Boot Setup
- [x] Authentication
- [x] JWT
- [x] RBAC

---

## Phase 2

- [ ] User Module
- [ ] Resume Upload
- [ ] Job Module
- [ ] Recruiter Module

---

## Phase 3

- [ ] AI Resume Analysis
- [ ] AI Job Recommendation
- [ ] AI Interview Preparation

---

## Phase 4

- [ ] Docker
- [ ] Kubernetes
- [ ] AWS Deployment
- [ ] CI/CD

---

# 📚 Learning Journey

This repository is maintained as part of my **90-Day Java Full Stack Developer Challenge**.

Every feature is documented with:

- What I learned
- Problems faced
- Debugging process
- Architecture diagrams
- Interview notes
- Best practices

---

# 🤝 Contributing

Contributions, issues, and feature requests are welcome.

Feel free to fork the repository and submit a Pull Request.

---

# 👨‍💻 Author

## Kaleeswaran Eswaran

Java Full Stack Developer

📧 kaleeswaran0711@gmail.com

💼 LinkedIn

https://www.linkedin.com/in/kaleeswaran-eswaran-software-developer

---

# ⭐ Support

If you found this project useful,

⭐ Star this repository

🍴 Fork it

📢 Share it with other developers

---

## 📜 License

This project is licensed under the MIT License.