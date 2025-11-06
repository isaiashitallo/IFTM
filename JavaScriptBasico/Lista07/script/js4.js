document.getElementById("btnIniciar").addEventListener("click", () => {
    let x = parseInt(document.getElementById("segundos").value);
    const msg = document.getElementById("mensagem");

    if (isNaN(x) || x <= 0) {
        alert("Informe um número válido de segundos!");
        return;
    }

    msg.textContent = `Por favor, aguarde ${x} segundos para carregar a página do Google.`;

    const timer = setInterval(() => {
        x--;
        if (x > 0) {
            msg.textContent = `Por favor, aguarde ${x} segundos para carregar a página do Google.`;
        } else {
            clearInterval(timer);
            window.location.href = "https://www.google.com";
        }
    }, 1000);
});
