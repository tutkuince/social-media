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
`db.createUser({user: "tutku", pwd: "s3cr3t", roles: ["readWrite", "dbAdmin"]})`

## Docker For Redis
```bash
docker run --name social-media-redis -p 6379:6379 -d redis:latest
```

### Docker For Redis-GUI
```bash
docker run --name redis-gui -p 8001:8001 -d redislabs/redisinsight:1.14.0
```