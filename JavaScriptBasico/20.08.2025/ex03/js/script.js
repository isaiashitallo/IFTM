nome = prompt("Informe seu nome:")
repeat = prompt("Quantas vezes vc quer que repita?")
color = prompt("Wich color would you like?")

for (i=0; i<repeat; i++)
    document.write(`<p style="color:${color}">${nome}</p>`)