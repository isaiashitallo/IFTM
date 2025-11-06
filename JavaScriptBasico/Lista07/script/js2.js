document.getElementById("btnTransferir").addEventListener("click", () => {
    const c1 = document.getElementById("caixa1");
    const c2 = document.getElementById("caixa2");
    const tempo = document.getElementById("tempo").value;

    if (!tempo) {
        alert("Selecione o tempo em segundos!");
        return;
    }

    setTimeout(() => {
        c2.value = c1.value;
        c1.value = "";
    }, tempo * 1000);
});
