# Challenge Java Application

Aplicação Spring Boot com dois endpoints cacheados em Redis (compatível com Amazon ElastiCache), empacotada com Docker, pronta para deploy em Kubernetes com CI/CD via GitHub Actions.

---

## 🚀 Endpoints

| Método | Rota   | Descrição                          |
|--------|--------|------------------------------------|
| GET    | /text  | Texto fixo (cache: 1 min)          |
| GET    | /time  | Horário do servidor (cache: 1 min) |

Para rodar a aplicação é necessário substituir algumas variáveis, com o host do redis no application.yaml e adicionar as variáveis de ambiente da AWS na pipeline.
---