/*  
    login.js
    --------
    Login do usuário.
*/

// Função para pegar os usuários salvos no navegador
function obterUsuarios() {
    let dados = localStorage.getItem("usuariosSalvos");

    // texto para objeto
    if (dados) {
        return JSON.parse(dados);
    }

    // Se não existir nada no navegador ainda:
    return {};
}

document.getElementById("formLogin").addEventListener("submit", function (evento) {

    // Evita que a página recarregue quando o formulário é enviado
    evento.preventDefault(); //p impedir envio automatico

    // Pegamos os valores digitados
    let usuarioDigitado = document.getElementById("usuarioLogin").value;
    let senhaDigitada = document.getElementById("senhaLogin").value;

    // Pegamos a lista de todos os usuários cadastrados
    let listaUsuarios = obterUsuarios();

    // Verifica se o usuário existe
    if (!listaUsuarios[usuarioDigitado]) {
        alert("Usuário não encontrado.");
        return;
    }

    // Verifica a senha
    if (listaUsuarios[usuarioDigitado] !== senhaDigitada) {
        alert("Senha incorreta.");
        return;
    }

    // Login OK → armazenamos quem está logado
    localStorage.setItem("usuarioLogado", usuarioDigitado);

    // Envia para o jogo
    window.location.href = "jogo.html";
});

