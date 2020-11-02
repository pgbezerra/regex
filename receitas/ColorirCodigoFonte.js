const aplicarCor = (txt, reg, cor) => {
    return txt.replace(reg, `<span style="color: #${cor}"><b>$1</b></span>`);
}

const files = require('./files');

const texto = files.read('codigofonte.html');

const codeRegex = /<code>[\s\S]*<\/code>/i;

let codigo = texto.match(codeRegex)[0];

//Strings

codigo = aplicarCor(codigo, /(\".*\")/g, 'ce9178');

//palavras reservadas

codigo = aplicarCor(codigo, /\b(package|public|static|class|if|else)\b/g, 'd857cf');

//tipos primitivos

codigo = aplicarCor(codigo, /\b(void|int|double|float|byte|long|short|boolean|char)\b/g, '1385e2');

//comentarios de multiplas linhas

codigo = aplicarCor(codigo, /(\/\*[\s\S]*\*\/)/g, '257703');

//comentario de uma linha

codigo = aplicarCor(codigo, /(\/\/.*?\n)/g, '267703');

const conteudoFinal = texto.replace(codeRegex, codigo);
files.write('codigoFonte.html', conteudoFinal);