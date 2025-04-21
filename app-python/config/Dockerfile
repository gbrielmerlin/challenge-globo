FROM python:3.10-slim
WORKDIR /app
COPY src/main /app
COPY config/docker-entrypoint.sh /usr/local/bin/
COPY config/config.yaml /app/config/config.yaml
RUN chmod +x /usr/local/bin/docker-entrypoint.sh \
    && pip install --no-cache-dir Flask Flask-Caching redis PyYAML

ENTRYPOINT ["docker-entrypoint.sh"]