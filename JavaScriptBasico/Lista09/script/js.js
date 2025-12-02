window.addEventListener("DOMContentLoaded", function() {
    let txt1 = this.document.getElementById("caixa1");
    this.document.getElementById("btn1").addEventListener("click", valida1);

    function valida1() {
        // let padrao = /^\d{2}$/;
        let padrao =  /^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/(\d{4}|\d{2})$/;
        (padrao.test(txt1.value))?alert("válido"):alert("inválido");
    }

    let txt2 = this.document.getElementById("caixa2");
    this.document.getElementById("btn2").addEventListener("click", valida2);

    function valida2() {
        let padrao =  /^\d{3}\.\d{3}\.\d{3}\-\d{2}$/;
        (padrao.test(txt2.value))?alert("válido"):alert("inválido");
    }

    let txt3 = this.document.getElementById("caixa3");
    this.document.getElementById("btn3").addEventListener("click", valida3);

    function valida3() {
        let padrao =  /^IFTM-\d{3}\/\d{3}-[a-zA-Z0-9]{2}$/i;
        (padrao.test(txt3.value))?alert("válido"):alert("inválido");
    }

    let txt4 = this.document.getElementById("caixa4");
    this.document.getElementById("btn4").addEventListener("click", valida4);

    function valida4() {
        let padrao =  /^MT-\d{2}\.\d{3}-IFTM$/i;
        (padrao.test(txt4.value))?alert("válido"):alert("inválido");
    }

    let txt5 = this.document.getElementById("caixa5");
    this.document.getElementById("btn5").addEventListener("click", valida5);

    function valida5() {
        let padrao =  /^MT-\d{2}\.\d{3}-(I|i)(F|f)(T|t)(M|m)$/i;
        (padrao.test(txt5.value))?alert("válido"):alert("inválido");
    }

    let txt6 = this.document.getElementById("caixa6");
    this.document.getElementById("btn6").addEventListener("click", valida6);

    function valida6() {
        let padrao =  /^M\s?T-\d{2}\.\d{3}-I\s?F\s?T\s?M$/i;
        (padrao.test(txt6.value))?alert("válido"):alert("inválido");
    }

    let txt7 = this.document.getElementById("caixa7");
    this.document.getElementById("btn7").addEventListener("click", valida7);

    function valida7() {
        let padrao =  /^M\s?T-\d{2}\.\d{3}-I\s?F\s?T\s?M\s(Uberlândia Centro|Uberlândia)$/i;
        (padrao.test(txt7.value))?alert("válido"):alert("inválido");
    }

    let txt8 = this.document.getElementById("caixa8");
    this.document.getElementById("btn8").addEventListener("click", valida8);

    function valida8() {
        let padrao =  /^(IFTM campus Uberlândia|IFTM campus Uberlândia Centro)$/;
        (padrao.test(txt8.value))?alert("válido"):alert("inválido");
    }

    let txt9 = this.document.getElementById("caixa9");
    this.document.getElementById("btn9").addEventListener("click", valida9);

    function valida9() {
        let padrao =  /^\+\d{2}\(\d{2}\)\d{5}-\d{4}$/;
        (padrao.test(txt9.value))?alert("válido"):alert("inválido");
    }

    let txt10 = this.document.getElementById("caixa10");
    this.document.getElementById("btn10").addEventListener("click", valida10);

    function valida10() {
        let padrao =  /^\(\d{2,3}\)\d{5}-\d{4}$/;
        (padrao.test(txt10.value))?alert("válido"):alert("inválido");
    }

    let txt11 = this.document.getElementById("caixa11");
    this.document.getElementById("btn11").addEventListener("click", valida11);

    function valida11() {
        // let padrao =  /^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/(\d{4}|\d{2})$/;
        let padrao =  /^(1(\.|\,)[3-9]\d{0,1}?)|(2(\.|\,)([0-4]\d{0,1}?|[5]0?))$/;
        (padrao.test(txt11.value))?alert("válido"):alert("inválido");
    }

    let txt12 = this.document.getElementById("caixa12");
    this.document.getElementById("btn12").addEventListener("click", valida12);

    function valida12() {
        let padrao =  /^R\$(0|[1-9]\d{0,2}(?:\.\d{3}){0,3}),\d{1,2}$/;
        (padrao.test(txt12.value))?alert("válido"):alert("inválido");
    }

    let txt13 = this.document.getElementById("caixa13");
    this.document.getElementById("btn13").addEventListener("click", valida13);

    function valida13() {
        let padrao =  /^(?:[01]\d|2[0-3]):[0-5]\d:[0-5]\d:\d{2}$/;
        (padrao.test(txt13.value))?alert("válido"):alert("inválido");
    }

    let txt14 = this.document.getElementById("caixa14");
    this.document.getElementById("btn14").addEventListener("click", valida14);

    function valida14() {
        let padrao =  /^[A-Za-z0-9._-]{5,}&[A-Pa-p]+\.[aeiou]+(?:\.[A-Za-z0-5]+)?-[^0-9]+,[^A-Za-z0-9]{2}\.[^ab01]+$/;
        (padrao.test(txt14.value))?alert("válido"):alert("inválido");
    }



})