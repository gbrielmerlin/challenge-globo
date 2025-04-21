from flask import Blueprint

text_bp = Blueprint('text', __name__)

@text_bp.route('/text')
def get_text():
    return "Essa é uma resposta fixa de texto."