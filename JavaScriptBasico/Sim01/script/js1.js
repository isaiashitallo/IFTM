// quando a pág carregar:
window.addEventListener("DOMContentLoaded", function() {
   
    // elementos da página
    const texto = document.getElementById("caixa1");
    const btnInput = document.getElementById("btnEnviar"); // corrigido: btnEnviar

    // protege caso o script rode antes do DOM (apenas por segurança)
    btnInput.addEventListener("click", () => {
     
        // SALVANDO NO localStorage (salva string)
        localStorage.setItem("informacao", texto.value);
        // redirecionando para nova pág
        window.open("ex02.html", "_self");
    });

});
