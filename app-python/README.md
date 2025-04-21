Esta aplicação Flask expõe duas rotas com cache de 10 segundos, utilizando Redis (ElastiCache).

- `/text`: retorna texto fixo
- `/time`: retorna data e hora do servidor

## Execução local com Redis

1. Suba um Redis local:

```bash
docker run -d --name redis -p 6379:6379 redis
```

2. Exporte as variáveis de ambiente e rode:

```bash
export REDIS_HOST=localhost
python src/main/app/app.py
```

## Docker

```bash
docker build -t app-python -f config/Dockerfile .
docker run -e REDIS_HOST=host.docker.internal -p 5000:5000 app-python
```

## Kubernetes

Incluído no `kubernetes.yaml`:

- Deployment da app com env `REDIS_HOST=redis-service`

> ⚠️ Você precisa de um service Redis rodando com o nome `redis-service` no cluster.

```bash
kubectl apply -f config/kubernetes.yaml
```
