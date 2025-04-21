from flask import Flask
from flask_caching import Cache
from controller.text_controller import text_bp
from controller.time_controller import time_bp
import yaml

app = Flask(__name__)
#config para cache local (nao se comunica com cache externo, faz cache em memoria)
#app.config['CACHE_TYPE'] = 'SimpleCache'
#app.config['CACHE_DEFAULT_TIMEOUT'] = 10

# Configuração para Redis (ElastiCache)
with open('/app/config/config.yaml', 'r') as f:
    yaml_config = yaml.safe_load(f)

redis_cfg = yaml_config.get('redis', {})

app.config['CACHE_TYPE'] = 'RedisCache'
app.config['CACHE_REDIS_HOST'] = redis_cfg.get('host', 'localhost')
app.config['CACHE_REDIS_PORT'] = int(redis_cfg.get('port', 6379))
app.config['CACHE_REDIS_DB'] = int(redis_cfg.get('db', 0))
app.config['CACHE_REDIS_PASSWORD'] = redis_cfg.get('password', None)
app.config['CACHE_DEFAULT_TIMEOUT'] = 10
cache = Cache(app)
cache.init_app(app)

app.register_blueprint(text_bp)
app.register_blueprint(time_bp)

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)