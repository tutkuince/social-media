*Docker Images*

*** Docker For PostgreSQL***
```bash
docker run --name postgresql -p 5432:5432 -e POSTGRES_USER=root -e POSTGRES_PASSWORD=s3cr3t -d postgres:latest
```