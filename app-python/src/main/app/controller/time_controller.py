from flask import Blueprint
from datetime import datetime

time_bp = Blueprint('time', __name__)

@time_bp.route('/time')
def get_time():
    now = datetime.now().strftime('%Y-%m-%d %H:%M:%S')
    return f"Data e hora do servidor: {now}"