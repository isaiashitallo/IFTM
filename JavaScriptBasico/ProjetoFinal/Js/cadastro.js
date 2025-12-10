/*  
    cadastro.js
    ------------
    Aqui fazemos o registro do usuário.
    Os dados são salvos no localStorage, usando um objeto simples.
*/

// Função básica para recuperar usuários já cadastrados
function obterUsuarios() {
    let dados = localStorage.getItem("usuariosSalvos");

    if (dados) {
        return JSON.parse(dados);
    }

    return {};
}

document.getElementById("formCadastro").addEventListener("submit", function (evento) {
    evento.preventDefault();

    // Pegamos o que foi digitado
    let usuario = document.getElementById("usuarioCadastro").value;
    let senha = document.getElementById("senhaCadastro").value;
    let confirmarSenha = document.getElementById("senhaConfirmarCadastro").value;

    // Verificação básica
    if (senha !== confirmarSenha) {
        alert("As senhas não conferem.");
        return;
    }

    let usuarios = obterUsuarios();

    // Verifica se já existe o usuário
    if (usuarios[usuario]) {
        alert("Este usuário já está cadastrado.");
        return;
    }

    // Salvamos o novo usuário no objeto
    usuarios[usuario] = senha;

    // Gravamos tudo novamente no navegador
    localStorage.setItem("usuariosSalvos", JSON.stringify(usuarios));

    alert("Cadastro concluído!");

    // Voltamos para a tela de login
    window.location.href = "index.html";
});
