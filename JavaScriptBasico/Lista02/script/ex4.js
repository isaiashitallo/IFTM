n = parseInt(prompt("Informe o valor de N:"));

m = parseInt(prompt("Informe o valor de M:"));

aleatorio = Math.floor(Math.random() * (m - n + 1)) + n;

document.write(aleatorio);