/*  
    login.js
    --------
    Este arquivo lida com o processo de LOGIN do usuário.

    Aqui evitamos funções avançadas e utilizamos apenas:
    - let
    - if
    - objetos simples
    - localStorage
*/

// Função para pegar os usuários salvos no navegador
// Motivo: todo cadastro salva no localStorage, então precisamos recuperar isso
function obterUsuarios() {
    let dados = localStorage.getItem("usuariosSalvos");

    // Se houver algum registro, transformamos de texto → objeto
    if (dados) {
        return JSON.parse(dados);
    }

    // Se não existir nada no navegador ainda:
    return {};
}

document.getElementById("formLogin").addEventListener("submit", function (evento) {

    // Evita que a página recarregue quando o formulário é enviado
    evento.preventDefault();

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
