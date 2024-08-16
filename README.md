# Docker Images

## Docker For PostgreSQL
```bash
docker run --name postgresql -p 5432:5432 -e POSTGRES_USER=root -e POSTGRES_PASSWORD=s3cr3t -d postgres:latest
```

## Docker For MongoDB
```bash
docker run --name mongodb -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=s3cr3t -d mongo:latest 
```
### Mongo Config
db.createUser({user: "tutku", pwd: "s3cr3t", roles: ["readWrite", "dbAdmin"]})