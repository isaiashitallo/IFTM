window.addEventListener("DOMContentLoaded", function() {
    // TODO CÓDIGO ABAIXO SERÁ EXECUTADO APENAS COM O CARREGAMENTO DA PÁG CONCLUSO

    var btn1 = this.document.getElementById("btnClicar1");
    var btn2 = this.document.getElementById("btnClicar2");
    var btn3 = this.document.getElementById("btnClicar3");
    
    btn1.addEventListener("click", function() {
        exibirMsg("msg 1");
    }); 

    btn2.addEventListener("click", function() {
        exibirMsg("msg 2");
    });

    btn3.addEventListener("click", function() {
        somar(10,20);
    });
    
    function exibirMsg(msg) {
        alert(msg);
    }

    function somar(x, y) {
        alert(x+y);
    }


// ======== MANEIRAS DE ESCREVER UMA FUNÇÃO ==========


    // Declarativa -> Literal -> Anonima -> Arrow Function

// ===================================================
    // Função declarativa
    
    const exibirNro = (nro) => {
        this.alert(nro);
    }

    const dobroTriplo = (nro) => {
        this.alert(nro * 2);
        this.alert(nro * 3);
    }

    // dobroTriplo(35);

    function dobroNro(nro) {
        alert(nro * 2);
    }
    // dobroNro(34);
    function dobroNro(nro) {
        return (nro * 2);
    }

    
})