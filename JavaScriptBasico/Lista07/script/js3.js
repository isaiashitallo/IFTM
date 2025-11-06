document.getElementById("btnMostrar").addEventListener("click", () => {
    const nome = document.getElementById("nome").value.trim();
    const resultado = document.getElementById("resultado");

    if (!nome) return alert("Digite seu nome completo!");

    let tamanho = 14;
    resultado.textContent = nome;
    resultado.style.fontSize = tamanho + "px";

    const intervalo = setInterval(() => {
        tamanho += 2;
        resultado.style.fontSize = tamanho + "px";
        if (tamanho >= 40) clearInterval(intervalo);
    }, 500);
});
