window.addEventListener("DOMContentLoaded", function() {
    const somarIdades = (vet) => {
        var acumulador = 0;
        for (let i=0; i<vet.length; i++) {
            acumulador = acumulador + vet[i];
        }
        return acumulador;

    }

    var vetor = [1, 3, 5, 7, 9]
})