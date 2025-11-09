window.addEventListener("DOMContentLoaded", function () {
    // recuperando o texto que foi salvo no localStorage
    let informacao = localStorage.getItem("informacao");
    document.getElementById("textoSalvo").innerHTML = informacao;//INNER HTML servirá para escrever na página



    //analisando o texto 
    function analisarTexto(texto) {
        // Remove espaços extras e divide por espaços
        const palavras = texto.trim().split(/\s+/);

        // 3) Quantidade de palavras
        document.getElementById("totalPalavras").textContent = palavras.length;

        // 4) Palavras iniciadas com M (maiúsculo ou minúsculo)
        const comM = palavras.filter(p => p[0]?.toLowerCase() === "m");
        document.getElementById("palComM").value = comM.length;

        // 5) Primeira palavra
        document.getElementById("priPal").value = palavras[0] || "";

        // 6) Segunda palavra
        document.getElementById("segPal").value = palavras[1] || "";

        // 7) Última palavra
        document.getElementById("ultPal").value = palavras[palavras.length - 1] || "";
    }

    // funcao analise
    btnAnalisar.addEventListener("click", function () {
        //usa o texto da caixa2 ou o salvo
        let textoParaAnalisar = caixa2.value.trim() || informacao;

        if (!textoParaAnalisar) {
            alert("Por favor, digite um texto ou volte à página anterior para informar um.");
            return;
        }

        analisarTexto(textoParaAnalisar);
    });


    // // criando funcao para analisar
    // this.document.getElementById("btnAnalisar").addEventListener("click", function () {
    //     let analise;
    //     let vetorPalavras;

    //     if (document.getElementById())


    // });

    // encaminhando para pagina do papai noel
    document.getElementById("btnPapaiNoel").addEventListener("click", function () { window.open('ex03.html', '_self') });

});
