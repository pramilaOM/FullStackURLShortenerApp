
# Linklytics: Full-Stack URL Shortener App 🚀🔗✨

A production-ready full-stack application that allows users to shorten long URLs, monitor click analytics, and manage their personalized links using a responsive interface. 🧠💡💻

---

## ✨ Live Demo 🚀🌍🔧
* **Site**: https://graceful-pithivier-bee131.netlify.app/
* **Frontend**: [https://graceful-pithivier-bee131.netlify.app](https://graceful-pithivier-bee131.netlify.app)
* **Backend API**: [https://url-shortener-sb-5mgd.onrender.com](https://url-shortener-sb-5mgd.onrender.com)

---

## 📄 Project Overview 💼📚🧩

This project is split into two major components: 🎯🛠️🚧

### 1. **Frontend**

* **Framework**: React.js (Vite setup)
* **Styling**: Tailwind CSS
* **Routing**: React Router
* **Animations**: Framer Motion
* **State Management**: React Context API

### 2. **Backend**

* **Framework**: Spring Boot (Java)
* **Authentication**: JWT-based auth (Spring Security)
* **Database**: PostgreSQL hosted on [Neon.tech](https://console.neon.tech/)
* **ORM**: Spring Data JPA
* **Hosting**: Docker image deployed via Render

---

## 🚀 Features 🔐⚡📊

* User registration and login
* JWT token-based secured endpoints
* URL shortening with analytics
* Dashboard to manage links (copy, track clicks, delete)
* Click analytics displayed as bar chart
* Dockerized backend with CI/CD-ready setup

---

## 🧱 Project Structure 🏗️📁🧭

```
url-shortener-project
├── client/                 # React frontend
│   ├── public/
│   └── src/
│       ├── components/     # UI Components
│       ├── pages/          # Views
│       ├── services/       # Axios-based API calls
│       ├── contextApi/     # Global store
│       └── App.jsx         # Routing entry
├── server/                 # Spring Boot backend
│   ├── src/main/java/      # Application code
│   ├── Dockerfile
│   └── application.properties
```

---

## ⚙️ Environment Setup 🧪🛠️🔍

### 1. **Frontend Configuration**

Create a `.env` file inside the `client` folder:

```env
VITE_BACKEND_URL=https://url-shortener-sb-5mgd.onrender.com
```

### 2. **Backend Configuration**

Set these properties in `application.properties`:

```properties
DATABASE_URL=jdbc:postgresql://<your-neon-url>/neondb
DATABASE_USERNAME=neondb_owner
DATABASE_PASSWORD=your_password
JWT_SECRET=generate_a_random_key
FRONTEND_URL=https://graceful-pithivier-bee131.netlify.app
```

Set these environment variables on Render:

* `DATABASE_URL`
* `DATABASE_USERNAME`
* `DATABASE_PASSWORD`
* `JWT_SECRET`
* `FRONTEND_URL`

---

## 🚫 Prerequisites (Locally) 🖥️📦🔧

* Node.js and npm
* Java 17 or above
* Maven
* Docker (for container build)

---

## 🚜 Deployment Steps 🚢🛠️🔁

### 📁 Frontend on Netlify 🧑‍💻📦🌐

1. Go to [Netlify](https://netlify.com/)
2. Create a new site from Git repo or drag-and-drop build folder.
3. Add environment variable:

   * `VITE_BACKEND_URL=https://url-shortener-sb-5mgd.onrender.com`
4. Set build command: `npm run build`
5. Publish directory: `dist`
6. Deploy

### ⛅️ Backend on Render 🔧🧳🖥️

1. Go to [Render](https://render.com/)
2. Create new Web Service:

   * Language: Java
   * Build Command: `./mvnw clean install`
   * Start Command: `java -jar target/your-jar-file.jar`
3. Add environment variables as above
4. Use PostgreSQL connection string from Neon
5. Deploy

### 📊 PostgreSQL on Neon.tech 🧠🗃️💾

1. Sign up at [https://neon.tech](https://neon.tech)
2. Create new project and branch
3. Copy the PostgreSQL URL for use in backend
4. Create tables automatically via Spring JPA

### 🛂 Docker Image (Optional) 🐳📦📤

1. Build image:

```bash
docker build -t pramilayadav/url-shortener-sb .
```

2. Push to DockerHub:

```bash
docker push pramilayadav/url-shortener-sb
```

3. To set up environment variables and run inside container (Windows PowerShell):

```powershell
$env:DATABASE_URL=
$env:DATABASE_USERNAME=
$env:DATABASE_PASSWORD=
$env:JWT_SECRET=
$env:FRONTEND_URL="http://localhost:5173"
$env:DATABASE_DIALECT="org.hibernate.dialect.PostgreSQLDialect"

./mvnw package

docker build -t url-shortener-sb .
docker tag url-shortener-sb pramilayadav/url-shortener-sb:latest
docker push pramilayadav/url-shortener-sb:latest

# Run interactively
docker run -it --rm url-shortener-sb bash

# Or persist
docker run -it url-shortener-sb bash

# View containers
docker ps 
docker ps -a
```

---

## ✉️ How to Run Locally 🏡🧪⚙️

### 1. Clone Repository

```bash
git clone https://github.com/<your-username>/url-shortener-project.git
cd url-shortener-project
```

### 2. Run Backend

```bash
cd server
./mvnw spring-boot:run
```

### 3. Run Frontend

```bash
cd client
npm install
npm run dev
```

---

## 🚮 API Endpoints Summary 🔍🌐🧾

| Method | Endpoint                  | Description           |
| ------ | ------------------------- | --------------------- |
| POST   | /api/auth/public/register | Register user         |
| POST   | /api/auth/public/login    | Login + get JWT token |
| POST   | /api/url                  | Shorten URL (auth)    |
| GET    | /api/url/my               | Get user URLs (auth)  |
| GET    | /api/url/stats/{id}       | Get stats per link    |
| GET    | /s/{shortUrl}             | Redirect              |

---

## 💪 Screenshots 🖼️📸🧾

### Login Page

<img width="1919" height="1090" alt="image" src="https://github.com/user-attachments/assets/51f9d3c5-74a9-406a-a82e-8a79557a7393" />

SignUp

<img width="1919" height="1096" alt="image" src="https://github.com/user-attachments/assets/b5e67e7b-a6d2-410b-8518-d63ba7e9e5f6" />

### Dashboard

<img width="1919" height="1111" alt="image" src="https://github.com/user-attachments/assets/b5996d32-ece3-4ed1-86c2-ef72bf70c42d" />


<img width="1919" height="1074" alt="image" src="https://github.com/user-attachments/assets/9a821688-3433-4f83-8bdb-7ebbff2e07b4" />


Create new shorted url


<img width="1912" height="1081" alt="image" src="https://github.com/user-attachments/assets/d21c89dc-f7a6-44db-8fd8-e285fa164da6" />

<img width="1885" height="596" alt="image" src="https://github.com/user-attachments/assets/d6260f61-a94a-4f75-8890-9411ce95d5c0" />

Home
<img width="1919" height="1099" alt="image" src="https://github.com/user-attachments/assets/8fa48ce4-a67a-43a1-be50-9630a6374127" />

About
<img width="1918" height="1093" alt="image" src="https://github.com/user-attachments/assets/b01f0abb-7c66-48fb-b2e3-601b6ec25876" />


---

## 🌐 Live Demo

> https://graceful-pithivier-bee131.netlify.app/


---


## 👤 Author 👩‍💻📝💼

**Pramila Yadav**

* [DockerHub](https://hub.docker.com/repository/docker/pramilayadav/url-shortener-sb/general)
* [Netlify Dashboard](https://app.netlify.com/projects/graceful-pithivier-bee131/overview)
* [Render Logs](https://dashboard.render.com/web/srv-d225bl15pdvs738jaepg/logs)
* [Neon Database](https://console.neon.tech/)

---

## 📚 License 📄⚖️🆓

This project is licensed under the MIT License. Free for commercial and personal use. 💼🌍🔓
