numeros = [];



while (numeros.length < 6) {
    n = Math.floor(Math.random() * 60) + 1;
    if (!numeros.includes(n)) {
        numeros.push(n);
    }
}

document.write("Números da mega sena: " + numeros.sort((a, b) => a - b).join(", "));
