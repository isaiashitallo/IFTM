window.addEventListener("DOMContentLoaded", function () {
    // criando variaveis
    const input = document.getElementById("quantidade");
    const botao = document.getElementById("btnMostrar");
    const container = document.getElementById("falas");

    botao.addEventListener("click", function () {
        const quantidade = parseInt(input.value);

        // if para verificar condicao
        if (isNaN(quantidade) || quantidade <= 0) {
            alert("Digite um número válido!");
            return;
        }

        //cria e adiciona novas falas conforme o nro passado
        for (let i = 0; i < quantidade; i++) {
            const p = document.createElement("p");
            p.textContent = "Ho Ho Ho Feliz Natal!";
            container.appendChild(p);
        }
    });
});
