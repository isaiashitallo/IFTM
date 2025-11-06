document.getElementById("btnTransferir").addEventListener("click", () => {
    const c1 = document.getElementById("caixa1");
    const c2 = document.getElementById("caixa2");

    setTimeout(() => {
        c2.value = c1.value;
        c1.value = "";
    }, 2000);
});
