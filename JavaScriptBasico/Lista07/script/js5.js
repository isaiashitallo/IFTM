document.getElementById("btnIniciar").addEventListener("click", () => {
    const qtd = parseInt(document.getElementById("quantidade").value);
    const resultado = document.getElementById("resultado");

    if (isNaN(qtd) || qtd <= 0) {
        alert("Informe uma quantidade válida!");
        return;
    }

    const nomes = [];
    for (let i = 0; i < qtd; i++) {
        const nome = prompt(`Digite o nome ${i + 1}:`);
        nomes.push(nome);
    }

    let i = 0;
    const intervalo = setInterval(() => {
        if (i < nomes.length) {
            const p = document.createElement("p");
            p.textContent = nomes[i];
            resultado.appendChild(p);
            i++;
        } else {
            clearInterval(intervalo);
        }
    }, 1000);
});
