// ETAPA 1 - Criar vetor com números de 1 a 27
var vetorCartas = [];
for (var i = 1; i <= 27; i++) {
    vetorCartas.push(i);
}
console.log("Todas as cartas do baralho:", vetorCartas);

// ETAPA 2 - Criar vetor com 4 pares aleatórios
var vetorPares = [];
var numerosEscolhidos = [];

while (numerosEscolhidos.length < 4) {
    var numeroAleatorio = Math.floor(Math.random() * 27) + 1;

    // Verifica se o nrro ainda não foi escolhido
    if (numerosEscolhidos.indexOf(numeroAleatorio) === -1) {
        numerosEscolhidos.push(numeroAleatorio);
    }
}

// duplica cada nro para formar os pares
for (var j = 0; j < numerosEscolhidos.length; j++) {
    vetorPares.push(numerosEscolhidos[j]);
    vetorPares.push(numerosEscolhidos[j]);
}

console.log("Quatro pares de cartas aleatórias do baralho:", vetorPares);



// ETAPA 3 - Embaralhar o vetor de pares
var vetorParesEmbaralhados = vetorPares.slice(); // cria uma copia de vetorpares


for (var i = 0; i < vetorParesEmbaralhados.length; i++) {
    var posicaoAleatoria = Math.floor(Math.random() * vetorParesEmbaralhados.length);

    // troca os valores de posição
    var temp = vetorParesEmbaralhados[i];
    vetorParesEmbaralhados[i] = vetorParesEmbaralhados[posicaoAleatoria];
    vetorParesEmbaralhados[posicaoAleatoria] = temp;
}

console.log("Quatro pares de cartas aleatórias do baralho embaralhadas:", vetorParesEmbaralhados);


// ETAPA 4 - Mostrar as imagens das cartas na página
function iniciarJogo() {
    var tabuleiro = document.getElementById("tabuleiro");
    tabuleiro.innerHTML = ""; // importante pq errei na prova: limpa o conteúdo anterior

    for (var x = 0; x < vetorParesEmbaralhados.length; x++) {
        var img = document.createElement("img");
        img.src = "img/carta" + vetorParesEmbaralhados[x] + ".png";
        img.alt = "Carta " + vetorParesEmbaralhados[x];
        tabuleiro.appendChild(img);
    }
}

iniciarJogo();
